/**
 * WsESDLConfigServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsesdlconfig.v1_2;

public interface WsESDLConfigServiceSoap extends java.rmi.Remote {
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_2.ConfigureESDLBindingMethodResponse configureESDLBindingMethod(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_2.ConfigureESDLBindingMethodRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_2.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_2.DeleteESDLRegistryEntryResponse deleteESDLBinding(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_2.DeleteESDLBindingRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_2.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_2.DeleteESDLRegistryEntryResponse deleteESDLDefinition(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_2.DeleteESDLDefinitionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_2.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_2.EchoResponse echo(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_2.EchoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_2.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_2.GetESDLBindingResponse getESDLBinding(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_2.GetESDLBindingRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_2.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_2.GetESDLDefinitionResponse getESDLDefinition(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_2.GetESDLDefinitionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_2.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_2.ListDESDLEspBindingsResp listDESDLEspBindings(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_2.ListDESDLEspBindingsReq parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_2.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_2.ListESDLBindingsResponse listESDLBindings(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_2.ListESDLBindingsRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_2.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_2.ListESDLDefinitionsResponse listESDLDefinitions(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_2.ListESDLDefinitionsRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_2.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_2.PublishESDLBindingResponse publishESDLBinding(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_2.PublishESDLBindingRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_2.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_2.PublishESDLDefinitionResponse publishESDLDefinition(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_2.PublishESDLDefinitionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_2.ArrayOfEspException;
}
