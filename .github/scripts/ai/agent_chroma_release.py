from __future__ import annotations
import argparse, json, os, sys
from typing import Any, Dict, List
import chromadb

def load_manifest(db_dir: str) -> Dict[str, Any]:
    path = os.path.join(db_dir, "MANIFEST.json")
    if os.path.isfile(path):
        try:
            with open(path, "r", encoding="utf-8") as f:
                return json.load(f)
        except Exception as e:
            print(f"::warning :: Failed to read MANIFEST.json: {e}", file=sys.stderr)
    return {}

def list_collection_names(client: chromadb.Client) -> List[str]:
    try:
        cols = client.list_collections()
        # Older Chroma returns objects with .name; newer returns dicts
        names = []
        for c in cols:
            name = getattr(c, "name", None) or (isinstance(c, dict) and c.get("name"))
            if name:
                names.append(name)
        return names
    except Exception as e:
        print(f"::warning :: Unable to list collections: {e}", file=sys.stderr)
        return []

def resolve_collection_name(client: chromadb.Client, requested: str | None, manifest: Dict[str, Any]) -> str:
    names = list_collection_names(client)
    man_name = (manifest.get("collection") if isinstance(manifest, dict) else None) or None

    # 1) Prefer manifest value if it exists in store
    if man_name and man_name in names:
        return man_name

    # 2) If a requested name is provided and exists, use it
    if requested and requested in names:
        return requested

    # 3) If there is exactly one collection, use it (common case)
    if len(names) == 1:
        return names[0]

    # 4) No obvious match → raise with guidance
    msg = ["No matching Chroma collection found in the persisted store."]
    msg.append(f"- Requested: {requested!r}")
    msg.append(f"- Manifest:  {man_name!r}")
    msg.append(f"- Available: {names if names else '[] (none)'}")
    raise RuntimeError("\n".join(msg))

def fmt_row(i, doc, meta, dist=None):
    src = meta.get("source_path") or meta.get("source") or meta.get("path") or "unknown"
    head = (doc or "").strip().splitlines()[0][:120]
    d = f"  (distance: {dist:.4f})" if isinstance(dist, (int, float)) else ""
    return f"{i+1}. {src}{d}\n    {head}"

def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--db", required=True, help="Path to Chroma persist directory (e.g., .kb_index)")
    ap.add_argument("--collection", default=None, help="Optional explicit collection name override")
    ap.add_argument("--question", required=True)
    ap.add_argument("--top-k", type=int, default=5)
    args = ap.parse_args()

    if not os.path.isdir(args.db):
        print(f"::error :: Chroma persist dir not found: {args.db}", file=sys.stderr)
        sys.exit(1)

    client = chromadb.PersistentClient(path=args.db)
    manifest = load_manifest(args.db)

    try:
        col_name = resolve_collection_name(client, args.collection, manifest)
    except Exception as e:
        print(f"::error :: {e}", file=sys.stderr)
        sys.exit(1)

    try:
        col = client.get_collection(col_name)
    except Exception as e:
        print(f"::error :: Failed to open collection '{col_name}': {e}", file=sys.stderr)
        sys.exit(1)

    res = col.query(
        query_texts=[args.question],
        n_results=args.top_k,
        include=["distances", "documents", "metadatas", "ids"],
    )

    docs = res.get("documents", [[]])[0]
    metas = res.get("metadatas", [[]])[0]
    dists = res.get("distances", [[]])[0]

    # Diagnostics
    print(f"[agent] Using collection: {col_name}")
    if manifest:
        print(f"[agent] MANIFEST: model={manifest.get('embed_model')} collection={manifest.get('collection')} count={manifest.get('count')}")

    # Build a concise grounded answer (no LLM)
    lines = [f"### Question", args.question, "", f"### Collection: {col_name}", "", "### Top Matches"]
    for i, (doc, meta, dist) in enumerate(zip(docs, metas, dists)):
        lines.append(fmt_row(i, doc, meta, dist))
    lines += ["", "### Grounded Answer (heuristic)",
              "Below are the most relevant excerpts; see sources above."]

    os.makedirs("dist", exist_ok=True)
    with open("dist/answer.md", "w", encoding="utf-8") as f:
        f.write("\n".join(lines))
    print("\n".join(lines))

if __name__ == "__main__":
    main()