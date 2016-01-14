/**
 * QuerySetQuery.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_56;

public class QuerySetQuery  implements java.io.Serializable {
    private java.lang.String id;

    private java.lang.String name;

    private java.lang.String wuid;

    private java.lang.String dll;

    private java.lang.Boolean suspended;

    private org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ClusterQueryState[] clusters;

    private java.lang.String memoryLimit;

    private org.apache.axis.types.NonNegativeInteger timeLimit;

    private org.apache.axis.types.NonNegativeInteger warnTimeLimit;

    private java.lang.String priority;

    private java.lang.String comment;

    private java.lang.String querySetId;

    private java.lang.Boolean isLibrary;

    private java.lang.Boolean activated;

    private java.lang.String publishedBy;

    private java.lang.String snapshot;

    public QuerySetQuery() {
    }

    public QuerySetQuery(
           java.lang.String id,
           java.lang.String name,
           java.lang.String wuid,
           java.lang.String dll,
           java.lang.Boolean suspended,
           org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ClusterQueryState[] clusters,
           java.lang.String memoryLimit,
           org.apache.axis.types.NonNegativeInteger timeLimit,
           org.apache.axis.types.NonNegativeInteger warnTimeLimit,
           java.lang.String priority,
           java.lang.String comment,
           java.lang.String querySetId,
           java.lang.Boolean isLibrary,
           java.lang.Boolean activated,
           java.lang.String publishedBy,
           java.lang.String snapshot) {
           this.id = id;
           this.name = name;
           this.wuid = wuid;
           this.dll = dll;
           this.suspended = suspended;
           this.clusters = clusters;
           this.memoryLimit = memoryLimit;
           this.timeLimit = timeLimit;
           this.warnTimeLimit = warnTimeLimit;
           this.priority = priority;
           this.comment = comment;
           this.querySetId = querySetId;
           this.isLibrary = isLibrary;
           this.activated = activated;
           this.publishedBy = publishedBy;
           this.snapshot = snapshot;
    }


    /**
     * Gets the id value for this QuerySetQuery.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this QuerySetQuery.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the name value for this QuerySetQuery.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this QuerySetQuery.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the wuid value for this QuerySetQuery.
     * 
     * @return wuid
     */
    public java.lang.String getWuid() {
        return wuid;
    }


    /**
     * Sets the wuid value for this QuerySetQuery.
     * 
     * @param wuid
     */
    public void setWuid(java.lang.String wuid) {
        this.wuid = wuid;
    }


    /**
     * Gets the dll value for this QuerySetQuery.
     * 
     * @return dll
     */
    public java.lang.String getDll() {
        return dll;
    }


    /**
     * Sets the dll value for this QuerySetQuery.
     * 
     * @param dll
     */
    public void setDll(java.lang.String dll) {
        this.dll = dll;
    }


    /**
     * Gets the suspended value for this QuerySetQuery.
     * 
     * @return suspended
     */
    public java.lang.Boolean getSuspended() {
        return suspended;
    }


    /**
     * Sets the suspended value for this QuerySetQuery.
     * 
     * @param suspended
     */
    public void setSuspended(java.lang.Boolean suspended) {
        this.suspended = suspended;
    }


    /**
     * Gets the clusters value for this QuerySetQuery.
     * 
     * @return clusters
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ClusterQueryState[] getClusters() {
        return clusters;
    }


    /**
     * Sets the clusters value for this QuerySetQuery.
     * 
     * @param clusters
     */
    public void setClusters(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ClusterQueryState[] clusters) {
        this.clusters = clusters;
    }


    /**
     * Gets the memoryLimit value for this QuerySetQuery.
     * 
     * @return memoryLimit
     */
    public java.lang.String getMemoryLimit() {
        return memoryLimit;
    }


    /**
     * Sets the memoryLimit value for this QuerySetQuery.
     * 
     * @param memoryLimit
     */
    public void setMemoryLimit(java.lang.String memoryLimit) {
        this.memoryLimit = memoryLimit;
    }


    /**
     * Gets the timeLimit value for this QuerySetQuery.
     * 
     * @return timeLimit
     */
    public org.apache.axis.types.NonNegativeInteger getTimeLimit() {
        return timeLimit;
    }


    /**
     * Sets the timeLimit value for this QuerySetQuery.
     * 
     * @param timeLimit
     */
    public void setTimeLimit(org.apache.axis.types.NonNegativeInteger timeLimit) {
        this.timeLimit = timeLimit;
    }


    /**
     * Gets the warnTimeLimit value for this QuerySetQuery.
     * 
     * @return warnTimeLimit
     */
    public org.apache.axis.types.NonNegativeInteger getWarnTimeLimit() {
        return warnTimeLimit;
    }


    /**
     * Sets the warnTimeLimit value for this QuerySetQuery.
     * 
     * @param warnTimeLimit
     */
    public void setWarnTimeLimit(org.apache.axis.types.NonNegativeInteger warnTimeLimit) {
        this.warnTimeLimit = warnTimeLimit;
    }


    /**
     * Gets the priority value for this QuerySetQuery.
     * 
     * @return priority
     */
    public java.lang.String getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this QuerySetQuery.
     * 
     * @param priority
     */
    public void setPriority(java.lang.String priority) {
        this.priority = priority;
    }


    /**
     * Gets the comment value for this QuerySetQuery.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this QuerySetQuery.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the querySetId value for this QuerySetQuery.
     * 
     * @return querySetId
     */
    public java.lang.String getQuerySetId() {
        return querySetId;
    }


    /**
     * Sets the querySetId value for this QuerySetQuery.
     * 
     * @param querySetId
     */
    public void setQuerySetId(java.lang.String querySetId) {
        this.querySetId = querySetId;
    }


    /**
     * Gets the isLibrary value for this QuerySetQuery.
     * 
     * @return isLibrary
     */
    public java.lang.Boolean getIsLibrary() {
        return isLibrary;
    }


    /**
     * Sets the isLibrary value for this QuerySetQuery.
     * 
     * @param isLibrary
     */
    public void setIsLibrary(java.lang.Boolean isLibrary) {
        this.isLibrary = isLibrary;
    }


    /**
     * Gets the activated value for this QuerySetQuery.
     * 
     * @return activated
     */
    public java.lang.Boolean getActivated() {
        return activated;
    }


    /**
     * Sets the activated value for this QuerySetQuery.
     * 
     * @param activated
     */
    public void setActivated(java.lang.Boolean activated) {
        this.activated = activated;
    }


    /**
     * Gets the publishedBy value for this QuerySetQuery.
     * 
     * @return publishedBy
     */
    public java.lang.String getPublishedBy() {
        return publishedBy;
    }


    /**
     * Sets the publishedBy value for this QuerySetQuery.
     * 
     * @param publishedBy
     */
    public void setPublishedBy(java.lang.String publishedBy) {
        this.publishedBy = publishedBy;
    }


    /**
     * Gets the snapshot value for this QuerySetQuery.
     * 
     * @return snapshot
     */
    public java.lang.String getSnapshot() {
        return snapshot;
    }


    /**
     * Sets the snapshot value for this QuerySetQuery.
     * 
     * @param snapshot
     */
    public void setSnapshot(java.lang.String snapshot) {
        this.snapshot = snapshot;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuerySetQuery)) return false;
        QuerySetQuery other = (QuerySetQuery) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.wuid==null && other.getWuid()==null) || 
             (this.wuid!=null &&
              this.wuid.equals(other.getWuid()))) &&
            ((this.dll==null && other.getDll()==null) || 
             (this.dll!=null &&
              this.dll.equals(other.getDll()))) &&
            ((this.suspended==null && other.getSuspended()==null) || 
             (this.suspended!=null &&
              this.suspended.equals(other.getSuspended()))) &&
            ((this.clusters==null && other.getClusters()==null) || 
             (this.clusters!=null &&
              java.util.Arrays.equals(this.clusters, other.getClusters()))) &&
            ((this.memoryLimit==null && other.getMemoryLimit()==null) || 
             (this.memoryLimit!=null &&
              this.memoryLimit.equals(other.getMemoryLimit()))) &&
            ((this.timeLimit==null && other.getTimeLimit()==null) || 
             (this.timeLimit!=null &&
              this.timeLimit.equals(other.getTimeLimit()))) &&
            ((this.warnTimeLimit==null && other.getWarnTimeLimit()==null) || 
             (this.warnTimeLimit!=null &&
              this.warnTimeLimit.equals(other.getWarnTimeLimit()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.querySetId==null && other.getQuerySetId()==null) || 
             (this.querySetId!=null &&
              this.querySetId.equals(other.getQuerySetId()))) &&
            ((this.isLibrary==null && other.getIsLibrary()==null) || 
             (this.isLibrary!=null &&
              this.isLibrary.equals(other.getIsLibrary()))) &&
            ((this.activated==null && other.getActivated()==null) || 
             (this.activated!=null &&
              this.activated.equals(other.getActivated()))) &&
            ((this.publishedBy==null && other.getPublishedBy()==null) || 
             (this.publishedBy!=null &&
              this.publishedBy.equals(other.getPublishedBy()))) &&
            ((this.snapshot==null && other.getSnapshot()==null) || 
             (this.snapshot!=null &&
              this.snapshot.equals(other.getSnapshot())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getWuid() != null) {
            _hashCode += getWuid().hashCode();
        }
        if (getDll() != null) {
            _hashCode += getDll().hashCode();
        }
        if (getSuspended() != null) {
            _hashCode += getSuspended().hashCode();
        }
        if (getClusters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClusters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClusters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMemoryLimit() != null) {
            _hashCode += getMemoryLimit().hashCode();
        }
        if (getTimeLimit() != null) {
            _hashCode += getTimeLimit().hashCode();
        }
        if (getWarnTimeLimit() != null) {
            _hashCode += getWarnTimeLimit().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getQuerySetId() != null) {
            _hashCode += getQuerySetId().hashCode();
        }
        if (getIsLibrary() != null) {
            _hashCode += getIsLibrary().hashCode();
        }
        if (getActivated() != null) {
            _hashCode += getActivated().hashCode();
        }
        if (getPublishedBy() != null) {
            _hashCode += getPublishedBy().hashCode();
        }
        if (getSnapshot() != null) {
            _hashCode += getSnapshot().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QuerySetQuery.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySetQuery"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Wuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dll");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Dll"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suspended");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Suspended"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusters");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Clusters"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ClusterQueryState"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ClusterQueryState"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memoryLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "memoryLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "timeLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("warnTimeLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "warnTimeLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("querySetId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySetId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isLibrary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "IsLibrary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activated");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Activated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publishedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "PublishedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snapshot");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "snapshot"));
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
