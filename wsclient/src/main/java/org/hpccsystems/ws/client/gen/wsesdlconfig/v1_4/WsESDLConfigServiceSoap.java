/**
 * WsESDLConfigServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4;

public interface WsESDLConfigServiceSoap extends java.rmi.Remote {
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.ConfigureESDLBindingMethodResponse configureESDLBindingMethod(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.ConfigureESDLBindingMethodRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.DeleteESDLRegistryEntryResponse deleteESDLBinding(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.DeleteESDLBindingRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.DeleteESDLRegistryEntryResponse deleteESDLDefinition(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.DeleteESDLDefinitionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.EchoResponse echo(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.EchoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.GetESDLBindingResponse getESDLBinding(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.GetESDLBindingRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.GetESDLDefinitionResponse getESDLDefinition(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.GetESDLDefinitionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.ListDESDLEspBindingsResp listDESDLEspBindings(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.ListDESDLEspBindingsReq parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.ListESDLBindingsResponse listESDLBindings(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.ListESDLBindingsRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.ListESDLDefinitionsResponse listESDLDefinitions(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.ListESDLDefinitionsRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.WsESDLConfigPingResponse ping(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.WsESDLConfigPingRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.PublishESDLBindingResponse publishESDLBinding(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.PublishESDLBindingRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.PublishESDLDefinitionResponse publishESDLDefinition(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.PublishESDLDefinitionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.ArrayOfEspException;
}
