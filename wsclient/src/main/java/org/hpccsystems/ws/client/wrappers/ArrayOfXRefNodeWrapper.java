package org.hpccsystems.ws.client.wrappers;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ArrayOfXRefNodeWrapper
{
    private final static String NODES_TAG = "XRefNodes";
    private final static String NODE_TAG = "XRefNode";

    protected List<XRefNodeWrapper> nodes = null;

    public ArrayOfXRefNodeWrapper (String response)
    {
        nodes = new ArrayList<XRefNodeWrapper>();

        if (response != null && !response.isEmpty())
        {
            try
            {
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

                Document doc = dBuilder.parse(new ByteArrayInputStream(response.getBytes("UTF-8")));

                NodeList xrefnodes = doc.getElementsByTagName(NODES_TAG);
                if (xrefnodes.getLength() > 0)
                {
                    NodeList xrefnodelist = xrefnodes.item(0).getChildNodes(); //we're only going to work on the first xrefnodes element
                    for (int index = 0; index < xrefnodelist.getLength(); index++)
                    {
                        Node currentNode = xrefnodelist.item(index);
                        if (currentNode.getNodeName().equals(NODE_TAG))
                            nodes.add(new XRefNodeWrapper(currentNode));
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
        String out = "XRefNodes:\n";
        for (XRefNodeWrapper xRefNodeWrapper : nodes)
        {
            out += "\t" + xRefNodeWrapper.toString() + "\n";
        }

        return out;
    }
}
