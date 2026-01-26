---
id: jira-HPCC4J-221
title: HPCC4J-221 – Support clusters with unsigned certs
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-221"
project: HPCC4J
key: HPCC4J-221
status: Resolved
statusCategory: Done
resolution: "Won't Fix"
created: 2019-08-28
updated: 2021-03-31
resolved: 2021-03-31
components:   - WSClient
fixVersions: []
labels: []
applies_to: hpcc4j: *
audience: developer
confidence: high
tags:
- jira
- change-log
- rationale
pull_requests: []
---
## Outcome (from JIRA)
Support clusters with unsigned certs

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Currently we handle allowing axis to communicate with unsigned clusters by using the following code: "}]}, {"type": "codeBlock", "attrs": {"language": "java"}, "content": [{"type": "text", "text": "if (configuration.getAllowInvalidCerts())\r\n                {\r\n                    AxisProperties.setProperty(\"axis.socketSecureFactory\",\r\n                            \"org.apache.axis.components.net.SunFakeTrustSocketFactory\");\r\n                }"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "Axis2 doesn't have a SunFakeTrustSocketFactory. hpcc-japi will have to create its own socket factory to use for clusters that have unsigned certs.  Or else persuade these clusters to sign their certs. "}, {"type": "emoji", "attrs": {"shortName": ":slight_smile:", "id": "1f642", "text": "\ud83d\ude42"}}]}]}

## Agent guidance
- Avoid this approach; rationale documented in the JIRA ticket.
