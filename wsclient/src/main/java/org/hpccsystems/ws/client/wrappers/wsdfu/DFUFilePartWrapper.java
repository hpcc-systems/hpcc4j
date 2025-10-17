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

import org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileCopy;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFilePart;
/*
enum FilePartKind
{
    TLK, DATA
}
*/
/**
 * <p>DFUFilePartWrapper class.</p>
 *
 */
public class DFUFilePartWrapper
{
    private Integer              partIndex;
    private DFUFileCopyWrapper[] wrappedDFUFileCopies;
    private boolean				 topLevelKey = false;

    /**
     * Is this part a Top level key
     *
     * @return a boolean.
     */
    public boolean isTopLevelKey()
    {
		return topLevelKey;
	}

    /**
     * Instantiates a new DFU file part wrapper.
     *
     * @param dfuFilePart
     *            the dfu file part
     * @param availableLocations
     *            the available locations
     */
    public DFUFilePartWrapper(DFUFilePart dfuFilePart, Hashtable<Integer, String> availableLocations)
    {
        partIndex = dfuFilePart.getPartIndex();
        topLevelKey = dfuFilePart.getTopLevelKey();
        DFUFileCopy[] dfufilecopies = dfuFilePart.getCopies().getDFUFileCopy();
        wrappedDFUFileCopies = new DFUFileCopyWrapper[dfufilecopies.length];
        for (int i = 0; i < dfufilecopies.length; i++)
        {
            Integer copyindex = dfufilecopies[i].getCopyIndex();
            if (copyindex == null || copyindex < 1 || copyindex > dfufilecopies.length)
                throw new IndexOutOfBoundsException("Encountered invalid Filepart Copy index: '" + copyindex + "'");

            if (wrappedDFUFileCopies[copyindex - 1] != null)
                throw new IndexOutOfBoundsException("Encountered duplicate Filepart copy index: '" + copyindex + "'");
            wrappedDFUFileCopies[copyindex - 1] = new DFUFileCopyWrapper(dfufilecopies[i],
                    availableLocations.get(dfufilecopies[i].getLocationIndex()));
        }
    }



    /**
     * Gets the part index.
     *
     * @return the part index
     * @throws java.lang.Exception
     *             the exception
     */
    public Integer getPartIndex() throws Exception
    {

        return partIndex;
    }

    /**
     * Gets the copies.
     *
     * @return the copies
     * @throws java.lang.Exception
     *             the exception
     */
    public DFUFileCopyWrapper[] getCopies() throws Exception
    {
        return wrappedDFUFileCopies;
    }
}
