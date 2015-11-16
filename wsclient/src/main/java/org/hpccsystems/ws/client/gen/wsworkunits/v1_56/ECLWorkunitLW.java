/**
 * ECLWorkunitLW.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_56;

public class ECLWorkunitLW  implements java.io.Serializable {
    private java.lang.String wuid;

    private java.lang.String owner;

    private java.lang.String jobName;

    private java.lang.String wuScope;

    private java.lang.String clusterName;

    private java.lang.Integer state;

    private java.lang.String stateDesc;

    private java.lang.Integer action;

    private java.lang.String actionDesc;

    private java.lang.Integer priority;

    private java.lang.String priorityDesc;

    private java.lang.Integer priorityLevel;

    private java.lang.Boolean isProtected;

    private java.util.Calendar dateTimeScheduled;

    private org.apache.axis.types.UnsignedInt totalClusterTime;

    private org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ApplicationValue[] applicationValues;

    public ECLWorkunitLW() {
    }

    public ECLWorkunitLW(
           java.lang.String wuid,
           java.lang.String owner,
           java.lang.String jobName,
           java.lang.String wuScope,
           java.lang.String clusterName,
           java.lang.Integer state,
           java.lang.String stateDesc,
           java.lang.Integer action,
           java.lang.String actionDesc,
           java.lang.Integer priority,
           java.lang.String priorityDesc,
           java.lang.Integer priorityLevel,
           java.lang.Boolean isProtected,
           java.util.Calendar dateTimeScheduled,
           org.apache.axis.types.UnsignedInt totalClusterTime,
           org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ApplicationValue[] applicationValues) {
           this.wuid = wuid;
           this.owner = owner;
           this.jobName = jobName;
           this.wuScope = wuScope;
           this.clusterName = clusterName;
           this.state = state;
           this.stateDesc = stateDesc;
           this.action = action;
           this.actionDesc = actionDesc;
           this.priority = priority;
           this.priorityDesc = priorityDesc;
           this.priorityLevel = priorityLevel;
           this.isProtected = isProtected;
           this.dateTimeScheduled = dateTimeScheduled;
           this.totalClusterTime = totalClusterTime;
           this.applicationValues = applicationValues;
    }


    /**
     * Gets the wuid value for this ECLWorkunitLW.
     * 
     * @return wuid
     */
    public java.lang.String getWuid() {
        return wuid;
    }


    /**
     * Sets the wuid value for this ECLWorkunitLW.
     * 
     * @param wuid
     */
    public void setWuid(java.lang.String wuid) {
        this.wuid = wuid;
    }


    /**
     * Gets the owner value for this ECLWorkunitLW.
     * 
     * @return owner
     */
    public java.lang.String getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this ECLWorkunitLW.
     * 
     * @param owner
     */
    public void setOwner(java.lang.String owner) {
        this.owner = owner;
    }


    /**
     * Gets the jobName value for this ECLWorkunitLW.
     * 
     * @return jobName
     */
    public java.lang.String getJobName() {
        return jobName;
    }


    /**
     * Sets the jobName value for this ECLWorkunitLW.
     * 
     * @param jobName
     */
    public void setJobName(java.lang.String jobName) {
        this.jobName = jobName;
    }


    /**
     * Gets the wuScope value for this ECLWorkunitLW.
     * 
     * @return wuScope
     */
    public java.lang.String getWuScope() {
        return wuScope;
    }


    /**
     * Sets the wuScope value for this ECLWorkunitLW.
     * 
     * @param wuScope
     */
    public void setWuScope(java.lang.String wuScope) {
        this.wuScope = wuScope;
    }


    /**
     * Gets the clusterName value for this ECLWorkunitLW.
     * 
     * @return clusterName
     */
    public java.lang.String getClusterName() {
        return clusterName;
    }


    /**
     * Sets the clusterName value for this ECLWorkunitLW.
     * 
     * @param clusterName
     */
    public void setClusterName(java.lang.String clusterName) {
        this.clusterName = clusterName;
    }


    /**
     * Gets the state value for this ECLWorkunitLW.
     * 
     * @return state
     */
    public java.lang.Integer getState() {
        return state;
    }


    /**
     * Sets the state value for this ECLWorkunitLW.
     * 
     * @param state
     */
    public void setState(java.lang.Integer state) {
        this.state = state;
    }


    /**
     * Gets the stateDesc value for this ECLWorkunitLW.
     * 
     * @return stateDesc
     */
    public java.lang.String getStateDesc() {
        return stateDesc;
    }


    /**
     * Sets the stateDesc value for this ECLWorkunitLW.
     * 
     * @param stateDesc
     */
    public void setStateDesc(java.lang.String stateDesc) {
        this.stateDesc = stateDesc;
    }


    /**
     * Gets the action value for this ECLWorkunitLW.
     * 
     * @return action
     */
    public java.lang.Integer getAction() {
        return action;
    }


    /**
     * Sets the action value for this ECLWorkunitLW.
     * 
     * @param action
     */
    public void setAction(java.lang.Integer action) {
        this.action = action;
    }


    /**
     * Gets the actionDesc value for this ECLWorkunitLW.
     * 
     * @return actionDesc
     */
    public java.lang.String getActionDesc() {
        return actionDesc;
    }


    /**
     * Sets the actionDesc value for this ECLWorkunitLW.
     * 
     * @param actionDesc
     */
    public void setActionDesc(java.lang.String actionDesc) {
        this.actionDesc = actionDesc;
    }


    /**
     * Gets the priority value for this ECLWorkunitLW.
     * 
     * @return priority
     */
    public java.lang.Integer getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this ECLWorkunitLW.
     * 
     * @param priority
     */
    public void setPriority(java.lang.Integer priority) {
        this.priority = priority;
    }


    /**
     * Gets the priorityDesc value for this ECLWorkunitLW.
     * 
     * @return priorityDesc
     */
    public java.lang.String getPriorityDesc() {
        return priorityDesc;
    }


    /**
     * Sets the priorityDesc value for this ECLWorkunitLW.
     * 
     * @param priorityDesc
     */
    public void setPriorityDesc(java.lang.String priorityDesc) {
        this.priorityDesc = priorityDesc;
    }


    /**
     * Gets the priorityLevel value for this ECLWorkunitLW.
     * 
     * @return priorityLevel
     */
    public java.lang.Integer getPriorityLevel() {
        return priorityLevel;
    }


    /**
     * Sets the priorityLevel value for this ECLWorkunitLW.
     * 
     * @param priorityLevel
     */
    public void setPriorityLevel(java.lang.Integer priorityLevel) {
        this.priorityLevel = priorityLevel;
    }


    /**
     * Gets the isProtected value for this ECLWorkunitLW.
     * 
     * @return isProtected
     */
    public java.lang.Boolean getIsProtected() {
        return isProtected;
    }


    /**
     * Sets the isProtected value for this ECLWorkunitLW.
     * 
     * @param isProtected
     */
    public void setIsProtected(java.lang.Boolean isProtected) {
        this.isProtected = isProtected;
    }


    /**
     * Gets the dateTimeScheduled value for this ECLWorkunitLW.
     * 
     * @return dateTimeScheduled
     */
    public java.util.Calendar getDateTimeScheduled() {
        return dateTimeScheduled;
    }


    /**
     * Sets the dateTimeScheduled value for this ECLWorkunitLW.
     * 
     * @param dateTimeScheduled
     */
    public void setDateTimeScheduled(java.util.Calendar dateTimeScheduled) {
        this.dateTimeScheduled = dateTimeScheduled;
    }


    /**
     * Gets the totalClusterTime value for this ECLWorkunitLW.
     * 
     * @return totalClusterTime
     */
    public org.apache.axis.types.UnsignedInt getTotalClusterTime() {
        return totalClusterTime;
    }


    /**
     * Sets the totalClusterTime value for this ECLWorkunitLW.
     * 
     * @param totalClusterTime
     */
    public void setTotalClusterTime(org.apache.axis.types.UnsignedInt totalClusterTime) {
        this.totalClusterTime = totalClusterTime;
    }


    /**
     * Gets the applicationValues value for this ECLWorkunitLW.
     * 
     * @return applicationValues
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ApplicationValue[] getApplicationValues() {
        return applicationValues;
    }


    /**
     * Sets the applicationValues value for this ECLWorkunitLW.
     * 
     * @param applicationValues
     */
    public void setApplicationValues(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ApplicationValue[] applicationValues) {
        this.applicationValues = applicationValues;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ECLWorkunitLW)) return false;
        ECLWorkunitLW other = (ECLWorkunitLW) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wuid==null && other.getWuid()==null) || 
             (this.wuid!=null &&
              this.wuid.equals(other.getWuid()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.jobName==null && other.getJobName()==null) || 
             (this.jobName!=null &&
              this.jobName.equals(other.getJobName()))) &&
            ((this.wuScope==null && other.getWuScope()==null) || 
             (this.wuScope!=null &&
              this.wuScope.equals(other.getWuScope()))) &&
            ((this.clusterName==null && other.getClusterName()==null) || 
             (this.clusterName!=null &&
              this.clusterName.equals(other.getClusterName()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.stateDesc==null && other.getStateDesc()==null) || 
             (this.stateDesc!=null &&
              this.stateDesc.equals(other.getStateDesc()))) &&
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.actionDesc==null && other.getActionDesc()==null) || 
             (this.actionDesc!=null &&
              this.actionDesc.equals(other.getActionDesc()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.priorityDesc==null && other.getPriorityDesc()==null) || 
             (this.priorityDesc!=null &&
              this.priorityDesc.equals(other.getPriorityDesc()))) &&
            ((this.priorityLevel==null && other.getPriorityLevel()==null) || 
             (this.priorityLevel!=null &&
              this.priorityLevel.equals(other.getPriorityLevel()))) &&
            ((this.isProtected==null && other.getIsProtected()==null) || 
             (this.isProtected!=null &&
              this.isProtected.equals(other.getIsProtected()))) &&
            ((this.dateTimeScheduled==null && other.getDateTimeScheduled()==null) || 
             (this.dateTimeScheduled!=null &&
              this.dateTimeScheduled.equals(other.getDateTimeScheduled()))) &&
            ((this.totalClusterTime==null && other.getTotalClusterTime()==null) || 
             (this.totalClusterTime!=null &&
              this.totalClusterTime.equals(other.getTotalClusterTime()))) &&
            ((this.applicationValues==null && other.getApplicationValues()==null) || 
             (this.applicationValues!=null &&
              java.util.Arrays.equals(this.applicationValues, other.getApplicationValues())));
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
        if (getWuid() != null) {
            _hashCode += getWuid().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getJobName() != null) {
            _hashCode += getJobName().hashCode();
        }
        if (getWuScope() != null) {
            _hashCode += getWuScope().hashCode();
        }
        if (getClusterName() != null) {
            _hashCode += getClusterName().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getStateDesc() != null) {
            _hashCode += getStateDesc().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getActionDesc() != null) {
            _hashCode += getActionDesc().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getPriorityDesc() != null) {
            _hashCode += getPriorityDesc().hashCode();
        }
        if (getPriorityLevel() != null) {
            _hashCode += getPriorityLevel().hashCode();
        }
        if (getIsProtected() != null) {
            _hashCode += getIsProtected().hashCode();
        }
        if (getDateTimeScheduled() != null) {
            _hashCode += getDateTimeScheduled().hashCode();
        }
        if (getTotalClusterTime() != null) {
            _hashCode += getTotalClusterTime().hashCode();
        }
        if (getApplicationValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApplicationValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getApplicationValues(), i);
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
        new org.apache.axis.description.TypeDesc(ECLWorkunitLW.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLWorkunitLW"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Wuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "JobName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wuScope");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WuScope"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusterName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ClusterName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "StateDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ActionDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priorityDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "PriorityDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priorityLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "PriorityLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isProtected");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "IsProtected"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateTimeScheduled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "DateTimeScheduled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalClusterTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "TotalClusterTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationValues");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ApplicationValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ApplicationValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ApplicationValue"));
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
