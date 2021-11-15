/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */
package org.hpccsystems.ws.client.gen.axis2.wscodesign.latest;


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
        if ("urn:hpccsystems:ws:ws_codesign".equals(namespaceURI) &&
                "EspException".equals(typeName)) {
            return org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.EspException.Factory.parse(reader);
        }

        if ("urn:hpccsystems:ws:ws_codesign".equals(namespaceURI) &&
                "SigningMethodType".equals(typeName)) {
            return org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.SigningMethodType.Factory.parse(reader);
        }

        if ("urn:hpccsystems:ws:ws_codesign".equals(namespaceURI) &&
                "EspStringArray".equals(typeName)) {
            return org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.EspStringArray.Factory.parse(reader);
        }

        if ("urn:hpccsystems:ws:ws_codesign".equals(namespaceURI) &&
                "ArrayOfEspException".equals(typeName)) {
            return org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.ArrayOfEspException.Factory.parse(reader);
        }

        throw new org.apache.axis2.databinding.ADBException("Unsupported type " +
            namespaceURI + " " + typeName);
    }
}
