package org.hpccsystems.ws.client.wrappers;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ArrayOfXRefDirectoryWrapper
{
    private List<XRefDirectoryWrapper> directories = null;
    private String cluster = null;

    public ArrayOfXRefDirectoryWrapper(String wsdfuxrefresponse)
    {
        directories = new ArrayList<XRefDirectoryWrapper>();
        if (wsdfuxrefresponse != null)
        {
            try
            {
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

                Document doc = dBuilder.parse(new ByteArrayInputStream(wsdfuxrefresponse.getBytes("UTF-8")));
                NodeList xrefnodelist = doc.getElementsByTagName("Cluster");
                if (xrefnodelist.getLength() > 0)
                {
                    cluster = xrefnodelist.item(0).getTextContent();
                }

                xrefnodelist = doc.getElementsByTagName("Directory");

                for (int index = 0; index < xrefnodelist.getLength(); index++)
                {
                    Node currentNode = xrefnodelist.item(index);
                    directories.add(new XRefDirectoryWrapper(currentNode));
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    public List<XRefDirectoryWrapper> getDirectories()
    {
        return directories;
    }

    public void addDirectory(XRefDirectoryWrapper dir)
    {
        directories.add(dir);
    }

    @Override
    public String toString()
    {
        String out = "Cluster: "+ cluster + "\nDirectories:\n";
        for (XRefDirectoryWrapper xRefDirectoryWrapper : directories)
        {
            out += "\t" + xRefDirectoryWrapper.toString() + "\n";
        }
        return out;
    }
}
