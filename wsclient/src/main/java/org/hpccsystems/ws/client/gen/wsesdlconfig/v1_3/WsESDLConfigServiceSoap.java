/**
 * WsESDLConfigServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3;

public interface WsESDLConfigServiceSoap extends java.rmi.Remote {
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.ConfigureESDLBindingMethodResponse configureESDLBindingMethod(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.ConfigureESDLBindingMethodRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.DeleteESDLRegistryEntryResponse deleteESDLBinding(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.DeleteESDLBindingRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.DeleteESDLRegistryEntryResponse deleteESDLDefinition(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.DeleteESDLDefinitionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.EchoResponse echo(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.EchoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.GetESDLBindingResponse getESDLBinding(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.GetESDLBindingRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.GetESDLDefinitionResponse getESDLDefinition(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.GetESDLDefinitionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.ListDESDLEspBindingsResp listDESDLEspBindings(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.ListDESDLEspBindingsReq parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.ListESDLBindingsResponse listESDLBindings(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.ListESDLBindingsRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.ListESDLDefinitionsResponse listESDLDefinitions(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.ListESDLDefinitionsRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.WsESDLConfigPingResponse ping(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.WsESDLConfigPingRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.PublishESDLBindingResponse publishESDLBinding(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.PublishESDLBindingRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.PublishESDLDefinitionResponse publishESDLDefinition(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.PublishESDLDefinitionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.ArrayOfEspException;
}
