from __future__ import annotations
import argparse, json, os, sys
from typing import Any, Dict, List
import chromadb
from chromadb.config import Settings
from sentence_transformers import SentenceTransformer
from tqdm import tqdm

def read_jsonl(path: str):
    with open(path, "r", encoding="utf-8") as f:
        for line in f:
            line = line.strip()
            if not line: 
                continue
            try:
                yield json.loads(line)
            except Exception:
                continue

def extract_text(obj: Dict[str, Any]) -> str:
    for k in ("text","content","page_content","chunk","body"):
        v = obj.get(k)
        if isinstance(v, str) and v.strip():
            return v
    return ""

def extract_id(obj: Dict[str,Any], i: int) -> str:
    return str(obj.get("id") or f"auto-{i}")

def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--index", required=True, help="Path to index.jsonl")
    ap.add_argument("--persist", default=".kb_index_ephemeral", help="Where to build temporary Chroma store")
    ap.add_argument("--collection", default="hpcckb")
    ap.add_argument("--model", default="sentence-transformers/all-MiniLM-L6-v2")
    ap.add_argument("--batch-size", type=int, default=256)
    ap.add_argument("--question", required=True)
    ap.add_argument("--top-k", type=int, default=5)
    args = ap.parse_args()

    os.makedirs(args.persist, exist_ok=True)
    client = chromadb.PersistentClient(path=args.persist, settings=Settings(anonymized_telemetry=False))
    try:
        client.delete_collection(args.collection)
    except Exception:
        pass
    col = client.create_collection(args.collection, metadata={"hnsw:space":"cosine"})

    # Load docs
    ids, docs, metas = [], [], []
    for i, obj in enumerate(read_jsonl(args.index)):
        txt = extract_text(obj)
        if not txt.strip():
            continue
        ids.append(extract_id(obj, i))
        docs.append(txt)
        metas.append(obj.get("metadata", {}))

    if not docs:
        print(f"::error :: No documents found in {args.index}", file=sys.stderr)
        sys.exit(1)

    model = SentenceTransformer(args.model)
    B = args.batch_size
    vecs: List[List[float]] = []
    for s in tqdm(range(0, len(docs), B), desc="Embedding"):
        batch = docs[s:s+B]
        emb = model.encode(batch, normalize_embeddings=True, show_progress_bar=False)
        vecs.extend(emb.tolist())

    col.add(ids=ids, documents=docs, metadatas=metas, embeddings=vecs)

    res = col.query(query_texts=[args.question], n_results=args.top_k, include=["distances","documents","metadatas","ids"])
    docs_r = res.get("documents", [[]])[0]
    metas_r = res.get("metadatas", [[]])[0]
    dists_r = res.get("distances", [[]])[0]

    def fmt_row(i, doc, meta, dist):
        src = meta.get("source_path") or meta.get("source") or meta.get("path") or "unknown"
        head = doc.strip().splitlines()[0][:120]
        return f"{i+1}. {src}  (distance: {dist:.4f})\n    {head}"

    lines = [f"### Question", args.question, "", "### Top Matches"]
    for i, (d, m, dist) in enumerate(zip(docs_r, metas_r, dists_r)):
        lines.append(fmt_row(i, d, m, dist))
    lines += ["", "### Grounded Answer (heuristic)",
              "Below are the most relevant excerpts; see sources above."]

    os.makedirs("dist", exist_ok=True)
    with open("dist/answer.md", "w", encoding="utf-8") as f:
        f.write("\n".join(lines))
    print("\n".join(lines))

if __name__ == "__main__":
    main()