package org.hpccsystems.ws.client;

/*##############################################################################

HPCC SYSTEMS software Copyright (C) 2022 HPCC Systems®.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
############################################################################## */

import java.io.IOException;

import org.apache.axis2.transport.http.*;
import org.apache.hc.client5.http.protocol.HttpClientContext;
import org.apache.hc.core5.http.EntityDetails;
import org.apache.hc.core5.http.HttpException;
import org.apache.hc.core5.http.HttpRequest;
import org.apache.hc.core5.http.HttpRequestInterceptor;
import org.apache.hc.core5.http.protocol.HttpContext;
/*import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.AuthState;
import org.apache.http.auth.Credentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.protocol.HttpContext;*/
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Used to force preemptive HTTP authentication
 *
 */
public class HPCCPreemptiveAuthInterceptor implements HttpRequestInterceptor
{
    protected static final Logger log = LogManager.getLogger(HPCCPreemptiveAuthInterceptor.class);

    /*
     * Old (Axis2 with HttpClient 4):.
     *  HttpClientContext.TARGET_AUTH_STATE was a way to store and retrieve the authentication state related to the target endpoint.
     *
     *  New (Axis2 with HttpClient 4.5):
     *  The concept of TARGET_AUTH_STATE is not directly used.
     *  Instead, authentication state is managed through AuthScope which represents the scope of the authentication (e.g., server, realm) and AuthProtocol,
     *  which specifies the authentication protocol (e.g., Basic, Digest).
     *  The HttpClientContext provides methods like getAuthScope() and getAuthProtocol() to access this information.
     *
     *  In essence, instead of a single TARGET_AUTH_STATE value, the newer approach uses more granular and contextual information within the HttpClientContext related to authentication. This approach offers better control and flexibility in handling authentication, particularly in complex scenarios with multiple authentication realms or protocols.
     */

    @Override
    public void process(HttpRequest request, EntityDetails entity, HttpContext context) throws HttpException, IOException
    {
        log.debug("HPCCPreemptiveAuthInterceptor: Processing preemptive authentication...");
    }
}
