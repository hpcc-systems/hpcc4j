
---
id: hpcc-platform-auth
title: HPCC Platform Authentication (Client-Side Expectations)
source:
  type: multi
  urls:
    - https://github.com/hpcc-systems/hpcc4j
    - https://javadoc.io/doc/org.hpccsystems/wsclient
    - https://hpccsystems.com/training/documentation/all/
  ref_type: concept
  last_verified: 2026-01-23
applies_to:
  hpcc4j: ">= 7.4"
  hpcc_platform: ">= 6.0"
audience: developer
confidence: high
tags: [hpcc4j, esp, eclwatch, authentication, tls, mTLS, authorization, dfsclient]
---

## Summary
The HPCC **platform (ESP/ECL Watch)** enforces authentication and authorization. HPCC4J does **not** implement its own auth mechanism; it **conforms** to the platform’s requirements by sending credentials over HTTP(S) and, when configured, client certificates.

```chunk id="auth-core-model" kind="concept"
Authentication decisions are made by the HPCC platform at the ESP layer.
HPCC4J clients must supply credentials and transport properties required
by the server configuration.
```

```chunk id="auth-basic" kind="concept"
ESP commonly uses HTTP Basic Authentication (username/password).
HPCC4J supplies these credentials to the platform but does not manage
identity itself.
```

```chunk id="auth-tls" kind="concept"
TLS secures transport and authenticates the server.
Clients must trust the ESP certificate chain via a JVM truststore.
```

```chunk id="auth-mtls" kind="procedure"
Some clusters require mutual TLS. In this case, the client must present
a valid certificate via a JVM keystore. Authentication remains a
server-side decision.
```

```chunk id="auth-authorization" kind="concept"
Authorization failures (403) indicate permission issues after successful
authentication and must not be confused with authentication errors.
```

```chunk id="auth-dfsclient" kind="concept"
DFSClient operations use cluster keypairs independent of ESP authentication.
```
