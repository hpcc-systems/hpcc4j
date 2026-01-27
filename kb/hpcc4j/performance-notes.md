
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
Key performance takeaways from the HPCC4J wiki with agent‑safe guidance.

```chunk id="perf-atomics" kind="concept"
**Shared Atomic contention:** Under heavy threading, a single shared Atomic can cause cache‑line ping‑pong; switching to per‑thread counters with periodic aggregation removed the bottleneck and improved throughput significantly in the reported scenario.
```

```chunk id="perf-guidance" kind="constraint"
**Guidance:** Avoid hot shared Atomics in tight loops; aggregate less frequently; use tracing to verify where stalls occur before assuming network limits.
```
