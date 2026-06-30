/**
 * ExtensionMapper.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wsresources.latest;

/** ExtensionMapper class */
@SuppressWarnings({"unchecked", "unused"})
public class ExtensionMapper {

  public static java.lang.Object getTypeObject(
      java.lang.String namespaceURI,
      java.lang.String typeName,
      javax.xml.stream.XMLStreamReader reader)
      throws java.lang.Exception {

    if ("urn:hpccsystems:ws:wsresources".equals(namespaceURI)
        && "ArrayOfEspException".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ArrayOfEspException.Factory
          .parse(reader);
    }

    if ("urn:hpccsystems:ws:wsresources".equals(namespaceURI)
        && "ServiceConnection".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ServiceConnection.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wsresources".equals(namespaceURI)
        && "Services_type0".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wsresources.latest.Services_type0.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wsresources".equals(namespaceURI)
        && "ArrayOfServicePorts".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ArrayOfServicePorts.Factory
          .parse(reader);
    }

    if ("urn:hpccsystems:ws:wsresources".equals(namespaceURI) && "NamedValue".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wsresources.latest.NamedValue.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wsresources".equals(namespaceURI)
        && "ExternalIPStatus".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ExternalIPStatus.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wsresources".equals(namespaceURI)
        && "ArrayOfHPCCQueue".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ArrayOfHPCCQueue.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wsresources".equals(namespaceURI) && "EspException".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wsresources.latest.EspException.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wsresources".equals(namespaceURI)
        && "ArrayOfNamedValue".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ArrayOfNamedValue.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wsresources".equals(namespaceURI)
        && "EspStringArray".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wsresources.latest.EspStringArray.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wsresources".equals(namespaceURI)
        && "ConfiguredWebLink".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ConfiguredWebLink.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wsresources".equals(namespaceURI)
        && "ArrayOfConfiguredWebLink".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ArrayOfConfiguredWebLink.Factory
          .parse(reader);
    }

    if ("urn:hpccsystems:ws:wsresources".equals(namespaceURI) && "HPCCService".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wsresources.latest.HPCCService.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wsresources".equals(namespaceURI) && "HPCCQueueType".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wsresources.latest.HPCCQueueType.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wsresources".equals(namespaceURI) && "ServicePorts".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ServicePorts.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wsresources".equals(namespaceURI) && "HPCCQueue".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wsresources.latest.HPCCQueue.Factory.parse(reader);
    }

    if ("urn:hpccsystems:ws:wsresources".equals(namespaceURI)
        && "DiscoveredWebLink".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wsresources.latest.DiscoveredWebLink.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wsresources".equals(namespaceURI)
        && "ArrayOfDiscoveredWebLink".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ArrayOfDiscoveredWebLink.Factory
          .parse(reader);
    }

    throw new org.apache.axis2.databinding.ADBException(
        "Unsupported type " + namespaceURI + " " + typeName);
  }
}
