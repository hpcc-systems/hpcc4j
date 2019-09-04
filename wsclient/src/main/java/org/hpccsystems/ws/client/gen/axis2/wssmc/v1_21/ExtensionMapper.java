/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */
package org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21;


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
        if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI) &&
                "Endpoints_type0".equals(typeName)) {
            return org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.Endpoints_type0.Factory.parse(reader);
        }

        if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI) &&
                "DFUJob".equals(typeName)) {
            return org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.DFUJob.Factory.parse(reader);
        }

        if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI) &&
                "RoxieControlEndpointInfo".equals(typeName)) {
            return org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.RoxieControlEndpointInfo.Factory.parse(reader);
        }

        if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI) &&
                "ArrayOfTargetCluster".equals(typeName)) {
            return org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.ArrayOfTargetCluster.Factory.parse(reader);
        }

        if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI) &&
                "LockModes".equals(typeName)) {
            return org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.LockModes.Factory.parse(reader);
        }

        if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI) &&
                "TargetCluster".equals(typeName)) {
            return org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.TargetCluster.Factory.parse(reader);
        }

        if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI) &&
                "ArrayOfServerJobQueue".equals(typeName)) {
            return org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.ArrayOfServerJobQueue.Factory.parse(reader);
        }

        if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI) &&
                "SMCJob".equals(typeName)) {
            return org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.SMCJob.Factory.parse(reader);
        }

        if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI) &&
                "Lock".equals(typeName)) {
            return org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.Lock.Factory.parse(reader);
        }

        if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI) &&
                "ArrayOfActiveWorkunit".equals(typeName)) {
            return org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.ArrayOfActiveWorkunit.Factory.parse(reader);
        }

        if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI) &&
                "ServerJobQueue".equals(typeName)) {
            return org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.ServerJobQueue.Factory.parse(reader);
        }

        if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI) &&
                "ArrayOfDFUJob".equals(typeName)) {
            return org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.ArrayOfDFUJob.Factory.parse(reader);
        }

        if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI) &&
                "ArrayOfEspException".equals(typeName)) {
            return org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.ArrayOfEspException.Factory.parse(reader);
        }

        if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI) &&
                "HPCCResource".equals(typeName)) {
            return org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.HPCCResource.Factory.parse(reader);
        }

        if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI) &&
                "HPCCResourceRepository".equals(typeName)) {
            return org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.HPCCResourceRepository.Factory.parse(reader);
        }

        if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI) &&
                "StatusServerInfo".equals(typeName)) {
            return org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.StatusServerInfo.Factory.parse(reader);
        }

        if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI) &&
                "ThorCluster".equals(typeName)) {
            return org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.ThorCluster.Factory.parse(reader);
        }

        if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI) &&
                "ActiveWorkunit".equals(typeName)) {
            return org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.ActiveWorkunit.Factory.parse(reader);
        }

        if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI) &&
                "ArrayOfThorCluster".equals(typeName)) {
            return org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.ArrayOfThorCluster.Factory.parse(reader);
        }

        if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI) &&
                "ArrayOfLock".equals(typeName)) {
            return org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.ArrayOfLock.Factory.parse(reader);
        }

        if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI) &&
                "EspException".equals(typeName)) {
            return org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.EspException.Factory.parse(reader);
        }

        if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI) &&
                "ArrayOfHPCCResourceRepository".equals(typeName)) {
            return org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.ArrayOfHPCCResourceRepository.Factory.parse(reader);
        }

        if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI) &&
                "ArrayOfHPCCResource".equals(typeName)) {
            return org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.ArrayOfHPCCResource.Factory.parse(reader);
        }

        if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI) &&
                "EspStringArray".equals(typeName)) {
            return org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.EspStringArray.Factory.parse(reader);
        }

        if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI) &&
                "RoxieControlCmdType".equals(typeName)) {
            return org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.RoxieControlCmdType.Factory.parse(reader);
        }

        if ("urn:hpccsystems:ws:wssmc".equals(namespaceURI) &&
                "ArrayOfSMCJob".equals(typeName)) {
            return org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.ArrayOfSMCJob.Factory.parse(reader);
        }

        throw new org.apache.axis2.databinding.ADBException("Unsupported type " +
            namespaceURI + " " + typeName);
    }
}
