package org.hpccsystems.ws.client.wrappers;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class ArrayOfXRefFileWrapper
{
    private final static String FILE_TAG = "File";
    private List<XRefFileWrapper> files = null;

    public ArrayOfXRefFileWrapper(String wsdfuxrefresp)
    {
        files = new ArrayList<XRefFileWrapper>();

        if (wsdfuxrefresp != null)
        {
            try
            {
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

                Document doc = dBuilder.parse(new ByteArrayInputStream(wsdfuxrefresp.getBytes("UTF-8")));

                NodeList xrefnodelist = doc.getElementsByTagName(FILE_TAG);
                for (int index = 0; index < xrefnodelist.getLength(); index++)
                {
                    files.add(new XRefFileWrapper(xrefnodelist.item(index)));
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
        String out = "XRefFiles:\n";

        for (XRefFileWrapper xRefFileWrapper : files)
        {
            out += xRefFileWrapper.toString() + "\n";
        }

        return out;
    }
}
