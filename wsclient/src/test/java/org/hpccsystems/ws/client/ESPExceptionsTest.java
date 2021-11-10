package org.hpccsystems.ws.client;

import org.hpccsystems.ws.client.gen.axis2.wssql.latest.ArrayOfECLException;
import org.hpccsystems.ws.client.gen.axis2.wssql.latest.ECLException;
import org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfEspException;
import org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspException;
import org.hpccsystems.ws.client.wrappers.ArrayOfECLExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.ECLExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.EspExceptionWrapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(org.hpccsystems.commons.annotations.BaseTests.class)
public class ESPExceptionsTest
{

    @Test
    public void basicarrayofespexceptiontest()
    {
        final String wsclientmessage = "Fake Exception created for WsClient Junit Test";
        final String arraysource = "wsclient test";
        final String audience = "User";
        final String code = "999";
        final String mess = "Fake ESP Exception";
        final String source = "MyEsp.mymethod";
        try
        {
            ArrayOfEspException arrayOfEspException = new ArrayOfEspException();

            arrayOfEspException.setSource(arraysource);
            EspException espexception = new EspException();
            espexception.setAudience(audience);
            espexception.setCode(code);
            espexception.setMessage(mess);
            espexception.setSource(source);
            
            arrayOfEspException.addException(espexception);
            throw new ArrayOfEspExceptionWrapper(arrayOfEspException).setWsClientMessage(wsclientmessage);
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.assertNotNull(e.toString());
            System.out.println(e.toString());
            Assert.assertEquals(wsclientmessage, e.getWsClientMessage());
            Assert.assertEquals(wsclientmessage + ":" + mess, e.getLocalizedMessage());
            Assert.assertEquals(wsclientmessage + ":" + mess, e.getMessage());
            Assert.assertEquals(arraysource, e.getSource());
            Assert.assertNotNull(e.getStackTrace());

            Assert.assertNotNull(e.getExceptions());
            EspExceptionWrapper espExceptionWrapper = e.getEspExceptions().get(0);

            Assert.assertNotNull(espExceptionWrapper);
            Assert.assertEquals(audience, espExceptionWrapper.getAudience());
            Assert.assertEquals(code, espExceptionWrapper.getCode());
            Assert.assertEquals(mess, espExceptionWrapper.getMessage());
            Assert.assertEquals(source, espExceptionWrapper.getSource());
            Assert.assertNull(e.getCause());
        }
    }

    @Test
    public void basicarrayofeclexceptiontest()
    {
        final String wsclientmessage = "Fake Exception created for WsClient Junit Test";
        final String mess = "FAKE: something went ECL wrong";
        final String source = "Roxie.query";
        final int activity = 1;
        final int col = 476;
        final String filename = "myfile.ecl";
        final int linenum = 87;
        final int prio = 99;
        final int code = -1;
        final String scope = "myscope";
        final String severity = "not very";
        try
        {
            ArrayOfECLException arrayOfEclException = new ArrayOfECLException();
            ECLException eclexception = new ECLException();

            eclexception.setActivity(activity);
            eclexception.setColumn(col);
            eclexception.setFileName(filename);
            eclexception.setLineNo(linenum);
            eclexception.setPriority(prio);
            eclexception.setMessage(mess);
            eclexception.setSource(source);
            eclexception.setSeverity(severity);
            eclexception.setScope(scope);
            eclexception.setCode(code);
            
            arrayOfEclException.addECLException(eclexception);

            throw new ArrayOfECLExceptionWrapper(arrayOfEclException).setWsClientMessage(wsclientmessage);
        }
        catch (ArrayOfECLExceptionWrapper e)
        {
            Assert.assertNotNull(e.toString());
            System.out.println(e.toString());
            Assert.assertEquals(wsclientmessage, e.getWsClientMessage());
            Assert.assertNotNull(e.getStackTrace());

            Assert.assertNotNull(e.getECLException());
            ECLExceptionWrapper espExceptionWrapper = e.getECLException().get(0);
            Assert.assertNotNull(espExceptionWrapper);
            Assert.assertEquals(activity, espExceptionWrapper.getActivity());
            Assert.assertEquals(code, espExceptionWrapper.getCode());
            Assert.assertEquals(col, espExceptionWrapper.getColumn());
            Assert.assertEquals(source, espExceptionWrapper.getSource());
            Assert.assertEquals(filename, espExceptionWrapper.getFileName());
            Assert.assertEquals(linenum, espExceptionWrapper.getLineNo());
            Assert.assertEquals(prio, espExceptionWrapper.getPriority());
            Assert.assertEquals(code, espExceptionWrapper.getCode());
            Assert.assertEquals(scope, espExceptionWrapper.getScope());
            Assert.assertEquals(severity, espExceptionWrapper.getSeverity());
            Assert.assertNull(e.getCause());
        }
    }
}
