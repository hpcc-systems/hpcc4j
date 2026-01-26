
---
id: hpcc4j-connections-endpoints
title: Connections & Endpoints for HPCC4J
source:
  type: github_wiki
  url: https://github.com/hpcc-systems/hpcc4j/wiki
  ref_type: branch
  ref: master
  last_verified: 2026-01-23
applies_to:
  hpcc4j: ">= 7.4"
  hpcc_platform: ">= 6.0"
audience: developer
confidence: high
tags: [hpcc4j, wsclient, connection, endpoints, eclwatch, esp, wsdfu, wsworkunits, wssmc, wsecl, roxie]
---

## Summary
How HPCC4J connects to HPCC Systems’ **ESP (ECL Watch)** gateway and calls service endpoints such as **WsWorkunits**, **WsDFU**, **WsSMC**, and **WsECL**. Covers default ports, TLS, client builders, and endpoint conventions.

```chunk id="conn-esp-basics" kind="concept" tokens≈250
**What:** HPCC4J talks to the HPCC platform via the ESP (ECL Watch) process. Most Web Service APIs are exposed under ESP paths like `/WsWorkunits`, `/WsDFU`, `/WsSMC`, `/WsEcl`. [Javadoc HPCCWsWorkUnitsClient; HPCC4J repo overview]
```

```chunk id="conn-building-clients" kind="procedure" tokens≈380
**Goal:** Instantiate HPCC4J clients that point to the right ESP base and credentials.

**Approach A — High-level façade (`HPCCWsClient`):**
- Use static `get(protocol, host, port, user, pass)` or constructor overloads to create a session that can vend specific service clients (e.g., Workunits). Defaults target ECL Watch if not specified. [Javadoc HPCCWsClient]

**Approach B — Service-specific client over `Connection`:**
- Create a `Connection` (host, port, protocol, credentials), then pass it to a service client (e.g., `new HPCCWsWorkUnitsClient(connection)`).
- The Workunits client advertises its service path as `/WsWorkunits` (`WSWORKUNITSWSDLURI`). [Javadoc HPCCWsWorkUnitsClient]

**When to use which:**
- Use **A** for simple app flows or when the agent needs quick access to multiple WS areas via one handle.
- Use **B** for explicit control per service (timeouts, version targeting, advanced tuning).

**Notes for agents:**
- Always store the resolved **base URL** and **service path** separately: `${proto}://${host}:${port}` + service WSDL path (e.g., `/WsWorkunits`).
```

```chunk id="conn-endpoint-catalog" kind="reference" tokens≈320
**Common ESP Web Service endpoints** used by HPCC4J:

- **WsWorkunits** – Workunit create/run/monitor; path: `/WsWorkunits`.
- **WsDFU** – File/DFU operations.
- **WsSMC** – System management/cluster details.
- **WsECL / ECL Watch UI** – Query submit/playground and admin UI, typically on ECL Watch ports (8010/18010).
```

```chunk id="conn-ports-protocols" kind="concept" tokens≈260
**ECL Watch (ESP) listener ports (typical):**
- **HTTP:** 8010
- **HTTPS (TLS):** 18010

**Agent guidance:** Detect port/protocol from environment (config files, CI vars, or kube service), don’t hardcode; fall back to these conventions only for local/dev stacks.
```

```chunk id="conn-version-targeting" kind="constraint" tokens≈220
**Constraint:** Prefer the **platform APIs** (e.g., `HPCCWsClient` and service clients) over calling generated stubs directly—especially when refactors must span clusters with different platform versions.
```

```chunk id="conn-roxie-note" kind="concept" tokens≈220
**Roxie calls vs. ESP:** Query execution against **Roxie** is commonly orchestrated through ESP endpoints (e.g., WsWorkunits / WsECL) for submission/management.
```

```chunk id="conn-timeouts-limits" kind="reference" tokens≈260
**Defaults exposed by service clients (example: Workunits):**
- `defaultWaitTime` (ms), `defaultMaxWaitTime` (ms), `defaultResultLimit`, etc., are surfaced on classes like `HPCCWsWorkUnitsClient`. Tune per environment/workload.

**Agent guidance:** When proposing code changes that call long-running jobs, set explicit wait/retry limits rather than relying on defaults; cite the class-level constants in PR notes.
```

```chunk id="conn-k8s-considerations" kind="procedure" tokens≈260
**Goal:** Resolve ESP service address in Kubernetes.

**Steps:**
1) Discover the service (e.g., `esp` or `hpcc-esp`) in the target namespace; resolve ClusterIP/port or external ingress.
2) Use HTTPS if ingress terminates TLS; otherwise use internal service port.
3) Initialize `HPCCWsClient` or service clients with resolved `protocol, host, port`.
```

```chunk id="conn-tracing-otel" kind="concept" tokens≈230
**Tracing:** HPCC4J libraries (wsclient, dfsclient, Spark-HPCC) can participate in **OpenTelemetry** tracing, which is helpful for diagnosing connection and endpoint behavior across client ↔ ESP ↔ platform.
```

```chunk id="conn-failure-modes" kind="troubleshooting" tokens≈360
**Symptoms & likely causes:**
- **401/403 from ESP** → Missing/invalid credentials or insufficient scope.
- **“createRemoteActivity: unauthorized” when using DFSClient** → Cluster `Keys` configuration issues.
- **Read assertion errors (e.g., code 8029)** → Record layout mismatch vs. on-disk layout during reads.

**Agent playbook:**
1) Reproduce against the exact ESP base + service path & version context.
2) Capture ESP response payloads and correlate with Otel spans if enabled.
3) Suggest config/permissions fixes in PR, referencing admin docs or cluster runbooks where appropriate.
```
