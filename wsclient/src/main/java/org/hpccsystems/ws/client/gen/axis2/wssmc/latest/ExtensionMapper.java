/**
 * ExtensionMapper.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wssmc.latest;

/** ExtensionMapper class */
@SuppressWarnings({"unchecked", "unused"})
public class ExtensionMapper {

  public static java.lang.Object getTypeObject(
      java.lang.String namespaceURI,
      java.lang.String typeName,
      javax.xml.stream.XMLStreamReader reader)
      throws java.lang.Exception {

    if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI) && "Endpoints_type0".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wssmc.latest.Endpoints_type0.Factory.parse(reader);
    }

    if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI) && "DFUJob".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wssmc.latest.DFUJob.Factory.parse(reader);
    }

    if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI)
        && "RoxieControlEndpointInfo".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wssmc.latest.RoxieControlEndpointInfo.Factory
          .parse(reader);
    }

    if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI)
        && "ArrayOfTargetCluster".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfTargetCluster.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI) && "LockModes".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wssmc.latest.LockModes.Factory.parse(reader);
    }

    if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI) && "TargetCluster".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wssmc.latest.TargetCluster.Factory.parse(reader);
    }

    if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI)
        && "ArrayOfServerJobQueue".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfServerJobQueue.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI) && "SMCJob".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wssmc.latest.SMCJob.Factory.parse(reader);
    }

    if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI) && "Lock".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wssmc.latest.Lock.Factory.parse(reader);
    }

    if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI)
        && "ArrayOfActiveWorkunit".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfActiveWorkunit.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI) && "ServerJobQueue".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ServerJobQueue.Factory.parse(reader);
    }

    if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI) && "ArrayOfDFUJob".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfDFUJob.Factory.parse(reader);
    }

    if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI) && "ArrayOfEspException".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfEspException.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI) && "HPCCResource".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wssmc.latest.HPCCResource.Factory.parse(reader);
    }

    if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI)
        && "HPCCResourceRepository".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wssmc.latest.HPCCResourceRepository.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI) && "StatusServerInfo".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wssmc.latest.StatusServerInfo.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI) && "ThorCluster".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ThorCluster.Factory.parse(reader);
    }

    if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI) && "ActiveWorkunit".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ActiveWorkunit.Factory.parse(reader);
    }

    if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI) && "ArrayOfThorCluster".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfThorCluster.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI) && "NamedValue".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wssmc.latest.NamedValue.Factory.parse(reader);
    }

    if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI) && "ArrayOfLock".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfLock.Factory.parse(reader);
    }

    if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI) && "ArrayOfNamedValue".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfNamedValue.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI) && "EspException".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspException.Factory.parse(reader);
    }

    if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI)
        && "ArrayOfHPCCResourceRepository".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfHPCCResourceRepository.Factory
          .parse(reader);
    }

    if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI) && "ArrayOfHPCCResource".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfHPCCResource.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI) && "EspStringArray".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspStringArray.Factory.parse(reader);
    }

    if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI) && "RoxieControlCmdType".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wssmc.latest.RoxieControlCmdType.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI) && "ArrayOfSMCJob".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfSMCJob.Factory.parse(reader);
    }

    throw new org.apache.axis2.databinding.ADBException(
        "Unsupported type " + namespaceURI + " " + typeName);
  }
}
