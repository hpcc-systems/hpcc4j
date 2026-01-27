
---
id: hpcc4j-tracing-support
title: HPCC4J Tracing Support (OpenTelemetry)
source:
  type: github_wiki
  url: https://github.com/hpcc-systems/hpcc4j/wiki/HPCC4J-Tracing-Support
  ref_type: branch
  ref: master
  last_verified: 2026-01-23
applies_to:
  hpcc4j: ">= 9.6.48"
audience: developer
confidence: high
tags: [hpcc4j, tracing, opentelemetry, observability, javaagent]
---

## Summary
Guidance for enabling and using HPCC4J tracing via the OpenTelemetry Java Agent: prerequisites, architecture, and configuration pointers derived from the HPCC4J wiki.

```chunk id="otel-arch" kind="concept"
**Architecture:** Client application ↔ hpcc4j library ↔ HPCC Platform (ESP/Roxie/Thor) ↔ External Gateways, with spans exported to an Observability Service (e.g., Elastic APM, Jaeger, Zipkin) optionally via collectors. The Java Agent provides zero‑code instrumentation. (Source: HPCC4J Tracing Support wiki)
```

```chunk id="otel-prereqs" kind="reference"
**Prerequisites:**
- HPCC4J library versions ≥ 9.6.48 / 9.8.22 for enhanced tracing hooks.
- OpenTelemetry Java Agent ≥ 2.6.0.
- Access to an observability backend (Elastic APM, Jaeger, Zipkin) and, if needed, an intermediary collector. (Source: HPCC4J Tracing Support wiki)
```

```chunk id="otel-config" kind="procedure"
**Configuration (high‑level):**
1) Attach the Otel Java Agent at startup (e.g., `-javaagent:/path/opentelemetry-javaagent.jar`).
2) Set exporter/endpoint env vars per your backend (e.g., OTEL_EXPORTER_OTLP_ENDPOINT).
3) Ensure all components (client + HPCC Platform) export to the same aggregation system for end‑to‑end traces. (Source: HPCC4J Tracing Support wiki)
```

```chunk id="otel-agent-tips" kind="reference"
**Agent tips:** Align service names and attributes; propagate trace context across HTTP calls to ESP. Prefer central configuration over code changes. (Source: HPCC4J Tracing Support wiki)
```
