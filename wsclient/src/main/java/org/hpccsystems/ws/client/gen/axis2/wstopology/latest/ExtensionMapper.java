/**
 * ExtensionMapper.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wstopology.latest;

/** ExtensionMapper class */
@SuppressWarnings({"unchecked", "unused"})
public class ExtensionMapper {

  public static java.lang.Object getTypeObject(
      java.lang.String namespaceURI,
      java.lang.String typeName,
      javax.xml.stream.XMLStreamReader reader)
      throws java.lang.Exception {

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI) && "TpMySqlServer".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMySqlServer.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI) && "TpMachineType".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineType.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI) && "TpDkcSlave".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDkcSlave.Factory.parse(reader);
    }

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI)
        && "ArrayOfTpLogicalCluster".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpLogicalCluster.Factory
          .parse(reader);
    }

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI)
        && "ArrayOfTpEclScheduler".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpEclScheduler.Factory
          .parse(reader);
    }

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI) && "TpBinding".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpBinding.Factory.parse(reader);
    }

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI) && "TpMachine".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachine.Factory.parse(reader);
    }

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI)
        && "ArrayOfTpBinding".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpBinding.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI) && "TpDropZone".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDropZone.Factory.parse(reader);
    }

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI)
        && "ArrayOfTpCluster".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpCluster.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI)
        && "ArrayOfTpFTSlave".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpFTSlave.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI) && "Plugins_type0".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.Plugins_type0.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI)
        && "ArrayOfTpDkcSlave".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpDkcSlave.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI) && "ArrayOfTpDali".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpDali.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI)
        && "ArrayOfTpTargetCluster".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpTargetCluster.Factory
          .parse(reader);
    }

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI)
        && "ArrayOfTpClusterNameType".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpClusterNameType.Factory
          .parse(reader);
    }

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI) && "TpLdapServer".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLdapServer.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI)
        && "TpGenesisServer".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGenesisServer.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI) && "TpDali".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDali.Factory.parse(reader);
    }

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI)
        && "ArrayOfTpEclServer".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpEclServer.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI) && "TpSashaServer".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSashaServer.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI) && "TpEspServer".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpEspServer.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI)
        && "ArrayOfTpMachine".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpMachine.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI) && "TpEclScheduler".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpEclScheduler.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI)
        && "ArrayOfTpEclAgent".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpEclAgent.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI)
        && "TpLogicalCluster".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogicalCluster.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI)
        && "ArrayOfLogFileStruct".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfLogFileStruct.Factory
          .parse(reader);
    }

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI)
        && "ArrayOfTpDropZone".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpDropZone.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI)
        && "ArrayOfTpSparkThor".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpSparkThor.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI) && "ArrayOfTpQueue".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpQueue.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI) && "TpDfuServer".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDfuServer.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI) && "TpSparkThor".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSparkThor.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI)
        && "ArrayOfTpDfuServer".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpDfuServer.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI)
        && "TpEspServicePlugin".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpEspServicePlugin.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI)
        && "ArrayOfTpLdapServer".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpLdapServer.Factory
          .parse(reader);
    }

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI)
        && "TpTargetCluster".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpTargetCluster.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI)
        && "TpClusterNameType".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpClusterNameType.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI)
        && "ArrayOfTpMySqlServer".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpMySqlServer.Factory
          .parse(reader);
    }

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI) && "ArrayOfTpGroup".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpGroup.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI)
        && "RoxieQueueFilter".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.RoxieQueueFilter.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI) && "LogFileStruct".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.LogFileStruct.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI)
        && "ArrayOfTpGenesisServer".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpGenesisServer.Factory
          .parse(reader);
    }

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI) && "EspStringArray".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspStringArray.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI) && "TpCluster".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpCluster.Factory.parse(reader);
    }

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI) && "TpFTSlave".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpFTSlave.Factory.parse(reader);
    }

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI) && "TpGroup".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGroup.Factory.parse(reader);
    }

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI)
        && "ArrayOfTpSashaServer".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpSashaServer.Factory
          .parse(reader);
    }

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI) && "TpEclServer".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpEclServer.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI) && "EspException".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspException.Factory.parse(
          reader);
    }

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI)
        && "ArrayOfEspException".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfEspException.Factory
          .parse(reader);
    }

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI) && "TpServices".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpServices.Factory.parse(reader);
    }

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI) && "TpQueue".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpQueue.Factory.parse(reader);
    }

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI) && "TpEclAgent".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpEclAgent.Factory.parse(reader);
    }

    if ("urn:hpccsystems:ws:wstopology".equals(namespaceURI)
        && "ArrayOfTpEspServer".equals(typeName)) {

      return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpEspServer.Factory.parse(
          reader);
    }

    throw new org.apache.axis2.databinding.ADBException(
        "Unsupported type " + namespaceURI + " " + typeName);
  }
}
