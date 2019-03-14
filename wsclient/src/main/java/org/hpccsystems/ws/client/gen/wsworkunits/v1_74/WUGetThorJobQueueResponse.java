/**
 * WUGetThorJobQueueResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_74;

public class WUGetThorJobQueueResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ArrayOfEspException exceptions;

    private java.lang.Integer longestQueue;

    private java.lang.Integer maxThorConnected;

    private org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ThorQueue[] queueList;

    private java.lang.String warning;

    public WUGetThorJobQueueResponse() {
    }

    public WUGetThorJobQueueResponse(
           org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ArrayOfEspException exceptions,
           java.lang.Integer longestQueue,
           java.lang.Integer maxThorConnected,
           org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ThorQueue[] queueList,
           java.lang.String warning) {
           this.exceptions = exceptions;
           this.longestQueue = longestQueue;
           this.maxThorConnected = maxThorConnected;
           this.queueList = queueList;
           this.warning = warning;
    }


    /**
     * Gets the exceptions value for this WUGetThorJobQueueResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this WUGetThorJobQueueResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the longestQueue value for this WUGetThorJobQueueResponse.
     * 
     * @return longestQueue
     */
    public java.lang.Integer getLongestQueue() {
        return longestQueue;
    }


    /**
     * Sets the longestQueue value for this WUGetThorJobQueueResponse.
     * 
     * @param longestQueue
     */
    public void setLongestQueue(java.lang.Integer longestQueue) {
        this.longestQueue = longestQueue;
    }


    /**
     * Gets the maxThorConnected value for this WUGetThorJobQueueResponse.
     * 
     * @return maxThorConnected
     */
    public java.lang.Integer getMaxThorConnected() {
        return maxThorConnected;
    }


    /**
     * Sets the maxThorConnected value for this WUGetThorJobQueueResponse.
     * 
     * @param maxThorConnected
     */
    public void setMaxThorConnected(java.lang.Integer maxThorConnected) {
        this.maxThorConnected = maxThorConnected;
    }


    /**
     * Gets the queueList value for this WUGetThorJobQueueResponse.
     * 
     * @return queueList
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ThorQueue[] getQueueList() {
        return queueList;
    }


    /**
     * Sets the queueList value for this WUGetThorJobQueueResponse.
     * 
     * @param queueList
     */
    public void setQueueList(org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ThorQueue[] queueList) {
        this.queueList = queueList;
    }


    /**
     * Gets the warning value for this WUGetThorJobQueueResponse.
     * 
     * @return warning
     */
    public java.lang.String getWarning() {
        return warning;
    }


    /**
     * Sets the warning value for this WUGetThorJobQueueResponse.
     * 
     * @param warning
     */
    public void setWarning(java.lang.String warning) {
        this.warning = warning;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUGetThorJobQueueResponse)) return false;
        WUGetThorJobQueueResponse other = (WUGetThorJobQueueResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.exceptions==null && other.getExceptions()==null) || 
             (this.exceptions!=null &&
              this.exceptions.equals(other.getExceptions()))) &&
            ((this.longestQueue==null && other.getLongestQueue()==null) || 
             (this.longestQueue!=null &&
              this.longestQueue.equals(other.getLongestQueue()))) &&
            ((this.maxThorConnected==null && other.getMaxThorConnected()==null) || 
             (this.maxThorConnected!=null &&
              this.maxThorConnected.equals(other.getMaxThorConnected()))) &&
            ((this.queueList==null && other.getQueueList()==null) || 
             (this.queueList!=null &&
              java.util.Arrays.equals(this.queueList, other.getQueueList()))) &&
            ((this.warning==null && other.getWarning()==null) || 
             (this.warning!=null &&
              this.warning.equals(other.getWarning())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getExceptions() != null) {
            _hashCode += getExceptions().hashCode();
        }
        if (getLongestQueue() != null) {
            _hashCode += getLongestQueue().hashCode();
        }
        if (getMaxThorConnected() != null) {
            _hashCode += getMaxThorConnected().hashCode();
        }
        if (getQueueList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQueueList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQueueList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWarning() != null) {
            _hashCode += getWarning().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WUGetThorJobQueueResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGetThorJobQueueResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longestQueue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "LongestQueue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxThorConnected");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "MaxThorConnected"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queueList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QueueList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ThorQueue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ThorQueue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("warning");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Warning"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
