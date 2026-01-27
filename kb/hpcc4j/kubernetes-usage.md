
---
id: hpcc4j-k8s-usage
title: Using HPCC4J with HPCC on a Kubernetes Cluster
source:
  type: github_wiki
  url: https://github.com/hpcc-systems/hpcc4j/wiki/Using-HPCC4J-with-HPCC-on-a-Kubernetes-Cluster
  ref_type: branch
  ref: master
  last_verified: 2026-01-23
applies_to:
  hpcc4j: ">= 7.4"
  hpcc_platform: ">= 8.0"
audience: developer
confidence: high
tags: [hpcc4j, kubernetes, helm, cert-manager, tls, rowservice]
---

## Summary
How to configure HPCC4J to connect securely to an HPCC Systems cluster on Kubernetes. Derived from the HPCC4J wiki, including Cert‑Manager setup, creating a local CA, enabling `dafilesrv.rowservice`, and Helm overrides.

```chunk id="k8s-cert-manager" kind="procedure"
**Goal:** Install and configure Cert‑Manager for HPCC.
**From wiki:** Add Jetstack Helm repo, apply CRDs, install chart; create a local CA as Kubernetes secrets and use them as issuers for ESP/cluster certs.
```

```chunk id="k8s-root-ca" kind="procedure"
**Goal:** Create a root CA for signing cluster certificates.
**From wiki:** Use OpenSSL (cfg with `basicConstraints=CA:true`) to generate CA key/cert and store as `hpcc-local-issuer-key-pair` and `hpcc-signing-issuer-key-pair` secrets.
```

```chunk id="k8s-values-overrides" kind="procedure"
**Goal:** Enable services HPCC4J depends on; configure TLS via Helm values.
**Highlights:** `certificates.enabled: true`; `dafilesrv` includes `rowservice` at `servicePort: 7600` (visibility `global`); optional `direct-access`; include `spray-service`.
```

```chunk id="k8s-agent-tips" kind="reference"
**Agent tips:** Import the cluster CA into a JVM truststore; use HTTPS to the ESP service/ingress; prefer config/values over hardcoding.
```
