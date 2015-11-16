/**
 * WUQueryDetailsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_56;

public class WUQueryDetailsResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException exceptions;

    private java.lang.String queryId;

    private java.lang.String querySet;

    private java.lang.String queryName;

    private java.lang.String wuid;

    private java.lang.String dll;

    private java.lang.Boolean suspended;

    private java.lang.Boolean activated;

    private java.lang.String suspendedBy;

    private org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ClusterQueryState[] clusters;

    private java.lang.String publishedBy;

    private java.lang.String comment;

    private java.lang.String[] logicalFiles;

    private org.hpccsystems.ws.client.gen.wsworkunits.v1_56.QuerySuperFile[] superFiles;

    private java.lang.Boolean isLibrary;

    private java.lang.String priority;

    private java.lang.String WUSnapShot;

    private java.lang.String compileTime;

    private java.lang.String[] librariesUsed;

    private java.lang.Integer countGraphs;

    private java.lang.String[] graphIds;

    private java.lang.Integer resourceURLCount;

    private java.lang.String[] wsEclAddresses;

    public WUQueryDetailsResponse() {
    }

    public WUQueryDetailsResponse(
           org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException exceptions,
           java.lang.String queryId,
           java.lang.String querySet,
           java.lang.String queryName,
           java.lang.String wuid,
           java.lang.String dll,
           java.lang.Boolean suspended,
           java.lang.Boolean activated,
           java.lang.String suspendedBy,
           org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ClusterQueryState[] clusters,
           java.lang.String publishedBy,
           java.lang.String comment,
           java.lang.String[] logicalFiles,
           org.hpccsystems.ws.client.gen.wsworkunits.v1_56.QuerySuperFile[] superFiles,
           java.lang.Boolean isLibrary,
           java.lang.String priority,
           java.lang.String WUSnapShot,
           java.lang.String compileTime,
           java.lang.String[] librariesUsed,
           java.lang.Integer countGraphs,
           java.lang.String[] graphIds,
           java.lang.Integer resourceURLCount,
           java.lang.String[] wsEclAddresses) {
           this.exceptions = exceptions;
           this.queryId = queryId;
           this.querySet = querySet;
           this.queryName = queryName;
           this.wuid = wuid;
           this.dll = dll;
           this.suspended = suspended;
           this.activated = activated;
           this.suspendedBy = suspendedBy;
           this.clusters = clusters;
           this.publishedBy = publishedBy;
           this.comment = comment;
           this.logicalFiles = logicalFiles;
           this.superFiles = superFiles;
           this.isLibrary = isLibrary;
           this.priority = priority;
           this.WUSnapShot = WUSnapShot;
           this.compileTime = compileTime;
           this.librariesUsed = librariesUsed;
           this.countGraphs = countGraphs;
           this.graphIds = graphIds;
           this.resourceURLCount = resourceURLCount;
           this.wsEclAddresses = wsEclAddresses;
    }


    /**
     * Gets the exceptions value for this WUQueryDetailsResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this WUQueryDetailsResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the queryId value for this WUQueryDetailsResponse.
     * 
     * @return queryId
     */
    public java.lang.String getQueryId() {
        return queryId;
    }


    /**
     * Sets the queryId value for this WUQueryDetailsResponse.
     * 
     * @param queryId
     */
    public void setQueryId(java.lang.String queryId) {
        this.queryId = queryId;
    }


    /**
     * Gets the querySet value for this WUQueryDetailsResponse.
     * 
     * @return querySet
     */
    public java.lang.String getQuerySet() {
        return querySet;
    }


    /**
     * Sets the querySet value for this WUQueryDetailsResponse.
     * 
     * @param querySet
     */
    public void setQuerySet(java.lang.String querySet) {
        this.querySet = querySet;
    }


    /**
     * Gets the queryName value for this WUQueryDetailsResponse.
     * 
     * @return queryName
     */
    public java.lang.String getQueryName() {
        return queryName;
    }


    /**
     * Sets the queryName value for this WUQueryDetailsResponse.
     * 
     * @param queryName
     */
    public void setQueryName(java.lang.String queryName) {
        this.queryName = queryName;
    }


    /**
     * Gets the wuid value for this WUQueryDetailsResponse.
     * 
     * @return wuid
     */
    public java.lang.String getWuid() {
        return wuid;
    }


    /**
     * Sets the wuid value for this WUQueryDetailsResponse.
     * 
     * @param wuid
     */
    public void setWuid(java.lang.String wuid) {
        this.wuid = wuid;
    }


    /**
     * Gets the dll value for this WUQueryDetailsResponse.
     * 
     * @return dll
     */
    public java.lang.String getDll() {
        return dll;
    }


    /**
     * Sets the dll value for this WUQueryDetailsResponse.
     * 
     * @param dll
     */
    public void setDll(java.lang.String dll) {
        this.dll = dll;
    }


    /**
     * Gets the suspended value for this WUQueryDetailsResponse.
     * 
     * @return suspended
     */
    public java.lang.Boolean getSuspended() {
        return suspended;
    }


    /**
     * Sets the suspended value for this WUQueryDetailsResponse.
     * 
     * @param suspended
     */
    public void setSuspended(java.lang.Boolean suspended) {
        this.suspended = suspended;
    }


    /**
     * Gets the activated value for this WUQueryDetailsResponse.
     * 
     * @return activated
     */
    public java.lang.Boolean getActivated() {
        return activated;
    }


    /**
     * Sets the activated value for this WUQueryDetailsResponse.
     * 
     * @param activated
     */
    public void setActivated(java.lang.Boolean activated) {
        this.activated = activated;
    }


    /**
     * Gets the suspendedBy value for this WUQueryDetailsResponse.
     * 
     * @return suspendedBy
     */
    public java.lang.String getSuspendedBy() {
        return suspendedBy;
    }


    /**
     * Sets the suspendedBy value for this WUQueryDetailsResponse.
     * 
     * @param suspendedBy
     */
    public void setSuspendedBy(java.lang.String suspendedBy) {
        this.suspendedBy = suspendedBy;
    }


    /**
     * Gets the clusters value for this WUQueryDetailsResponse.
     * 
     * @return clusters
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ClusterQueryState[] getClusters() {
        return clusters;
    }


    /**
     * Sets the clusters value for this WUQueryDetailsResponse.
     * 
     * @param clusters
     */
    public void setClusters(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ClusterQueryState[] clusters) {
        this.clusters = clusters;
    }


    /**
     * Gets the publishedBy value for this WUQueryDetailsResponse.
     * 
     * @return publishedBy
     */
    public java.lang.String getPublishedBy() {
        return publishedBy;
    }


    /**
     * Sets the publishedBy value for this WUQueryDetailsResponse.
     * 
     * @param publishedBy
     */
    public void setPublishedBy(java.lang.String publishedBy) {
        this.publishedBy = publishedBy;
    }


    /**
     * Gets the comment value for this WUQueryDetailsResponse.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this WUQueryDetailsResponse.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the logicalFiles value for this WUQueryDetailsResponse.
     * 
     * @return logicalFiles
     */
    public java.lang.String[] getLogicalFiles() {
        return logicalFiles;
    }


    /**
     * Sets the logicalFiles value for this WUQueryDetailsResponse.
     * 
     * @param logicalFiles
     */
    public void setLogicalFiles(java.lang.String[] logicalFiles) {
        this.logicalFiles = logicalFiles;
    }


    /**
     * Gets the superFiles value for this WUQueryDetailsResponse.
     * 
     * @return superFiles
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.QuerySuperFile[] getSuperFiles() {
        return superFiles;
    }


    /**
     * Sets the superFiles value for this WUQueryDetailsResponse.
     * 
     * @param superFiles
     */
    public void setSuperFiles(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.QuerySuperFile[] superFiles) {
        this.superFiles = superFiles;
    }


    /**
     * Gets the isLibrary value for this WUQueryDetailsResponse.
     * 
     * @return isLibrary
     */
    public java.lang.Boolean getIsLibrary() {
        return isLibrary;
    }


    /**
     * Sets the isLibrary value for this WUQueryDetailsResponse.
     * 
     * @param isLibrary
     */
    public void setIsLibrary(java.lang.Boolean isLibrary) {
        this.isLibrary = isLibrary;
    }


    /**
     * Gets the priority value for this WUQueryDetailsResponse.
     * 
     * @return priority
     */
    public java.lang.String getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this WUQueryDetailsResponse.
     * 
     * @param priority
     */
    public void setPriority(java.lang.String priority) {
        this.priority = priority;
    }


    /**
     * Gets the WUSnapShot value for this WUQueryDetailsResponse.
     * 
     * @return WUSnapShot
     */
    public java.lang.String getWUSnapShot() {
        return WUSnapShot;
    }


    /**
     * Sets the WUSnapShot value for this WUQueryDetailsResponse.
     * 
     * @param WUSnapShot
     */
    public void setWUSnapShot(java.lang.String WUSnapShot) {
        this.WUSnapShot = WUSnapShot;
    }


    /**
     * Gets the compileTime value for this WUQueryDetailsResponse.
     * 
     * @return compileTime
     */
    public java.lang.String getCompileTime() {
        return compileTime;
    }


    /**
     * Sets the compileTime value for this WUQueryDetailsResponse.
     * 
     * @param compileTime
     */
    public void setCompileTime(java.lang.String compileTime) {
        this.compileTime = compileTime;
    }


    /**
     * Gets the librariesUsed value for this WUQueryDetailsResponse.
     * 
     * @return librariesUsed
     */
    public java.lang.String[] getLibrariesUsed() {
        return librariesUsed;
    }


    /**
     * Sets the librariesUsed value for this WUQueryDetailsResponse.
     * 
     * @param librariesUsed
     */
    public void setLibrariesUsed(java.lang.String[] librariesUsed) {
        this.librariesUsed = librariesUsed;
    }


    /**
     * Gets the countGraphs value for this WUQueryDetailsResponse.
     * 
     * @return countGraphs
     */
    public java.lang.Integer getCountGraphs() {
        return countGraphs;
    }


    /**
     * Sets the countGraphs value for this WUQueryDetailsResponse.
     * 
     * @param countGraphs
     */
    public void setCountGraphs(java.lang.Integer countGraphs) {
        this.countGraphs = countGraphs;
    }


    /**
     * Gets the graphIds value for this WUQueryDetailsResponse.
     * 
     * @return graphIds
     */
    public java.lang.String[] getGraphIds() {
        return graphIds;
    }


    /**
     * Sets the graphIds value for this WUQueryDetailsResponse.
     * 
     * @param graphIds
     */
    public void setGraphIds(java.lang.String[] graphIds) {
        this.graphIds = graphIds;
    }


    /**
     * Gets the resourceURLCount value for this WUQueryDetailsResponse.
     * 
     * @return resourceURLCount
     */
    public java.lang.Integer getResourceURLCount() {
        return resourceURLCount;
    }


    /**
     * Sets the resourceURLCount value for this WUQueryDetailsResponse.
     * 
     * @param resourceURLCount
     */
    public void setResourceURLCount(java.lang.Integer resourceURLCount) {
        this.resourceURLCount = resourceURLCount;
    }


    /**
     * Gets the wsEclAddresses value for this WUQueryDetailsResponse.
     * 
     * @return wsEclAddresses
     */
    public java.lang.String[] getWsEclAddresses() {
        return wsEclAddresses;
    }


    /**
     * Sets the wsEclAddresses value for this WUQueryDetailsResponse.
     * 
     * @param wsEclAddresses
     */
    public void setWsEclAddresses(java.lang.String[] wsEclAddresses) {
        this.wsEclAddresses = wsEclAddresses;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUQueryDetailsResponse)) return false;
        WUQueryDetailsResponse other = (WUQueryDetailsResponse) obj;
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
            ((this.queryId==null && other.getQueryId()==null) || 
             (this.queryId!=null &&
              this.queryId.equals(other.getQueryId()))) &&
            ((this.querySet==null && other.getQuerySet()==null) || 
             (this.querySet!=null &&
              this.querySet.equals(other.getQuerySet()))) &&
            ((this.queryName==null && other.getQueryName()==null) || 
             (this.queryName!=null &&
              this.queryName.equals(other.getQueryName()))) &&
            ((this.wuid==null && other.getWuid()==null) || 
             (this.wuid!=null &&
              this.wuid.equals(other.getWuid()))) &&
            ((this.dll==null && other.getDll()==null) || 
             (this.dll!=null &&
              this.dll.equals(other.getDll()))) &&
            ((this.suspended==null && other.getSuspended()==null) || 
             (this.suspended!=null &&
              this.suspended.equals(other.getSuspended()))) &&
            ((this.activated==null && other.getActivated()==null) || 
             (this.activated!=null &&
              this.activated.equals(other.getActivated()))) &&
            ((this.suspendedBy==null && other.getSuspendedBy()==null) || 
             (this.suspendedBy!=null &&
              this.suspendedBy.equals(other.getSuspendedBy()))) &&
            ((this.clusters==null && other.getClusters()==null) || 
             (this.clusters!=null &&
              java.util.Arrays.equals(this.clusters, other.getClusters()))) &&
            ((this.publishedBy==null && other.getPublishedBy()==null) || 
             (this.publishedBy!=null &&
              this.publishedBy.equals(other.getPublishedBy()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.logicalFiles==null && other.getLogicalFiles()==null) || 
             (this.logicalFiles!=null &&
              java.util.Arrays.equals(this.logicalFiles, other.getLogicalFiles()))) &&
            ((this.superFiles==null && other.getSuperFiles()==null) || 
             (this.superFiles!=null &&
              java.util.Arrays.equals(this.superFiles, other.getSuperFiles()))) &&
            ((this.isLibrary==null && other.getIsLibrary()==null) || 
             (this.isLibrary!=null &&
              this.isLibrary.equals(other.getIsLibrary()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.WUSnapShot==null && other.getWUSnapShot()==null) || 
             (this.WUSnapShot!=null &&
              this.WUSnapShot.equals(other.getWUSnapShot()))) &&
            ((this.compileTime==null && other.getCompileTime()==null) || 
             (this.compileTime!=null &&
              this.compileTime.equals(other.getCompileTime()))) &&
            ((this.librariesUsed==null && other.getLibrariesUsed()==null) || 
             (this.librariesUsed!=null &&
              java.util.Arrays.equals(this.librariesUsed, other.getLibrariesUsed()))) &&
            ((this.countGraphs==null && other.getCountGraphs()==null) || 
             (this.countGraphs!=null &&
              this.countGraphs.equals(other.getCountGraphs()))) &&
            ((this.graphIds==null && other.getGraphIds()==null) || 
             (this.graphIds!=null &&
              java.util.Arrays.equals(this.graphIds, other.getGraphIds()))) &&
            ((this.resourceURLCount==null && other.getResourceURLCount()==null) || 
             (this.resourceURLCount!=null &&
              this.resourceURLCount.equals(other.getResourceURLCount()))) &&
            ((this.wsEclAddresses==null && other.getWsEclAddresses()==null) || 
             (this.wsEclAddresses!=null &&
              java.util.Arrays.equals(this.wsEclAddresses, other.getWsEclAddresses())));
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
        if (getQueryId() != null) {
            _hashCode += getQueryId().hashCode();
        }
        if (getQuerySet() != null) {
            _hashCode += getQuerySet().hashCode();
        }
        if (getQueryName() != null) {
            _hashCode += getQueryName().hashCode();
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
        if (getActivated() != null) {
            _hashCode += getActivated().hashCode();
        }
        if (getSuspendedBy() != null) {
            _hashCode += getSuspendedBy().hashCode();
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
        if (getPublishedBy() != null) {
            _hashCode += getPublishedBy().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getLogicalFiles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLogicalFiles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLogicalFiles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSuperFiles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSuperFiles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSuperFiles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsLibrary() != null) {
            _hashCode += getIsLibrary().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getWUSnapShot() != null) {
            _hashCode += getWUSnapShot().hashCode();
        }
        if (getCompileTime() != null) {
            _hashCode += getCompileTime().hashCode();
        }
        if (getLibrariesUsed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLibrariesUsed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLibrariesUsed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCountGraphs() != null) {
            _hashCode += getCountGraphs().hashCode();
        }
        if (getGraphIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGraphIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGraphIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResourceURLCount() != null) {
            _hashCode += getResourceURLCount().hashCode();
        }
        if (getWsEclAddresses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWsEclAddresses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWsEclAddresses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WUQueryDetailsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQueryDetailsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QueryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("querySet");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QueryName"));
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
        elemField.setFieldName("activated");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Activated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suspendedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "SuspendedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("publishedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "PublishedBy"));
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
        elemField.setFieldName("logicalFiles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "LogicalFiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("superFiles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "SuperFiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySuperFile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "SuperFile"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isLibrary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "IsLibrary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WUSnapShot");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUSnapShot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compileTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "CompileTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("librariesUsed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "LibrariesUsed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countGraphs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "CountGraphs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("graphIds");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "GraphIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceURLCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ResourceURLCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsEclAddresses");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WsEclAddresses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Address"));
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
