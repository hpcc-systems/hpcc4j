package org.hpccsystems.ws.client.platform;

import org.hpccsystems.ws.client.gen.wsdfu.v1_36.DFUPart;

/**
 * @author John Holt
 *
 */
public class DFUFilePartInfo extends DFUPart
{

    /**
     * @param raw
     *            the DFUPart object from the web service
     */
    public DFUFilePartInfo(DFUPart raw)
    {
        super(raw.getId(), raw.getCopy(), raw.getActualSize(), raw.getIp(), raw.getPartsize());
    }

    /**
     * @param id
     *            the part number
     * @param copy
     *            is this a copy part
     * @param actualSize
     * @param ip
     *            the IP address of the node holding this part
     * @param partsize
     *            the size of the file part
     */
    public DFUFilePartInfo(Integer id, Integer copy, String actualSize, String ip, String partsize)
    {
        super(id, copy, actualSize, ip, partsize);
    }

}
