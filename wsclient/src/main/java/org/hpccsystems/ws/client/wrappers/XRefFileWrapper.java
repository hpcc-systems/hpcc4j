package org.hpccsystems.ws.client.wrappers;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XRefFileWrapper
{
    private final static String PARTS_FOUND_TAG = "Partsfound";
    private final static String PART_MASK_TAG = "Partmask";
    private final static String SIZE_TAG = "Size";
    private final static String MODIFIED_TAG = "Modified";
    private final static String NUM_PARTS_TAG = "Numparts";
    private final static String PART_TAG = "Part";

    private int partsfound = -1;
    private String partmask = null;
    private long size = -1;
    private String modified = null;
    private int numparts = -1;
    private List<XRefFilePartWrapper> parts = new ArrayList<XRefFilePartWrapper>();

    public XRefFileWrapper (Node xreffilenode)
    {
        populatefile(xreffilenode);
    }

    public int getPartsfound()
    {
        return partsfound;
    }

    public void setPartsfound(int partsfound)
    {
        this.partsfound = partsfound;
    }

    public String getPartmask()
    {
        return partmask;
    }

    public void setPartmask(String partmask)
    {
        this.partmask = partmask;
    }

    public long getSize()
    {
        return size;
    }

    public void setSize(long size)
    {
        this.size = size;
    }

    public String getModified()
    {
        return modified;
    }

    public void setModified(String modified)
    {
        this.modified = modified;
    }

    public int getNumparts()
    {
        return numparts;
    }

    public void setNumparts(int numparts)
    {
        this.numparts = numparts;
    }

    public void addPart(XRefFilePartWrapper part)
    {
        parts.add(part);
    }

    private void populatefile(Node currentNode)
    {
        try
        {
            NodeList currentChildren = currentNode.getChildNodes();

            for (int childindex = 0; childindex < currentChildren.getLength(); childindex++)
            {
                Node childNode = currentChildren.item(childindex);
                String tagName = childNode.getNodeName();
                if (tagName.equalsIgnoreCase(PARTS_FOUND_TAG))
                {
                    setPartsfound(Integer.valueOf(childNode.getTextContent()));
                }
                else if (tagName.equalsIgnoreCase(PART_MASK_TAG))
                {
                    setPartmask(childNode.getTextContent());
                }
                else if (tagName.equalsIgnoreCase(SIZE_TAG))
                {
                    setSize(Long.valueOf(childNode.getTextContent()));
                }
                else if (tagName.equalsIgnoreCase(MODIFIED_TAG))
                {
                    setModified(childNode.getTextContent());
                }
                else if (tagName.equalsIgnoreCase(NUM_PARTS_TAG))
                {
                    setNumparts(Integer.valueOf(childNode.getTextContent()));
                }
                else if (tagName.equalsIgnoreCase(PART_TAG))
                {
                    addPart(new XRefFilePartWrapper(childNode));
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public String toString()
    {
        String out = "XRefFile:\n\tPartsfound: " + partsfound + "\n\tPartmask: " + partmask + "\n\tSize: " + size + "\n\tModified: " + modified + "\n\tNumparts: " + numparts;
        out += "\n\tParts: [";

        for (XRefFilePartWrapper xRefFilePartWrapper : parts)
        {
            out += " " + xRefFilePartWrapper.toString();
        }
        out += "]\n";

        return out;
    }
}
