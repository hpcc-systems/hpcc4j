/**
 * <pre>
 * Provides target cluster node address mapping between private/public networks.
 *
 * Only necessary in rare cases where caller encounters situation where
 * target node addresses are reported by target HPCC Systems using internal or private network
 * even though the nodes are exposed publicly. This package provides mapping logic, but ultimately
 * the issue should be reported to the HPCC Systems system administrator and resolved on the cluster side.
 *</pre>
 */
package org.hpccsystems.dfs.cluster;
