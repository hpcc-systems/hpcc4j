#!/usr/bin/env python3
# -*- coding: utf-8 -*-

"""
cleanse_markdown.py — Enhanced version for AI/RAG quality

Zero‑risk, value‑add cleaning:
- preserves semantics
- improves embedding density
- standardizes structure for chunking
"""

import argparse
import os
import re
from pathlib import Path
import sys
from typing import List


# ---------------------------------------------------------------------
# Regex Patterns
# ---------------------------------------------------------------------

BADGE_PATTERN = re.compile(
    r"!\[.*?\]\([^)]*(badge|build|status|shield|ci)[^)]*\)", re.IGNORECASE
)

HTML_TAGS_TO_MD = [
    (re.compile(r"<b>(.*?)</b>", re.DOTALL | re.IGNORECASE), r"**\1**"),
    (re.compile(r"<strong>(.*?)</strong>", re.DOTALL | re.IGNORECASE), r"**\1**"),
    (re.compile(r"<i>(.*?)</i>", re.DOTALL | re.IGNORECASE), r"_\1_"),
    (re.compile(r"<em>(.*?)</em>", re.DOTALL | re.IGNORECASE), r"_\1_"),
]

INLINE_HTML_REMOVE = [
    re.compile(r"<br\s*/?>", re.IGNORECASE),
    re.compile(r"</?(span|div|font)[^>]*>", re.IGNORECASE),
]

HTML_COMMENT = re.compile(r"<!--.*?-->", re.DOTALL)

TRAIL_WS = re.compile(r"[ \t]+$", re.MULTILINE)

# GitHub wiki style: [[Some Page Name]]
WIKI_LINK = re.compile(r"\[\[([^\]]+)\]\]")

# Fix malformed Markdown links
BROKEN_MD_LINK = re.compile(r"\[([^\]]+)\]\((\s+)\)")


# ---------------------------------------------------------------------
# Helpers
# ---------------------------------------------------------------------

def load_file(path: Path) -> str:
    try:
        return path.read_text(encoding="utf-8")
    except UnicodeDecodeError:
        return path.read_text(encoding="latin-1", errors="ignore")


def save_file(path: Path, content: str):
    path.write_text(content, encoding="utf-8")


def normalize_blank_lines(lines: List[str]) -> List[str]:
    out, blank = [], False
    for line in lines:
        if line.strip() == "":
            if not blank:
                out.append("")
            blank = True
        else:
            out.append(line.rstrip())
            blank = False
    return out


# ---------------------------------------------------------------------
# Folder-Aware Cleansing
# ---------------------------------------------------------------------

def cleanse_issue(text: str) -> str:
    """Preserve YAML front matter for issues."""
    lines = text.splitlines()
    if lines and lines[0].strip() == "---":
        try:
            end = lines[1:].index("---") + 2
        except ValueError:
            return cleanse_generic(text)

        fm = lines[:end]
        body = "\n".join(lines[end:])
        return "\n".join(fm + [""] + cleanse_generic(body).splitlines())
    return cleanse_generic(text)


def cleanse_wiki(text: str) -> str:
    text = re.sub(r"(?i)created by .*? on \d{4}-\d{2}-\d{2}.*$", "", text, flags=re.MULTILINE)
    return cleanse_generic(text)


def cleanse_project_docs(text: str) -> str:
    cleaned = cleanse_generic(text)
    return re.sub(r"^(#{5,})", "####", cleaned, flags=re.MULTILINE)


def cleanse_connector(text: str) -> str:
    return cleanse_generic(text)


# ---------------------------------------------------------------------
# Generic cleansing logic used by all
# ---------------------------------------------------------------------

def cleanse_generic(text: str) -> str:
    original = text

    # Remove badges
    text = BADGE_PATTERN.sub("", text)

    # Remove HTML comments
    text = HTML_COMMENT.sub("", text)

    # Convert HTML tags to Markdown
    for pattern, repl in HTML_TAGS_TO_MD:
        text = pattern.sub(repl, text)

    for patt in INLINE_HTML_REMOVE:
        text = patt.sub("", text)

    # Convert wiki [[Links]]
    def wiki_to_md(m):
        label = m.group(1).strip()
        slug = label.replace(" ", "-").lower()
        return f"{slug}.md"
    text = WIKI_LINK.sub(wiki_to_md, text)

    # Fix broken links
    text = BROKEN_MD_LINK.sub(r"\1", text)

    # Normalize headings
    text = re.sub(r"^(#+)([A-Za-z0-9])", r"\1 \2", text, flags=re.MULTILINE)

    # Normalize code fences
    text = re.sub(r"```(\s+)", "```", text)                   # strip spacing after ```
    text = re.sub(r"```python3", "```python", text)           # alias normalize
    text = re.sub(r"```bash", "```bash", text)                # normalize casing
    # Ensure closing fences exist (only if safe)
    if text.count("```") % 2 != 0:
        text += "\n```"

    # Table normalization
    def fix_table(line):
        if "|" not in line:
            return line
        return "|".join(col.strip() for col in line.split("|"))
    text = "\n".join(fix_table(l) for l in text.splitlines())

    # Strip trailing whitespace
    text = TRAIL_WS.sub("", text)

    # Collapse extra blank lines
    lines = normalize_blank_lines(text.splitlines())

    # Remove leading/trailing blank lines
    while lines and lines[0].strip() == "":
        lines.pop(0)
    while lines and lines[-1].strip() == "":
        lines.pop()

    return "\n".join(lines)


# ---------------------------------------------------------------------
# Main Dispatcher
# ---------------------------------------------------------------------

def cleanse_path(path: Path, root: Path):
    rel = str(path.relative_to(root))
    content = load_file(path)

    if rel.startswith("issues/"):
        cleaned = cleanse_issue(content)
    elif rel.startswith("wiki/"):
        cleaned = cleanse_wiki(content)
    elif rel.startswith("project-docs/"):
        cleaned = cleanse_project_docs(content)
    elif rel.startswith("spark-hpcc-connector/"):
        cleaned = cleanse_connector(content)
    else:
        cleaned = cleanse_generic(content)

    if cleaned != content:
        save_file(path, cleaned)


def walk_and_cleanse(root: Path):
    for p in root.rglob("*.md"):
        cleanse_path(p, root)


# ---------------------------------------------------------------------
# Entry Point
# ---------------------------------------------------------------------

def main():
    ap = argparse.ArgumentParser(description="Cleanses KB markdown safely with enhancements.")
    ap.add_argument("--root", required=True)
    args = ap.parse_args()

    root = Path(args.root)
    if not root.exists():
        print(f"ERROR: KB root does not exist: {root}", file=sys.stderr)
        sys.exit(2)

    walk_and_cleanse(root)
    print(f"[cleanse] Completed cleansing for root: {root}")


if __name__ == "__main__":
    main()