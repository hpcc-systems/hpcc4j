package org.hpccsystems.ws.client.wrappers;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XRefMessageWrapper
{
    private final static String TEXT_TAG = "text";
    private final static String FILE_TAG = "file";

    protected String text = null;
    protected String file = null;
    protected String type = null;

    public XRefMessageWrapper (Node xrefnode)
    {
        populatemessage(xrefnode);
    }

    public void setText(String text)
    {
        this.text = text;
    }

    public void setFile(String file)
    {
        this.file = file;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getText()
    {
        return text;
    }

    public String getFile()
    {
        return file;
    }

    public String getType()
    {
        return type;
    }

    private void populatemessage (Node currentNode)
    {
        if (currentNode != null)
        {
            try
            {
                NodeList currentChildren = currentNode.getChildNodes();
                setType(currentNode.getNodeName());
                for (int childindex = 0; childindex < currentChildren.getLength(); childindex++)
                {
                    Node childNode = currentChildren.item(childindex);
                    String tagName = childNode.getNodeName();
                    if (tagName.equalsIgnoreCase(TEXT_TAG))
                    {
                        setText(childNode.getTextContent());
                    }
                    else if (tagName.equalsIgnoreCase(FILE_TAG))
                    {
                        setFile(childNode.getTextContent());
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
        return "Type: " + type + " File: " + file + " Text: " + text;
    }
}
