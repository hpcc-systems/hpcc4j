package org.hpccsystems.ws.client.wrappers.wsworkunits;

import java.util.ArrayList;
import java.util.List;

import org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ApplicationValue;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_74.DebugValue;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WUUpdate;
import org.hpccsystems.ws.client.wrappers.ApplicationValueWrapper;
import org.hpccsystems.ws.client.wrappers.DebugValueWrapper;

public class WUCreateRequestWrapper
{

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WUCreate getRaw() {
        return getRawVersion1_74();
    }
    
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WUCreate getRawVersion1_74() {
        org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WUCreate raw=
                new org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WUCreate();
        return raw;
    }
    
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUCreate getRawVersion1_69() {
                org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUCreate raw=
                new org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUCreate();
        return raw;
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_62.WUCreate getRawVersion1_62() {
        org.hpccsystems.ws.client.gen.wsworkunits.v1_62.WUCreate raw=
        new org.hpccsystems.ws.client.gen.wsworkunits.v1_62.WUCreate();
        return raw;
    }
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_58.WUCreate getRawVersion1_58() {
        org.hpccsystems.ws.client.gen.wsworkunits.v1_58.WUCreate raw=
        new org.hpccsystems.ws.client.gen.wsworkunits.v1_58.WUCreate();
        return raw;
    }

}
