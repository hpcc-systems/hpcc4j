#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
kb-source-markdow-chunk.py
Markdown-aware, section-first chunking + metadata for KB sources.

Enhancements (non-breaking, optional via flags):
- Respects fenced code blocks AND tables when creating chunk boundaries.
- Adds overlap without starting/ending inside protected code/table spans.
- Emits JSONL with richer metadata (section_path, tokens_estimate, deprecation).
- Optional per-chunk Markdown files with YAML frontmatter (--emit-md).
- Optional topics mapping (--topics-map) to attach module/section_path/topics.
- Normalizes relative links in emitted Markdown to absolute GitHub URLs.

Usage (compatible with your current pattern):
  python .github/scripts/kb-source-markdow-chunk.py \
    --kb-root kb/hpcc4j \
    --out-dir .kb_index_enhanced \
    --source-base https://github.com/rpastrana/HPCC4J/blob/master \
    --max-chars 2400 \
    --overlap 300 \
    --ext .md .txt

Optional:
  --emit-md                          # also emit per-chunk .md files with frontmatter
  --owner "hpcc-systems/hpcc4j"      # owner/namespace string
  --license "Apache-2.0"             # license short name to stamp in metadata
  --default-version "9.14.x"         # default version string for chunks
  --topics-map path/to/topics-map.yml# mapping of source paths -> module/section_path/topics
"""

import argparse, os, re, json, hashlib, time, fnmatch, sys
from typing import List, Dict, Tuple, Optional
from pathlib import Path

# Try optional YAML for topics map
try:
    import yaml  # type: ignore
except Exception:
    yaml = None

# ---------- Regexes ----------
RE_HX     = re.compile(r"^(#{1,6})\s+(.*)")
RE_FENCE  = re.compile(r"^```")
RE_URL    = re.compile(r"(https?://[^\s)]+)")
RE_MD_LINK= re.compile(r"\[([^\]]+)\]\(([^)]+)\)")
RE_HPORT  = re.compile(r"\b([A-Za-z0-9\-\._]+):([0-9]{2,5})\b")
RE_TABLE_SEP = re.compile(r"^\s*:?-{3,}:?\s*(\|\s*:?-{3,}:?\s*)+$")  # e.g. ---|--- separators
RE_TABLE_ROW = re.compile(r"^\s*\|.+\|\s*$")                         # pipe-leading table row

# ---------- CLI ----------
def parse_args():
    p = argparse.ArgumentParser()
    p.add_argument("--kb-root", default="kb/hpcc4j", help="Root directory to crawl")  # <- default updated
    p.add_argument("--out-dir", default=".kb_index_enhanced", help="Output directory")
    p.add_argument("--source-base", required=True, help="Repo base: https://github.com/<owner>/<repo>/blob/<ref>")
    p.add_argument("--max-chars", type=int, default=2400, help="Approx chars per chunk (before overlap)")
    p.add_argument("--overlap",   type=int, default=300,  help="Chars of overlap between chunks")
    p.add_argument("--ext", nargs="+", default=[".md", ".txt"], help="File extensions to include")

    # Optional extras (non-breaking)
    p.add_argument("--emit-md", action="store_true", help="Emit one Markdown file per chunk (with YAML frontmatter)")
    p.add_argument("--owner", default="", help="Owner/namespace string for metadata (e.g., hpcc-systems/hpcc4j)")
    p.add_argument("--license", default="", help="License short name (e.g., Apache-2.0)")
    p.add_argument("--default-version", default="", help="Default version string (e.g., 9.14.x)")
    p.add_argument("--topics-map", default="", help="Path to topics-map.yml for module/section_path/topics mapping")
    return p.parse_args()

# ---------- IO helpers ----------
def read_lines(path: str) -> List[str]:
    with open(path, "r", encoding="utf-8", errors="ignore") as f:
        return f.read().splitlines()

def write_text(path: Path, text: str):
    path.parent.mkdir(parents=True, exist_ok=True)
    path.write_text(text, encoding="utf-8")

# ---------- Sectioning ----------
def split_sections(lines: List[str]) -> List[Dict]:
    """Split by Markdown headings, respect fenced code blocks, preserve line numbers."""
    sections = []
    cur = {"level": 0, "title": "", "start": 1, "lines": []}
    in_code = False
    for i, l in enumerate(lines, start=1):
        if RE_FENCE.match(l):
            in_code = not in_code
        m = RE_HX.match(l)
        if m and not in_code:
            if cur["lines"]:
                cur["end"] = i - 1
                sections.append(cur)
            cur = {"level": len(m.group(1)), "title": m.group(2).strip(), "start": i, "lines": [l]}
        else:
            cur["lines"].append(l)
    if cur["lines"]:
        cur["end"] = cur.get("end", len(lines))
        sections.append(cur)
    if not sections:
        sections = [{"level": 1, "title": "(document)", "start": 1, "end": len(lines), "lines": lines}]
    return sections

# ---------- Protected spans (code/table) ----------
def protected_spans(section_lines: List[str]) -> List[Tuple[int, int]]:
    """
    Return character spans (start, end) within section_text that correspond to
    fenced code blocks OR Markdown tables. Used to avoid cutting inside them.
    """
    text = "\n".join(section_lines)
    spans: List[Tuple[int, int]] = []

    # Map line -> char offset
    offsets = []
    c = 0
    for ln in section_lines:
        offsets.append(c)
        c += len(ln) + 1  # include '\n'

    # Fenced code spans
    in_code = False
    start_char = 0
    for idx, line in enumerate(section_lines):
        if RE_FENCE.match(line):
            if not in_code:
                in_code = True
                start_char = offsets[idx]
            else:
                in_code = False
                end_char = offsets[idx] + len(line)
                spans.append((start_char, end_char))
    if in_code:
        # Unclosed fence: protect to end of section
        spans.append((start_char, len(text)))

    # Table spans: group consecutive table-like lines
    i = 0
    n = len(section_lines)
    while i < n:
        line = section_lines[i]
        is_row = RE_TABLE_ROW.match(line) is not None
        is_sep = RE_TABLE_SEP.match(line) is not None
        if is_row:
            j = i + 1
            # accept rows; if next line is a separator, keep including following rows
            saw_sep = False
            if j < n and (RE_TABLE_SEP.match(section_lines[j]) or RE_TABLE_ROW.match(section_lines[j])):
                # grow while looks like a table row or separator
                while j < n and (RE_TABLE_ROW.match(section_lines[j]) or RE_TABLE_SEP.match(section_lines[j])):
                    if RE_TABLE_SEP.match(section_lines[j]):
                        saw_sep = True
                    j += 1
            if saw_sep:
                spans.append((offsets[i], offsets[j - 1] + len(section_lines[j - 1])))
                i = j
                continue
        elif is_sep:
            # separator without leading row still likely part of a table block
            j = i + 1
            while j < n and (RE_TABLE_ROW.match(section_lines[j]) or RE_TABLE_SEP.match(section_lines[j])):
                j += 1
            spans.append((offsets[i], offsets[j - 1] + len(section_lines[j - 1])))
            i = j
            continue
        i += 1

    # Merge/normalize spans
    if not spans:
        return spans
    spans.sort()
    merged = [spans[0]]
    for s, e in spans[1:]:
        ls, le = merged[-1]
        if s <= le:
            merged[-1] = (ls, max(le, e))
        else:
            merged.append((s, e))
    return merged

def is_inside_spans(idx: int, spans: List[Tuple[int, int]]) -> bool:
    for s, e in spans:
        if s <= idx < e:
            return True
    return False

def next_safe_boundary(text: str, pos: int, spans: List[Tuple[int, int]], search_forward: bool = True, limit: int = 300) -> int:
    """
    Move to a nearby boundary outside protected spans, preferring a paragraph/newline boundary.
    """
    n = len(text)
    pos = max(0, min(n, pos))
    if not is_inside_spans(pos, spans):
        # try to align to a newline boundary near pos
        if search_forward:
            end = min(n, pos + limit)
            window = text[pos:end]
            nl = window.find("\n\n")
            if nl == -1: nl = window.find("\n")
            if nl != -1 and not is_inside_spans(pos + nl, spans):
                return pos + nl
            return pos
        else:
            start = max(0, pos - limit)
            window = text[start:pos]
            nl = window.rfind("\n\n")
            if nl == -1: nl = window.rfind("\n")
            if nl != -1 and not is_inside_spans(start + nl, spans):
                return start + nl
            return pos
    # If we're inside a protected span, hop to its end (forward) or start (back)
    if search_forward:
        for s, e in spans:
            if s <= pos < e:
                return e
        return pos
    else:
        for s, e in reversed(spans):
            if s < pos <= e:
                return s
        return pos

def smart_chunkify(section_lines: List[str], size: int, overlap: int) -> List[Tuple[int, int, str]]:
    """
    Chunk section text with protected spans, returning (start_char, end_char, chunk_text).
    """
    text = "\n".join(section_lines)
    spans = protected_spans(section_lines)
    chunks: List[Tuple[int, int, str]] = []
    n = len(text)
    i = 0
    while i < n:
        # target end
        tgt = min(n, i + size)
        j = next_safe_boundary(text, tgt, spans, search_forward=True, limit=300)
        if j <= i:
            # fallback to naive bump
            j = min(n, i + size)
        frag = text[i:j].strip()
        if frag:
            chunks.append((i, j, frag))
        if j >= n:
            break
        # compute next start with overlap, avoid starting inside spans
        next_i = max(0, j - overlap)
        if is_inside_spans(next_i, spans):
            next_i = next_safe_boundary(text, next_i, spans, search_forward=False, limit=200)
        if next_i <= i and j > i:
            next_i = i + 1
        i = next_i
    return chunks

# ---------- Misc inference ----------
def extract_endpoints(s: str) -> Dict[str, List[str]]:
    urls = list(set(RE_URL.findall(s)))
    hp   = list({f"{h}:{p}" for h, p in RE_HPORT.findall(s)})
    return {"urls": urls, "hostports": hp}

def infer_doc_type(rel: str) -> str:
    r = rel.lower()
    if "tests" in r or "usage" in r:  return "usage-pattern"
    if "howto" in r or "how-to" in r:  return "howto"
    if "api-reference" in r or "reference" in r or "javadoc" in r: return "reference"
    if "changelog" in r:               return "changelog"
    if "jira" in r or "issues" in r:   return "issue"
    return "guide"

def infer_component(rel: str) -> str:
    r = rel.lower()
    for c in ("wsclient","dfsclient","spark-hpcc","commons-hpcc","clienttools","hpcc4j"):
        if c in r: return c
    return "hpcc4j"

def infer_keywords(title: str, text: str) -> List[str]:
    keys = set()
    ttl = (title or "").lower()
    tx = text.lower()
    for k in ("tls","ssl","mtls","basic auth","token","oauth","timeout","dropzone","roxie",
              "thor","dfu","filespray","eclcc","spark","endpoint","port","protocol",
              "certificate","keystore","truststore","opentelemetry","trace","jaeger","zipkin"):
        if k in ttl or k in tx: keys.add(k)
    return sorted(keys)

def infer_deprecation(title: str, text: str) -> Dict[str, Optional[str]]:
    tx = (title + " " + text).lower()
    dep = any(tag in tx for tag in ["deprecated", "no longer supported", "superseded", "replaced by"])
    note = None
    if dep:
        # best-effort short note
        note = "Deprecated guidance detected from source text."
    return {
        "deprecated": dep,
        "deprecation_note": note,
        "version_deprecated": None,
        "version_removed": None
    }

def tokens_estimate(s: str) -> int:
    # rough, token ~ 4 chars heuristic
    return max(1, len(s) // 4)

def mk_id(rel: str, sec_i: int, part_i: int) -> str:
    return hashlib.sha1(f"{rel}:{sec_i}:{part_i}".encode()).hexdigest()

# ---------- Topics map ----------
def load_topics_map(path: str) -> List[Dict]:
    if not path:
        return []
    if not os.path.exists(path):
        print(f"[topics-map] file not found: {path}", file=sys.stderr)
        return []
    if yaml is None:
        print("[topics-map] PyYAML not available; skipping topics map.", file=sys.stderr)
        return []
    try:
        with open(path, "r", encoding="utf-8") as f:
            data = yaml.safe_load(f) or {}
        rules = data.get("rules", [])
        return rules if isinstance(rules, list) else []
    except Exception as e:
        print(f"[topics-map] failed to load: {e}", file=sys.stderr)
        return []

def apply_topics_map(rules: List[Dict], rel: str, section_title: str) -> Dict:
    out = {}
    for rule in rules:
        pat = rule.get("match")
        if not pat: 
            continue
        if any(fnmatch.fnmatch(rel, p.strip()) for p in pat.split("|")):
            for k in ("module","section_path","topics"):
                if k in rule:
                    out[k] = rule[k]
    # default section_path if missing
    if "section_path" not in out:
        topic = rel.split(os.sep, 1)[0] if os.sep in rel else "(root)"
        out["section_path"] = [topic, section_title] if section_title else [topic]
    return out

# ---------- Link normalization for emitted MD ----------
def is_relative_link(url: str) -> bool:
    u = url.strip()
    if u.startswith(("http://","https://","mailto:","#")):
        return False
    return True

def normalize_links(md_text: str, kb_root: str, rel: str, source_base: str) -> str:
    base_dir = os.path.dirname(rel)
    def _repl(m):
        text, url = m.group(1), m.group(2).strip()
        if not is_relative_link(url):
            return m.group(0)
        # Build absolute GitHub blob URL
        # Normalize path: rel may contain subdirs; url may be "./" "../" or filename
        norm = os.path.normpath(os.path.join(base_dir, url))
        abs_url = f"{source_base}/{kb_root}/{norm}"
        return f"[{text}]({abs_url})"
    return RE_MD_LINK.sub(_repl, md_text)

# ---------- Frontmatter for emitted MD ----------
def build_frontmatter(meta: Dict, version_default: str, owner: str, license_short: str) -> str:
    fm = {
        "id": meta.get("id"),
        "title": f"{meta.get('doc_title','')} — {meta.get('section_title','')}".strip(" —"),
        "owner": owner or meta.get("repo",""),
        "owned_by": owner or meta.get("repo",""),
        "module": meta.get("component"),
        "section_path": meta.get("section_path", []),
        "source_url": meta.get("source_url"),
        "source_path": meta.get("source_path"),
        "source_commit": meta.get("commit"),
        "license": license_short or "",
        "version_introduced": version_default or None,
        "version_deprecated": meta.get("version_deprecated"),
        "version_removed": meta.get("version_removed"),
        "deprecation_note": meta.get("deprecation_note"),
        "chunk_index": meta.get("chunk_index"),
        "chunk_count_in_section": meta.get("chunk_count_in_section"),
        "created_at_utc": time.strftime("%Y-%m-%dT%H:%M:%SZ", time.gmtime(meta.get("created_at", int(time.time())))),
        "tokens_estimate": meta.get("tokens_estimate")
    }
    # Remove None values for a cleaner frontmatter
    fm_clean = {k:v for k,v in fm.items() if v not in (None, "", [])}
    # Build YAML string
    import io
    buf = io.StringIO()
    buf.write("---\n")
    for k, v in fm_clean.items():
        if isinstance(v, list):
            buf.write(f"{k}: {json.dumps(v, ensure_ascii=False)}\n")
        else:
            buf.write(f"{k}: {json.dumps(v, ensure_ascii=False)}\n")
    buf.write("---\n\n")
    return buf.getvalue()

# ---------- Main ----------
def main():
    args = parse_args()
    repo  = os.environ.get("GITHUB_REPOSITORY","")
    sha   = os.environ.get("GITHUB_SHA","")
    ts    = int(time.time())

    out_dir = Path(args.out_dir)
    out_dir.mkdir(parents=True, exist_ok=True)
    out_jsonl = out_dir / "index.jsonl"
    out_md_dir = out_dir / "md"

    topics_rules = load_topics_map(args.topics_map) if args.topics_map else []

    written = 0
    with out_jsonl.open("w", encoding="utf-8") as out:
        for root, _, files in os.walk(args.kb_root):
            for name in files:
                if not any(name.lower().endswith(e) for e in args.ext):
                    continue
                full = os.path.join(root, name)
                rel  = os.path.relpath(full, args.kb_root)
                lines = read_lines(full)
                sections = split_sections(lines)
                doc_title = os.path.splitext(os.path.basename(full))[0].replace("-", " ").title()
                topic = rel.split(os.sep, 1)[0] if os.sep in rel else "(root)"

                for si, sec in enumerate(sections, start=1):
                    sec_text = "\n".join(sec["lines"]).strip()
                    if not sec_text: 
                        continue

                    # chunks for this section
                    parts = smart_chunkify(sec["lines"], args.max_chars, args.overlap)
                    source_url = f"{args.source_base}/{args.kb_root}/{rel}#L{sec['start']}-L{sec['end']}"
                    endpoints = extract_endpoints(sec_text)

                    # topics mapping
                    mapped = apply_topics_map(topics_rules, rel, sec["title"])

                    base_meta = {
                        "repo": repo, "commit": sha, "created_at": ts,
                        "source_path": f"{args.kb_root}/{rel}",
                        "source_url": source_url,
                        "topic": topic,
                        "doc_title": doc_title,
                        "section_title": sec["title"],
                        "section_level": sec["level"],
                        "doc_type": infer_doc_type(rel),
                        "component": mapped.get("module", infer_component(rel)),
                        "keywords": infer_keywords(sec["title"], sec_text),
                        "endpoints": endpoints,
                        "section_path": mapped.get("section_path", [topic, sec["title"]] if sec["title"] else [topic]),
                        "topics": mapped.get("topics", [])
                    }

                    # deprecation inference (best effort)
                    dep = infer_deprecation(sec["title"], sec_text)

                    # emit all chunks
                    total_in_section = len(parts)
                    prev_id = None
                    for pj, (c0, c1, chunk) in enumerate(parts, start=1):
                        rec_id = mk_id(rel, si, pj)
                        rec = {
                            "id": rec_id,
                            **base_meta,
                            "chunk_index": pj,
                            "chunk_count_in_section": total_in_section,
                            "char_span_in_section": [int(c0), int(c1)],
                            "content": chunk,
                            "tokens_estimate": tokens_estimate(chunk),
                            # versions / deprecation
                            "version_introduced": args.default_version or None,
                            "version_deprecated": dep["version_deprecated"],
                            "version_removed": dep["version_removed"],
                            "deprecated": dep["deprecated"],
                            "deprecation_note": dep["deprecation_note"],
                        }
                        out.write(json.dumps(rec, ensure_ascii=False) + "\n")
                        written += 1

                        # Optional Markdown emission
                        if args.emit_md:
                            md_body = chunk
                            md_body = normalize_links(md_body, args.kb_root, rel, args.source_base)
                            fm = build_frontmatter(
                                {**rec},
                                version_default=args.default_version,
                                owner=args.owner,
                                license_short=args.license
                            )
                            write_text(out_md_dir / f"{rec_id}.md", fm + md_body)

                        prev_id = rec_id

    print(f"[enhanced] wrote {written} chunks -> {out_jsonl}")

if __name__ == "__main__":
    main()