/**
 * ThorQueue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_74;

public class ThorQueue  implements java.io.Serializable {
    private java.lang.String DT;

    private java.lang.String runningWUs;

    private java.lang.String queuedWUs;

    private java.lang.String waitingThors;

    private java.lang.String connectedThors;

    private java.lang.String idledThors;

    private java.lang.String runningWU1;

    private java.lang.String runningWU2;

    public ThorQueue() {
    }

    public ThorQueue(
           java.lang.String DT,
           java.lang.String runningWUs,
           java.lang.String queuedWUs,
           java.lang.String waitingThors,
           java.lang.String connectedThors,
           java.lang.String idledThors,
           java.lang.String runningWU1,
           java.lang.String runningWU2) {
           this.DT = DT;
           this.runningWUs = runningWUs;
           this.queuedWUs = queuedWUs;
           this.waitingThors = waitingThors;
           this.connectedThors = connectedThors;
           this.idledThors = idledThors;
           this.runningWU1 = runningWU1;
           this.runningWU2 = runningWU2;
    }


    /**
     * Gets the DT value for this ThorQueue.
     * 
     * @return DT
     */
    public java.lang.String getDT() {
        return DT;
    }


    /**
     * Sets the DT value for this ThorQueue.
     * 
     * @param DT
     */
    public void setDT(java.lang.String DT) {
        this.DT = DT;
    }


    /**
     * Gets the runningWUs value for this ThorQueue.
     * 
     * @return runningWUs
     */
    public java.lang.String getRunningWUs() {
        return runningWUs;
    }


    /**
     * Sets the runningWUs value for this ThorQueue.
     * 
     * @param runningWUs
     */
    public void setRunningWUs(java.lang.String runningWUs) {
        this.runningWUs = runningWUs;
    }


    /**
     * Gets the queuedWUs value for this ThorQueue.
     * 
     * @return queuedWUs
     */
    public java.lang.String getQueuedWUs() {
        return queuedWUs;
    }


    /**
     * Sets the queuedWUs value for this ThorQueue.
     * 
     * @param queuedWUs
     */
    public void setQueuedWUs(java.lang.String queuedWUs) {
        this.queuedWUs = queuedWUs;
    }


    /**
     * Gets the waitingThors value for this ThorQueue.
     * 
     * @return waitingThors
     */
    public java.lang.String getWaitingThors() {
        return waitingThors;
    }


    /**
     * Sets the waitingThors value for this ThorQueue.
     * 
     * @param waitingThors
     */
    public void setWaitingThors(java.lang.String waitingThors) {
        this.waitingThors = waitingThors;
    }


    /**
     * Gets the connectedThors value for this ThorQueue.
     * 
     * @return connectedThors
     */
    public java.lang.String getConnectedThors() {
        return connectedThors;
    }


    /**
     * Sets the connectedThors value for this ThorQueue.
     * 
     * @param connectedThors
     */
    public void setConnectedThors(java.lang.String connectedThors) {
        this.connectedThors = connectedThors;
    }


    /**
     * Gets the idledThors value for this ThorQueue.
     * 
     * @return idledThors
     */
    public java.lang.String getIdledThors() {
        return idledThors;
    }


    /**
     * Sets the idledThors value for this ThorQueue.
     * 
     * @param idledThors
     */
    public void setIdledThors(java.lang.String idledThors) {
        this.idledThors = idledThors;
    }


    /**
     * Gets the runningWU1 value for this ThorQueue.
     * 
     * @return runningWU1
     */
    public java.lang.String getRunningWU1() {
        return runningWU1;
    }


    /**
     * Sets the runningWU1 value for this ThorQueue.
     * 
     * @param runningWU1
     */
    public void setRunningWU1(java.lang.String runningWU1) {
        this.runningWU1 = runningWU1;
    }


    /**
     * Gets the runningWU2 value for this ThorQueue.
     * 
     * @return runningWU2
     */
    public java.lang.String getRunningWU2() {
        return runningWU2;
    }


    /**
     * Sets the runningWU2 value for this ThorQueue.
     * 
     * @param runningWU2
     */
    public void setRunningWU2(java.lang.String runningWU2) {
        this.runningWU2 = runningWU2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ThorQueue)) return false;
        ThorQueue other = (ThorQueue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.DT==null && other.getDT()==null) || 
             (this.DT!=null &&
              this.DT.equals(other.getDT()))) &&
            ((this.runningWUs==null && other.getRunningWUs()==null) || 
             (this.runningWUs!=null &&
              this.runningWUs.equals(other.getRunningWUs()))) &&
            ((this.queuedWUs==null && other.getQueuedWUs()==null) || 
             (this.queuedWUs!=null &&
              this.queuedWUs.equals(other.getQueuedWUs()))) &&
            ((this.waitingThors==null && other.getWaitingThors()==null) || 
             (this.waitingThors!=null &&
              this.waitingThors.equals(other.getWaitingThors()))) &&
            ((this.connectedThors==null && other.getConnectedThors()==null) || 
             (this.connectedThors!=null &&
              this.connectedThors.equals(other.getConnectedThors()))) &&
            ((this.idledThors==null && other.getIdledThors()==null) || 
             (this.idledThors!=null &&
              this.idledThors.equals(other.getIdledThors()))) &&
            ((this.runningWU1==null && other.getRunningWU1()==null) || 
             (this.runningWU1!=null &&
              this.runningWU1.equals(other.getRunningWU1()))) &&
            ((this.runningWU2==null && other.getRunningWU2()==null) || 
             (this.runningWU2!=null &&
              this.runningWU2.equals(other.getRunningWU2())));
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
        if (getDT() != null) {
            _hashCode += getDT().hashCode();
        }
        if (getRunningWUs() != null) {
            _hashCode += getRunningWUs().hashCode();
        }
        if (getQueuedWUs() != null) {
            _hashCode += getQueuedWUs().hashCode();
        }
        if (getWaitingThors() != null) {
            _hashCode += getWaitingThors().hashCode();
        }
        if (getConnectedThors() != null) {
            _hashCode += getConnectedThors().hashCode();
        }
        if (getIdledThors() != null) {
            _hashCode += getIdledThors().hashCode();
        }
        if (getRunningWU1() != null) {
            _hashCode += getRunningWU1().hashCode();
        }
        if (getRunningWU2() != null) {
            _hashCode += getRunningWU2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ThorQueue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ThorQueue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DT");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "DT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runningWUs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "RunningWUs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queuedWUs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QueuedWUs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("waitingThors");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WaitingThors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectedThors");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ConnectedThors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idledThors");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "IdledThors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runningWU1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "RunningWU1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runningWU2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "RunningWU2"));
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
