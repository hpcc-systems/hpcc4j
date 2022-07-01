package org.hpccsystems.ws.client.utils;

import static org.junit.Assert.*;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.junit.Test;

public class Security
{
    @Test
    public void testXMLExternalEntityDocBuilderFactorySuppressionSettings() throws XPathExpressionException, ParserConfigurationException 
    {
        DocumentBuilderFactory safefactory = Utils.newSafeXMLDocBuilderFactory();
        assertTrue("XML DocBuilder Factory attribute 'XMLConstants.FEATURE_SECURE_PROCESSING' not set to TRUE!", safefactory.getAttribute(XMLConstants.FEATURE_SECURE_PROCESSING) == Boolean.TRUE);
        Object accessExternalDTDAttribute = safefactory.getAttribute(XMLConstants.ACCESS_EXTERNAL_DTD);
        assertTrue("XML DocBuilder Factory attribute 'XMLConstants.ACCESS_EXTERNAL_DTD' not set to \"\"!", accessExternalDTDAttribute != null && accessExternalDTDAttribute.equals(""));
        Object accessExternalSchemaAttribute = safefactory.getAttribute(XMLConstants.ACCESS_EXTERNAL_SCHEMA);
        assertTrue("XML DocBuilder Factory attribute 'XMLConstants.ACCESS_EXTERNAL_SCHEMA' not set to \"\"!", accessExternalSchemaAttribute != null && accessExternalSchemaAttribute.equals(""));
        assertTrue("XML DocBuilder Factory 'http://apache.org/xml/features/disallow-doctype-decl' not set to TRUE!", safefactory.getFeature("http://apache.org/xml/features/disallow-doctype-decl"));
        assertFalse("XML DocBuilder Factory 'http://xml.org/sax/features/external-general-entities' not set to FALSE!", safefactory.getFeature("http://xml.org/sax/features/external-general-entities"));
        assertFalse("XML DocBuilder Factory 'http://xml.org/sax/features/external-parameter-entities' not set to FALSE!", safefactory.getFeature( "http://xml.org/sax/features/external-parameter-entities"));
        assertFalse("XML DocBuilder Factory 'http://apache.org/xml/features/nonvalidating/load-external-dtd' not set to FALSE!", safefactory.getFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd"));
        assertFalse("XML DocBuilder Factory 'ExpandEntityReferences' not set to FALSE!", safefactory.isExpandEntityReferences());
        assertFalse("XML DocBuilder Factory 'XIncludeAware' not set to FALSE!", safefactory.isXIncludeAware());
    }

    @Test
    public void testXMLExternalEntityDocBuilderSuppressionSettings() throws XPathExpressionException, ParserConfigurationException 
    {
        DocumentBuilder xmldocparser = Utils.newSafeXMLDocBuilder();
        assertFalse("XML DocBuilder 'XIncludeAware' not set to FALSE!", xmldocparser.isXIncludeAware());
    }
}
