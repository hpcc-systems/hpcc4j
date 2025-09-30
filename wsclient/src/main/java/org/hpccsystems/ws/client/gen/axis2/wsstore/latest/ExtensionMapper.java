/**
 * ExtensionMapper.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wsstore.latest;

/** ExtensionMapper class */
@SuppressWarnings({"unchecked", "unused"})
public class ExtensionMapper {

  public static java.lang.Object getTypeObject(
      java.lang.String namespaceURI,
      java.lang.String typeName,
      javax.xml.stream.XMLStreamReader reader)
      throws java.lang.Exception {

    if ("urn:hpccsystems:ws:wsstore".equals(namespaceURI) && "StoreInfo".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wsstore.latest.StoreInfo.Factory.parse(reader);
    }

    if ("urn:hpccsystems:ws:wsstore".equals(namespaceURI) && "Namespaces_type0".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wsstore.latest.Namespaces_type0.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wsstore".equals(namespaceURI) && "KVPair".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wsstore.latest.KVPair.Factory.parse(reader);
    }

    if ("urn:hpccsystems:ws:wsstore".equals(namespaceURI) && "EspException".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wsstore.latest.EspException.Factory.parse(reader);
    }

    if ("urn:hpccsystems:ws:wsstore".equals(namespaceURI) && "Stores_type0".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wsstore.latest.Stores_type0.Factory.parse(reader);
    }

    if ("urn:hpccsystems:ws:wsstore".equals(namespaceURI)
        && "ArrayOfEspException".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wsstore.latest.ArrayOfEspException.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wsstore".equals(namespaceURI) && "KeySet_type0".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wsstore.latest.KeySet_type0.Factory.parse(reader);
    }

    if ("urn:hpccsystems:ws:wsstore".equals(namespaceURI) && "Pairs_type0".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wsstore.latest.Pairs_type0.Factory.parse(reader);
    }

    if ("urn:hpccsystems:ws:wsstore".equals(namespaceURI) && "Pairs_type1".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wsstore.latest.Pairs_type1.Factory.parse(reader);
    }

    throw new org.apache.axis2.databinding.ADBException(
        "Unsupported type " + namespaceURI + " " + typeName);
  }
}
