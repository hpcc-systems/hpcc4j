#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
convert_any_to_md.py

Purpose:
  Recursively convert "any" file in a root directory to low-noise Markdown suitable for KB ingestion.
  - Converts known formats to .md next to the source (or into an --out-root), preserving relative paths.
  - Writes a small stub .md for unsupported/corrupt files (unless --fail-on-error).
  - Never fails the job by default; returns non-zero only with --fail-on-error on conversion failures.

Supported conversions (best-effort):
  - .md, .markdown       -> normalized Markdown (pass-through)
  - .txt                 -> wrapped as Markdown
  - .ipynb               -> Markdown via nbformat + nbconvert (outputs stripped)
  - .docx                -> text via python-docx
  - .html/.htm           -> text via BeautifulSoup4
  - .pdf                 -> text via pdfminer.six (if installed)
  - code files (.java, .py, .xml, .json, .yml/.yaml, .ini, .cfg, .sh, .bat, .groovy, .scala, .sql, .properties)
                         -> fenced code block with language hint
  - images and binaries  -> stub unless --skip-binaries

Usage (example):
  python .github/scripts/convert_any_to_md.py \
      --root kb \
      --out-root kb   \
      --remove-source false \
      --exclude "topics/tests-*/**" "*/node_modules/**" \
      --preview 0

Exit codes:
  0 = success (converted OR stubbed/skipped as per flags)
  1 = hard failure if --fail-on-error and at least one conversion failed
"""

import argparse, sys, os, shutil, fnmatch, mimetypes
from pathlib import Path

# Optional imports (loaded lazily)
def _lazy(module_name):
    try:
        return __import__(module_name)
    except Exception:
        return None

# ---- CLI ----
def parse_args():
    p = argparse.ArgumentParser(description="Convert arbitrary files under --root into Markdown for KB ingestion.")
    p.add_argument("--root", required=True, help="Input root directory to walk (e.g., kb)")
    p.add_argument("--out-root", default="", help="Output root for .md (default: in-place under --root)")
    p.add_argument("--remove-source", action="store_true", help="Remove original after successful conversion")
    p.add_argument("--fail-on-error", action="store_true", help="Exit 1 if any conversion fails")
    p.add_argument("--preview", type=int, default=0, help="Print first N lines of each produced .md")
    p.add_argument("--exclude", nargs="*", default=[], help="Glob patterns to exclude (relative to --root)")
    p.add_argument("--skip-binaries", action="store_true", help="Skip binaries instead of stubbing them")
    return p.parse_args()

# ---- Small helpers ----
TEXT_EXT = {
    ".md",".markdown",".txt",".csv",".tsv",".ini",".cfg",".properties",".conf",".log",".rst",".adoc",
    ".json",".yml",".yaml",".xml",".toml",".gitignore",".gitattributes",".editorconfig",
}
CODE_LANG_MAP = {
    ".java":"java",".py":"python",".xml":"xml",".json":"json",
    ".yml":"yaml",".yaml":"yaml",".ini":"ini",".cfg":"ini",".sh":"bash",".bat":"batch",
    ".groovy":"groovy",".scala":"scala",".sql":"sql",".properties":"ini",".gradle":"groovy",
    ".rb":"ruby",".go":"go",".c":"c",".h":"c",".hpp":"cpp",".cpp":"cpp",".cs":"csharp",".ts":"ts",".js":"js",
    ".mjs":"js",".jsx":"jsx",".tsx":"tsx",".kt":"kotlin",".swift":"swift",".ps1":"powershell",
}

BINARY_EXT = {
    ".png",".jpg",".jpeg",".gif",".bmp",".tiff",".ico",".icns",".webp",".svg",
    ".pdf",".zip",".tar",".gz",".tgz",".7z",".jar",".war",".ear",".class",".so",".dll",
    ".exe",".dylib",".a",".o",".bin",
}

def rel_to_out(out_root: Path, in_root: Path, src: Path, new_suffix: str) -> Path:
    rel = src.relative_to(in_root)
    rel = rel.with_suffix(new_suffix)
    return (out_root / rel).resolve()

def ensure_parent(p: Path):
    p.parent.mkdir(parents=True, exist_ok=True)

def write_text(p: Path, s: str):
    ensure_parent(p); p.write_text(s, encoding="utf-8")

def head_preview(p: Path, n: int):
    if n <= 0: return
    try:
        print(f"[preview] {p}:")
        with p.open("r", encoding="utf-8", errors="ignore") as f:
            for i, line in enumerate(f):
                print(line.rstrip("\n"))
                if i+1 >= n: break
    except Exception as e:
        print(f"[preview] failed for {p}: {e}", file=sys.stderr)

def is_excluded(rel_path: str, exclude_globs):
    return any(fnmatch.fnmatch(rel_path, g) for g in exclude_globs)

def is_binary_by_mime(path: Path):
    mime, _ = mimetypes.guess_type(str(path))
    if mime is None:  # unknown
        return False
    return not mime.startswith(("text/", "application/json", "application/xml"))

# ---- Converters ----
def convert_markdown(src: Path) -> str:
    # Normalize lightly: ensure trailing newline; you can expand with md lint later
    s = src.read_text(encoding="utf-8", errors="ignore")
    if not s.endswith("\n"): s += "\n"
    return s

def convert_text(src: Path, title=None) -> str:
    body = src.read_text(encoding="utf-8", errors="ignore")
    title = title or src.name
    return f"# {title}\n\n```\n{body}\n```\n"

def convert_code(src: Path, lang: str) -> str:
    body = src.read_text(encoding="utf-8", errors="ignore")
    title = src.name
    return f"# {title}\n\n```{lang}\n{body}\n```\n"

def convert_ipynb(src: Path) -> str:
    nbformat = _lazy("nbformat")
    nbconvert = _lazy("nbconvert")
    if not nbformat or not nbconvert:
        raise RuntimeError("nbformat/nbconvert not installed")
    nb = nbformat.read(src, as_version=4)
    from traitlets.config import Config
    from nbconvert.exporters import MarkdownExporter
    c = Config()
    c.TemplateExporter.exclude_output = True
    exporter = MarkdownExporter(config=c)
    body, _res = exporter.from_notebook_node(nb)
    return body

def convert_docx(src: Path) -> str:
    docx = _lazy("docx") or _lazy("python_docx")
    if not docx:
        raise RuntimeError("python-docx not installed")
    from docx import Document
    d = Document(str(src))
    lines = []
    for p in d.paragraphs:
        txt = p.text.strip("\r")
        if txt: lines.append(txt)
    text = "\n\n".join(lines)
    return f"# {src.name}\n\n{text}\n"

def convert_html(src: Path) -> str:
    bs4 = _lazy("bs4")
    if not bs4:
        raise RuntimeError("beautifulsoup4 not installed")
    from bs4 import BeautifulSoup
    html = src.read_text(encoding="utf-8", errors="ignore")
    soup = BeautifulSoup(html, "html.parser")
    text = soup.get_text("\n")
    return f"# {src.name}\n\n{text}\n"

def convert_pdf(src: Path) -> str:
    pdfminer = _lazy("pdfminer")
    if not pdfminer:
        # pdfminer.six exposes miner via pdfminer.high_level
        # Import lazily to avoid heavy import if not needed
        try:
            from pdfminer.high_level import extract_text
        except Exception as e:
            raise RuntimeError("pdfminer.six not installed") from e
    else:
        from pdfminer.high_level import extract_text
    text = extract_text(str(src)) or ""
    return f"# {src.name}\n\n{text}\n"

def write_stub(out_md: Path, src: Path, reason: str):
    msg = f"""# {src.name} (stub)

> This file could not be converted to Markdown during CI.

**Reason:** {reason}

**Path:** `{src}`

## Next steps
- Convert locally (e.g., open and export to Markdown), or
- Provide a human-curated summary and save it as `{out_md.name}`.
"""
    write_text(out_md, msg)

# ---- Main walk ----
def main():
    args = parse_args()
    in_root = Path(args.root).resolve()
    out_root = Path(args.out_root).resolve() if args.out_root else in_root

    if not in_root.exists():
        print(f"[error] --root not found: {in_root}", file=sys.stderr)
        return 1

    converted = 0
    stubbed = 0
    skipped = 0
    failed = 0

    for src in in_root.rglob("*"):
        if not src.is_file():
            continue
        rel = str(src.relative_to(in_root)).replace("\\", "/")
        if is_excluded(rel, args.exclude):
            # print(f"[skip] excluded: {rel}")
            skipped += 1
            continue

        ext = src.suffix.lower()
        out_md = rel_to_out(out_root, in_root, src, ".md")

        # A) already .md → normalize pass-through
        if ext in {".md", ".markdown"}:
            try:
                md = convert_markdown(src)
                write_text(out_md, md)
                if args.remove_source and (out_md != src):
                    src.unlink(missing_ok=True)
                head_preview(out_md, args.preview)
                converted += 1
            except Exception as e:
                failed += 1
                write_stub(out_md, src, f"Markdown normalization failed: {e}")
            continue

        # B) simple text
        if ext in {".txt", ".rst", ".adoc"}:
            try:
                md = convert_text(src, title=src.stem.replace("_"," ").title())
                write_text(out_md, md)
                if args.remove_source:
                    src.unlink(missing_ok=True)
                head_preview(out_md, args.preview)
                converted += 1
            except Exception as e:
                failed += 1
                write_stub(out_md, src, f"Plain text conversion failed: {e}")
            continue

        # C) notebooks
        if ext == ".ipynb":
            try:
                md = convert_ipynb(src)
                write_text(out_md, md)
                if args.remove_source:
                    src.unlink(missing_ok=True)
                head_preview(out_md, args.preview)
                converted += 1
            except Exception as e:
                # fallback: stub
                stubbed += 1
                write_stub(out_md, src, f"Notebook conversion failed: {e}")
            continue

        # D) docx
        if ext == ".docx":
            try:
                md = convert_docx(src)
                write_text(out_md, md)
                if args.remove_source:
                    src.unlink(missing_ok=True)
                head_preview(out_md, args.preview)
                converted += 1
            except Exception as e:
                stubbed += 1
                write_stub(out_md, src, f"DOCX conversion failed: {e}")
            continue

        # E) html
        if ext in {".html",".htm"}:
            try:
                md = convert_html(src)
                write_text(out_md, md)
                if args.remove_source:
                    src.unlink(missing_ok=True)
                head_preview(out_md, args.preview)
                converted += 1
            except Exception as e:
                stubbed += 1
                write_stub(out_md, src, f"HTML conversion failed: {e}")
            continue

        # F) pdf
        if ext == ".pdf":
            try:
                md = convert_pdf(src)
                write_text(out_md, md)
                if args.remove_source:
                    src.unlink(missing_ok=True)
                head_preview(out_md, args.preview)
                converted += 1
            except Exception as e:
                if args.skip_binaries:
                    skipped += 1
                else:
                    stubbed += 1
                    write_stub(out_md, src, f"PDF conversion failed: {e}")
            continue

        # G) code-ish text files
        if ext in CODE_LANG_MAP or ext in TEXT_EXT:
            lang = CODE_LANG_MAP.get(ext, "")
            try:
                if lang:
                    md = convert_code(src, lang=lang)
                else:
                    md = convert_text(src, title=src.name)
                write_text(out_md, md)
                if args.remove_source:
                    src.unlink(missing_ok=True)
                head_preview(out_md, args.preview)
                converted += 1
            except Exception as e:
                stubbed += 1
                write_stub(out_md, src, f"Code/text conversion failed: {e}")
            continue

        # H) obvious binaries
        if ext in BINARY_EXT or is_binary_by_mime(src):
            if args.skip_binaries:
                skipped += 1
            else:
                stubbed += 1
                write_stub(out_md, src, f"Binary or unsupported file type: {ext or 'unknown'}")
            continue

        # I) default: treat as text with a stub on failure
        try:
            md = convert_text(src, title=src.name)
            write_text(out_md, md)
            if args.remove_source:
                src.unlink(missing_ok=True)
            head_preview(out_md, args.preview)
            converted += 1
        except Exception as e:
            stubbed += 1
            write_stub(out_md, src, f"Unknown file type conversion failed: {e}")

    # Summary
    print(f"[summary] converted={converted} stubbed={stubbed} skipped={skipped} failed={failed}")
    if args.fail_on_error and (failed > 0):
        return 1
    return 0

if __name__ == "__main__":
    sys.exit(main())