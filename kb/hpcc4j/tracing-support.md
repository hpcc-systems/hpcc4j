
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
Enable HPCC4J tracing with the OpenTelemetry Java Agent; establish end‑to‑end visibility across client ↔ hpcc4j ↔ HPCC Platform.

```chunk id="otel-arch" kind="concept"
**Architecture:** Client ↔ hpcc4j ↔ HPCC Platform (ESP/Roxie/Thor) ↔ External Gateways → Observability Service (Elastic APM/Jaeger/Zipkin), optionally via collectors.
```

```chunk id="otel-prereqs" kind="reference"
**Prereqs:** HPCC4J ≥ 9.6.48 / 9.8.22; OpenTelemetry Java Agent ≥ 2.6.0; access to an observability backend and, if needed, a collector.
```

```chunk id="otel-config" kind="procedure"
**Setup:** Attach `-javaagent:/path/opentelemetry-javaagent.jar`; set exporter/endpoint env vars (e.g., OTEL_EXPORTER_OTLP_ENDPOINT); align all components to the same backend.
```

```chunk id="otel-agent-tips" kind="reference"
**Tips:** Align service names; propagate context across ESP calls; prefer centralized config over code changes.
```
