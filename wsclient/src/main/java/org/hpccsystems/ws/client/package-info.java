/**
 * <pre>
 * Provides several HPCC Systems client libraries used to actuate a variety of actions on
 * a target HPCC Systems instance.
 *
 * These clients abstract connectivity, soap, and proprietary web service details away from
 * the caller. Allowing the caller to focus on higher level logic without the need to account
 * for web service details and interface version changes.
 *
 * Each of the HPCC Web Service clients expose specialized HPCC-centric actions, and the caller
 * can choose to interact with individual clients directly, or can interact with the multi-purpose HPCCWsClient.
 * The caller must provide connection information including target HPCC address, ECLWatch port (typically 8010 or 18010),
 * and user credentials.
 *
 * Create connection:
 * org.hpccsystems.ws.client.utils.Connection connection = new Connection("http://myhpcc:8010");
 *
 * Provide HPCC user credentials:
 * connection.setCredentials(hpccUser, hpccPass);
 *
 * Get HPCCWsXYZClient:
 * HPCCWsWorkUnitsClient mywswuclient = HPCCWsWorkUnitsClient.get(connection);
 *
 * Execute action of your choice:
 * mywswuclient.ping()
 *</pre>
 */
package org.hpccsystems.ws.client;
