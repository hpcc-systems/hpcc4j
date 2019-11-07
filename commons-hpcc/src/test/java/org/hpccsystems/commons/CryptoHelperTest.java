package org.hpccsystems.commons;

import java.nio.charset.Charset;
import java.util.Random;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.hpccsystems.commons.utils.CryptoHelper;
import org.hpccsystems.commons.utils.DigestAlgorithmType;
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

        final DigestAlgorithmType digestAlgo = DigestAlgorithmType.SHA1;
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

    @Test
    public void testDigestCryptoAlgoEnum()
    {
        DigestAlgorithmType algo = DigestAlgorithmType.MD2;
        Assert.assertNotNull(algo);
        Assert.assertTrue("DigestAlgorithType MD2 name is invalid", "MD2".equals(algo.getName()));
        algo = DigestAlgorithmType.MD5;
        Assert.assertNotNull(algo);
        Assert.assertTrue("DigestAlgorithType MD5 name is invalid", "MD5".equals(algo.getName()));
        algo = DigestAlgorithmType.SHA1;
        Assert.assertNotNull(algo);
        Assert.assertTrue("DigestAlgorithType SHA1 name is invalid", "SHA-1".equals(algo.getName()));
        algo = DigestAlgorithmType.SHA256;
        Assert.assertNotNull(algo);
        Assert.assertTrue("DigestAlgorithType SHA256 name is invalid", "SHA-256".equals(algo.getName()));
        algo = DigestAlgorithmType.SHA384;
        Assert.assertNotNull(algo);
        Assert.assertTrue("DigestAlgorithType SHA384 name is invalid", "SHA-384".equals(algo.getName()));
        algo = DigestAlgorithmType.SHA512;
        Assert.assertNotNull(algo);
        Assert.assertTrue("DigestAlgorithType SHA512 name is invalid", "SHA-512".equals(algo.getName()));
    }

    @Test
    public void testCipherCompare()
    {
        final String digestInput = "12323423*&^";
        String secret = "ForMyEyesOnLY!";


        byte[] array = new byte[12];
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));

        System.out.println("Generated key content: " + generatedString);

        SecretKeySpec sha512aesSecretKey = CryptoHelper.createSHA512AESSecretKey(digestInput);
        /*Create your own cipher*/
        Cipher encryptCipher = null;
        try
        {
            encryptCipher = CryptoHelper.createCipher(sha512aesSecretKey, "AES", true);
            Assert.assertNotNull(encryptCipher);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail("Could not create AES sha-512 encrypt cipher");
        }
        String encryptedString = CryptoHelper.encrypt(secret, encryptCipher);

        Cipher decryptCipher=null;
        try
        {
            decryptCipher = CryptoHelper.createCipher(sha512aesSecretKey, "AES", false);
            Assert.assertNotNull(decryptCipher);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail("Could not create AES sha-512 decrypt cipher");
        }
        String decryptedString = CryptoHelper.decrypt(encryptedString, decryptCipher) ;

        /*Create default cipher*/
        try
        {
            encryptCipher = CryptoHelper.createDefaultCipher(sha512aesSecretKey, true);
            Assert.assertNotNull(encryptCipher);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail("Could not create default encrypt cipher");
        }
        String encryptedDefaultCipherString = CryptoHelper.encrypt(secret, encryptCipher);

        try
        {
            decryptCipher = CryptoHelper.createDefaultCipher(sha512aesSecretKey, false);
            Assert.assertNotNull(encryptCipher);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail("Could not create default decrypt cipher");
        }

        String decryptedDefaultCipherString = CryptoHelper.decrypt(encryptedDefaultCipherString, decryptCipher) ;

        System.out.println("Original string: " + secret);
        Assert.assertNotNull(encryptedString);
        System.out.println("Encrypted using custom cipher: " + encryptedString);
        Assert.assertNotNull(decryptedString);
        Assert.assertTrue("invalid decrypted value encountered", secret.equals(decryptedString));
        System.out.println("Decrypted string custom cipher: " + decryptedString);
        Assert.assertNotNull(encryptedDefaultCipherString);
        System.out.println("Encrypted using default cipher: " + encryptedDefaultCipherString);
        Assert.assertTrue("encrypted values differ (custom vs default ciphers)", encryptedString.equals(encryptedDefaultCipherString));
        Assert.assertNotNull(decryptedDefaultCipherString);
        Assert.assertTrue("invalid decrypted value encountered", secret.equals(decryptedDefaultCipherString));
        System.out.println("Decrypted using default cipher: " + decryptedDefaultCipherString);
        Assert.assertTrue("decrypted values differ (custom vs default ciphers)", decryptedString.equals(decryptedDefaultCipherString));
    }
}
