/*##############################################################################

    HPCC SYSTEMS software Copyright (C) 2018 HPCC Systems®.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
############################################################################## */

package org.hpccsystems.ws.client.wrappers.wsdfu;

import org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUFilePart;
import java.util.Hashtable;

import org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUFileCopy;

public class DFUFilePartWrapper
{
    private Integer partIndex;

    private DFUFileCopyWrapper [] wrappedDFUFileCopies;
    
    public DFUFilePartWrapper(DFUFilePart soapdfufilepart, Hashtable<Integer,String> availableLocations)
    {
        partIndex = soapdfufilepart.getPartIndex();

        DFUFileCopy[] dfufilecopies = soapdfufilepart.getCopies();
        for (DFUFileCopy dfuFileCopy : dfufilecopies)
        {
            wrappedDFUFileCopies[dfuFileCopy.getCopyIndex()] = new DFUFileCopyWrapper(dfuFileCopy, availableLocations.get(dfuFileCopy.getLocationIndex()));
        }
    }

    public Integer getPartIndex() throws Exception
    {

        return partIndex;
    }

    public DFUFileCopyWrapper []  getCopies() throws Exception
    {
        return wrappedDFUFileCopies;
    }
}
