/**
 * DFUArrayActionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsdfu.v1_51;

public class DFUArrayActionResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException exceptions;

    private java.lang.String backToPage;

    private java.lang.String redirectTo;

    private org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUActionInfo[] actionResults;

    public DFUArrayActionResponse() {
    }

    public DFUArrayActionResponse(
           org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException exceptions,
           java.lang.String backToPage,
           java.lang.String redirectTo,
           org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUActionInfo[] actionResults) {
           this.exceptions = exceptions;
           this.backToPage = backToPage;
           this.redirectTo = redirectTo;
           this.actionResults = actionResults;
    }


    /**
     * Gets the exceptions value for this DFUArrayActionResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this DFUArrayActionResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the backToPage value for this DFUArrayActionResponse.
     * 
     * @return backToPage
     */
    public java.lang.String getBackToPage() {
        return backToPage;
    }


    /**
     * Sets the backToPage value for this DFUArrayActionResponse.
     * 
     * @param backToPage
     */
    public void setBackToPage(java.lang.String backToPage) {
        this.backToPage = backToPage;
    }


    /**
     * Gets the redirectTo value for this DFUArrayActionResponse.
     * 
     * @return redirectTo
     */
    public java.lang.String getRedirectTo() {
        return redirectTo;
    }


    /**
     * Sets the redirectTo value for this DFUArrayActionResponse.
     * 
     * @param redirectTo
     */
    public void setRedirectTo(java.lang.String redirectTo) {
        this.redirectTo = redirectTo;
    }


    /**
     * Gets the actionResults value for this DFUArrayActionResponse.
     * 
     * @return actionResults
     */
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUActionInfo[] getActionResults() {
        return actionResults;
    }


    /**
     * Sets the actionResults value for this DFUArrayActionResponse.
     * 
     * @param actionResults
     */
    public void setActionResults(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUActionInfo[] actionResults) {
        this.actionResults = actionResults;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DFUArrayActionResponse)) return false;
        DFUArrayActionResponse other = (DFUArrayActionResponse) obj;
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
            ((this.backToPage==null && other.getBackToPage()==null) || 
             (this.backToPage!=null &&
              this.backToPage.equals(other.getBackToPage()))) &&
            ((this.redirectTo==null && other.getRedirectTo()==null) || 
             (this.redirectTo!=null &&
              this.redirectTo.equals(other.getRedirectTo()))) &&
            ((this.actionResults==null && other.getActionResults()==null) || 
             (this.actionResults!=null &&
              java.util.Arrays.equals(this.actionResults, other.getActionResults())));
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
        if (getBackToPage() != null) {
            _hashCode += getBackToPage().hashCode();
        }
        if (getRedirectTo() != null) {
            _hashCode += getRedirectTo().hashCode();
        }
        if (getActionResults() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActionResults());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActionResults(), i);
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
        new org.apache.axis.description.TypeDesc(DFUArrayActionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUArrayActionResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backToPage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "BackToPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("redirectTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "RedirectTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionResults");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ActionResults"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUActionInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUActionInfo"));
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
