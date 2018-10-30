package org.hpccsystems.ws.client.wrappers.wsworkunits;

import org.apache.axis.client.Stub;
import org.apache.commons.lang3.NotImplementedException;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_73.EspException;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WsWorkunitsServiceSoap;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WsWorkunitsServiceSoapProxy;
import org.hpccsystems.ws.client.platform.Version;
import org.hpccsystems.ws.client.platform.WorkunitInfo;
import org.hpccsystems.ws.client.utils.Connection;

public class WsWorkunitsClientSoapProxyWrapper
{
    
    private org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WsWorkunitsServiceSoap version5WorkunitsServiceSoap = null;
    private org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WsWorkunitsServiceSoap version6WorkunitsServiceSoap = null;
    private org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WsWorkunitsServiceSoap version7WorkunitsServiceSoap = null;

    private org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WsWorkunitsServiceSoapProxy version5WorkunitsServiceSoapProxy = null;
    private org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WsWorkunitsServiceSoapProxy version6WorkunitsServiceSoapProxy = null;
    private org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WsWorkunitsServiceSoapProxy version7WorkunitsServiceSoapProxy = null;

    private Version platformVersion;
    
    public WsWorkunitsClientSoapProxyWrapper(String baseURL, String user, String pass, Version platformVersion) {
        this.platformVersion=platformVersion;
        version7WorkunitsServiceSoapProxy = new WsWorkunitsServiceSoapProxy(baseURL);
        if (version7WorkunitsServiceSoapProxy != null)
        {
            version7WorkunitsServiceSoap = version7WorkunitsServiceSoapProxy.getWsWorkunitsServiceSoap();
            if (user != null && pass != null) Connection.initStub((Stub) version7WorkunitsServiceSoap, user, pass);
        }

        version5WorkunitsServiceSoapProxy = new org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WsWorkunitsServiceSoapProxy(
                baseURL);
        if (version5WorkunitsServiceSoapProxy != null)
        {
            version5WorkunitsServiceSoap = version5WorkunitsServiceSoapProxy.getWsWorkunitsServiceSoap();
            if (user != null && pass != null) Connection.initStub((Stub) version5WorkunitsServiceSoap, user, pass);
        }
        
        version6WorkunitsServiceSoapProxy = new org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WsWorkunitsServiceSoapProxy(
                baseURL);
        if (version6WorkunitsServiceSoapProxy != null)
        {
            version6WorkunitsServiceSoap = version6WorkunitsServiceSoapProxy.getWsWorkunitsServiceSoap();
            if (user != null && pass != null) Connection.initStub((Stub) version6WorkunitsServiceSoap, user, pass);
        }
    }
    
    public WUCreateResponseWrapper WUCreate(WUCreateRequestWrapper params) throws Exception {
        if (platformVersion.major==6) {
            return new WUCreateResponseWrapper(this.version6WorkunitsServiceSoapProxy.WUCreate(params.getRawVersion6()));
        } else if (platformVersion.major==7) {
            return new WUCreateResponseWrapper(this.version7WorkunitsServiceSoapProxy.WUCreate(params.getRaw()));
        } else {
            throw new NotImplementedException("Can only handle cluster versions 6 and 7, not version " + String.valueOf(platformVersion.major));
        }
    }

    public WUInfoResponseWrapper WUInfo(WUInfoRequestWrapper params) throws Exception {
        if (platformVersion.major==6) {
            return new WUInfoResponseWrapper(this.version6WorkunitsServiceSoapProxy.WUInfo(params.getRawVersion6()));
        } else if (platformVersion.major==7) {
            return new WUInfoResponseWrapper(this.version7WorkunitsServiceSoapProxy.WUInfo(params.getRaw()));
        } else {
            throw new NotImplementedException("Can only handle cluster versions 6 and 7, not version " + String.valueOf(platformVersion.major));
        }
    }

    public WUUpdateResponseWrapper WUUpdate(WUUpdateRequestWrapper params) throws Exception {
        if (platformVersion.major==6) {
            return new WUUpdateResponseWrapper(this.version6WorkunitsServiceSoapProxy.WUUpdate(params.getRawVersion6()));
        } else if (platformVersion.major==7) {
            return new WUUpdateResponseWrapper(this.version7WorkunitsServiceSoapProxy.WUUpdate(params.getRaw()));
        } else {
            throw new NotImplementedException("Can only handle cluster versions 6 and 7, not version " + String.valueOf(platformVersion.major));
        }
    }

    public WUUpdateResponseWrapper WUCreateAndUpdate(WUCreateAndUpdateWrapper params) throws Exception {
        if (platformVersion.major==6) {
            return new WUUpdateResponseWrapper(this.version6WorkunitsServiceSoapProxy.WUCreateAndUpdate(params.getRawVersion6()));
        } else if (platformVersion.major==7) {
            return new WUUpdateResponseWrapper(this.version7WorkunitsServiceSoapProxy.WUCreateAndUpdate(params.getRaw()));
        } else {
            throw new NotImplementedException("Can only handle cluster versions 6 and 7, not version " + String.valueOf(platformVersion.major));
        }
    }
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WsWorkunitsServiceSoapProxy getLatestRaw() {
        return getVersion7Raw();
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WsWorkunitsServiceSoapProxy getVersion6Raw() {
        return version6WorkunitsServiceSoapProxy;
    }
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WsWorkunitsServiceSoapProxy getVersion7Raw() {
        return version7WorkunitsServiceSoapProxy;
    }
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WsWorkunitsServiceSoapProxy getVersion5Raw() {
        return version5WorkunitsServiceSoapProxy;
    }
   
}
