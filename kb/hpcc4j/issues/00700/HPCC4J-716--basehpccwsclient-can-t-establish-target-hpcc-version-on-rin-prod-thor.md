---
id: jira-HPCC4J-716
title: "HPCC4J-716 – BaseHPCCWsClient can't establish target HPCC version on rin-prod-thor"
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-716"
project: HPCC4J
key: HPCC4J-716
status: Awaiting Information
statusCategory: In Progress
resolution: null
created: 2025-05-09
updated: 2025-09-23
resolved: null
components:   - WSClient
fixVersions: []
labels: []
applies_to: hpcc4j: *
audience: developer
confidence: medium
tags:
- jira
- change-log
- rationale
---
## Outcome (from JIRA)
BaseHPCCWsClient can't establish target HPCC version on rin-prod-thor

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Lentic Manager is reporting errors communicating with HPCC on "}]}, {"type": "paragraph", "content": [{"type": "text", "text": "https://rin-prod-thor-alpha.hpcc.risk.regn.net:18010/wssmc/getbuildinfo", "marks": [{"type": "link", "attrs": {"href": "https://rin-prod-thor-alpha.hpcc.risk.regn.net:18010/wssmc/getbuildinfo"}}]}]}, {"type": "codeBlock", "content": [{"type": "text", "text": "INFO: AutoConfiguredOpenTelemetrySdk found on classpath but automatic configuration is disabled. To enable, run your JVM with -Dotel.java.global-autoconfigure.enabled=true\n2025-05-07 09:39:05 INFO  Connection:1070 - Sending HTTP GETRequest to:https://rin-prod-thor-alpha.hpcc.risk.regn.net:18010/WsSMC/Activity?rawxml_\n2025-05-07 09:39:09 INFO  Connection:1070 - Sending HTTP GETRequest to:https://rin-prod-thor-alpha.hpcc.risk.regn.net:18010/wssmc/getbuildinfo\n2025-05-07 09:39:09 ERROR BaseHPCCWsClient:29

## Agent guidance
- Do not depend on unmerged behavior; consider adding tests or defensive checks.
