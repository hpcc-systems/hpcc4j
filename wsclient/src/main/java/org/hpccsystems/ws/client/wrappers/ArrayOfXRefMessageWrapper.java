package org.hpccsystems.ws.client.wrappers;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class ArrayOfXRefMessageWrapper
{
    protected List<XRefMessageWrapper> messages = null;
    protected String cluster = null;

    private final static String WARNING_TAG = "Warning";
    private final static String ERROR_TAG = "Error";
    private final static String CLUSTER_TAG = "Cluster";

    public String getCluster()
    {
        return cluster;
    }

    public ArrayOfXRefMessageWrapper (String response)
    {
        messages = new ArrayList<XRefMessageWrapper>();

        if (response != null)
        {
            try
            {
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

                Document doc = dBuilder.parse(new ByteArrayInputStream(response.getBytes("UTF-8")));

                NodeList xrefnodelist = doc.getElementsByTagName(WARNING_TAG); //there could be others, info?

                for (int index = 0; index < xrefnodelist.getLength(); index++)
                {
                    messages.add(new XRefMessageWrapper(xrefnodelist.item(index)));
                }

                xrefnodelist = doc.getElementsByTagName(ERROR_TAG); //there could be others, info?

                for (int index = 0; index < xrefnodelist.getLength(); index++)
                {
                    messages.add(new XRefMessageWrapper(xrefnodelist.item(index)));
                }

                xrefnodelist = doc.getElementsByTagName(CLUSTER_TAG);
                if(xrefnodelist.getLength() > 0)
                    cluster = xrefnodelist.item(0).getTextContent();

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
        String out = "XRefMessages (cluster: '" + cluster + "'):\n";
        for (XRefMessageWrapper message : messages)
        {
            out += "\t" + message.toString() + "\n";
        }

        return out;
    }
}
