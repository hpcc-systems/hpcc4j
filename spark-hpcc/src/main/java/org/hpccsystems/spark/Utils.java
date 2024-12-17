/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2024 HPCC Systems®.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *******************************************************************************/
package org.hpccsystems.spark;

import io.opentelemetry.api.GlobalOpenTelemetry;
import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.SpanContext;
import io.opentelemetry.api.trace.SpanId;
import io.opentelemetry.api.trace.SpanKind;
import io.opentelemetry.api.trace.TraceFlags;
import io.opentelemetry.api.trace.TraceId;
import io.opentelemetry.api.trace.TraceState;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.context.Context;
import io.opentelemetry.sdk.OpenTelemetrySdk;
import io.opentelemetry.sdk.autoconfigure.AutoConfiguredOpenTelemetrySdk;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Utils
{
    private static Logger log = LogManager.getLogger(Utils.class);

    private static OpenTelemetry globalOpenTelemetry = null;
    private static Tracer dfsClientTracer = null;

    static
    {
        System.setProperty("otel.service.name", "org.hpccsystems.spark");
    }

    public static OpenTelemetry getOpenTelemetry()
    {
        if (globalOpenTelemetry == null)
        {
            if (Boolean.getBoolean("otel.java.global-autoconfigure.enabled"))
            {
                globalOpenTelemetry = AutoConfiguredOpenTelemetrySdk.initialize().getOpenTelemetrySdk();
            }
            else
            {
                globalOpenTelemetry = GlobalOpenTelemetry.get();
            }
        }

        return globalOpenTelemetry;
    }

    public static Tracer getTelemetryTracer()
    {
        if (dfsClientTracer == null)
        {
            dfsClientTracer = getOpenTelemetry().getTracer("org.hpccsystems.spark");
        }

        return dfsClientTracer;
    }

    public static Span createSpan(String name)
    {
        return createChildSpan(null, name);
    }

    public static Span createChildSpan(Span parentSpan, String name)
    {
        Span span = null;
        if (parentSpan == null)
        {
            span = Utils.getTelemetryTracer().spanBuilder(name)
                                    .setSpanKind(SpanKind.CLIENT)
                                    .startSpan();
        }
        else
        {
            span = Utils.getTelemetryTracer().spanBuilder(name)
                                    .setParent(Context.current().with(parentSpan))
                                    .setSpanKind(SpanKind.CLIENT)
                                    .startSpan();
        }

        span.makeCurrent();
        return span;
    }

    public static Span createChildSpan(String traceID, String parentSpanID, String childName)
    {
        // Check if traceID & parentSpanID are valid
        if (!TraceId.isValid(traceID))
        {
            log.error("Error creating child span, invalid parent traceID: " + traceID + ". Creating a disconnected span.");
            return createSpan(childName);
        }

        if (!SpanId.isValid(parentSpanID))
        {
            log.error("Error creating child span, invalid parent spanID: " + parentSpanID + ". Creating a disconnected span.");
            return createSpan(childName);
        }

        SpanContext parentSpanContext = SpanContext.createFromRemoteParent(
            traceID,
            parentSpanID,
            TraceFlags.getSampled(),
            TraceState.getDefault()
        );
        Context parentContext = Context.current().with(Span.wrap(parentSpanContext));

        Span childSpan = getTelemetryTracer().spanBuilder(childName)
                                    .setParent(parentContext)
                                    .setSpanKind(SpanKind.CLIENT)
                                    .startSpan();
        childSpan.makeCurrent();
        return childSpan;
    }

}
