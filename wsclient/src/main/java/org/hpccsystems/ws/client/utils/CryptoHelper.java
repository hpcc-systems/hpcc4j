package org.hpccsystems.ws.client.utils;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
import java.util.Random;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.apache.log4j.Logger;
 
public class CryptoHelper
{
    private final static Logger log = Logger.getLogger(CryptoHelper.class.getName());
    
    public final static String DEFAULT_DIGEST_ALGORITHM = "SHA-512";
    public final static String DEFAULT_SECRETKEY_ALGORITHM = "AES";
    public final static int DEFAULT_AES_SECRETKEY_LEN = 16;
    public final static String DEFAULT_CIPHER_MODE = "AES/ECB/PKCS5PADDING";

    public static SecretKeySpec createSHA512AESSecretKey(String digestInput)
    {
        return createSecretKey(digestInput, DEFAULT_DIGEST_ALGORITHM, DEFAULT_SECRETKEY_ALGORITHM);
    }

    /**
     * 
     * @param utf8DigestInput
     * @param digestAlgorithm MD2 | MD5 | SHA-1 | SHA-256 | SHA-384 | SHA-512
     * @param secretKeyAlgorithm
     * @return
     */
    public static SecretKeySpec createSecretKey(String utf8DigestInput, String digestAlgorithm, String secretKeyAlgorithm)
    {
        SecretKeySpec secretkey = null;
        try
        {
            byte[] key = utf8DigestInput.getBytes("UTF-8");
            MessageDigest sha = MessageDigest.getInstance(digestAlgorithm);
            
            key = sha.digest(key);
            int aesKeySize = DEFAULT_AES_SECRETKEY_LEN;
            if (secretKeyAlgorithm.equalsIgnoreCase("AES"))
            {
                //AES only supports key sizes of 16, 24 or 32 bytes.
                if (secretKeyAlgorithm.equalsIgnoreCase("SHA-512"))
                {
                    aesKeySize = 32;
                    log.info("AES SHA-512 Digest key cut to 32 bytes");
                }
                else if (secretKeyAlgorithm.equalsIgnoreCase("SHA-384"))
                {
                    aesKeySize = 32;
                    log.info("AES SHA-384 Digest key cut to 32 bytes");
                }
                else if (secretKeyAlgorithm.equalsIgnoreCase("SHA-1"))
                {
                    aesKeySize = 16;
                    log.info("AES SHA-1 Digest key cut to 32 bytes");
                }

                key = Arrays.copyOf(sha.digest(key), aesKeySize);
            }
            secretkey = new SecretKeySpec(key, secretKeyAlgorithm);
        }
        catch (NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }
        catch (UnsupportedEncodingException e)
        {
            e.printStackTrace();
        }
        return secretkey;
    }
 
    public static String encrypt(String utf8StrToEncrypt, Cipher cipher)
    {
        try
        {
            if (cipher != null)
            {
                return Base64.getEncoder().encodeToString(cipher.doFinal(utf8StrToEncrypt.getBytes("UTF-8")));
            }
            else
            {
                throw new Exception("Must provide chiper");
            }
        }
        catch (Exception e)
        {
            System.out.println("Error while encrypting: " + e.toString());
        }
        return null;
    }
    
    public static Cipher createDefaultCipher(String secretKey, boolean encryptMode) throws Exception
    {
        return createDefaultCipher(createSHA512AESSecretKey(secretKey), encryptMode);        
    }

    /**
     * @param secretKey
     * @param cipherAlgorithm AES | AES/CBC/NoPadding | AES/ECB/PKCS5PADDING | etc.
     * @param encryptMode
     * @return
     * @throws Exception
     */
    public static Cipher createCipher(SecretKeySpec secretKey, String cipherAlgorithm, boolean encryptMode) throws Exception
    {
        if (secretKey == null)
            throw new Exception("Must provide SecretKeySpec");

        if (cipherAlgorithm == null || cipherAlgorithm.isEmpty())
            throw new Exception("Must provide cipher algorithm (AES, AES/CBC/PKCS5Padding, etc.");
        
        Cipher cipher = Cipher.getInstance(cipherAlgorithm);
        cipher.init(encryptMode ? Cipher.ENCRYPT_MODE : Cipher.DECRYPT_MODE, secretKey);
        return cipher;
    }
    
    public static Cipher createDefaultCipher(SecretKeySpec secretKey, boolean encryptMode) throws Exception
    {
        return createCipher(secretKey, DEFAULT_CIPHER_MODE, encryptMode);       
    }

    public static String encryptSHA512AESPKCS5Pad(String utf8StrToEncrypt, String digestInput)
    {
        return encryptSHA512AESPKCS5Pad(utf8StrToEncrypt, createSHA512AESSecretKey(digestInput));
    }

    public static String encryptSHA512AESPKCS5Pad(String utf8StrToEncrypt, SecretKeySpec secretKey)
    {
        try
        {
            Cipher AESCipher = Cipher.getInstance(DEFAULT_CIPHER_MODE);
            if (AESCipher != null)
            {
                if (secretKey != null)
                {
                    AESCipher.init(Cipher.ENCRYPT_MODE, secretKey);
                    return encrypt(utf8StrToEncrypt, AESCipher);
                }
                else
                {
                    throw new Exception("Must provide Secret Key");
                }
            }
            else
            {
                throw new Exception("Cipher not available");
            }
        }
        catch (Exception e)
        {
            System.out.println("Error while encrypting: " + e.toString());
        }
        return null;
    }
 
    public static String decrypt(String strToDecrypt, Cipher cipher)
    {
        try
        {
            if (cipher != null)
            {
                return new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt)));
            }
            else
            {
                throw new Exception("Must provide valid Cipher");
            }
        }
        catch (Exception e)
        {
            System.out.println("Error while decrypting: " + e.toString());
        }
        return null;
    }
    
    public static String decrypt(String utf8StrToDecrypt, SecretKeySpec secretspec)
    {
        try
        {
            Cipher aesCipher = Cipher.getInstance(DEFAULT_CIPHER_MODE);
            if (aesCipher != null)
            {
                if (secretspec != null)
                {
                    aesCipher.init(Cipher.DECRYPT_MODE, secretspec);
                    return decrypt(utf8StrToDecrypt, aesCipher);
                }
                else
                {
                    throw new Exception("Secret not available");
                }
            }
            else
            {
                throw new Exception("Cipher not available");
            }
        }
        catch (Exception e)
        {
            System.out.println("Error while decrypting: " + e.toString());
        }
        return null;
    }
    
    public static String decrypt(String value, String secretKey)
    {
        return decrypt(value, createSHA512AESSecretKey(secretKey));
    }

    public static void main(String[] args)
    {
        final String digestInput = "12323423*&^";
        String secret = "ForMyEyesOnLY!";

        try
        {
            byte[] array = new byte[12];
            new Random().nextBytes(array);
            String generatedString = new String(array, Charset.forName("UTF-8"));
         
            System.out.println(generatedString);

            SecretKeySpec sha512aesSecretKey = createSHA512AESSecretKey(digestInput);
            /*Create your own cipher*/
            Cipher encryptCipher = CryptoHelper.createCipher(sha512aesSecretKey, "AES", true);
            String encryptedString = CryptoHelper.encrypt(secret, encryptCipher);
            
            Cipher decryptCipher = CryptoHelper.createCipher(sha512aesSecretKey, "AES", false);
            String decryptedString = CryptoHelper.decrypt(encryptedString, decryptCipher) ;

            /*Create default cipher*/
            encryptCipher = CryptoHelper.createDefaultCipher(sha512aesSecretKey, true);
            String encryptedDefaultCipherString = CryptoHelper.encrypt(secret, encryptCipher);
            
            decryptCipher = CryptoHelper.createDefaultCipher(sha512aesSecretKey, false);
            String decryptedDefaultCipherString = CryptoHelper.decrypt(encryptedDefaultCipherString, decryptCipher) ;

            System.out.println("Original string: " + secret);
            System.out.println("Encrypted using custom cipher: " + encryptedString);
            System.out.println("Decrypted string custom cipher: " + decryptedString);
            System.out.println("Encrypted using default cipher: " + encryptedDefaultCipherString);
            System.out.println("Decrypted using default cipher: " + decryptedDefaultCipherString);            
        }
        catch (Exception e)
        {
            log.error("Could not create cipher");
            e.printStackTrace();
        }
    }
}