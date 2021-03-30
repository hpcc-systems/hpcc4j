package org.hpccsystems.ws.client.wrappers;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XRefFilePartWrapper
{
    private final static String NODE_TAG = "Node";
    private final static String NUM_TAG = "Num";

    private int num;
    private String node;

    public XRefFilePartWrapper(Node wsdfuxrefresp)
    {
        populatefilepart(wsdfuxrefresp);
    }

    private void populatefilepart(Node childNode)
    {
        if (childNode != null)
        {
            NodeList currentPartChildren = childNode.getChildNodes();
            for (int partschildrenindex = 0; partschildrenindex < currentPartChildren.getLength(); partschildrenindex++)
            {
                Node partChildNode = currentPartChildren.item(partschildrenindex);
                String childtagName = partChildNode.getNodeName();

                if (childtagName.equalsIgnoreCase(NUM_TAG))
                {
                    setNum(Integer.valueOf(partChildNode.getTextContent()));
                }
                else if (childtagName.equalsIgnoreCase(NODE_TAG))
                {
                    setNode(partChildNode.getTextContent());
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

    public String getNode()
    {
        return node;
    }

    public void setNode(String node)
    {
        this.node = node;
    }

    @Override
    public String toString()
    {
        return "Num: " + num + " Node: " + node;
    }
}
