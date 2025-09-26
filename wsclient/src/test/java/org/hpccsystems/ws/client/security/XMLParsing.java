package org.hpccsystems.ws.client.security;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.hpccsystems.ws.client.utils.Utils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.xml.sax.SAXException;

@Category(org.hpccsystems.commons.annotations.BaseTests.class)
public class XMLParsing
{
    final static String externalEntityFile = "src/test/resources/security/externalentity.xml";
    final static String xxeFile = "src/test/resources/security/xxe.xml";
    final static String localfilexxe = "src/test/resources/security/localfilexxe.xml";
    final static String millionLaughsFile = "src/test/resources/security/millionlaughs.xml";


    /*
     * Illustrates security vulnerable XML parsing:
     *
    @Test
    public void unsafeXXETest() throws XPathExpressionException, ParserConfigurationException, SAXException, IOException
    {
        try
        {
        File uploadFile = new File(xxeFile);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbFactory.newDocumentBuilder();
        db.parse(uploadFile);
        }
catch (SAXException e)
        {
            Assert.assertTrue("Unexpected SAXEception message detected, ensure DOCTYPE is disallowed and the feature \"http://apache.org/xml/features/disallow-doctype-decl\" set to true ", e.getMessage().equals("DOCTYPE is disallowed when the feature \"http://apache.org/xml/features/disallow-doctype-decl\" set to true."));
        }

        Assert.fail("Unsafe XML entity expansion detected - should explicitely avoid use Utils.newSafeXMLDocBuilder!");
    }*/

    @Test
    public void saferXXETest() throws XPathExpressionException, ParserConfigurationException, SAXException, IOException
    {
        try
        {
            File uploadFile = new File(xxeFile);
            Utils.newSafeXMLDocBuilder().parse(uploadFile);

            Assert.fail("SAXEception expected! Ensure DOCTYPE is disallowed and the feature \"http://apache.org/xml/features/disallow-doctype-decl\" set to true");
        }
        catch (SAXException e)
        {
            Assert.assertTrue("Unexpected SAXEception message detected, ensure DOCTYPE is disallowed and the feature \"http://apache.org/xml/features/disallow-doctype-decl\" set to true ", e.getMessage().equals("DOCTYPE is disallowed when the feature \"http://apache.org/xml/features/disallow-doctype-decl\" set to true."));
        }
    }


    /*
     * Illustrates security vulnerable XML parsing:
     *
     *@Test
    public void unsafeExternalentityTest() throws XPathExpressionException, ParserConfigurationException, SAXException, IOException
    {
        try
        {
            File uploadFile = new File(externalEntityFile);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbFactory.newDocumentBuilder();
            db.parse(uploadFile);
        }
        catch (SAXException e)
        {
            Assert.assertTrue("Unexpected SAXEception message detected, ensure DOCTYPE is disallowed and the feature \"http://apache.org/xml/features/disallow-doctype-decl\" set to true ", e.getMessage().equals("DOCTYPE is disallowed when the feature \"http://apache.org/xml/features/disallow-doctype-decl\" set to true."));
        }
    }*/

    @Test
    public void saferExternalentityTest() throws XPathExpressionException, ParserConfigurationException, SAXException, IOException
    {
        try
        {
            File uploadFile = new File(externalEntityFile);
            Utils.newSafeXMLDocBuilder().parse(uploadFile);

            Assert.fail("SAXEception expected! Ensure DOCTYPE is disallowed and the feature \"http://apache.org/xml/features/disallow-doctype-decl\" set to true");
        }
        catch (SAXException e)
        {
            Assert.assertTrue("Unexpected SAXEception message detected, ensure DOCTYPE is disallowed and the feature \"http://apache.org/xml/features/disallow-doctype-decl\" set to true ", e.getMessage().equals("DOCTYPE is disallowed when the feature \"http://apache.org/xml/features/disallow-doctype-decl\" set to true."));
        }
    }

    @Test(expected = SAXException.class)
    public void unsafeMillionLaughsTest() throws IOException, ParserConfigurationException, SAXException
    {
        File uploadFile = new File(millionLaughsFile);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbFactory.newDocumentBuilder();
        db.parse(uploadFile);

        //Modern JDKs should restrict unlimited XML entity expansion with SAXException:
        //AXP00010001: The parser has encountered more than "64000" entity expansions in this document; this is the limit imposed by the JDK.
        Assert.fail("Unlimited XML entity expansion detected - should explicitely avoid and modern JDK should be targeted!");
    }

    @Test
    public void noEntityExpansionTest() throws XPathExpressionException, ParserConfigurationException, SAXException, IOException
    {
        try
        {
            File uploadFile = new File(millionLaughsFile);
            Utils.newSafeXMLDocBuilder().parse(uploadFile);

            Assert.fail("SAXEception expected! Ensure DOCTYPE is disallowed and the feature \"http://apache.org/xml/features/disallow-doctype-decl\" set to true");
        }
        catch (SAXException e)
        {
            Assert.assertTrue("Unexpected SAXEception message detected, ensure DOCTYPE is disallowed and the feature \"http://apache.org/xml/features/disallow-doctype-decl\" set to true ", e.getMessage().equals("DOCTYPE is disallowed when the feature \"http://apache.org/xml/features/disallow-doctype-decl\" set to true."));
        }
    }


    /*
     * Illustrates security vulnerable XML parsing:
     *
    @Test
    public void unsafeLocalFileXXETest() throws XPathExpressionException, ParserConfigurationException, SAXException, IOException
    {
        try
        {
             File uploadFile = new File(localfilexxe);
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder db = dbFactory.newDocumentBuilder();
                db.parse(uploadFile);
        }
        catch (SAXException e)
        {
            Assert.assertTrue("Unexpected SAXEception message detected, ensure DOCTYPE is disallowed and the feature \"http://apache.org/xml/features/disallow-doctype-decl\" set to true ", e.getMessage().equals("DOCTYPE is disallowed when the feature \"http://apache.org/xml/features/disallow-doctype-decl\" set to true."));
        }
    }*/

    @Test
    public void saferLocalFileXXETest() throws XPathExpressionException, ParserConfigurationException, SAXException, IOException
    {
        try
        {
            File uploadFile = new File(localfilexxe);
            Utils.newSafeXMLDocBuilder().parse(uploadFile);

            Assert.fail("SAXEception expected! Ensure DOCTYPE is disallowed and the feature \"http://apache.org/xml/features/disallow-doctype-decl\" set to true");
        }
        catch (SAXException e)
        {
            Assert.assertTrue("Unexpected SAXEception message detected, ensure DOCTYPE is disallowed and the feature \"http://apache.org/xml/features/disallow-doctype-decl\" set to true ", e.getMessage().equals("DOCTYPE is disallowed when the feature \"http://apache.org/xml/features/disallow-doctype-decl\" set to true."));
        }
    }
}
