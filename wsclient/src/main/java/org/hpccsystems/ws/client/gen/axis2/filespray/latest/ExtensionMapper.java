/**
 * ExtensionMapper.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.filespray.latest;

/** ExtensionMapper class */
@SuppressWarnings({"unchecked", "unused"})
public class ExtensionMapper {

  public static java.lang.Object getTypeObject(
      java.lang.String namespaceURI,
      java.lang.String typeName,
      javax.xml.stream.XMLStreamReader reader)
      throws java.lang.Exception {

    if ("urn:hpccsystems:ws:filespray".equals(namespaceURI)
        && "ArrayOfDFUException".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.filespray.latest.ArrayOfDFUException.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:filespray".equals(namespaceURI)
        && "PhysicalFileStruct".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.filespray.latest.PhysicalFileStruct.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:filespray".equals(namespaceURI) && "ArrayOfDropZone".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.filespray.latest.ArrayOfDropZone.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:filespray".equals(namespaceURI) && "DFUWUActions".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.filespray.latest.DFUWUActions.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:filespray".equals(namespaceURI) && "EspStringArray".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspStringArray.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:filespray".equals(namespaceURI) && "DFUActionResult".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.filespray.latest.DFUActionResult.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:filespray".equals(namespaceURI)
        && "ArrayOfDFUActionResult".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.filespray.latest.ArrayOfDFUActionResult.Factory
          .parse(reader);
    }

    if ("urn:hpccsystems:ws:filespray".equals(namespaceURI) && "DropZone".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.filespray.latest.DropZone.Factory.parse(reader);
    }

    if ("urn:hpccsystems:ws:filespray".equals(namespaceURI)
        && "ArrayOfPhysicalFileStruct".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.filespray.latest.ArrayOfPhysicalFileStruct.Factory
          .parse(reader);
    }

    if ("urn:hpccsystems:ws:filespray".equals(namespaceURI) && "EspException".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspException.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:filespray".equals(namespaceURI) && "GroupNode".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.filespray.latest.GroupNode.Factory.parse(reader);
    }

    if ("urn:hpccsystems:ws:filespray".equals(namespaceURI)
        && "ClusterNames_type0".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.filespray.latest.ClusterNames_type0.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:filespray".equals(namespaceURI)
        && "ArrayOfDFUWorkunit".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.filespray.latest.ArrayOfDFUWorkunit.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:filespray".equals(namespaceURI)
        && "ArrayOfEspException".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.filespray.latest.ArrayOfEspException.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:filespray".equals(namespaceURI) && "DFUWorkunit".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.filespray.latest.DFUWorkunit.Factory.parse(reader);
    }

    if ("urn:hpccsystems:ws:filespray".equals(namespaceURI)
        && "GroupNodes_type0".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.filespray.latest.GroupNodes_type0.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:filespray".equals(namespaceURI) && "DFUException".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.filespray.latest.DFUException.Factory.parse(
          reader);
    }

    throw new org.apache.axis2.databinding.ADBException(
        "Unsupported type " + namespaceURI + " " + typeName);
  }
}
