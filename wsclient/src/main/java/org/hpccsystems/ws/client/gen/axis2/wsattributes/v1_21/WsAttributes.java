/**
 * WsAttributes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21;


/*
 *  WsAttributes java interface
 */
public interface WsAttributes {
    /**
     * Auto generated method signature
     *
     * @param createModule
     * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.CreateModuleResponse createModule(
        org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.CreateModule createModule)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param deleteModule
     * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.DeleteModuleResponse deleteModule(
        org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.DeleteModule deleteModule)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param getAttributeLabels
     * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.GetAttributeLabelsResponse getAttributeLabels(
        org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.GetAttributeLabels getAttributeLabels)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param getAttributes
     * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.GetAttributesResponse getAttributes(
        org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.GetAttributes getAttributes)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param createAttribute
     * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.CreateAttributeResponse createAttribute(
        org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.CreateAttribute createAttribute)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param getAttribute
     * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.GetAttributeResponse getAttribute(
        org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.GetAttribute getAttribute)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param importAttributes
     * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.UpdateAttributesResponse importAttributes(
        org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.ImportAttributes importAttributes)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param rollbackAttributes
     * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.UpdateAttributesResponse rollbackAttributes(
        org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.RollbackAttributes rollbackAttributes)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param deleteAttributes
     * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.UpdateAttributesResponse deleteAttributes(
        org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.DeleteAttributes deleteAttributes)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param listAttributeTypes
     * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.ListAttributeTypesResponse listAttributeTypes(
        org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.ListAttributeTypes listAttributeTypes)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param getAttributeHistory
     * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.GetAttributeHistoryResponse getAttributeHistory(
        org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.GetAttributeHistory getAttributeHistory)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param renameModule
     * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.RenameModuleResponse renameModule(
        org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.RenameModule renameModule)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param supportsEarMark
     * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.SupportsEarMarkResponse supportsEarMark(
        org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.SupportsEarMark supportsEarMark)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param getLabels
     * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.GetLabelsResponse getLabels(
        org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.GetLabels getLabels)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param renameAttributes
     * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.UpdateAttributesResponse renameAttributes(
        org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.RenameAttributes renameAttributes)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param updateLabel
     * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.UpdateLabelResponse updateLabel(
        org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.UpdateLabel updateLabel)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param createLabel
     * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.CreateLabelResponse createLabel(
        org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.CreateLabel createLabel)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param checkoutAttributes
     * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.UpdateAttributesResponse checkoutAttributes(
        org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.CheckoutAttributes checkoutAttributes)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param checkinAttributes
     * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.UpdateAttributesResponse checkinAttributes(
        org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.CheckinAttributes checkinAttributes)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param getModules
     * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.GetModulesResponse getModules(
        org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.GetModules getModules)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param deleteLabel
     * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.DeleteLabelResponse deleteLabel(
        org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.DeleteLabel deleteLabel)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param saveAttributes
     * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.UpdateAttributesResponse saveAttributes(
        org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.SaveAttributes saveAttributes)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param findAttributes
     * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.FindAttributesResponse findAttributes(
        org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.FindAttributes findAttributes)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault;

    //
}
