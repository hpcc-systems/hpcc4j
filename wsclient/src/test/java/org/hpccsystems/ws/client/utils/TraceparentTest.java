package org.hpccsystems.ws.client.utils;

import static org.junit.Assert.*;

import org.junit.Test;

import io.opentelemetry.api.GlobalOpenTelemetry;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.SpanContext;
import io.opentelemetry.api.trace.SpanKind;
import io.opentelemetry.api.trace.TraceFlags;
import io.opentelemetry.api.trace.TraceState;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.context.Context;

public class TraceparentTest
{
    @Test
    public void testGetTraceParentHeaderWithSampledSpan()
    {
        // Create a sampled span context
        SpanContext sampledContext = SpanContext.create(
            "12345678901234567890123456789012",
            "1234567890123456",
            TraceFlags.getSampled(),
            TraceState.getDefault()
        );
        
        // Create a span wrapper
        Span sampledSpan = Span.wrap(sampledContext);
        
        // Get the traceparent header
        String traceparent = Utils.getTraceParentHeader(sampledSpan);
        
        // Verify the traceparent has the correct format and sampling flag
        assertNotNull("Traceparent should not be null", traceparent);
        assertTrue("Traceparent should contain sampled flag", 
                   traceparent.endsWith("-01") || traceparent.contains("-01"));
    }
    
    @Test
    public void testGetTraceParentHeaderWithNonSampledSpan()
    {
        // Create a non-sampled span context
        SpanContext nonSampledContext = SpanContext.create(
            "12345678901234567890123456789012",
            "1234567890123456",
            TraceFlags.getDefault(), // Default is not sampled
            TraceState.getDefault()
        );
        
        // Create a span wrapper
        Span nonSampledSpan = Span.wrap(nonSampledContext);
        
        // Get the traceparent header
        String traceparent = Utils.getTraceParentHeader(nonSampledSpan);
        
        // Verify the traceparent has the correct format and non-sampling flag
        assertNotNull("Traceparent should not be null", traceparent);
        assertTrue("Traceparent should contain non-sampled flag", 
                   traceparent.endsWith("-00") || traceparent.contains("-00"));
    }
    
    @Test
    public void testGetTraceParentHeaderWithInvalidSpan()
    {
        // Test with null span
        String traceparent = Utils.getTraceParentHeader(null);
        assertNull("Traceparent should be null for invalid span", traceparent);
        
        // Test with invalid span
        Span invalidSpan = Span.getInvalid();
        traceparent = Utils.getTraceParentHeader(invalidSpan);
        assertNull("Traceparent should be null for invalid span", traceparent);
    }
}