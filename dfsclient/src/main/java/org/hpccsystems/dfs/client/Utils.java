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
package org.hpccsystems.dfs.client;

import io.opentelemetry.api.GlobalOpenTelemetry;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.SpanKind;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.context.Context;

public class Utils
{
    public static Tracer getTelemetryTracer()
    {
        return GlobalOpenTelemetry.get().getTracer("DFSClient");
    }

    public static Span createSpan(String name)
    {
        return Utils.getTelemetryTracer().spanBuilder(name)
                                        .setSpanKind(SpanKind.CLIENT)
                                        .startSpan();
    }

    public static Span createChildSpan(Span parentSpan, String name)
    {
        return Utils.getTelemetryTracer().spanBuilder(name)
                                        .setParent(Context.current().with(parentSpan))
                                        .setSpanKind(SpanKind.CLIENT)
                                        .startSpan();
    }

}
