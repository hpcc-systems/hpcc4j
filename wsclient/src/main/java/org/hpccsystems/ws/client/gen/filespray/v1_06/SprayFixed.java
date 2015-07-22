/**
 * SprayFixed.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.filespray.v1_06;

public class SprayFixed  implements java.io.Serializable {
    private java.lang.String sourceIP;

    private java.lang.String sourcePath;

    private byte[] srcxml;

    private java.lang.Integer sourceRecordSize;

    private java.lang.String destGroup;

    private java.lang.String destLogicalName;

    private java.lang.Boolean overwrite;

    private java.lang.Boolean replicate;

    private java.lang.Integer replicateOffset;

    private java.lang.Integer maxConnections;

    private java.lang.Integer throttle;

    private java.lang.Integer transferBufferSize;

    private java.lang.String prefix;

    private java.lang.Boolean nosplit;

    private java.lang.Boolean norecover;

    private java.lang.Boolean compress;

    private java.lang.Boolean push;

    private java.lang.Boolean pull;

    private java.lang.String encrypt;

    private java.lang.String decrypt;

    private java.lang.Boolean wrap;

    public SprayFixed() {
    }

    public SprayFixed(
           java.lang.String sourceIP,
           java.lang.String sourcePath,
           byte[] srcxml,
           java.lang.Integer sourceRecordSize,
           java.lang.String destGroup,
           java.lang.String destLogicalName,
           java.lang.Boolean overwrite,
           java.lang.Boolean replicate,
           java.lang.Integer replicateOffset,
           java.lang.Integer maxConnections,
           java.lang.Integer throttle,
           java.lang.Integer transferBufferSize,
           java.lang.String prefix,
           java.lang.Boolean nosplit,
           java.lang.Boolean norecover,
           java.lang.Boolean compress,
           java.lang.Boolean push,
           java.lang.Boolean pull,
           java.lang.String encrypt,
           java.lang.String decrypt,
           java.lang.Boolean wrap) {
           this.sourceIP = sourceIP;
           this.sourcePath = sourcePath;
           this.srcxml = srcxml;
           this.sourceRecordSize = sourceRecordSize;
           this.destGroup = destGroup;
           this.destLogicalName = destLogicalName;
           this.overwrite = overwrite;
           this.replicate = replicate;
           this.replicateOffset = replicateOffset;
           this.maxConnections = maxConnections;
           this.throttle = throttle;
           this.transferBufferSize = transferBufferSize;
           this.prefix = prefix;
           this.nosplit = nosplit;
           this.norecover = norecover;
           this.compress = compress;
           this.push = push;
           this.pull = pull;
           this.encrypt = encrypt;
           this.decrypt = decrypt;
           this.wrap = wrap;
    }


    /**
     * Gets the sourceIP value for this SprayFixed.
     * 
     * @return sourceIP
     */
    public java.lang.String getSourceIP() {
        return sourceIP;
    }


    /**
     * Sets the sourceIP value for this SprayFixed.
     * 
     * @param sourceIP
     */
    public void setSourceIP(java.lang.String sourceIP) {
        this.sourceIP = sourceIP;
    }


    /**
     * Gets the sourcePath value for this SprayFixed.
     * 
     * @return sourcePath
     */
    public java.lang.String getSourcePath() {
        return sourcePath;
    }


    /**
     * Sets the sourcePath value for this SprayFixed.
     * 
     * @param sourcePath
     */
    public void setSourcePath(java.lang.String sourcePath) {
        this.sourcePath = sourcePath;
    }


    /**
     * Gets the srcxml value for this SprayFixed.
     * 
     * @return srcxml
     */
    public byte[] getSrcxml() {
        return srcxml;
    }


    /**
     * Sets the srcxml value for this SprayFixed.
     * 
     * @param srcxml
     */
    public void setSrcxml(byte[] srcxml) {
        this.srcxml = srcxml;
    }


    /**
     * Gets the sourceRecordSize value for this SprayFixed.
     * 
     * @return sourceRecordSize
     */
    public java.lang.Integer getSourceRecordSize() {
        return sourceRecordSize;
    }


    /**
     * Sets the sourceRecordSize value for this SprayFixed.
     * 
     * @param sourceRecordSize
     */
    public void setSourceRecordSize(java.lang.Integer sourceRecordSize) {
        this.sourceRecordSize = sourceRecordSize;
    }


    /**
     * Gets the destGroup value for this SprayFixed.
     * 
     * @return destGroup
     */
    public java.lang.String getDestGroup() {
        return destGroup;
    }


    /**
     * Sets the destGroup value for this SprayFixed.
     * 
     * @param destGroup
     */
    public void setDestGroup(java.lang.String destGroup) {
        this.destGroup = destGroup;
    }


    /**
     * Gets the destLogicalName value for this SprayFixed.
     * 
     * @return destLogicalName
     */
    public java.lang.String getDestLogicalName() {
        return destLogicalName;
    }


    /**
     * Sets the destLogicalName value for this SprayFixed.
     * 
     * @param destLogicalName
     */
    public void setDestLogicalName(java.lang.String destLogicalName) {
        this.destLogicalName = destLogicalName;
    }


    /**
     * Gets the overwrite value for this SprayFixed.
     * 
     * @return overwrite
     */
    public java.lang.Boolean getOverwrite() {
        return overwrite;
    }


    /**
     * Sets the overwrite value for this SprayFixed.
     * 
     * @param overwrite
     */
    public void setOverwrite(java.lang.Boolean overwrite) {
        this.overwrite = overwrite;
    }


    /**
     * Gets the replicate value for this SprayFixed.
     * 
     * @return replicate
     */
    public java.lang.Boolean getReplicate() {
        return replicate;
    }


    /**
     * Sets the replicate value for this SprayFixed.
     * 
     * @param replicate
     */
    public void setReplicate(java.lang.Boolean replicate) {
        this.replicate = replicate;
    }


    /**
     * Gets the replicateOffset value for this SprayFixed.
     * 
     * @return replicateOffset
     */
    public java.lang.Integer getReplicateOffset() {
        return replicateOffset;
    }


    /**
     * Sets the replicateOffset value for this SprayFixed.
     * 
     * @param replicateOffset
     */
    public void setReplicateOffset(java.lang.Integer replicateOffset) {
        this.replicateOffset = replicateOffset;
    }


    /**
     * Gets the maxConnections value for this SprayFixed.
     * 
     * @return maxConnections
     */
    public java.lang.Integer getMaxConnections() {
        return maxConnections;
    }


    /**
     * Sets the maxConnections value for this SprayFixed.
     * 
     * @param maxConnections
     */
    public void setMaxConnections(java.lang.Integer maxConnections) {
        this.maxConnections = maxConnections;
    }


    /**
     * Gets the throttle value for this SprayFixed.
     * 
     * @return throttle
     */
    public java.lang.Integer getThrottle() {
        return throttle;
    }


    /**
     * Sets the throttle value for this SprayFixed.
     * 
     * @param throttle
     */
    public void setThrottle(java.lang.Integer throttle) {
        this.throttle = throttle;
    }


    /**
     * Gets the transferBufferSize value for this SprayFixed.
     * 
     * @return transferBufferSize
     */
    public java.lang.Integer getTransferBufferSize() {
        return transferBufferSize;
    }


    /**
     * Sets the transferBufferSize value for this SprayFixed.
     * 
     * @param transferBufferSize
     */
    public void setTransferBufferSize(java.lang.Integer transferBufferSize) {
        this.transferBufferSize = transferBufferSize;
    }


    /**
     * Gets the prefix value for this SprayFixed.
     * 
     * @return prefix
     */
    public java.lang.String getPrefix() {
        return prefix;
    }


    /**
     * Sets the prefix value for this SprayFixed.
     * 
     * @param prefix
     */
    public void setPrefix(java.lang.String prefix) {
        this.prefix = prefix;
    }


    /**
     * Gets the nosplit value for this SprayFixed.
     * 
     * @return nosplit
     */
    public java.lang.Boolean getNosplit() {
        return nosplit;
    }


    /**
     * Sets the nosplit value for this SprayFixed.
     * 
     * @param nosplit
     */
    public void setNosplit(java.lang.Boolean nosplit) {
        this.nosplit = nosplit;
    }


    /**
     * Gets the norecover value for this SprayFixed.
     * 
     * @return norecover
     */
    public java.lang.Boolean getNorecover() {
        return norecover;
    }


    /**
     * Sets the norecover value for this SprayFixed.
     * 
     * @param norecover
     */
    public void setNorecover(java.lang.Boolean norecover) {
        this.norecover = norecover;
    }


    /**
     * Gets the compress value for this SprayFixed.
     * 
     * @return compress
     */
    public java.lang.Boolean getCompress() {
        return compress;
    }


    /**
     * Sets the compress value for this SprayFixed.
     * 
     * @param compress
     */
    public void setCompress(java.lang.Boolean compress) {
        this.compress = compress;
    }


    /**
     * Gets the push value for this SprayFixed.
     * 
     * @return push
     */
    public java.lang.Boolean getPush() {
        return push;
    }


    /**
     * Sets the push value for this SprayFixed.
     * 
     * @param push
     */
    public void setPush(java.lang.Boolean push) {
        this.push = push;
    }


    /**
     * Gets the pull value for this SprayFixed.
     * 
     * @return pull
     */
    public java.lang.Boolean getPull() {
        return pull;
    }


    /**
     * Sets the pull value for this SprayFixed.
     * 
     * @param pull
     */
    public void setPull(java.lang.Boolean pull) {
        this.pull = pull;
    }


    /**
     * Gets the encrypt value for this SprayFixed.
     * 
     * @return encrypt
     */
    public java.lang.String getEncrypt() {
        return encrypt;
    }


    /**
     * Sets the encrypt value for this SprayFixed.
     * 
     * @param encrypt
     */
    public void setEncrypt(java.lang.String encrypt) {
        this.encrypt = encrypt;
    }


    /**
     * Gets the decrypt value for this SprayFixed.
     * 
     * @return decrypt
     */
    public java.lang.String getDecrypt() {
        return decrypt;
    }


    /**
     * Sets the decrypt value for this SprayFixed.
     * 
     * @param decrypt
     */
    public void setDecrypt(java.lang.String decrypt) {
        this.decrypt = decrypt;
    }


    /**
     * Gets the wrap value for this SprayFixed.
     * 
     * @return wrap
     */
    public java.lang.Boolean getWrap() {
        return wrap;
    }


    /**
     * Sets the wrap value for this SprayFixed.
     * 
     * @param wrap
     */
    public void setWrap(java.lang.Boolean wrap) {
        this.wrap = wrap;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SprayFixed)) return false;
        SprayFixed other = (SprayFixed) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sourceIP==null && other.getSourceIP()==null) || 
             (this.sourceIP!=null &&
              this.sourceIP.equals(other.getSourceIP()))) &&
            ((this.sourcePath==null && other.getSourcePath()==null) || 
             (this.sourcePath!=null &&
              this.sourcePath.equals(other.getSourcePath()))) &&
            ((this.srcxml==null && other.getSrcxml()==null) || 
             (this.srcxml!=null &&
              java.util.Arrays.equals(this.srcxml, other.getSrcxml()))) &&
            ((this.sourceRecordSize==null && other.getSourceRecordSize()==null) || 
             (this.sourceRecordSize!=null &&
              this.sourceRecordSize.equals(other.getSourceRecordSize()))) &&
            ((this.destGroup==null && other.getDestGroup()==null) || 
             (this.destGroup!=null &&
              this.destGroup.equals(other.getDestGroup()))) &&
            ((this.destLogicalName==null && other.getDestLogicalName()==null) || 
             (this.destLogicalName!=null &&
              this.destLogicalName.equals(other.getDestLogicalName()))) &&
            ((this.overwrite==null && other.getOverwrite()==null) || 
             (this.overwrite!=null &&
              this.overwrite.equals(other.getOverwrite()))) &&
            ((this.replicate==null && other.getReplicate()==null) || 
             (this.replicate!=null &&
              this.replicate.equals(other.getReplicate()))) &&
            ((this.replicateOffset==null && other.getReplicateOffset()==null) || 
             (this.replicateOffset!=null &&
              this.replicateOffset.equals(other.getReplicateOffset()))) &&
            ((this.maxConnections==null && other.getMaxConnections()==null) || 
             (this.maxConnections!=null &&
              this.maxConnections.equals(other.getMaxConnections()))) &&
            ((this.throttle==null && other.getThrottle()==null) || 
             (this.throttle!=null &&
              this.throttle.equals(other.getThrottle()))) &&
            ((this.transferBufferSize==null && other.getTransferBufferSize()==null) || 
             (this.transferBufferSize!=null &&
              this.transferBufferSize.equals(other.getTransferBufferSize()))) &&
            ((this.prefix==null && other.getPrefix()==null) || 
             (this.prefix!=null &&
              this.prefix.equals(other.getPrefix()))) &&
            ((this.nosplit==null && other.getNosplit()==null) || 
             (this.nosplit!=null &&
              this.nosplit.equals(other.getNosplit()))) &&
            ((this.norecover==null && other.getNorecover()==null) || 
             (this.norecover!=null &&
              this.norecover.equals(other.getNorecover()))) &&
            ((this.compress==null && other.getCompress()==null) || 
             (this.compress!=null &&
              this.compress.equals(other.getCompress()))) &&
            ((this.push==null && other.getPush()==null) || 
             (this.push!=null &&
              this.push.equals(other.getPush()))) &&
            ((this.pull==null && other.getPull()==null) || 
             (this.pull!=null &&
              this.pull.equals(other.getPull()))) &&
            ((this.encrypt==null && other.getEncrypt()==null) || 
             (this.encrypt!=null &&
              this.encrypt.equals(other.getEncrypt()))) &&
            ((this.decrypt==null && other.getDecrypt()==null) || 
             (this.decrypt!=null &&
              this.decrypt.equals(other.getDecrypt()))) &&
            ((this.wrap==null && other.getWrap()==null) || 
             (this.wrap!=null &&
              this.wrap.equals(other.getWrap())));
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
        if (getSourceIP() != null) {
            _hashCode += getSourceIP().hashCode();
        }
        if (getSourcePath() != null) {
            _hashCode += getSourcePath().hashCode();
        }
        if (getSrcxml() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSrcxml());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSrcxml(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSourceRecordSize() != null) {
            _hashCode += getSourceRecordSize().hashCode();
        }
        if (getDestGroup() != null) {
            _hashCode += getDestGroup().hashCode();
        }
        if (getDestLogicalName() != null) {
            _hashCode += getDestLogicalName().hashCode();
        }
        if (getOverwrite() != null) {
            _hashCode += getOverwrite().hashCode();
        }
        if (getReplicate() != null) {
            _hashCode += getReplicate().hashCode();
        }
        if (getReplicateOffset() != null) {
            _hashCode += getReplicateOffset().hashCode();
        }
        if (getMaxConnections() != null) {
            _hashCode += getMaxConnections().hashCode();
        }
        if (getThrottle() != null) {
            _hashCode += getThrottle().hashCode();
        }
        if (getTransferBufferSize() != null) {
            _hashCode += getTransferBufferSize().hashCode();
        }
        if (getPrefix() != null) {
            _hashCode += getPrefix().hashCode();
        }
        if (getNosplit() != null) {
            _hashCode += getNosplit().hashCode();
        }
        if (getNorecover() != null) {
            _hashCode += getNorecover().hashCode();
        }
        if (getCompress() != null) {
            _hashCode += getCompress().hashCode();
        }
        if (getPush() != null) {
            _hashCode += getPush().hashCode();
        }
        if (getPull() != null) {
            _hashCode += getPull().hashCode();
        }
        if (getEncrypt() != null) {
            _hashCode += getEncrypt().hashCode();
        }
        if (getDecrypt() != null) {
            _hashCode += getDecrypt().hashCode();
        }
        if (getWrap() != null) {
            _hashCode += getWrap().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SprayFixed.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">SprayFixed"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceIP");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "sourceIP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourcePath");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "sourcePath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srcxml");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "srcxml"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceRecordSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "sourceRecordSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "destGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destLogicalName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "destLogicalName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overwrite");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "overwrite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("replicate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "replicate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("replicateOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ReplicateOffset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxConnections");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "maxConnections"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("throttle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "throttle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferBufferSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "transferBufferSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefix");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "prefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nosplit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "nosplit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("norecover");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "norecover"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "compress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("push");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "push"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pull");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "pull"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encrypt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "encrypt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("decrypt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "decrypt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wrap");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "wrap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
