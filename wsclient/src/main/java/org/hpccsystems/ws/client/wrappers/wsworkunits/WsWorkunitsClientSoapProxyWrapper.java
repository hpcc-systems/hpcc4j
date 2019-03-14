package org.hpccsystems.ws.client.wrappers.wsworkunits;

import org.apache.axis.client.Stub;
import org.hpccsystems.ws.client.platform.Version;
import org.hpccsystems.ws.client.utils.Connection;

/**
 * @author LeedDX
 * This wrapper class allows an HPCCWsWorkUnitsClient instance to connect to HPCC Clusters using different
 * versions of the platform.
 * any soapproxy method (WURun, WUCreate, etc) can be added to provide a platform-version-independent soapproxy call.
 * Currently 6.x and 7.x are supported in the wrapped soap methods.
 * All hpcc 6.x clusters use 1_69 of the workunits soap proxy except for 6.0, and
 * all hpcc 7.x clusters use version 1_73.  Version 1_56 of the soap proxy also exists to support
 * existing HPCCWsWorkUnitsClient methods using 1_56.
 *
 */
public class WsWorkunitsClientSoapProxyWrapper
{
    private org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WsWorkunitsServiceSoap version1_56WorkunitsServiceSoap = null;
    private org.hpccsystems.ws.client.gen.wsworkunits.v1_58.WsWorkunitsServiceSoap version1_58WorkunitsServiceSoap = null;
    private org.hpccsystems.ws.client.gen.wsworkunits.v1_62.WsWorkunitsServiceSoap version1_62WorkunitsServiceSoap = null;
    private org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WsWorkunitsServiceSoap version1_69WorkunitsServiceSoap = null;
    private org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WsWorkunitsServiceSoap version1_73WorkunitsServiceSoap = null;
    private org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WsWorkunitsServiceSoap version1_74WorkunitsServiceSoap = null;
    private org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WsWorkunitsServiceSoapProxy version1_56WorkunitsServiceSoapProxy = null;
    private org.hpccsystems.ws.client.gen.wsworkunits.v1_58.WsWorkunitsServiceSoapProxy version1_58WorkunitsServiceSoapProxy = null;
    private org.hpccsystems.ws.client.gen.wsworkunits.v1_62.WsWorkunitsServiceSoapProxy version1_62WorkunitsServiceSoapProxy = null;
    private org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WsWorkunitsServiceSoapProxy version1_69WorkunitsServiceSoapProxy = null;
    private org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WsWorkunitsServiceSoapProxy version1_73WorkunitsServiceSoapProxy = null;
    private org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WsWorkunitsServiceSoapProxy version1_74WorkunitsServiceSoapProxy = null;
    private String user;
    private String password;
    private Version platformVersion;
    private String baseURL;

    /**
     * @param baseURL The URL of the cluster to connect to
     * @param user the username to use when connecting to the cluster
     * @param pass the password to use when connecting to the cluster
     * @param platformVersion the version of the cluster
     */
    public WsWorkunitsClientSoapProxyWrapper(String baseURL, String user, String pass, Version platformVersion)
    {
        this.platformVersion=platformVersion;
        this.baseURL=baseURL;
        this.user=user;
        this.password=pass;
    }
    /**
     * @return a lazy-loaded 1_73 soap proxy
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WsWorkunitsServiceSoapProxy getVersion1_74WorkunitsServiceSoapProxy() {
        if (version1_74WorkunitsServiceSoapProxy == null)
        {
            version1_74WorkunitsServiceSoapProxy = new org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WsWorkunitsServiceSoapProxy(baseURL);
            version1_74WorkunitsServiceSoap = version1_74WorkunitsServiceSoapProxy.getWsWorkunitsServiceSoap();
            if (user != null && password != null) Connection.initStub((Stub) version1_74WorkunitsServiceSoap, user, password);
        }
        return version1_74WorkunitsServiceSoapProxy;
    }

    /**
     * @return a lazy-loaded 1_73 soap proxy
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WsWorkunitsServiceSoapProxy getVersion1_73WorkunitsServiceSoapProxy() {
        if (version1_73WorkunitsServiceSoapProxy == null)
        {
            version1_73WorkunitsServiceSoapProxy = new org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WsWorkunitsServiceSoapProxy(baseURL);
            version1_73WorkunitsServiceSoap = version1_73WorkunitsServiceSoapProxy.getWsWorkunitsServiceSoap();
            if (user != null && password != null) Connection.initStub((Stub) version1_73WorkunitsServiceSoap, user, password);
        }
        return version1_73WorkunitsServiceSoapProxy;
    }
    /**
     * @return a lazy-loaded 1_56 soap proxy
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WsWorkunitsServiceSoapProxy getVersion1_56WorkunitsServiceSoapProxy() {

        if (version1_56WorkunitsServiceSoapProxy == null)
        {
            version1_56WorkunitsServiceSoapProxy = new org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WsWorkunitsServiceSoapProxy(baseURL);
            version1_56WorkunitsServiceSoap = version1_56WorkunitsServiceSoapProxy.getWsWorkunitsServiceSoap();
            if (user != null && password != null) Connection.initStub((Stub) version1_56WorkunitsServiceSoap, user, password);
        }
        return version1_56WorkunitsServiceSoapProxy;
    }
    /**
     * @return a lazy-loaded 1_58 soap proxy
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_58.WsWorkunitsServiceSoapProxy getVersion1_58WorkunitsServiceSoapProxy() {

        if (version1_58WorkunitsServiceSoapProxy == null)
        {
            version1_58WorkunitsServiceSoapProxy = new org.hpccsystems.ws.client.gen.wsworkunits.v1_58.WsWorkunitsServiceSoapProxy(baseURL);
            version1_58WorkunitsServiceSoap = version1_58WorkunitsServiceSoapProxy.getWsWorkunitsServiceSoap();
            if (user != null && password != null) Connection.initStub((Stub) version1_58WorkunitsServiceSoap, user, password);
        }
        return version1_58WorkunitsServiceSoapProxy;
    }
    /**
     * @return a lazy-loaded 1_62 soap proxy
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_62.WsWorkunitsServiceSoapProxy getVersion1_62WorkunitsServiceSoapProxy() {

        if (version1_62WorkunitsServiceSoapProxy == null)
        {
            version1_62WorkunitsServiceSoapProxy = new org.hpccsystems.ws.client.gen.wsworkunits.v1_62.WsWorkunitsServiceSoapProxy(baseURL);
            version1_62WorkunitsServiceSoap = version1_62WorkunitsServiceSoapProxy.getWsWorkunitsServiceSoap();
            if (user != null && password != null) Connection.initStub((Stub) version1_62WorkunitsServiceSoap, user, password);
        }
        return version1_62WorkunitsServiceSoapProxy;
    }

    /**
     * @return a lazy-loaded 1_69 soap proxy
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WsWorkunitsServiceSoapProxy getVersion1_69WorkunitsServiceSoapProxy() {

        if (version1_69WorkunitsServiceSoapProxy == null)
        {
            version1_69WorkunitsServiceSoapProxy = new org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WsWorkunitsServiceSoapProxy(baseURL);
            version1_69WorkunitsServiceSoap = version1_69WorkunitsServiceSoapProxy.getWsWorkunitsServiceSoap();
            if (user != null && password != null) Connection.initStub((Stub) version1_69WorkunitsServiceSoap, user, password);
        }
        return version1_69WorkunitsServiceSoapProxy;
    }
    /**
     * @param params WUCreateRequestWrapper containing request info
     * @return a WUCreateResponseWrapper containing the response
     * @throws Exception if the WUCreate command fails or an unsupported version is specified
     */
    public WUCreateResponseWrapper WUCreate(WUCreateRequestWrapper params) throws Exception
    {
        if (useVersion1_62())
        {
            return new WUCreateResponseWrapper(this.getVersion1_62WorkunitsServiceSoapProxy().WUCreate());
        } else if (useVersion1_69())
        {
            return new WUCreateResponseWrapper(this.getVersion1_69WorkunitsServiceSoapProxy().WUCreate(params.getRawVersion1_69()));
        } else if (useVersion1_58())
        {
            return new WUCreateResponseWrapper(this.getVersion1_58WorkunitsServiceSoapProxy().WUCreate());
        } else if (useVersion1_73())
        {
            return new WUCreateResponseWrapper(this.getVersion1_73WorkunitsServiceSoapProxy().WUCreate(params.getRaw()));
        } else
        {
            throw new UnsupportedOperationException("Can only handle cluster versions 6 and 7, not version " + String.valueOf(platformVersion.major));
        }
    }
    /**
     * @param params WUInfoRequestWrapper containing request info
     * @return a WUInfoResponseWrapper containing the response
     * @throws Exception if the WUInfo command fails or an unsupported version is specified
     */
    public WUInfoResponseWrapper WUInfo(WUInfoRequestWrapper params) throws Exception
    {
        if (useVersion1_58())
        {
            return new WUInfoResponseWrapper(this.getVersion1_58WorkunitsServiceSoapProxy().WUInfo(params.getRawVersion1_58()));
        } else if (useVersion1_62())
        {
            return new WUInfoResponseWrapper(this.getVersion1_62WorkunitsServiceSoapProxy().WUInfo(params.getRawVersion1_62()));
        } else if (useVersion1_69())
        {
            return new WUInfoResponseWrapper(this.getVersion1_69WorkunitsServiceSoapProxy().WUInfo(params.getRawVersion1_69()));
        } else if (useVersion1_73())
        {
            return new WUInfoResponseWrapper(this.getVersion1_73WorkunitsServiceSoapProxy().WUInfo(params.getRaw()));
        } else
        {
            throw new UnsupportedOperationException("Can only handle cluster versions 6 and 7, not version " + String.valueOf(platformVersion.major));
        }
    }
    /**
     * @param params WUUpdateRequestWrapper containing request info
     * @return a WUUpdateResponseWrapper containing the response
     * @throws Exception if the WUpdate command fails or an unsupported version is specified
     */
    public WUUpdateResponseWrapper WUUpdate(WUUpdateRequestWrapper params) throws Exception
    {
        if (useVersion1_58())
        {
            return new WUUpdateResponseWrapper(this.getVersion1_58WorkunitsServiceSoapProxy().WUUpdate(params.getRawVersion1_58()));
        } else if (useVersion1_62())
        {
            return new WUUpdateResponseWrapper(this.getVersion1_62WorkunitsServiceSoapProxy().WUUpdate(params.getRawVersion1_62()));
        } else if (useVersion1_69())
        {
            return new WUUpdateResponseWrapper(this.getVersion1_69WorkunitsServiceSoapProxy().WUUpdate(params.getRawVersion1_69()));
        } else if (useVersion1_73())
        {
            return new WUUpdateResponseWrapper(this.getVersion1_73WorkunitsServiceSoapProxy().WUUpdate(params.getRaw()));
        } else
        {
            throw new UnsupportedOperationException("Can only handle cluster versions 6 and 7, not version " + String.valueOf(platformVersion.major));
        }
    }
    /**
     * @param params WUCreateAndUpdateWrapper containing request info
     * @return a WUUpdateResponseWrapper containing the response
     * @throws Exception if the WuCreateAndUpdate command fails or an unsupported version is specified
     */
    public WUUpdateResponseWrapper WUCreateAndUpdate(WUCreateAndUpdateWrapper params) throws Exception
    {
        if (useVersion1_58())
        {
            return new WUUpdateResponseWrapper(this.getVersion1_58WorkunitsServiceSoapProxy().WUCreateAndUpdate(params.getRawVersion1_58()));
        } else if (useVersion1_62())
        {
            return new WUUpdateResponseWrapper(this.getVersion1_62WorkunitsServiceSoapProxy().WUCreateAndUpdate(params.getRawVersion1_62()));
        } else if (useVersion1_69())
        {
            return new WUUpdateResponseWrapper(this.getVersion1_69WorkunitsServiceSoapProxy().WUCreateAndUpdate(params.getRawVersion1_69()));
        } else if (useVersion1_73())
        {
            return new WUUpdateResponseWrapper(this.getVersion1_73WorkunitsServiceSoapProxy().WUCreateAndUpdate(params.getRaw()));
        } else
        {
            throw new UnsupportedOperationException("Can only handle cluster versions 6 and 7, not version " + String.valueOf(platformVersion.major));
        }
    }
    /**
     * @return the latest available soap proxy
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WsWorkunitsServiceSoapProxy getLatestRaw()
    {
        return getVersion1_74Raw();
    }
    /**
     * @return version 1_69 soap proxy
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WsWorkunitsServiceSoapProxy getVersion1_69Raw()
    {
        return getVersion1_69WorkunitsServiceSoapProxy();
    }
    /**
     * @return version 1_62 soap proxy
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_62.WsWorkunitsServiceSoapProxy getVersion1_62Raw()
    {
        return getVersion1_62WorkunitsServiceSoapProxy();
    }
    /**
     * @return version 1_73 soap proxy
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WsWorkunitsServiceSoapProxy getVersion1_73Raw()
    {
        return getVersion1_73WorkunitsServiceSoapProxy();
    }
    /**
     * @return version 1_74 soap proxy
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WsWorkunitsServiceSoapProxy getVersion1_74Raw()
    {
        return getVersion1_74WorkunitsServiceSoapProxy();
    }
    /**
     * @return version 1_56 soap proxy
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WsWorkunitsServiceSoapProxy getVersion1_56Raw()
    {
        return getVersion1_56WorkunitsServiceSoapProxy();
    }

    /**
     * @return version 1_58 soap proxy
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_58.WsWorkunitsServiceSoapProxy getVersion1_58Raw()
    {
        return getVersion1_58WorkunitsServiceSoapProxy();
    }
    private boolean useVersion1_69()
    {
        return platformVersion.major==6 && platformVersion.minor>=4;
    }
    private boolean useVersion1_56()
    {
        return platformVersion.major==5
                && (platformVersion.minor==0
                || platformVersion.minor==2
                || platformVersion.minor==4
                || platformVersion.minor==6);
    }
    private boolean useVersion1_58()
    {
        return platformVersion.major==6 && platformVersion.minor==0;
    }
    private boolean useVersion1_62()
    {
        return platformVersion.major==6 && platformVersion.minor==2;
    }
    private boolean useVersion1_73()
    {
        return platformVersion.major==7
                && (platformVersion.minor==0
                || platformVersion.minor==2);
    }
}
