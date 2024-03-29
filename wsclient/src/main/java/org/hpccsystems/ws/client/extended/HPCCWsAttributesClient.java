package org.hpccsystems.ws.client.extended;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Stub;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.hpccsystems.ws.client.BaseHPCCWsClient;
import org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfCheckinAttributeRequest;
import org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfCheckoutAttributeRequest;
import org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfDeleteAttributeRequest;
import org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfECLAttribute;
import org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfRenameAttributeRequest;
import org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfSaveAttributeRequest;
import org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CheckinAttributeRequest;
import org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CheckinAttributes;
import org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CheckoutAttributeRequest;
import org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CheckoutAttributes;
import org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateAttribute;
import org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateAttributeResponse;
import org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.DeleteAttributeRequest;
import org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.DeleteAttributes;
import org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.DeleteModule;
import org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.DeleteModuleResponse;
import org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ECLAttribute;
import org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault;
import org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspStringArray;
import org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.FindAttributes;
import org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.FindAttributesResponse;
import org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttribute;
import org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeResponse;
import org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributes;
import org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributesResponse;
import org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RenameAttributeRequest;
import org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RenameAttributes;
import org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.SaveAttributeRequest;
import org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.SaveAttributes;
import org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateAttributesResponse;
import org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.WsAttributesStub;
import org.hpccsystems.ws.client.gen.axis2.wstopology.latest.WsTopologyStub;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.ECLAttributeWrapper;
import org.hpccsystems.ws.client.wrappers.EspSoapFaultWrapper;
import org.hpccsystems.ws.client.wrappers.GetAttributesResponseWrapper;
import org.hpccsystems.ws.client.wrappers.GetAttributesWrapper;

/**
 * <p>HPCCWsAttributesClient class.</p>
 *
 */
public class HPCCWsAttributesClient extends BaseHPCCWsClient
{
    private static final Logger                  log    = LogManager.getLogger(HPCCWsAttributesClient.class);
    /** Constant <code>WSATTRIBUTESWSDLURI="/WsAttributes"</code> */
    public static final String   WSATTRIBUTESWSDLURI    = "/WsAttributes";
    private static int            DEFAULTSERVICEPORT    = -1;
    private static String                    WSDLURL    = null;

    /**
     * Load WSDLURL.
     */
    private static void loadWSDLURL()
    {
        try
        {
            WSDLURL = getServiceWSDLURL(new WsAttributesStub());
            DEFAULTSERVICEPORT = (new URL(WSDLURL)).getPort();
        }
        catch (AxisFault | MalformedURLException e)
        {
            log.error("Unable to establish original WSDL URL");
            log.error(e.getLocalizedMessage());
        }
    }

    /**
     * Gets the service URI.
     *
     * @return the service URI
     */
    public String getServiceURI()
    {
        return WSATTRIBUTESWSDLURI;
    }

    /**
     * Gets the service WSDLURL.
     *
     * @return the service WSDLURL
     */
    public static String getServiceWSDLURL()
    {
        if (WSDLURL == null)
        {
            loadWSDLURL();
        }

        return WSDLURL;
    }

    /**
     * Gets the service WSDL port.
     *
     * @return the service WSDL port
     */
    public static int getServiceWSDLPort()
    {
        if (WSDLURL == null)
        {
            loadWSDLURL();
        }

        return DEFAULTSERVICEPORT;
    }

    /**
     * Gets the.
     *
     * @param connection
     *            the connection
     * @return the HPCC ws attributes client
     */
    public static HPCCWsAttributesClient get(Connection connection)
    {
        return new HPCCWsAttributesClient(connection);
    }

    /**
     * Gets the.
     *
     * @param protocol
     *            the protocol
     * @param targetHost
     *            the target host
     * @param targetPort
     *            the target port
     * @param user
     *            the user
     * @param pass
     *            the pass
     * @return the HPCC ws attributes client
     */
    public static HPCCWsAttributesClient get(String protocol, String targetHost, String targetPort, String user, String pass)
    {
        Connection conn = new Connection(protocol,targetHost,targetPort);
        conn.setCredentials(user, pass);
        return new HPCCWsAttributesClient(conn);
    }

    /**
     * Gets the.
     *
     * @param protocol
     *            the protocol
     * @param targetHost
     *            the target host
     * @param targetPort
     *            the target port
     * @param user
     *            the user
     * @param pass
     *            the pass
     * @param timeout
     *            the timeout
     * @return the HPCC ws attributes client
     */
    public static HPCCWsAttributesClient get(String protocol, String targetHost, String targetPort, String user, String pass, int timeout)
    {
        Connection conn = new Connection(protocol,targetHost,targetPort);
        conn.setCredentials(user, pass);
        conn.setConnectTimeoutMilli(timeout);
        conn.setSocketTimeoutMilli(timeout);

        return new HPCCWsAttributesClient(conn);
    }

    /**
     * Instantiates a new HPCC ws attributes client.
     *
     * @param baseConnection
     *            the base connection
     */
    protected HPCCWsAttributesClient(Connection baseConnection)
    {
        initWsAttributesClientStub(baseConnection);
    }

    /**
     * Initializes the service's underlying soap proxy. Should only be used by constructors
     *
     * @param connection
     *            the connection
     */
    private void initWsAttributesClientStub(Connection connection)
    {
        initBaseWsClient(connection, false); //No need to preemptively fetch HPCC build version, Containerized mode
        try
        {
            stub = setStubOptions(new WsAttributesStub(connection.getBaseUrl()+WSATTRIBUTESWSDLURI), connection);
        }
        catch (AxisFault e)
        {
            initErrMessage = "Could not initialize WsAttributesStub - Review all HPCC connection values";
            if (!e.getLocalizedMessage().isEmpty())
            {
                initErrMessage += "\n" + e.getLocalizedMessage();
            }
        }

        if (!initErrMessage.isEmpty())
            log.error(initErrMessage);
    }

    /**
     * Check whether an attribute exists.
     *
     * @param modulename
     *            - ECL Module name containing the attribute to check
     * @param attributename
     *            - Attribute to check
     * @param type
     *            the type
     * @return true if the attribute exists, false if it does not
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public boolean attributeExists(String modulename, String attributename, String type) throws Exception, ArrayOfEspExceptionWrapper
    {
        List<ECLAttributeWrapper>items = findItems(modulename, attributename, type, null, null, null);
        if (items.size()>0)
        {
            return true;
        }
        return false;
    }

    /**
     * Search for and retrieve the attribute metadata for attributes from a repository.
     *
     * @param modulename
     *            - modulename of attributes to find. Entire name will be matched.
     * @param attributename
     *            - attributename of attributes to find. Entire name will be matched.
     * @param type
     *            the type
     * @param username
     *            - owner of attributes to find. Entire name will be matched
     * @param anytext
     *            - text string to find. It is implicitly surrounded by wildcards. will match any module name containing
     *            the pattern, attribute name containing the pattern, or attribute containing ecl that contains the
     *            pattern
     * @param changedSince
     *            - only return attributes changes since this time
     * @return a list of ECLAttributeInfo
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public List<ECLAttributeWrapper> findItems(String modulename, String attributename, String type, String username, String anytext, String changedSince) throws Exception, ArrayOfEspExceptionWrapper
    {
        verifyStub(); //Throws if stub not available

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
            String[] types=type.split(",");
            EspStringArray typelist = new EspStringArray();
            typelist.setItem(types);
            params.setTypeList(typelist);
        }
        if (anytext != null)
        {
            params.setPattern(anytext);
        }

        FindAttributesResponse resp = null;

        try
        {
            resp = ((WsAttributesStub)stub).findAttributes(params);
        }
        catch (RemoteException e)
        {
            throw new Exception ("HPCCWsAttributesClient findItems encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Could Not perform findItems");
        }

        List<ECLAttributeWrapper> results = new ArrayList<ECLAttributeWrapper>();
        if (resp != null)
        {
            if (resp.getExceptions() != null)
                handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could Not perform findItems");

            if (resp.getOutAttributes() != null)
            {
                ECLAttribute[] eclAttribute = resp.getOutAttributes().getECLAttribute();
                for (int i=0; i < eclAttribute.length;i++)
                {
                    results.add(new ECLAttributeWrapper(eclAttribute[i]));
                }
            }
        }
        return results;
    }

    /**
     * Get the text of an attribute from a repo.
     *
     * @param modulename
     *            - module name of the attribute
     * @param attributename
     *            - attribute name of the attribute
     * @param type
     *            the type
     * @return text contained by the attribute
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public String getAttributeText(String modulename, String attributename,String type) throws Exception, ArrayOfEspExceptionWrapper
    {
        verifyStub(); //Throws if stub not available

        GetAttribute params = new GetAttribute();

        params.setAttributeName(attributename);
        params.setModuleName(modulename);
        params.setType(type);
        params.setGetText(true);

        GetAttributeResponse response = null;

        try
        {
            response = ((WsAttributesStub)stub).getAttribute(params);
        }
        catch (RemoteException e)
        {
            throw new Exception ("HPCCWsAttributesClient getAttributeTest encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Could Not perform getAttributeText");
        }

        if (response != null)
        {
            if (response.getExceptions() != null)
                handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()), "Could Not perform getAttributeText");

            if (response.getOutAttribute() != null)
            {
                return response.getOutAttribute().getText();
            }
        }
        return null;
    }

    /**
     * Rename an attribute in a legacy repo.
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
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public ECLAttribute renameAttribute(String modulename, String attributename, String newmodulename, String newattributename) throws Exception, ArrayOfEspExceptionWrapper
    {
        if ((modulename == null && newmodulename != null) || (newmodulename == null && modulename != null))
        {
            throw new Exception("If modulename or newmodulename is specified, both must be specified");
        }

        if ((attributename == null && newattributename != null) || (newattributename == null && attributename != null))
        {
            throw new Exception("If attributename or newattributename is specified, both must be specified");
        }

        verifyStub(); //Throws if stub not available

        RenameAttributeRequest req = new RenameAttributeRequest();

        req.setAttributeName(attributename);
        req.setModuleName(modulename);
        req.setNewAttributeName(newattributename);
        req.setNewModuleName(newmodulename);

        RenameAttributes request = new RenameAttributes();
        ArrayOfRenameAttributeRequest arrayofrenameattributes = new ArrayOfRenameAttributeRequest();
        RenameAttributeRequest[] param = new RenameAttributeRequest[1];
        arrayofrenameattributes.setRenameAttributeRequest(param);
        request.setAttributes(arrayofrenameattributes);

        UpdateAttributesResponse response = null;

        try
        {
            response = ((WsAttributesStub)stub).renameAttributes(request);
        }
        catch (RemoteException e)
        {
            throw new Exception ("HPCCWsAttributesClient renameAttribute encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Could Not perform renameAttribute");
        }

        if (response != null)
        {
            if (response.getExceptions() != null)
                handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()), "Could Not perform renameAttribute");

            ArrayOfECLAttribute outAttributes = response.getOutAttributes();
            if (outAttributes != null)
            {
                ECLAttribute[] eclAttributes = outAttributes.getECLAttribute();
                if (eclAttributes != null && eclAttributes.length == 1)
                return eclAttributes[0];
            }
        }
        return null;
    }

    /**
     * Creates the or update attributes.
     *
     * @param in
     *            - a list of ECLAttributeInfo objects to create or update
     * @param checkoutin
     *            - if true, check out before updating and check in afterwards
     * @param checkindesc
     *            - if checkoutin is true, this is the checkin message
     * @return - a list of updated eclattributeinfo objects
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public List<ECLAttributeWrapper> createOrUpdateAttributes(List<ECLAttributeWrapper> in, boolean checkoutin, String checkindesc) throws Exception, ArrayOfEspExceptionWrapper
    {
        List<ECLAttributeWrapper> result=new ArrayList<ECLAttributeWrapper>();
        if (in==null || in.size()==0)
        {
            return result;
        }

        if (checkoutin == true && (checkindesc == null || checkindesc.trim().length() == 0))
        {
            throw new Exception("Checkin comment is required if checking attribute out / in");
        }

        //validate items to be created
        String allers="";
        for (ECLAttributeWrapper item: in)
        {
            try
            {
                item.validate();
            }
            catch (Exception e)
            {
                allers=allers + e.getMessage() + "\n";
            }
        }
        if (!allers.isEmpty())
        {
            throw new Exception(allers);
        }

        //get a cached copy of the modules being updated to check whether items must be created
        //convert objects to needed create/update soap object arrays
        Map<String,List<String>> founditems = new HashMap<String,List<String>>();
        List<CreateAttribute> tocreate = new ArrayList<CreateAttribute>();
        SaveAttributeRequest[] toupdate = new SaveAttributeRequest[in.size()];
        CheckoutAttributeRequest[] tocheckout = new CheckoutAttributeRequest[in.size()];
        CheckinAttributeRequest[] tocheckin = new CheckinAttributeRequest[in.size()];
        for (int i=0; i < in.size();i++)
        {
            ECLAttributeWrapper item = in.get(i);
            if (!founditems.containsKey(item.getModuleName().toLowerCase()))
            {
                List<ECLAttributeWrapper> found = this.findItems(item.getModuleName(),null,null,null,null,null);
                List<String> cache=new ArrayList<String>();
                for (ECLAttributeWrapper f : found)
                {
                    cache.add(f.getUniqueName());
                }
                founditems.put(item.getModuleName().toLowerCase(),cache);
            }

            if (!founditems.get(item.getModuleName().toLowerCase()).contains(item.getUniqueName()))
            {
                tocreate.add(item.toCreateAttribute());
            }
            toupdate [i] = item.toSaveAttributeRequest();
            tocheckout [i] = item.toCheckoutAttributeRequest();
            tocheckin [i] = item.toCheckinAttributeRequest(checkindesc);
        }

        //create nonexistant attributes
        verifyStub();

        for (CreateAttribute req : tocreate)
        {
            CreateAttributeResponse resp = ((WsAttributesStub)stub).createAttribute(req);
            if (resp != null)
            {
                if (resp.getExceptions() != null)
                    handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could not create attribute(s)");
            }

            log.trace("Created " + req.getType() + " attribute " + req.getModuleName() + "." + req.getAttributeName());
        }

        //check out attributes
        if (checkoutin)
        {
            CheckoutAttributes params = new CheckoutAttributes();
            ArrayOfCheckoutAttributeRequest tocheckoutatts = new ArrayOfCheckoutAttributeRequest();

            tocheckoutatts.setCheckoutAttributeRequest(tocheckout);
            params.setAttributes(tocheckoutatts);

            UpdateAttributesResponse resp = ((WsAttributesStub)stub).checkoutAttributes(params);

            if (resp != null)
            {
                if (resp.getExceptions() != null)
                    handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()));
            }
        }

        //update attributes
        SaveAttributes params = new SaveAttributes();

        ArrayOfSaveAttributeRequest toupdateatts = new ArrayOfSaveAttributeRequest();
        toupdateatts.setSaveAttributeRequest(toupdate);
        params.setAttributes(toupdateatts);

        UpdateAttributesResponse resp = ((WsAttributesStub)stub).saveAttributes(params);
        if (resp != null)
        {
            if (resp != null)
            {
                if (resp.getExceptions() != null)
                    handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()));
            }

            ArrayOfECLAttribute outAttributes = resp.getOutAttributes();
            if (outAttributes != null)
            {
                ECLAttribute[] eclAttributes = outAttributes.getECLAttribute();
                for (int i=0; i < eclAttributes.length; i++)
                {
                    result.add(new ECLAttributeWrapper(eclAttributes[i]));
                }
            }
        }

        //check in attributes
        if (checkoutin)
        {
            CheckinAttributes inparams = new CheckinAttributes();

            ArrayOfCheckinAttributeRequest tocheckinatts = new ArrayOfCheckinAttributeRequest();
            tocheckinatts.setCheckinAttributeRequest(tocheckin);
            inparams.setAttributes(tocheckinatts);

            UpdateAttributesResponse upresp = ((WsAttributesStub)stub).checkinAttributes(inparams);

            if (upresp != null)
            {
                if (upresp.getExceptions() != null)
                    handleEspExceptions(new ArrayOfEspExceptionWrapper(upresp.getExceptions()));
            }
        }

        return result;
    }

    /**
     * Create/Update an attribute in a legacy repository.
     *
     * @param item
     *            the item
     * @param checkoutin
     *            - whether to check the attribute out/in before doing this
     * @param checkindesc
     *            - if checkoutin=true, the description to append to the checkin
     * @return updated ECLAttributeItem for created/updated item
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public ECLAttributeWrapper createOrUpdateAttribute(ECLAttributeWrapper item, boolean checkoutin, String checkindesc) throws Exception, ArrayOfEspExceptionWrapper
    {
        if (item==null)
        {
            return null;
        }

        item.validate();

        if (checkoutin == true && (checkindesc == null || checkindesc.trim().length() == 0))
        {
            throw new Exception("Checkin comment is required if checking attribute out / in");
        }

        verifyStub();

        if (!this.attributeExists(item.getModuleName(),item.getName(),item.getType()))
        {
            CreateAttributeResponse response = ((WsAttributesStub)stub).createAttribute(item.toCreateAttribute());
            if (response != null)
            {
                if (response.getExceptions() != null)
                    handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()));
            }
            log.trace("Created " + item.getType() + " attribute " + item.getModuleName() + "." + item.getName());
        }

        if (checkoutin)
        {
            this.checkoutAttribute(item.getModuleName(),item.getName());
        }

        SaveAttributeRequest[] arr = { item.toSaveAttributeRequest() };
        SaveAttributes params = new SaveAttributes();
        ArrayOfSaveAttributeRequest arrayofattributes = new ArrayOfSaveAttributeRequest();
        arrayofattributes.setSaveAttributeRequest(arr);
        params.setAttributes(arrayofattributes);

        UpdateAttributesResponse resp = ((WsAttributesStub)stub).saveAttributes(params);
        log.trace("Updated text of " + item.getType() + " attribute " + item.getModuleName() + "." + item.getName());
        if (resp != null)
        {
            if (resp.getExceptions() != null)
                handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()));

            if (checkoutin)
            {
                this.checkinAttribute(item.getModuleName(), item.getName(), checkindesc);
            }

            if (resp.getOutAttributes() != null)
            {
                ECLAttribute[] eclAttributes = resp.getOutAttributes().getECLAttribute();
                if (eclAttributes != null && eclAttributes.length > 0)
                    return new ECLAttributeWrapper(eclAttributes[0]);
            }
        }

        return null;
    }

    /**
     * Update an attribute in a legacy repository.
     *
     * @param modulename
     *            - module name to update
     * @param attributename
     *            - attribute name to update
     * @param type
     *            the type
     * @param text
     *            - text to update the attribute to
     * @param checkoutin
     *            - whether to check the attribute out/in before doing this
     * @param checkindesc
     *            - if checkoutin=true, the description to append to the checkin
     * @return the ECL attribute
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public ECLAttribute updateAttribute(String modulename, String attributename, String type, String text, Boolean checkoutin, String checkindesc) throws Exception, ArrayOfEspExceptionWrapper
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
            throw new FileNotFoundException("Cannot update " + modulename + "." + attributename + ", attribute does not exist");
        }

        verifyStub();

        if (checkoutin)
        {
            this.checkoutAttribute(modulename, attributename);
        }

        SaveAttributeRequest req = new SaveAttributeRequest();
        req.setModuleName(modulename);
        req.setAttributeName(attributename);
        req.setText(text);

        SaveAttributeRequest[] arr = { req };
        ArrayOfSaveAttributeRequest arrayofatts = new ArrayOfSaveAttributeRequest();
        arrayofatts.setSaveAttributeRequest(arr);
        SaveAttributes saveattributes = new SaveAttributes();
        saveattributes.setAttributes(arrayofatts);

        UpdateAttributesResponse resp = ((WsAttributesStub)stub).saveAttributes(saveattributes);
        if (resp != null)
        {
            if (resp.getExceptions() != null)
                handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()));

            if (checkoutin)
            {
                this.checkinAttribute(modulename, attributename, checkindesc);
            }
            if (resp.getOutAttributes() != null)
            {
                ECLAttribute[] eclAttributes = resp.getOutAttributes().getECLAttribute();
                if (eclAttributes != null && eclAttributes.length > 0)
                    return eclAttributes[0];
            }
        }

        return null;
    }

    /**
     * Check in an attribute in an HPCC Repository.
     *
     * @param modulename
     *            - module name to check in
     * @param attributename
     *            - attribute name to check in
     * @param checkindesc
     *            - check in comment
     * @return ECLAttribute of checked in attribute
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public ECLAttribute checkinAttribute(String modulename, String attributename, String checkindesc) throws Exception, ArrayOfEspExceptionWrapper
    {
        if (modulename == null || attributename == null)
        {
            throw new Exception("Module name and attribute name are required");
        }
        if (checkindesc == null || checkindesc.trim().length() == 0)
        {
            throw new Exception("Checkin comment is required if checking attribute out / in");
        }

        verifyStub();

        CheckinAttributeRequest req = new CheckinAttributeRequest();
        req.setAttributeName(attributename);
        req.setModuleName(modulename);
        req.setDescription(checkindesc);
        CheckinAttributeRequest[] arr = { req };

        CheckinAttributes params = new CheckinAttributes();
        ArrayOfCheckinAttributeRequest arrayofcheckinatts = new ArrayOfCheckinAttributeRequest();
        arrayofcheckinatts.setCheckinAttributeRequest(arr);
        params.setAttributes(arrayofcheckinatts);

        UpdateAttributesResponse response = ((WsAttributesStub)stub).checkinAttributes(params);

        if (response == null)
        {
            return null;
        }

        if (response.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()));

        if (response.getOutAttributes() != null)
        {
            ECLAttribute[] eclAttributes = response.getOutAttributes().getECLAttribute();
            if (eclAttributes != null && eclAttributes.length > 0)
                return eclAttributes[0];
        }
        return null;
    }

    /**
     * Check out an attribute in a legacy repository.
     *
     * @param modulename
     *            - module to check out
     * @param attributename
     *            - attribute to check out
     * @return ECLAttribute of checked out attribute
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public ECLAttribute checkoutAttribute(String modulename, String attributename) throws Exception, ArrayOfEspExceptionWrapper
    {
        if (modulename == null || attributename == null)
        {
            throw new Exception("Module name and attribute name are required");
        }

        verifyStub();

        CheckoutAttributeRequest req = new CheckoutAttributeRequest();
        req.setAttributeName(attributename);
        req.setModuleName(modulename);
        CheckoutAttributeRequest[] arr = { req };
        CheckoutAttributes params = new CheckoutAttributes();

        ArrayOfCheckoutAttributeRequest arrayofCheckoutAtts = new ArrayOfCheckoutAttributeRequest();
        arrayofCheckoutAtts.setCheckoutAttributeRequest(arr);
        params.setAttributes(arrayofCheckoutAtts);

        UpdateAttributesResponse response = ((WsAttributesStub)stub).checkoutAttributes(params);
        if (response == null)
        {
            return null;
        }

        if (response.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()));

        if (response.getOutAttributes() != null)
        {
            ECLAttribute[] eclAttributes = response.getOutAttributes().getECLAttribute();
            if (eclAttributes != null && eclAttributes.length > 0)
                return eclAttributes[0];
        }
        return null;
    }

    /**
     * Create an attribute in an HPCC Legacy Repository.
     *
     * @param modulename
     *            - module name to create
     * @param attributename
     *            - attribute name to create
     * @param type
     *            the type
     * @param text
     *            the text
     * @param checkin
     *            - if true, check this attribute in after creating it
     * @param checkindesc
     *            - checkin comment. Required if checkin=true
     * @return the ECL Attribute of the created object
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public ECLAttribute createAttribute(String modulename, String attributename, String type,String text, Boolean checkin, String checkindesc) throws Exception, ArrayOfEspExceptionWrapper
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

        verifyStub();

        CreateAttribute req = new CreateAttribute();
        req.setModuleName(modulename);
        req.setAttributeName(attributename);
        req.setType(type);

        CreateAttributeResponse response = ((WsAttributesStub)stub).createAttribute(req);
        if (response == null)
        {
            return null;
        }
        if (response.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()));

        ECLAttribute attr = updateAttribute(modulename, attributename, type, text, checkin, checkindesc);
        return attr;
    }


    /**
     * Delete a module from the remote repository.
     *
     * @param modulename
     *            - name of module to delete
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public void deleteModule(String modulename) throws Exception, ArrayOfEspExceptionWrapper
    {
        verifyStub();

        DeleteModule parameters = new DeleteModule();
        parameters.setModuleName(modulename);

        DeleteModuleResponse response = ((WsAttributesStub)stub).deleteModule(parameters);
        if (response.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()));
    }

    /**
     * delete an attribute from the remote repository.
     *
     * @param modulename
     *            - name of module for attribute to delete
     * @param attributename
     *            - name of attribute to delete
     * @return the list
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public List<ECLAttributeWrapper> deleteAttribute(String modulename,String attributename) throws Exception, ArrayOfEspExceptionWrapper
    {
        verifyStub();

        DeleteAttributeRequest dar = new DeleteAttributeRequest();
        DeleteAttributes parameters = new DeleteAttributes();

        dar.setAttributeName(attributename);
        dar.setModuleName(modulename);

        DeleteAttributeRequest[] arr = new DeleteAttributeRequest[]{dar};
        ArrayOfDeleteAttributeRequest arrayofdeleteatts = new ArrayOfDeleteAttributeRequest();
        arrayofdeleteatts.setDeleteAttributeRequest(arr);
        parameters.setAttributes(arrayofdeleteatts);

        UpdateAttributesResponse resp = ((WsAttributesStub)stub).deleteAttributes(parameters);

        if (resp.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()));

        List<ECLAttributeWrapper> results=new ArrayList<ECLAttributeWrapper>();
        if (resp.getOutAttributes() != null)
        {
            ECLAttribute[] arrayOfECLAttribute = resp.getOutAttributes().getECLAttribute();
            for (int i=0; i < arrayOfECLAttribute.length; i++)
            {
                results.add(new ECLAttributeWrapper(arrayOfECLAttribute[i]));
            }
        }
        return results;
    }

    /**
     * Gets the attributes.
     *
     * @param label
     *            the label
     * @param modulename
     *            the modulename
     * @param typelist
     *            the typelist
     * @return the attributes
     * @throws java.lang.Exception
     *             the exception
     */
    public GetAttributesResponseWrapper getAttributes(String label, String modulename, EspStringArray typelist) throws Exception
    {
        GetAttributes request = new GetAttributes();

        request.setLabel(label);
        request.setModuleName(modulename);
        request.setTypeList(typelist);

        return getAttributes(new GetAttributesWrapper(request));
    }

    /**
     * Gets the attributes.
     *
     * @param request
     *            the request
     * @return the attributes
     * @throws java.lang.Exception
     *             the exception
     */
    public GetAttributesResponseWrapper getAttributes(GetAttributesWrapper request) throws Exception
    {
        verifyStub();

        GetAttributesResponse response = null;
        try
        {
            response = ((WsAttributesStub)stub).getAttributes(request.getRaw());
        }
        catch (RemoteException e)
        {
            throw new Exception ("HPCCWsAttributes.getAttributes() encountered RemoteException.", e);
        }

        if (response != null && response.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()), "Could not get attributes");

        return new GetAttributesResponseWrapper(response);
    }

    /* (non-Javadoc)
     * @see org.hpccsystems.ws.client.BaseHPCCWsClient#getDefaultStub()
     */
    /** {@inheritDoc} */
    @Override
    public Stub getDefaultStub() throws AxisFault
    {
        return new WsAttributesStub();
    }
}
