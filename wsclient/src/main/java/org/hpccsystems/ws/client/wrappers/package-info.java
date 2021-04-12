/**
 * Layer of abstraction between caller and HPCC Web Service interface
 *
 * Provides a uniform, and consistent representation of HPCC Systems web
 * service response objects which shields callers from unnecessary implementation
 * details, proprietary standards, and interface changes. These wrapper objects
 * are typically used as an encapsulation of a given web services request and its
 * response. In general, callers shouldn't interact with raw responses from HPCC
 * Systems web services (ESPs), but should expect to interact with a wrapped version
 * of the response object.
 *
 */
package org.hpccsystems.ws.client.wrappers;
