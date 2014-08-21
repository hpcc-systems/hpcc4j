/**
 * WsAttributesServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.legacy.soap;

public interface WsAttributesServiceSoap extends java.rmi.Remote {
    public org.hpccsystems.ws.client.legacy.soap.UpdateAttributesResponse checkinAttributes(org.hpccsystems.ws.client.legacy.soap.CheckinAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException;
    public org.hpccsystems.ws.client.legacy.soap.UpdateAttributesResponse checkoutAttributes(org.hpccsystems.ws.client.legacy.soap.CheckoutAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException;
    public org.hpccsystems.ws.client.legacy.soap.CreateAttributeResponse createAttribute(org.hpccsystems.ws.client.legacy.soap.CreateAttribute parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException;
    public org.hpccsystems.ws.client.legacy.soap.CreateLabelResponse createLabel(org.hpccsystems.ws.client.legacy.soap.CreateLabel parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException;
    public org.hpccsystems.ws.client.legacy.soap.CreateModuleResponse createModule(org.hpccsystems.ws.client.legacy.soap.CreateModule parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException;
    public org.hpccsystems.ws.client.legacy.soap.UpdateAttributesResponse deleteAttributes(org.hpccsystems.ws.client.legacy.soap.DeleteAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException;
    public org.hpccsystems.ws.client.legacy.soap.DeleteLabelResponse deleteLabel(org.hpccsystems.ws.client.legacy.soap.DeleteLabel parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException;
    public org.hpccsystems.ws.client.legacy.soap.DeleteModuleResponse deleteModule(org.hpccsystems.ws.client.legacy.soap.DeleteModule parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException;
    public org.hpccsystems.ws.client.legacy.soap.FindAttributesResponse findAttributes(org.hpccsystems.ws.client.legacy.soap.FindAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException;
    public org.hpccsystems.ws.client.legacy.soap.GetAttributeResponse getAttribute(org.hpccsystems.ws.client.legacy.soap.GetAttribute parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException;
    public org.hpccsystems.ws.client.legacy.soap.GetAttributeHistoryResponse getAttributeHistory(org.hpccsystems.ws.client.legacy.soap.GetAttributeHistory parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException;
    public org.hpccsystems.ws.client.legacy.soap.GetAttributeLabelsResponse getAttributeLabels(org.hpccsystems.ws.client.legacy.soap.GetAttributeLabels parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException;
    public org.hpccsystems.ws.client.legacy.soap.GetAttributesResponse getAttributes(org.hpccsystems.ws.client.legacy.soap.GetAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException;
    public org.hpccsystems.ws.client.legacy.soap.GetLabelsResponse getLabels(org.hpccsystems.ws.client.legacy.soap.GetLabels parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException;
    public org.hpccsystems.ws.client.legacy.soap.GetModulesResponse getModules(org.hpccsystems.ws.client.legacy.soap.GetModules parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException;
    public org.hpccsystems.ws.client.legacy.soap.UpdateAttributesResponse importAttributes(org.hpccsystems.ws.client.legacy.soap.ImportAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException;
    public org.hpccsystems.ws.client.legacy.soap.ListAttributeTypesResponse listAttributeTypes() throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException;
    public org.hpccsystems.ws.client.legacy.soap.UpdateAttributesResponse renameAttributes(org.hpccsystems.ws.client.legacy.soap.RenameAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException;
    public org.hpccsystems.ws.client.legacy.soap.RenameModuleResponse renameModule(org.hpccsystems.ws.client.legacy.soap.RenameModule parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException;
    public org.hpccsystems.ws.client.legacy.soap.UpdateAttributesResponse rollbackAttributes(org.hpccsystems.ws.client.legacy.soap.RollbackAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException;
    public org.hpccsystems.ws.client.legacy.soap.UpdateAttributesResponse saveAttributes(org.hpccsystems.ws.client.legacy.soap.SaveAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException;
    public org.hpccsystems.ws.client.legacy.soap.SupportsEarMarkResponse supportsEarMark() throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException;
    public org.hpccsystems.ws.client.legacy.soap.UpdateLabelResponse updateLabel(org.hpccsystems.ws.client.legacy.soap.UpdateLabel parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException;
}
