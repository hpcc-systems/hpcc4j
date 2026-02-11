---
id: jira-HPCC4J-387
title: HPCC4J-387 – ForstXML libraries conflict when using PySpark integrated to HPCC
source:
type: jira
url: "https://hpccsystems.atlassian.net/browse/HPCC4J-387"
project: HPCC4J
key: HPCC4J-387
status: Resolved
statusCategory: Done
resolution: Fixed
created: 2021-03-04
updated: 2021-03-30
resolved: 2021-03-30
components:   - dfsclient
fixVersions:   - 8.0.0
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
ForstXML libraries conflict when using PySpark integrated to HPCC

{"type": "doc", "version": 1, "content": [{"type": "paragraph", "content": [{"type": "text", "text": "Trying to use PySpark results in an error. Below some excerptions from PySpark shell:"}]}, {"type": "paragraph", "content": [{"type": "text", "text": "\u00a0"}]}, {"type": "codeBlock", "attrs": {"language": "java"}, "content": [{"type": "text", "text": ">>> df.show()\r\nTraceback (most recent call last):\r\n\u00a0 File \"<stdin>\", line 1, in <module>\r\n\u00a0 File \"/opt/HPCCSystems/externals/spark-hadoop/python/pyspark/sql/dataframe.py\", line 378, in show\r\n\u00a0\u00a0\u00a0 print(self._jdf.showString(n, 20, vertical))\r\n\u00a0 File \"/opt/HPCCSystems/externals/spark-hadoop/python/lib/py4j-0.10.7-src.zip/py4j/java_gateway.py\", line 1257, in __call__\r\n\u00a0 File \"/opt/HPCCSystems/externals/spark-hadoop/python/pyspark/sql/utils.py\", line 63, in deco\r\n\u00a0\u00a0\u00a0 return f(*a, **kw)\r\n\u00a0 File \"/opt/HPCCSystems/externals/spark-hadoop/python/lib/py4j-0.10.7-src.zi

## Agent guidance
- Prefer the fixed/updated path; avoid re-introducing previous behavior.
