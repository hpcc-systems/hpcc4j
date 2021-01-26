package org.hpccsystems.ws.client.wrappers;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XRefNodeWrapper
{
    protected String name = null;
    protected String modified = null;
    protected String status = null;

    public XRefNodeWrapper (String name, String modified, String status)
    {
        this.name = name;
        this.modified = modified;
        this.status = status;
    }

    public XRefNodeWrapper (Node xrefnode)
    {
        populatenode(xrefnode);
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setModified(String modified)
    {
        this.modified = modified;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getName()
    {
        return name;
    }

    public String getModified()
    {
        return modified;
    }

    public String getStatus()
    {
        return status;
    }

    private void populatenode (Node currentNode)
    {
        if (currentNode != null)
        {
            try
            {
                NodeList currentChildren = currentNode.getChildNodes();

                for (int childindex = 0; childindex < currentChildren.getLength(); childindex++)
                {
                    Node childNode = currentChildren.item(childindex);
                    String tagName = childNode.getNodeName();
                    if (tagName.equalsIgnoreCase("name"))
                    {
                        setName(childNode.getTextContent());
                    }
                    else if (tagName.equalsIgnoreCase("status"))
                    {
                        setStatus(childNode.getTextContent());
                    }
                    else if (tagName.equalsIgnoreCase("modified"))
                    {
                        setModified(childNode.getTextContent());
                    }
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String toString()
    {
        return "Name: " + name + " Modified: " + modified + " Status: " + status;
    }
}
