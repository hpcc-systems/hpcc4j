#!/usr/bin/env python3
# -*- coding: utf-8 -*-

import json
import os
import time
from typing import Dict, Any, List, Iterator

from langchain_huggingface import HuggingFaceEmbeddings
from langchain_community.vectorstores import Chroma
from chromadb.config import Settings

DEFAULT_INDEX_JSONL = os.environ.get("KB_INDEX_JSONL", ".kb_index_enhanced/index.jsonl")
DB_DIR = os.environ.get("KB_DB_DIR", ".kb_index")
MODEL_NAME = os.environ.get("KB_EMBED_MODEL", "sentence-transformers/all-MiniLM-L6-v2")
COLLECTION = os.environ.get("KB_COLLECTION", "hpcckb")
BATCH_SIZE = int(os.environ.get("KB_BATCH_SIZE", "256"))

SOURCE_SHA  = os.environ.get("KB_SOURCE_SHA")  or os.environ.get("GITHUB_SHA", "")
SOURCE_REF  = os.environ.get("KB_SOURCE_REF")  or os.environ.get("GITHUB_REF_NAME", "")
SOURCE_REPO = os.environ.get("KB_SOURCE_REPO") or os.environ.get("GITHUB_REPOSITORY", "")

os.environ.setdefault("ANONYMIZED_TELEMETRY", "false")
os.environ.setdefault("CHROMA_ANONYMIZED_TELEMETRY", "false")
os.environ.setdefault("CHROMA_TELEMETRY_IMPLEMENTATION", "none")


def iter_index_jsonl(path: str):
    with open(path, "r", encoding="utf-8") as fin:
        for line in fin:
            line = line.strip()
            if not line:
                continue
            try:
                yield json.loads(line)
            except Exception as e:
                print(f"WARN: skipping non-JSON line: {e}")


def infer_dim_or_zero(emb) -> int:
    try:
        v = emb.embed_query("dimension probe")
        return len(v) if v else 0
    except Exception:
        return 0


def write_manifest(chunks_total: int, dims: int) -> str:
    manifest = {
        "kind": "kb-embedding-manifest",
        "version": 1,
        "created_utc": time.strftime("%Y-%m-%dT%H:%M:%SZ", time.gmtime()),
        "source": {
            "index_jsonl": os.path.abspath(DEFAULT_INDEX_JSONL),
            "repo": SOURCE_REPO,
            "ref": SOURCE_REF,
            "commit": SOURCE_SHA,
        },
        "embedding": {
            "provider": "huggingface",
            "model": MODEL_NAME,
            "dims": dims,
        },
        "vector_store": {
            "type": "chroma",
            "persist_directory": os.path.abspath(DB_DIR),
            "collection": COLLECTION,
        },
        "counts": {
            "chunks": chunks_total,
            "batch_size": BATCH_SIZE,
        },
        "notes": "Manifest exists even if 0 chunks were embedded (for audit/debug).",
    }
    os.makedirs(DB_DIR, exist_ok=True)
    path = os.path.join(DB_DIR, "MANIFEST.json")
    with open(path, "w", encoding="utf-8") as fout:
        json.dump(manifest, fout, ensure_ascii=False, indent=2)
    return path


def main():
    # Fail fast if index is missing
    if not os.path.exists(DEFAULT_INDEX_JSONL):
        print(f"ERROR: index.jsonl not found at {DEFAULT_INDEX_JSONL}")
        raise SystemExit(2)

    print(f"Loading chunks from: {DEFAULT_INDEX_JSONL}")
    texts, metas, ids = [], [], []

    for i, rec in enumerate(iter_index_jsonl(DEFAULT_INDEX_JSONL)):
        text = rec.get("text") or rec.get("chunk") or ""
        if not text.strip():
            continue
        meta = rec.get("meta") or rec.get("metadata") or {}
        if "source" not in meta and rec.get("source"):
            meta["source"] = rec["source"]
        cid = str(rec.get("id") or rec.get("chunk_id") or f"chunk-{i}")
        texts.append(text)
        metas.append(meta)
        ids.append(cid)

    # Always create the DB dir and a manifest, even if we have 0 chunks
    os.makedirs(DB_DIR, exist_ok=True)

    if not texts:
        dims = 0
        mf = write_manifest(chunks_total=0, dims=dims)
        print("No chunks found in index.jsonl — wrote manifest only:", mf)
        # List for diagnostics
        for root, dirs, files in os.walk(DB_DIR):
            for f in files:
                print(os.path.join(root, f))
        return

    print(f"Preparing to embed {len(texts)} chunk(s) with model: {MODEL_NAME}")
    embeddings = HuggingFaceEmbeddings(model_name=MODEL_NAME)
    dims = infer_dim_or_zero(embeddings)

    client_settings = Settings(anonymized_telemetry=False, is_persistent=True)
    created = False
    total = len(texts)
    start = 0
    while start < total:
        end = min(start + BATCH_SIZE, total)
        t_slice = texts[start:end]
        m_slice = metas[start:end]
        i_slice = ids[start:end]
        print(f"Embedding batch {start}..{end-1}")

        if not created:
            db = Chroma.from_texts(
                texts=t_slice,
                embedding=embeddings,
                metadatas=m_slice,
                ids=i_slice,
                persist_directory=DB_DIR,
                client_settings=client_settings,
                collection_name=COLLECTION,
            )
            created = True
        else:
            db._collection.add(documents=t_slice, metadatas=m_slice, ids=i_slice)
        start = end

    mf = write_manifest(chunks_total=total, dims=dims)

    print(f"Persisted Chroma DB under: {DB_DIR}")
    try:
        for root, dirs, files in os.walk(DB_DIR):
            for f in files:
                print(os.path.join(root, f))
    except Exception as e:
        print(f"WARN: listing {DB_DIR} failed: {e}")
    print(f"[DONE] Embedded {total} chunk(s). Manifest: {mf}")


if __name__ == "__main__":
    import os
    main()