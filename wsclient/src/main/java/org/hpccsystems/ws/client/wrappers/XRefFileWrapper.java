package org.hpccsystems.ws.client.wrappers;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XRefFileWrapper
{
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
                if (tagName.equalsIgnoreCase("Partsfound"))
                {
                    setPartsfound(Integer.valueOf(childNode.getTextContent()));
                }
                else if (tagName.equalsIgnoreCase("Partmask"))
                {
                    setPartmask(childNode.getTextContent());
                }
                else if (tagName.equalsIgnoreCase("Size"))
                {
                    setSize(Long.valueOf(childNode.getTextContent()));
                }
                else if (tagName.equalsIgnoreCase("Modified"))
                {
                    setModified(childNode.getTextContent());
                }
                else if (tagName.equalsIgnoreCase("Numparts"))
                {
                    setNumparts(Integer.valueOf(childNode.getTextContent()));
                }
                else if (tagName.equalsIgnoreCase("Part"))
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
