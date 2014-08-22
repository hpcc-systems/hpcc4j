package org.hpccsystems.ws.client.legacy;

import java.io.FileNotFoundException;

import org.apache.axis.client.Stub;
import org.apache.axis.utils.StringUtils;
import org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException;
import org.hpccsystems.ws.client.legacy.soap.CheckinAttributeRequest;
import org.hpccsystems.ws.client.legacy.soap.CheckinAttributes;
import org.hpccsystems.ws.client.legacy.soap.CheckoutAttributeRequest;
import org.hpccsystems.ws.client.legacy.soap.CheckoutAttributes;
import org.hpccsystems.ws.client.legacy.soap.CreateAttribute;
import org.hpccsystems.ws.client.legacy.soap.CreateAttributeResponse;
import org.hpccsystems.ws.client.legacy.soap.ECLAttribute;
import org.hpccsystems.ws.client.legacy.soap.FindAttributes;
import org.hpccsystems.ws.client.legacy.soap.FindAttributesResponse;
import org.hpccsystems.ws.client.legacy.soap.GetAttribute;
import org.hpccsystems.ws.client.legacy.soap.GetAttributeResponse;
import org.hpccsystems.ws.client.legacy.soap.RenameAttributeRequest;
import org.hpccsystems.ws.client.legacy.soap.RenameAttributes;
import org.hpccsystems.ws.client.legacy.soap.SaveAttributeRequest;
import org.hpccsystems.ws.client.legacy.soap.SaveAttributes;
import org.hpccsystems.ws.client.legacy.soap.UpdateAttributesResponse;
import org.hpccsystems.ws.client.legacy.soap.WsAttributesServiceSoap;
import org.hpccsystems.ws.client.legacy.soap.WsAttributesServiceSoapProxy;
import org.hpccsystems.ws.client.legacy.soap.EspException;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.utils.Utils;

public class HPCCWsAttributesClient
{
    public static final String           WSATTRIBUTESWSDLURI          = "/WsAttributes";

    private WsAttributesServiceSoapProxy wsAttributesServiceSoapProxy = null;
    private boolean                      verbose                      = false;

    /**
     * @param verbose
     *            - sets verbose mode
     */
    public void setVerbose(boolean verbose)
    {
        this.verbose = verbose;
    }

    /**
     * Check whether an attribute exists
     * 
     * @param modulename
     *            - ECL Module name containing the attribute to check
     * @param attributename
     *            - Attribute to check
     * @return true if the attribute exists, false if it does not
     * @throws Exception
     */
    public boolean attributeExists(String modulename, String attributename, String type) throws Exception
    {
        ECLAttribute[] items = findItems(modulename, attributename, type, null, null, null);
        if (items != null && items.length > 0)
        {
            return true;
        }
        return false;
    }

    /**
     * Search for and retrieve the attribute metadata for attributes from a repository
     * 
     * @param modulename
     *            - modulename of attributes to find. Entire name will be matched.
     * @param attributename
     *            - attributename of attributes to find. Entire name will be matched.
     * @param username
     *            - owner of attributes to find. Entire name will be matched
     * @param anytext
     *            - text string to find. It is implicitly surrounded by wildcards. will match any module name containing
     *            the pattern, attribute name containing the pattern, or attribute containing ecl that contains the
     *            pattern
     * @param changedSince
     *            - only return attributes changes since this time
     * @return an array of ECLAttribute
     * @throws Exception
     */
    public ECLAttribute[] findItems(String modulename, String attributename, String type, String username, String anytext,
            String changedSince) throws Exception
    {
        WsAttributesServiceSoapProxy proxy = this.getSoapProxy();
        if (modulename == null && attributename == null && username == null && 
                type==null && anytext == null && changedSince == null)
        {
            throw new Exception("At least one find criteria is required.");
        }
        FindAttributes params = new FindAttributes();
        if (modulename != null)
        {
            params.setModuleName(modulename);
        }
        if (attributename != null)
        {
            params.setAttributeName(attributename);
        }
        if (username != null)
        {
            params.setUserName(username);
        }
        if (type != null)
        {
            String[] types=StringUtils.split(type, ',');
            params.setTypeList(types);
        }
        if (anytext != null)
        {
            params.setPattern(anytext);
        }

        FindAttributesResponse resp = proxy.findAttributes(params);

        if (resp != null)
        {
            handleException(resp.getExceptions());
            return resp.getOutAttributes();
        }
        return null;
    }

    /**
     * Get the text of an attribute from a repo
     * 
     * @param modulename
     *            - module name of the attribute
     * @param attributename
     *            - attribute name of the attribute
     * @return text contained by the attribute
     * @throws Exception
     */
    public String getAttributeText(String modulename, String attributename,String type) throws Exception
    {
        WsAttributesServiceSoapProxy proxy = this.getSoapProxy();
        GetAttribute params = new GetAttribute();
        params.setAttributeName(attributename);
        params.setModuleName(modulename);
        params.setType(type);
        params.setGetText(true);
        GetAttributeResponse resp = proxy.getAttribute(params);
        if (resp != null)
        {
            handleException(resp.getExceptions());
            if (resp.getOutAttribute() != null)
            {
                return resp.getOutAttribute().getText();
            }
        }
        return null;
    }

    /**
     * Rename an attribute in a legacy repo
     * 
     * @param modulename
     *            -existing module name that will be renamed
     * @param attributename
     *            - existing attributename that will be renamed
     * @param newmodulename
     *            - new module name to rename module to
     * @param newattributename
     *            - new attribute name to rename attribute to
     * @return ECL attribute of the renamed attribute
     * @throws Exception
     */
    public ECLAttribute renameAttribute(String modulename, String attributename, String newmodulename,
            String newattributename) throws Exception
    {
        WsAttributesServiceSoapProxy proxy = this.getSoapProxy();

        if ((modulename == null && newmodulename != null) || (newmodulename == null && modulename != null))
        {
            throw new Exception("If modulename or newmodulename is specified, both must be specified");
        }

        if ((attributename == null && newattributename != null) || (newattributename == null && attributename != null))
        {
            throw new Exception("If attributename or newattributename is specified, both must be specified");
        }

        RenameAttributeRequest req = new RenameAttributeRequest();
        req.setAttributeName(attributename);
        req.setModuleName(modulename);
        req.setNewAttributeName(newattributename);
        req.setNewModuleName(newmodulename);

        RenameAttributeRequest[] arr = { req };

        RenameAttributes params = new RenameAttributes();
        params.setAttributes(arr);
        UpdateAttributesResponse resp = proxy.renameAttributes(params);
        if (resp != null)
        {
            handleException(resp.getExceptions());
            if (resp.getOutAttributes() != null && resp.getOutAttributes().length > 0)
            {
                return resp.getOutAttributes()[0];
            }
        }
        return null;
    }

    /**
     * Update an attribute in a legacy repository
     * 
     * @param modulename
     *            - module name to update
     * @param attributename
     *            - attribute name to update
     * @param text
     *            - text to update the attribute to
     * @param checkoutin
     *            - whether to check the attribute out/in before doing this
     * @param checkindesc
     *            - if checkoutin=true, the description to append to the checkin
     * @return
     * @throws Exception
     */
    public ECLAttribute updateAttribute(String modulename, String attributename, String type, String text, Boolean checkoutin,
            String checkindesc) throws Exception
    {
        if (checkoutin == null)
        {
            checkoutin = false;
        }

        if (modulename == null || attributename == null || text == null)
        {
            throw new Exception("Module name, attribute name and text are required");
        }
        if (checkoutin == true && (checkindesc == null || checkindesc.trim().length() == 0))
        {
            throw new Exception("Checkin comment is required if checking attribute out / in");
        }
        if (!this.attributeExists(modulename, attributename,type))
        {
            throw new FileNotFoundException("Cannot update " + modulename + "." + attributename
                    + ", attribute does not exist");
        }
        WsAttributesServiceSoapProxy proxy = this.getSoapProxy();

        if (checkoutin)
        {
            this.checkoutAttribute(modulename, attributename);
        }
        SaveAttributeRequest req = new SaveAttributeRequest();
        req.setModuleName(modulename);
        req.setAttributeName(attributename);
        req.setText(text);
        SaveAttributeRequest[] arr = { req };
        SaveAttributes params = new SaveAttributes();
        params.setAttributes(arr);
        UpdateAttributesResponse resp = proxy.saveAttributes(params);
        if (resp != null)
        {
            handleException(resp.getExceptions());
            if (checkoutin)
            {
                this.checkinAttribute(modulename, attributename, checkindesc);
            }
            if (resp.getOutAttributes() != null && resp.getOutAttributes().length > 0)
            {
                return resp.getOutAttributes()[0];
            }
        }

        return null;
    }

    /**
     * Check in an attribute in an HPCC Repository
     * 
     * @param modulename
     *            - module name to check in
     * @param attributename
     *            - attribute name to check in
     * @param checkindesc
     *            - check in comment
     * @return ECLAttribute of checked in attribute
     * @throws Exception
     */
    public ECLAttribute checkinAttribute(String modulename, String attributename, String checkindesc) throws Exception
    {
        if (modulename == null || attributename == null)
        {
            throw new Exception("Module name and attribute name are required");
        }
        if (checkindesc == null || checkindesc.trim().length() == 0)
        {
            throw new Exception("Checkin comment is required if checking attribute out / in");
        }
        WsAttributesServiceSoapProxy proxy = this.getSoapProxy();
        CheckinAttributeRequest req = new CheckinAttributeRequest();
        req.setAttributeName(attributename);
        req.setModuleName(modulename);
        req.setDescription(checkindesc);
        CheckinAttributeRequest[] arr = { req };
        CheckinAttributes params = new CheckinAttributes();
        params.setAttributes(arr);
        UpdateAttributesResponse resp = proxy.checkinAttributes(params);
        if (resp == null)
        {
            return null;
        }
        handleException(resp.getExceptions());
        if (resp.getOutAttributes() != null && resp.getOutAttributes().length > 0)
        {
            return resp.getOutAttributes()[0];
        }
        return null;
    }

    /**
     * Check out an attribute in a legacy repository
     * 
     * @param modulename
     *            - module to check out
     * @param attributename
     *            - attribute to check out
     * @return ECLAttribute of checked out attribute
     * @throws Exception
     */
    public ECLAttribute checkoutAttribute(String modulename, String attributename) throws Exception
    {
        if (modulename == null || attributename == null)
        {
            throw new Exception("Module name and attribute name are required");
        }
        WsAttributesServiceSoapProxy proxy = this.getSoapProxy();
        CheckoutAttributeRequest req = new CheckoutAttributeRequest();
        req.setAttributeName(attributename);
        req.setModuleName(modulename);
        CheckoutAttributeRequest[] arr = { req };
        CheckoutAttributes params = new CheckoutAttributes();
        params.setAttributes(arr);
        UpdateAttributesResponse resp = proxy.checkoutAttributes(params);
        if (resp == null)
        {
            return null;
        }
        handleException(resp.getExceptions());
        if (resp.getOutAttributes() != null && resp.getOutAttributes().length > 0)
        {
            return resp.getOutAttributes()[0];
        }
        return null;
    }

    /**
     * Create an attribute in an HPCC Legacy Repository
     * 
     * @param modulename
     *            - module name to create
     * @param attributename
     *            - attribute name to create
     * @param ecltext
     *            - ecl text to create in attribute
     * @param checkin
     *            - if true, check this attribute in after creating it
     * @param checkindesc
     *            - checkin comment. Required if checkin=true
     * @return the ECL Attribute of the created object
     * @throws Exception
     */
    public ECLAttribute createAttribute(String modulename, String attributename, String type,String text, Boolean checkin,
            String checkindesc) throws Exception
    {
        if (checkin == null)
        {
            checkin = false;
        }
        if (modulename == null || attributename == null || text == null)
        {
            throw new Exception("Module name, attribute name and text are required");
        }
        if (checkin == true && (checkindesc == null || checkindesc.trim().length() == 0))
        {
            throw new Exception("Checkin comment is required if checking attribute in");
        }
        if (this.attributeExists(modulename, attributename,type))
        {
            throw new Exception(modulename + "." + attributename + " already exists");
        }
        WsAttributesServiceSoapProxy proxy = this.getSoapProxy();
        CreateAttribute req = new CreateAttribute();
        req.setModuleName(modulename);
        req.setAttributeName(attributename);
        req.setType(type);
        CreateAttributeResponse resp = proxy.createAttribute(req);
        if (resp == null)
        {
            return null;
        }
        handleException(resp.getExceptions());
        ECLAttribute attr = updateAttribute(modulename, attributename, type, text, checkin, checkindesc);
        return attr;
    }

    /**
     * Provides soapproxy object for HPCCWsAttributesClient which can be used to access the web service methods directly
     * 
     * @return soapproxy for HPCCWsAttributesClient
     * @throws Exception
     *             if soapproxy not available.
     */
    /**
     * @return
     * @throws Exception
     */
    public WsAttributesServiceSoapProxy getSoapProxy() throws Exception
    {
        if (wsAttributesServiceSoapProxy != null)
            return wsAttributesServiceSoapProxy;
        else
            throw new Exception("wsAttributesServiceSoapProxy not available.");
    }

    /**
     * Provides the WSDL URL originally used to create the underlying stub code
     *
     * @return original WSLD URL
     */
    public static String getOriginalWSDLURL()
    {
        return (new org.hpccsystems.ws.client.legacy.soap.WsAttributesLocator().getWsAttributesServiceSoapAddress());
    }

    /**
     * @param wsAttributesServiceSoapProxy
     */
    public HPCCWsAttributesClient(WsAttributesServiceSoapProxy wsAttributesServiceSoapProxy)
    {
        this.wsAttributesServiceSoapProxy = wsAttributesServiceSoapProxy;
    }

    /**
     * @param baseConnection
     */
    public HPCCWsAttributesClient(Connection baseConnection)
    {
        this(baseConnection.getProtocol(), baseConnection.getHost(), baseConnection.getPort(), baseConnection
                .getUserName(), baseConnection.getPassword());
    }

    /**
     * Create an HPCCWsAttributesClient object
     * 
     * @param protocol
     *            - http or https
     * @param targetHost
     *            - server ip or domain name
     * @param targetPort
     *            - wsAttributes port (8145, usually)
     * @param user
     *            username of connecting user
     * @param pass
     *            password of connecting user
     */
    public HPCCWsAttributesClient(String protocol, String targetHost, String targetPort, String user, String pass)
    {
        String address = Connection.buildUrl(protocol, targetHost, targetPort, WSATTRIBUTESWSDLURI);

        initWsAttributesSoapProxy(address, user, pass);
    }

    /**
     * Initializes the service's underlying soap proxy. Should only be used by constructors
     *
     * @param baseURL
     *            Target service base URL
     * @param user
     *            User credentials
     * @param pass
     *            User credentials
     */
    private void initWsAttributesSoapProxy(String baseURL, String user, String pass)
    {
        wsAttributesServiceSoapProxy = new WsAttributesServiceSoapProxy(baseURL);
        if (wsAttributesServiceSoapProxy != null)
        {
            WsAttributesServiceSoap wsAttributesServiceSoap = wsAttributesServiceSoapProxy.getWsAttributesServiceSoap();
            if (wsAttributesServiceSoap != null)
            {
                if (user != null && pass != null) Connection.initStub((Stub) wsAttributesServiceSoap, user, pass);
            }
        }
    }

    private void handleException(ArrayOfEspException exp) throws Exception
    {
        if (exp != null && exp.getException() != null && exp.getException().length > 0)
        {
            for (int i = 0; i < exp.getException().length; i++)
            {
                EspException ex = exp.getException()[i];
                Utils.println(System.out, ex.getMessage(), true, verbose);
            }
            throw new Exception(exp);
        }
    }
}
