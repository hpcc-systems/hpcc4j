
---
id: hpcc4j-troubleshooting-common
title: Common Issues and Solutions (HPCC4J)
source:
  type: github_wiki
  url: https://github.com/hpcc-systems/hpcc4j/wiki/Common-Issues-and-Solutions
  ref_type: branch
  ref: master
  last_verified: 2026-01-23
applies_to:
  hpcc4j: ">= 7.4"
  hpcc_platform: ">= 6.4"
audience: developer
confidence: high
tags: [hpcc4j, troubleshooting, dfsclient, wsclient, authorization, keys]
---

## Summary
Curated atomic troubleshooting units directly distilled from the HPCC4J wiki page.

```chunk id="issue-axis2-incompatible-wrapper" kind="troubleshooting"
**Symptom:** Java build-time error due to Axis2 wrapper type name drift (e.g., `<fieldName>_typeX`).
**Cause:** Axis2 stub code for repeating fields may change container class naming across versions.
**Next steps:** Update consumer code to match new wrapper classes; track long-term fix as per wiki’s referenced JIRA.
```

```chunk id="issue-dfsclient-unauthorized" kind="troubleshooting"
**Symptom:** DFSClient errors like "createRemoteActivity: unauthorized"; read failures for copy locations.
**Cause:** Misconfigured/absent `Keys`/`ClusterGroup` (invalid keypairs, inconsistent paths, or missing association).
**Next steps:** Validate cluster `Keys` configuration and keypair consistency; associate the correct keypair with the target group.
```

```chunk id="issue-esp-scope-denied" kind="troubleshooting"
**Symptom:** ESP returns "Create access denied for scope".
**Cause:** Insufficient file-scope permissions on the target cluster.
**Next steps:** Request appropriate scope permissions; align environments when permissions differ.
```

```chunk id="issue-assert-8029" kind="troubleshooting"
**Symptom:** Assertion `Code: '8029' ... assert (required <= maxAvailable())`.
**Cause:** Source record layout mismatch vs. on-disk layout.
**Next steps:** Reconcile record definitions with stored metadata; regenerate schemas as needed.
```
