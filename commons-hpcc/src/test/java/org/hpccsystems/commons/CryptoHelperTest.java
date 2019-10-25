package org.hpccsystems.commons;

import java.nio.charset.Charset;
import java.util.Random;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.hpccsystems.commons.utils.CryptoHelper;
import org.junit.Assert;
import org.junit.Test;

public class CryptoHelperTest
{
    public String testEncrypt(String secretContent, Cipher cipher)
    {
        String encrypted = CryptoHelper.encrypt(secretContent, cipher);
        Assert.assertNotNull(encrypted);
        Assert.assertFalse("Encrypted value is empty!", encrypted.isEmpty());
        return encrypted;
    }

    public String testDecrypt(String encrypted, Cipher cipher)
    {
        String decryptedvalue = CryptoHelper.decrypt(encrypted, cipher);
        Assert.assertNotNull(decryptedvalue);
        Assert.assertFalse("Decrypted value is empty!", decryptedvalue.isEmpty());

        return decryptedvalue;
    }

    @Test
    public void testCustomCipher()
    {
        //Generating random data as key content, client must keep track of this key in order to decrypt
        byte[] array = new byte[12];
        new Random().nextBytes(array);
        String mysecretkeycontent = new String(array, Charset.forName("UTF-8"));

        final String secretContent = "SECRETTEST!!";

        final String digestAlgo = "SHA-1";
        final String secretKeyAlgo = "AES";
        final String cipherAlgo = "AES";

        SecretKeySpec secretKeySpec = CryptoHelper.createSecretKey(mysecretkeycontent, digestAlgo, secretKeyAlgo); //Caller can create their own secret key spec
        Assert.assertNotNull("Could not create custom secretKeySpec '"+ digestAlgo +"' '" + secretKeyAlgo + "'!", secretKeySpec);

        Cipher someencryptcipher = null;
        try
        {
            someencryptcipher = CryptoHelper.createCipher(secretKeySpec, cipherAlgo, true);
            Assert.assertNotNull("Could not create custom encrypt cipher '"+ digestAlgo +"' '" + secretKeyAlgo + "'!", someencryptcipher);
        }
        catch (Exception e)
        {
            Assert.fail("Could create encrypt cipher: " + e.getLocalizedMessage());
        }

        String testEncrypt = testEncrypt(secretContent, someencryptcipher);

        Cipher somedecryptcipher = null;
        try
        {
            somedecryptcipher = CryptoHelper.createCipher(secretKeySpec, cipherAlgo, false);
            Assert.assertNotNull("Could not create custom encrypt cipher '"+ digestAlgo +"' '" + secretKeyAlgo + "'!", somedecryptcipher);
        }
        catch (Exception e)
        {
            Assert.fail("Could create decrypt cipher: " + e.getLocalizedMessage());
        }

        String decryptedvalue = testDecrypt(testEncrypt, somedecryptcipher);

        Assert.assertTrue("Decrypted value not to original secret value", decryptedvalue.equals(secretContent));
    }

    @Test
    public void testDefaultCryptoAlgo()
    {
        //Generating random data as key content, client must keep track of this key in order to decrypt
        byte[] array = new byte[12];
        new Random().nextBytes(array);
        String mysecretkeycontent = new String(array, Charset.forName("UTF-8"));

        final String secretContent = "SECRETTEST!!";

        SecretKeySpec secretKeySpec = CryptoHelper.createSHA512AESSecretKey(mysecretkeycontent);
        Assert.assertNotNull("Could not create default secretKeySpec!", secretKeySpec);

        Cipher someencryptcipher = null;
        try
        {
            someencryptcipher = CryptoHelper.createDefaultCipher(secretKeySpec, true);
            Assert.assertNotNull("Could not create default cipher!", someencryptcipher);
        }
        catch (Exception e)
        {
            Assert.fail("Could create encrypt cipher: " + e.getLocalizedMessage());
        }

        String encrypted = testEncrypt(secretContent, someencryptcipher);

        Cipher somedecryptcipher = null;
        try
        {
            somedecryptcipher = CryptoHelper.createDefaultCipher(secretKeySpec, false);
            Assert.assertNotNull("Could not create default encrypt cipher!", somedecryptcipher);
        }
        catch (Exception e)
        {
            Assert.fail("Could create decrypt cipher: " + e.getLocalizedMessage());
        }

        String decryptedvalue = testDecrypt(encrypted, somedecryptcipher);

        Assert.assertTrue("Decrypted value not to original secret value", decryptedvalue.equals(secretContent));
    }
}
