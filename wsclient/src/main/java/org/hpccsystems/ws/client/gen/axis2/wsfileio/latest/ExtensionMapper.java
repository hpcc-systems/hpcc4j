/**
 * ExtensionMapper.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wsfileio.latest;

/** ExtensionMapper class */
@SuppressWarnings({"unchecked", "unused"})
public class ExtensionMapper {

  public static java.lang.Object getTypeObject(
      java.lang.String namespaceURI,
      java.lang.String typeName,
      javax.xml.stream.XMLStreamReader reader)
      throws java.lang.Exception {

    if ("urn:hpccsystems:ws:wsfileio".equals(namespaceURI)
        && "ArrayOfEspException".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.ArrayOfEspException.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wsfileio".equals(namespaceURI) && "EspException".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.EspException.Factory.parse(reader);
    }

    throw new org.apache.axis2.databinding.ADBException(
        "Unsupported type " + namespaceURI + " " + typeName);
  }
}
