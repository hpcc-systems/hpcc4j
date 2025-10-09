package org.hpccsystems.spark;

import static org.junit.Assert.*;

import org.junit.Test;

import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.TraceFlags;

public class SparkUtilsTraceparentTest
{
    @Test
    public void testCreateChildSpanFromTraceParentSampled()
    {
        // Test with a sampled traceparent header
        String sampledTraceparent = "00-12345678901234567890123456789012-1234567890123456-01";
        
        Span childSpan = Utils.createChildSpanFromTraceParent(sampledTraceparent, "test-child-span");
        
        assertNotNull("Child span should not be null", childSpan);
        assertTrue("Child span should be valid", childSpan.getSpanContext().isValid());
        assertTrue("Child span should be sampled", childSpan.getSpanContext().getTraceFlags().isSampled());
        assertEquals("Trace ID should match parent", "12345678901234567890123456789012", 
                     childSpan.getSpanContext().getTraceId());
        
        childSpan.end();
    }
    
    @Test
    public void testCreateChildSpanFromTraceParentNotSampled()
    {
        // Test with a non-sampled traceparent header
        String nonSampledTraceparent = "00-12345678901234567890123456789012-1234567890123456-00";
        
        Span childSpan = Utils.createChildSpanFromTraceParent(nonSampledTraceparent, "test-child-span");
        
        assertNotNull("Child span should not be null", childSpan);
        assertTrue("Child span should be valid", childSpan.getSpanContext().isValid());
        assertFalse("Child span should not be sampled", childSpan.getSpanContext().getTraceFlags().isSampled());
        assertEquals("Trace ID should match parent", "12345678901234567890123456789012", 
                     childSpan.getSpanContext().getTraceId());
        
        childSpan.end();
    }
    
    @Test
    public void testCreateChildSpanWithTraceFlagsSampled()
    {
        String traceId = "12345678901234567890123456789012";
        String spanId = "1234567890123456";
        TraceFlags sampledFlags = TraceFlags.getSampled();
        
        Span childSpan = Utils.createChildSpan(traceId, spanId, sampledFlags, "test-child-span");
        
        assertNotNull("Child span should not be null", childSpan);
        assertTrue("Child span should be valid", childSpan.getSpanContext().isValid());
        assertTrue("Child span should be sampled", childSpan.getSpanContext().getTraceFlags().isSampled());
        assertEquals("Trace ID should match parent", traceId, 
                     childSpan.getSpanContext().getTraceId());
        
        childSpan.end();
    }
    
    @Test
    public void testCreateChildSpanWithTraceFlagsNotSampled()
    {
        String traceId = "12345678901234567890123456789012";
        String spanId = "1234567890123456";
        TraceFlags nonSampledFlags = TraceFlags.getDefault(); // Default is not sampled
        
        Span childSpan = Utils.createChildSpan(traceId, spanId, nonSampledFlags, "test-child-span");
        
        assertNotNull("Child span should not be null", childSpan);
        assertTrue("Child span should be valid", childSpan.getSpanContext().isValid());
        assertFalse("Child span should not be sampled", childSpan.getSpanContext().getTraceFlags().isSampled());
        assertEquals("Trace ID should match parent", traceId, 
                     childSpan.getSpanContext().getTraceId());
        
        childSpan.end();
    }
    
    @Test
    public void testCreateChildSpanFromInvalidTraceparent()
    {
        // Test with invalid traceparent format
        String invalidTraceparent = "invalid-traceparent-format";
        
        Span childSpan = Utils.createChildSpanFromTraceParent(invalidTraceparent, "test-child-span");
        
        assertNotNull("Child span should not be null", childSpan);
        assertTrue("Child span should be valid", childSpan.getSpanContext().isValid());
        // Since it's a disconnected span, it should create a new trace
        
        childSpan.end();
    }
    
    @Test
    public void testCreateChildSpanFromNullTraceparent()
    {
        // Test with null traceparent
        Span childSpan = Utils.createChildSpanFromTraceParent(null, "test-child-span");
        
        assertNotNull("Child span should not be null", childSpan);
        assertTrue("Child span should be valid", childSpan.getSpanContext().isValid());
        // Since it's a disconnected span, it should create a new trace
        
        childSpan.end();
    }
    
    @Test 
    public void testBackwardCompatibilityCreateChildSpan()
    {
        // Test that the old method signature still works
        String traceId = "12345678901234567890123456789012";
        String spanId = "1234567890123456";
        
        Span childSpan = Utils.createChildSpan(traceId, spanId, "test-child-span");
        
        assertNotNull("Child span should not be null", childSpan);
        assertTrue("Child span should be valid", childSpan.getSpanContext().isValid());
        assertTrue("Child span should be sampled (backward compatibility)", 
                   childSpan.getSpanContext().getTraceFlags().isSampled());
        assertEquals("Trace ID should match parent", traceId, 
                     childSpan.getSpanContext().getTraceId());
        
        childSpan.end();
    }
}