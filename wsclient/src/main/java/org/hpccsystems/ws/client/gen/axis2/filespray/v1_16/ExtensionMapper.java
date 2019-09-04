/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */
package org.hpccsystems.ws.client.gen.axis2.filespray.v1_16;


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
        if ("urn:hpccsystems:ws:filespray".equals(namespaceURI) &&
                "ArrayOfDFUException".equals(typeName)) {
            return org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.ArrayOfDFUException.Factory.parse(reader);
        }

        if ("urn:hpccsystems:ws:filespray".equals(namespaceURI) &&
                "PhysicalFileStruct".equals(typeName)) {
            return org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.PhysicalFileStruct.Factory.parse(reader);
        }

        if ("urn:hpccsystems:ws:filespray".equals(namespaceURI) &&
                "ArrayOfDropZone".equals(typeName)) {
            return org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.ArrayOfDropZone.Factory.parse(reader);
        }

        if ("urn:hpccsystems:ws:filespray".equals(namespaceURI) &&
                "DFUWUActions".equals(typeName)) {
            return org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.DFUWUActions.Factory.parse(reader);
        }

        if ("urn:hpccsystems:ws:filespray".equals(namespaceURI) &&
                "EspStringArray".equals(typeName)) {
            return org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspStringArray.Factory.parse(reader);
        }

        if ("urn:hpccsystems:ws:filespray".equals(namespaceURI) &&
                "DFUActionResult".equals(typeName)) {
            return org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.DFUActionResult.Factory.parse(reader);
        }

        if ("urn:hpccsystems:ws:filespray".equals(namespaceURI) &&
                "ArrayOfDFUActionResult".equals(typeName)) {
            return org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.ArrayOfDFUActionResult.Factory.parse(reader);
        }

        if ("urn:hpccsystems:ws:filespray".equals(namespaceURI) &&
                "DropZone".equals(typeName)) {
            return org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.DropZone.Factory.parse(reader);
        }

        if ("urn:hpccsystems:ws:filespray".equals(namespaceURI) &&
                "ArrayOfPhysicalFileStruct".equals(typeName)) {
            return org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.ArrayOfPhysicalFileStruct.Factory.parse(reader);
        }

        if ("urn:hpccsystems:ws:filespray".equals(namespaceURI) &&
                "EspException".equals(typeName)) {
            return org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspException.Factory.parse(reader);
        }

        if ("urn:hpccsystems:ws:filespray".equals(namespaceURI) &&
                "GroupNode".equals(typeName)) {
            return org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.GroupNode.Factory.parse(reader);
        }

        if ("urn:hpccsystems:ws:filespray".equals(namespaceURI) &&
                "ClusterNames_type0".equals(typeName)) {
            return org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.ClusterNames_type0.Factory.parse(reader);
        }

        if ("urn:hpccsystems:ws:filespray".equals(namespaceURI) &&
                "ArrayOfDFUWorkunit".equals(typeName)) {
            return org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.ArrayOfDFUWorkunit.Factory.parse(reader);
        }

        if ("urn:hpccsystems:ws:filespray".equals(namespaceURI) &&
                "ArrayOfEspException".equals(typeName)) {
            return org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.ArrayOfEspException.Factory.parse(reader);
        }

        if ("urn:hpccsystems:ws:filespray".equals(namespaceURI) &&
                "DFUWorkunit".equals(typeName)) {
            return org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.DFUWorkunit.Factory.parse(reader);
        }

        if ("urn:hpccsystems:ws:filespray".equals(namespaceURI) &&
                "GroupNodes_type0".equals(typeName)) {
            return org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.GroupNodes_type0.Factory.parse(reader);
        }

        if ("urn:hpccsystems:ws:filespray".equals(namespaceURI) &&
                "DFUException".equals(typeName)) {
            return org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.DFUException.Factory.parse(reader);
        }

        throw new org.apache.axis2.databinding.ADBException("Unsupported type " +
            namespaceURI + " " + typeName);
    }
}
