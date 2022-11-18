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

import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.AuthState;
import org.apache.http.auth.Credentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.protocol.HttpContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Used to force preemptive HTTP authentication
 *
 */
public class HPCCPreemptiveAuthInterceptor implements HttpRequestInterceptor
{
    protected static final Logger log = LogManager.getLogger(HPCCPreemptiveAuthInterceptor.class);

    @Override
    public void process(HttpRequest request, HttpContext context) throws HttpException, IOException
    {
        log.info("HPCCPreemptiveAuthInterceptor: Processing preemtive authentication...");
        AuthState authState = (AuthState) context.getAttribute(HttpClientContext.TARGET_AUTH_STATE);
        // If no auth scheme available yet, try to initialize it preemptively
        if (authState.getAuthScheme() == null)
        {
            log.info("HPCCPreemptiveAuthInterceptor: No previous authentication schem found, initializing preemtively...");
            CredentialsProvider credsProvider = (CredentialsProvider) context.getAttribute(HttpClientContext.CREDS_PROVIDER);

            if (credsProvider == null)
            {
                log.warn("HPCCPreemptiveAuthInterceptor: No credentials provider found...");
            }
            else
            {
                Credentials creds = credsProvider.getCredentials(new AuthScope(AuthScope.ANY_HOST, AuthScope.ANY_PORT));
                if (creds == null)
                {
                    log.warn("HPCCPreemptiveAuthInterceptor: No credentials found during preemptive authentication processing...");
                }
                authState.update(new BasicScheme(), creds);
            }
        }
    }
}
