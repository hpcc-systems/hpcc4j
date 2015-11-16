/**
 * TpThorStatusResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wstopology.v1_22;

public class TpThorStatusResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.wstopology.v1_22.ArrayOfEspException exceptions;

    private java.lang.String name;

    private java.lang.String queue;

    private java.lang.String group;

    private java.lang.String thorMasterIPAddress;

    private java.lang.Integer port;

    private java.lang.String startTime;

    private java.lang.String logFile;

    private java.lang.String wuid;

    private java.lang.String graph;

    private java.lang.Integer subGraph;

    private java.lang.Integer subGraphDuration;

    private java.lang.Integer autoRefresh;

    public TpThorStatusResponse() {
    }

    public TpThorStatusResponse(
           org.hpccsystems.ws.client.gen.wstopology.v1_22.ArrayOfEspException exceptions,
           java.lang.String name,
           java.lang.String queue,
           java.lang.String group,
           java.lang.String thorMasterIPAddress,
           java.lang.Integer port,
           java.lang.String startTime,
           java.lang.String logFile,
           java.lang.String wuid,
           java.lang.String graph,
           java.lang.Integer subGraph,
           java.lang.Integer subGraphDuration,
           java.lang.Integer autoRefresh) {
           this.exceptions = exceptions;
           this.name = name;
           this.queue = queue;
           this.group = group;
           this.thorMasterIPAddress = thorMasterIPAddress;
           this.port = port;
           this.startTime = startTime;
           this.logFile = logFile;
           this.wuid = wuid;
           this.graph = graph;
           this.subGraph = subGraph;
           this.subGraphDuration = subGraphDuration;
           this.autoRefresh = autoRefresh;
    }


    /**
     * Gets the exceptions value for this TpThorStatusResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.gen.wstopology.v1_22.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this TpThorStatusResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.gen.wstopology.v1_22.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the name value for this TpThorStatusResponse.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this TpThorStatusResponse.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the queue value for this TpThorStatusResponse.
     * 
     * @return queue
     */
    public java.lang.String getQueue() {
        return queue;
    }


    /**
     * Sets the queue value for this TpThorStatusResponse.
     * 
     * @param queue
     */
    public void setQueue(java.lang.String queue) {
        this.queue = queue;
    }


    /**
     * Gets the group value for this TpThorStatusResponse.
     * 
     * @return group
     */
    public java.lang.String getGroup() {
        return group;
    }


    /**
     * Sets the group value for this TpThorStatusResponse.
     * 
     * @param group
     */
    public void setGroup(java.lang.String group) {
        this.group = group;
    }


    /**
     * Gets the thorMasterIPAddress value for this TpThorStatusResponse.
     * 
     * @return thorMasterIPAddress
     */
    public java.lang.String getThorMasterIPAddress() {
        return thorMasterIPAddress;
    }


    /**
     * Sets the thorMasterIPAddress value for this TpThorStatusResponse.
     * 
     * @param thorMasterIPAddress
     */
    public void setThorMasterIPAddress(java.lang.String thorMasterIPAddress) {
        this.thorMasterIPAddress = thorMasterIPAddress;
    }


    /**
     * Gets the port value for this TpThorStatusResponse.
     * 
     * @return port
     */
    public java.lang.Integer getPort() {
        return port;
    }


    /**
     * Sets the port value for this TpThorStatusResponse.
     * 
     * @param port
     */
    public void setPort(java.lang.Integer port) {
        this.port = port;
    }


    /**
     * Gets the startTime value for this TpThorStatusResponse.
     * 
     * @return startTime
     */
    public java.lang.String getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this TpThorStatusResponse.
     * 
     * @param startTime
     */
    public void setStartTime(java.lang.String startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the logFile value for this TpThorStatusResponse.
     * 
     * @return logFile
     */
    public java.lang.String getLogFile() {
        return logFile;
    }


    /**
     * Sets the logFile value for this TpThorStatusResponse.
     * 
     * @param logFile
     */
    public void setLogFile(java.lang.String logFile) {
        this.logFile = logFile;
    }


    /**
     * Gets the wuid value for this TpThorStatusResponse.
     * 
     * @return wuid
     */
    public java.lang.String getWuid() {
        return wuid;
    }


    /**
     * Sets the wuid value for this TpThorStatusResponse.
     * 
     * @param wuid
     */
    public void setWuid(java.lang.String wuid) {
        this.wuid = wuid;
    }


    /**
     * Gets the graph value for this TpThorStatusResponse.
     * 
     * @return graph
     */
    public java.lang.String getGraph() {
        return graph;
    }


    /**
     * Sets the graph value for this TpThorStatusResponse.
     * 
     * @param graph
     */
    public void setGraph(java.lang.String graph) {
        this.graph = graph;
    }


    /**
     * Gets the subGraph value for this TpThorStatusResponse.
     * 
     * @return subGraph
     */
    public java.lang.Integer getSubGraph() {
        return subGraph;
    }


    /**
     * Sets the subGraph value for this TpThorStatusResponse.
     * 
     * @param subGraph
     */
    public void setSubGraph(java.lang.Integer subGraph) {
        this.subGraph = subGraph;
    }


    /**
     * Gets the subGraphDuration value for this TpThorStatusResponse.
     * 
     * @return subGraphDuration
     */
    public java.lang.Integer getSubGraphDuration() {
        return subGraphDuration;
    }


    /**
     * Sets the subGraphDuration value for this TpThorStatusResponse.
     * 
     * @param subGraphDuration
     */
    public void setSubGraphDuration(java.lang.Integer subGraphDuration) {
        this.subGraphDuration = subGraphDuration;
    }


    /**
     * Gets the autoRefresh value for this TpThorStatusResponse.
     * 
     * @return autoRefresh
     */
    public java.lang.Integer getAutoRefresh() {
        return autoRefresh;
    }


    /**
     * Sets the autoRefresh value for this TpThorStatusResponse.
     * 
     * @param autoRefresh
     */
    public void setAutoRefresh(java.lang.Integer autoRefresh) {
        this.autoRefresh = autoRefresh;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpThorStatusResponse)) return false;
        TpThorStatusResponse other = (TpThorStatusResponse) obj;
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
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.queue==null && other.getQueue()==null) || 
             (this.queue!=null &&
              this.queue.equals(other.getQueue()))) &&
            ((this.group==null && other.getGroup()==null) || 
             (this.group!=null &&
              this.group.equals(other.getGroup()))) &&
            ((this.thorMasterIPAddress==null && other.getThorMasterIPAddress()==null) || 
             (this.thorMasterIPAddress!=null &&
              this.thorMasterIPAddress.equals(other.getThorMasterIPAddress()))) &&
            ((this.port==null && other.getPort()==null) || 
             (this.port!=null &&
              this.port.equals(other.getPort()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.logFile==null && other.getLogFile()==null) || 
             (this.logFile!=null &&
              this.logFile.equals(other.getLogFile()))) &&
            ((this.wuid==null && other.getWuid()==null) || 
             (this.wuid!=null &&
              this.wuid.equals(other.getWuid()))) &&
            ((this.graph==null && other.getGraph()==null) || 
             (this.graph!=null &&
              this.graph.equals(other.getGraph()))) &&
            ((this.subGraph==null && other.getSubGraph()==null) || 
             (this.subGraph!=null &&
              this.subGraph.equals(other.getSubGraph()))) &&
            ((this.subGraphDuration==null && other.getSubGraphDuration()==null) || 
             (this.subGraphDuration!=null &&
              this.subGraphDuration.equals(other.getSubGraphDuration()))) &&
            ((this.autoRefresh==null && other.getAutoRefresh()==null) || 
             (this.autoRefresh!=null &&
              this.autoRefresh.equals(other.getAutoRefresh())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getQueue() != null) {
            _hashCode += getQueue().hashCode();
        }
        if (getGroup() != null) {
            _hashCode += getGroup().hashCode();
        }
        if (getThorMasterIPAddress() != null) {
            _hashCode += getThorMasterIPAddress().hashCode();
        }
        if (getPort() != null) {
            _hashCode += getPort().hashCode();
        }
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getLogFile() != null) {
            _hashCode += getLogFile().hashCode();
        }
        if (getWuid() != null) {
            _hashCode += getWuid().hashCode();
        }
        if (getGraph() != null) {
            _hashCode += getGraph().hashCode();
        }
        if (getSubGraph() != null) {
            _hashCode += getSubGraph().hashCode();
        }
        if (getSubGraphDuration() != null) {
            _hashCode += getSubGraphDuration().hashCode();
        }
        if (getAutoRefresh() != null) {
            _hashCode += getAutoRefresh().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpThorStatusResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpThorStatusResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Queue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Group"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thorMasterIPAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ThorMasterIPAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("port");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Port"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "StartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logFile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "LogFile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Wuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("graph");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Graph"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subGraph");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "SubGraph"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subGraphDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "SubGraphDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoRefresh");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "AutoRefresh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
