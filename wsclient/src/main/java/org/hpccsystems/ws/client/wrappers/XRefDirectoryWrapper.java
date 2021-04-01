package org.hpccsystems.ws.client.wrappers;

import java.io.ByteArrayInputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XRefDirectoryWrapper
{
    private final static String DIRECTORY_TAG = "Directory";
    private final static String NUM_TAG = "Num";
    private final static String NAME_TAG = "Name";
    private final static String NEG_SKEW_TAG = "NegativeSkew";
    private final static String MAX_SIZE_TAG = "MaxSize";
    private final static String MAX_IP_TAG = "MaxIP";
    private final static String MIN_SIZE_TAG = "MinSize";
    private final static String SIZE_TAG = "Size";
    private final static String POS_SKEW_TAG = "PositiveSkew";
    private final static String MIN_IP_TAG = "MinIP";

    private int num = -1;
    private String name = null;
    private String negativeskew = null;
    private long maxsize = -1;
    private String maxip = null;
    private long minsize = -1;
    private long size = -1;
    private String positiveskew = null;
    private String minip = null;

    public XRefDirectoryWrapper(String wsdfuxrefresp)
    {
        if (wsdfuxrefresp != null && !wsdfuxrefresp.isEmpty())
        {
            try
            {
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

                Document doc = dBuilder.parse(new ByteArrayInputStream(wsdfuxrefresp.getBytes("UTF-8")));

                NodeList xrefnodelist = doc.getElementsByTagName(DIRECTORY_TAG);

                if (xrefnodelist.getLength() > 0)
                {
                    populateDirectory(xrefnodelist.item(0));
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    public XRefDirectoryWrapper(Node directorynode)
    {
        populateDirectory(directorynode);
    }

    private void populateDirectory(Node directorynode)
    {
        if (directorynode != null)
        {
            NodeList currentChildren = directorynode.getChildNodes();
            for (int childindex = 0; childindex < currentChildren.getLength(); childindex++)
            {
                Node currentnodetag = currentChildren.item(childindex);
                String tagName = currentnodetag.getNodeName();
                if (tagName.equalsIgnoreCase(NUM_TAG))
                {
                    setNum(Integer.valueOf(currentnodetag.getTextContent()));
                }
                else if (tagName.equalsIgnoreCase(NAME_TAG))
                {
                    setName(currentnodetag.getTextContent());
                }
                else if (tagName.equalsIgnoreCase(NEG_SKEW_TAG))
                {
                    setNegativeskew(currentnodetag.getTextContent());
                }
                else if (tagName.equalsIgnoreCase(MAX_SIZE_TAG))
                {
                    setMaxsize(Long.valueOf(currentnodetag.getTextContent()));
                }
                else if (tagName.equalsIgnoreCase(MAX_IP_TAG))
                {
                    setMaxip(currentnodetag.getTextContent());
                }
                else if (tagName.equalsIgnoreCase(MIN_SIZE_TAG))
                {
                    setMinsize(Long.valueOf(currentnodetag.getTextContent()));
                }
                else if (tagName.equalsIgnoreCase(SIZE_TAG))
                {
                    setSize(Long.valueOf(currentnodetag.getTextContent()));
                }
                else if (tagName.equalsIgnoreCase(POS_SKEW_TAG))
                {
                    setPositiveskew(currentnodetag.getTextContent());
                }
                else if (tagName.equalsIgnoreCase(MIN_IP_TAG))
                {
                    setMinip(currentnodetag.getTextContent());
                }
            }
        }
    }
    public int getNum()
    {
        return num;
    }

    public void setNum(int num)
    {
        this.num = num;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getNegativeskew()
    {
        return negativeskew;
    }

    public void setNegativeskew(String negativeskew)
    {
        this.negativeskew = negativeskew;
    }

    public long getMaxsize()
    {
        return maxsize;
    }

    public void setMaxsize(long maxsize)
    {
        this.maxsize = maxsize;
    }

    public String getMaxip()
    {
        return maxip;
    }

    public void setMaxip(String maxip)
    {
        this.maxip = maxip;
    }

    public long getMinsize()
    {
        return minsize;
    }

    public void setMinsize(long minsize)
    {
        this.minsize = minsize;
    }

    public long getSize()
    {
        return size;
    }

    public void setSize(long size)
    {
        this.size = size;
    }

    public String getPositiveskew()
    {
        return positiveskew;
    }

    public void setPositiveskew(String positiveskew)
    {
        this.positiveskew = positiveskew;
    }

    public String getMinip()
    {
        return minip;
    }

    public void setMinip(String minip)
    {
        this.minip = minip;
    }

    @Override
    public String toString()
    {
        return "Num: " + num + " Name: " + name + " NegativeSkew: " + " MaxSize: " + maxsize + " MaxIP: " + maxip + " MinSize: " + minsize + " Size: " + size + " PositiveSkew: " + positiveskew + " MinIP: " + minip;
    }
}
