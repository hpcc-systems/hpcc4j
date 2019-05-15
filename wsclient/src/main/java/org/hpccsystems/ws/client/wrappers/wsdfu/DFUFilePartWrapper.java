/*##############################################################################

    HPCC SYSTEMS software Copyright (C) 2019 HPCC Systems®.

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
import java.util.Hashtable;


public class DFUFilePartWrapper
{
    private Integer partIndex;
    private DFUFileCopyWrapper [] wrappedDFUFileCopies;

    public DFUFilePartWrapper(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFilePart soapdfufilepart, Hashtable<Integer,String> availableLocations)
    {
        partIndex = soapdfufilepart.getPartIndex();
        org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileCopy[] dfufilecopies = soapdfufilepart.getCopies();
        wrappedDFUFileCopies = new DFUFileCopyWrapper [dfufilecopies.length];
        for (int i = 0; i < dfufilecopies.length; i++)
        {
             Integer copyindex = dfufilecopies[i].getCopyIndex();
             if (copyindex == null || copyindex  < 1 || copyindex > dfufilecopies.length )
                 throw new IndexOutOfBoundsException("Encountered invalid Filepart Copy index: '" + copyindex + "'");

             if (wrappedDFUFileCopies[copyindex-1] != null)
                 throw new IndexOutOfBoundsException("Encountered duplicate Filepart copy index: '" + copyindex + "'");
             wrappedDFUFileCopies[copyindex-1] = new DFUFileCopyWrapper(dfufilecopies[i], availableLocations.get(dfufilecopies[i].getLocationIndex()));
        }
    }

    public DFUFilePartWrapper(org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUFilePart soapdfufilepart, Hashtable<Integer,String> availableLocations)
    {
        partIndex = soapdfufilepart.getPartIndex();
        org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUFileCopy[] dfufilecopies = soapdfufilepart.getCopies();
        wrappedDFUFileCopies = new DFUFileCopyWrapper [dfufilecopies.length];
        for (int i = 0; i < dfufilecopies.length; i++)
        {
             Integer copyindex = dfufilecopies[i].getCopyIndex();
             if (copyindex == null || copyindex  < 1 || copyindex > dfufilecopies.length )
                 throw new IndexOutOfBoundsException("Encountered invalid Filepart Copy index: '" + copyindex + "'");

             if (wrappedDFUFileCopies[copyindex-1] != null)
                 throw new IndexOutOfBoundsException("Encountered duplicate Filepart copy index: '" + copyindex + "'");
             wrappedDFUFileCopies[copyindex-1] = new DFUFileCopyWrapper(dfufilecopies[i], availableLocations.get(dfufilecopies[i].getLocationIndex()));
        }
    }

    public DFUFilePartWrapper(org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUFilePart soapdfufilepart, Hashtable<Integer,String> availableLocations)
    {
        partIndex = soapdfufilepart.getPartIndex();
        org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUFileCopy[] dfufilecopies = soapdfufilepart.getCopies();
        wrappedDFUFileCopies = new DFUFileCopyWrapper [dfufilecopies.length];
        for (int i = 0; i < dfufilecopies.length; i++)
        {
             Integer copyindex = dfufilecopies[i].getCopyIndex();
             if (copyindex == null || copyindex  < 1 || copyindex > dfufilecopies.length )
                 throw new IndexOutOfBoundsException("Encountered invalid Filepart Copy index: '" + copyindex + "'");

             if (wrappedDFUFileCopies[copyindex-1] != null)
                 throw new IndexOutOfBoundsException("Encountered duplicate Filepart copy index: '" + copyindex + "'");
             wrappedDFUFileCopies[copyindex-1] = new DFUFileCopyWrapper(dfufilecopies[i], availableLocations.get(dfufilecopies[i].getLocationIndex()));
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
