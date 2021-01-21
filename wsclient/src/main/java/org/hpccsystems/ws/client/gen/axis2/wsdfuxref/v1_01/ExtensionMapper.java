/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */
package org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_01;


/**
 *  ExtensionMapper class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class ExtensionMapper {
    public static java.lang.Object getTypeObject(
        java.lang.String namespaceURI, java.lang.String typeName,
        javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
        if ("urn:hpccsystems:ws:wsdfuxref".equals(namespaceURI) &&
                "ArrayOfDFULogicalFile".equals(typeName)) {
            return org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_01.ArrayOfDFULogicalFile.Factory.parse(reader);
        }

        if ("urn:hpccsystems:ws:wsdfuxref".equals(namespaceURI) &&
                "EspStringArray".equals(typeName)) {
            return org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_01.EspStringArray.Factory.parse(reader);
        }

        if ("urn:hpccsystems:ws:wsdfuxref".equals(namespaceURI) &&
                "ArrayOfEspException".equals(typeName)) {
            return org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_01.ArrayOfEspException.Factory.parse(reader);
        }

        if ("urn:hpccsystems:ws:wsdfuxref".equals(namespaceURI) &&
                "EspException".equals(typeName)) {
            return org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_01.EspException.Factory.parse(reader);
        }

        if ("urn:hpccsystems:ws:wsdfuxref".equals(namespaceURI) &&
                "UnusedFiles_type0".equals(typeName)) {
            return org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_01.UnusedFiles_type0.Factory.parse(reader);
        }

        if ("urn:hpccsystems:ws:wsdfuxref".equals(namespaceURI) &&
                "DFULogicalFile".equals(typeName)) {
            return org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_01.DFULogicalFile.Factory.parse(reader);
        }

        throw new org.apache.axis2.databinding.ADBException("Unsupported type " +
            namespaceURI + " " + typeName);
    }
}
