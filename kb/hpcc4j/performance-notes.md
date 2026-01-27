
---
id: hpcc4j-performance-notes
title: Performance Notes (HPCC4J)
source:
  type: github_wiki
  url: https://github.com/hpcc-systems/hpcc4j/wiki/Performance-Notes
  ref_type: branch
  ref: master
  last_verified: 2026-01-23
audience: developer
confidence: high
tags: [hpcc4j, performance, concurrency, atomics, tracing]
---

## Summary
Extracts key lessons from the HPCC4J wiki’s Performance Notes, including concurrency pitfalls with shared Atomics and how tracing helped diagnose bottlenecks.

```chunk id="perf-atomics" kind="concept"
**Shared Atomic contention:** Under multi‑threaded load, updating a shared Atomic can cause cache line ping‑pong and stall throughput. A per‑thread counter + periodic aggregation removed a bottleneck and yielded ~6× throughput improvement in the noted scenario. (Source: Performance Notes wiki)
```

```chunk id="perf-guidance" kind="constraint"
**Guidance:** Avoid hot shared Atomics in read/write loops. Prefer per‑partition/per‑thread metrics and aggregate less frequently. Consider tracing (Otel) to confirm where stalls occur before assuming network limits. (Source: Performance Notes wiki)
```
