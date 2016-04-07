/**
 * WsESDLConfigServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0;

public interface WsESDLConfigServiceSoap extends java.rmi.Remote {
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.ConfigureESDLBindingMethodResponse configureESDLBindingMethod(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.ConfigureESDLBindingMethodRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.DeleteESDLRegistryEntryResponse deleteESDLBinding(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.DeleteESDLBindingRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.DeleteESDLRegistryEntryResponse deleteESDLDefinition(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.DeleteESDLDefinitionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.EchoResponse echo(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.EchoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.GetESDLBindingResponse getESDLBinding(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.GetESDLBindingRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.GetESDLDefinitionResponse getESDLDefinition(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.GetESDLDefinitionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.ListESDLBindingsResponse listESDLBindings(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.ListESDLBindingsRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.ListESDLDefinitionsResponse listESDLDefinitions(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.ListESDLDefinitionsRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.PublishESDLBindingResponse publishESDLBinding(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.PublishESDLBindingRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.PublishESDLDefinitionResponse publishESDLDefinition(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.PublishESDLDefinitionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.ArrayOfEspException;
}
