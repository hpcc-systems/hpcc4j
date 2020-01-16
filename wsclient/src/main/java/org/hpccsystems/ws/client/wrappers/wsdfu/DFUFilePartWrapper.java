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

import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUFileCopy;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUFilePart;

enum FilePartKind
{
    TLK, DATA
}

public class DFUFilePartWrapper
{
    private Integer              partIndex;
    private DFUFileCopyWrapper[] wrappedDFUFileCopies;
    private FilePartKind         kind = FilePartKind.DATA;

    /**
     * Gets the kind.
     *
     * @return the kind
     */
    public FilePartKind getKind()
    {
        return kind;
    }

    /**
     * Sets the kind.
     *
     * @param kind
     *            the kind to set
     * @return the DFU file part wrapper
     */
    public DFUFilePartWrapper setKind(FilePartKind kind)
    {
        this.kind = kind;
        return this;
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
     * Instantiates a new DFU file part wrapper.
     *
     * @param dfuFilePart
     *            the dfu file part
     * @param availableLocations
     *            the available locations
     */
    public DFUFilePartWrapper(org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFilePart dfuFilePart, Hashtable<Integer, String> availableLocations)
    {
        partIndex = dfuFilePart.getPartIndex();
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileCopy[] dfufilecopies = dfuFilePart.getCopies().getDFUFileCopy();
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
     * @throws Exception
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
     * @throws Exception
     *             the exception
     */
    public DFUFileCopyWrapper[] getCopies() throws Exception
    {
        return wrappedDFUFileCopies;
    }
}
