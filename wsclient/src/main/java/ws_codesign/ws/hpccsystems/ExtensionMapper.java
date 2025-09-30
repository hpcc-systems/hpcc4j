/**
 * ExtensionMapper.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package ws_codesign.ws.hpccsystems;

/** ExtensionMapper class */
@SuppressWarnings({"unchecked", "unused"})
public class ExtensionMapper {

  public static java.lang.Object getTypeObject(
      java.lang.String namespaceURI,
      java.lang.String typeName,
      javax.xml.stream.XMLStreamReader reader)
      throws java.lang.Exception {

    if ("urn:hpccsystems:ws:ws_codesign".equals(namespaceURI) && "EspException".equals(typeName)) {

      return ws_codesign.ws.hpccsystems.EspException.Factory.parse(reader);
    }

    if ("urn:hpccsystems:ws:ws_codesign".equals(namespaceURI)
        && "SigningMethodType".equals(typeName)) {

      return ws_codesign.ws.hpccsystems.SigningMethodType.Factory.parse(reader);
    }

    if ("urn:hpccsystems:ws:ws_codesign".equals(namespaceURI)
        && "EspStringArray".equals(typeName)) {

      return ws_codesign.ws.hpccsystems.EspStringArray.Factory.parse(reader);
    }

    if ("urn:hpccsystems:ws:ws_codesign".equals(namespaceURI)
        && "ArrayOfEspException".equals(typeName)) {

      return ws_codesign.ws.hpccsystems.ArrayOfEspException.Factory.parse(reader);
    }

    throw new org.apache.axis2.databinding.ADBException(
        "Unsupported type " + namespaceURI + " " + typeName);
  }
}
