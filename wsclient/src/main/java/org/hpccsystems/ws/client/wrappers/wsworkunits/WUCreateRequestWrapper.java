package org.hpccsystems.ws.client.wrappers.wsworkunits;

import java.util.ArrayList;
import java.util.List;

import org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ApplicationValue;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_73.DebugValue;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUUpdate;
import org.hpccsystems.ws.client.platform.ApplicationValueInfo;
import org.hpccsystems.ws.client.platform.DebugValueInfo;

public class WUCreateRequestWrapper
{

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUCreate getRaw() {
        return getRawVersion73();
    }
    
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUCreate getRawVersion73() {
        org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUCreate raw=
                new org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUCreate();
        return raw;
    }
    
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUCreate getRawVersion6() {
                org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUCreate raw=
                new org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUCreate();
        return raw;
    }

}
