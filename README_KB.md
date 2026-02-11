
# HPCC4J Knowledge Base Builder

This document describes the comprehensive Knowledge Base (KB) infrastructure for HPCC4J, designed to support AI agents and automated documentation systems.

## Overview

The KB system converts project documentation, JIRA issues, and code examples into a structured format optimized for AI consumption. It includes vector indexing capabilities for Retrieval-Augmented Generation (RAG) systems.

## KB Processing Flow

```
[GitHub Repo]
   |
   | (push to KB folders)
   v
[KB Refinement CI Workflow]
   - cleanse
   - convert
   - chunk (policy-aware)
   - generate index.jsonl
   - embed (optional next stage)
   - upload artifacts / store versioned index
   |
   v
[Vector Store / S3 / Blob / Artifact]
   |
   v
[AI Agent]
   - loads index
   - retrieves relevant chunks
   - produces grounded answers
```

This automated pipeline ensures that any changes to knowledge base content are automatically processed, indexed, and made available for AI consumption.

## Structure

### Core Directories

- `kb/hpcc4j/issues/` — 771 JIRA issues from hpccsystems.atlassian.net converted to markdown
- `kb/hpcc4j/project-docs/` — Essential project documentation (architecture, migration guides)
- `kb/hpcc4j/spark-hpcc-connector/` — Spark connector examples and documentation
- `kb/hpcc4j/wiki/` — Wiki content integrated as Git submodule

### Processing Scripts

Located in `.github/scripts/kb/`:

- `kb-source-markdow-chunk.py` — Primary KB builder script
- `cleanse_markdown.py` — Markdown cleanup and standardization
- `convert_any_to_md.py` — Multi-format to markdown conversion
- `kb-chunk-with-policy.py` — Configurable document chunking
- `kb_index_chroma_from_jsonl.py` — Vector embedding generation
- `chunking-policy.yml` — Chunking configuration parameters

## Build Process

### Local Development

1. **Basic KB Generation:**
   ```bash
   python3 .github/scripts/kb/kb-source-markdow-chunk.py \
     --repo-root /path/to/hpcc4j \
     --out kb/hpcc4j/10.0.20-1 \
     --version 10.0.20-1 \
     --maven-opts -DskipTests
   ```

2. **Vector Index Generation:**
   ```bash
   python3 .github/scripts/kb/kb_index_chroma_from_jsonl.py \
     --input kb/hpcc4j/10.0.20-1/chunks/ \
     --output .kb_index
   ```

### Prerequisites

- **Python 3.11+** with pip
- **Java 17+** and Maven on PATH  
- **Git** with submodule access

Required Python packages (auto-installed during execution):
- `beautifulsoup4` — HTML parsing
- `markdownify` — HTML to markdown conversion  
- `nbformat` — Jupyter notebook processing
- `lxml` — XML/HTML processing
- `langchain-community` — Vector store integration
- `chromadb` — Vector database
- `sentence-transformers` — Embedding models

### GitHub Actions Integration

The system includes automated workflows:

- `.github/workflows/kb-refinement.yml` — Automated KB processing and refinement
- Triggered on changes to `kb/**` paths or manual dispatch
- Generates vector embeddings using HuggingFace transformers
- No API keys required (uses local sentence-transformers models)

## Output Structure

```
kb/hpcc4j/<version>/
├── chunks/          # Individual document chunks as JSON
├── index.json       # Metadata index of all chunks
└── embeddings/      # Vector embeddings (if generated)
```

Each chunk includes:
- Content text and metadata
- Source file provenance  
- Chunk boundaries and overlap information
- Embedding vectors (when generated)

## Configuration

### Chunking Policy (`chunking-policy.yml`)

Configure document processing parameters:
- Chunk size and overlap settings
- File type specific processing rules
- Metadata extraction patterns
- Content filtering rules

### Environment Variables

- `KB_DIR` — Source directory (default: `kb`)
- `KB_DB_DIR` — Vector database output (default: `.kb_index`)
- `KB_CHUNK_SIZE` — Chunk size in characters (default: 900)
- `KB_CHUNK_OVERLAP` — Overlap between chunks (default: 120)
- `KB_EMBED_MODEL` — Transformer model (default: `sentence-transformers/all-MiniLM-L6-v2`)

## Usage Patterns

### For AI Agents
The structured JSON chunks with metadata enable:
- Semantic search across project documentation
- Context-aware code assistance  
- Automated issue triage and resolution
- Documentation generation

### For Development Teams
- Centralized knowledge repository
- Version-controlled documentation snapshots
- Automated documentation validation
- Cross-project knowledge sharing

## Notes

- The KB system does **not** affect runtime builds or application behavior
- Vector indices are generated separately and can be regenerated as needed  
- All processing is designed to be reproducible and version-controlled
- JIRA content is automatically synchronized and converted to markdown format
