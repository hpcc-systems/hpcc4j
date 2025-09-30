/**
 * WsAttributes.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 1.7.9 Built on : Nov 16,
 * 2018 (12:05:37 GMT)
 */
package org.hpccsystems.ws.client.gen.axis2.wsattributes.latest;

/*
 *  WsAttributes java interface
 */
public interface WsAttributes {
  /**
   * Auto generated method signature
   *
   * @param createModule
   * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateModuleResponse createModule(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateModule createModule)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param deleteModule
   * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.DeleteModuleResponse deleteModule(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.DeleteModule deleteModule)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param getAttributeLabels
   * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeLabelsResponse
      getAttributeLabels(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeLabels
              getAttributeLabels)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param getAttributes
   * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributesResponse
      getAttributes(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributes getAttributes)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param createAttribute
   * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateAttributeResponse
      createAttribute(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateAttribute createAttribute)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param getAttribute
   * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeResponse getAttribute(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttribute getAttribute)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param importAttributes
   * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateAttributesResponse
      importAttributes(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ImportAttributes importAttributes)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param rollbackAttributes
   * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateAttributesResponse
      rollbackAttributes(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RollbackAttributes
              rollbackAttributes)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param deleteAttributes
   * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateAttributesResponse
      deleteAttributes(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.DeleteAttributes deleteAttributes)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param listAttributeTypes
   * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ListAttributeTypesResponse
      listAttributeTypes(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ListAttributeTypes
              listAttributeTypes)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param getAttributeHistory
   * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeHistoryResponse
      getAttributeHistory(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeHistory
              getAttributeHistory)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param renameModule
   * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RenameModuleResponse renameModule(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RenameModule renameModule)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param supportsEarMark
   * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.SupportsEarMarkResponse
      supportsEarMark(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.SupportsEarMark supportsEarMark)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param getLabels
   * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetLabelsResponse getLabels(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetLabels getLabels)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param renameAttributes
   * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateAttributesResponse
      renameAttributes(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RenameAttributes renameAttributes)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param updateLabel
   * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateLabelResponse updateLabel(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateLabel updateLabel)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param createLabel
   * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateLabelResponse createLabel(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateLabel createLabel)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param checkoutAttributes
   * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateAttributesResponse
      checkoutAttributes(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CheckoutAttributes
              checkoutAttributes)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param checkinAttributes
   * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateAttributesResponse
      checkinAttributes(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CheckinAttributes
              checkinAttributes)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param getModules
   * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetModulesResponse getModules(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetModules getModules)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param deleteLabel
   * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.DeleteLabelResponse deleteLabel(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.DeleteLabel deleteLabel)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param saveAttributes
   * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateAttributesResponse
      saveAttributes(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.SaveAttributes saveAttributes)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param findAttributes
   * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.FindAttributesResponse
      findAttributes(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.FindAttributes findAttributes)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault;

  //
}
