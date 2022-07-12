/*##############################################################################

    HPCC SYSTEMS software Copyright (C) 2019 HPCC Systems®.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
############################################################################## */

package org.hpccsystems.commons.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class CryptoHelper
{
    private final static Logger             log                         = LogManager.getLogger(CryptoHelper.class);

    public final static DigestAlgorithmType DEFAULT_DIGEST_ALGORITHM    = DigestAlgorithmType.SHA512;
    public final static String              DEFAULT_SECRETKEY_ALGORITHM = "AES";
    public final static int                 DEFAULT_AES_SECRETKEY_LEN   = 16;
    public final static String              DEFAULT_CIPHER_MODE         = "AES";

    /**
     * Creates the SHA 512 AES secret key.
     *
     * @param digestInput
     *            the digest input
     * @return the secret key spec
     */
    public static SecretKeySpec createSHA512AESSecretKey(String digestInput)
    {
        return createSecretKey(digestInput, DEFAULT_DIGEST_ALGORITHM, DEFAULT_SECRETKEY_ALGORITHM);
    }

    /**
     * Creates the secret key.
     *
     * @param utf8DigestInput
     *            the utf 8 digest input
     * @param digestAlgorithm
     *            DigestAlgorithmType enumeration MD2 | MD5 | SHA-1 | SHA-256 | SHA-384 | SHA-512
     * @param secretKeyAlgorithm
     *            the secret key algorithm
     * @return the secret key spec
     */
    public static SecretKeySpec createSecretKey(String utf8DigestInput, DigestAlgorithmType digestAlgorithm, String secretKeyAlgorithm)
    {
        SecretKeySpec secretkey = null;
        try
        {
            byte[] key = utf8DigestInput.getBytes("UTF-8");
            MessageDigest sha = MessageDigest.getInstance(digestAlgorithm.getName());

            key = sha.digest(key);
            int aesKeySize = DEFAULT_AES_SECRETKEY_LEN;
            if (secretKeyAlgorithm.equalsIgnoreCase("AES"))
            {
                // AES only supports key sizes of 16, 24 or 32 bytes.
                switch (digestAlgorithm)
                {
                    case SHA512:
                        aesKeySize = 32;
                        log.info("AES SHA-512 Digest key cut to 32 bytes");
                        break;
                    case SHA384:
                        aesKeySize = 32;
                        log.info("AES SHA-384 Digest key cut to 32 bytes");
                        break;
                    case SHA1:
                        aesKeySize = 16;
                        log.info("AES SHA-1 Digest key cut to 32 bytes");
                        break;
                    default:
                        break;
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

    /**
     * Encrypt.
     *
     * @param utf8StrToEncrypt
     *            the utf 8 str to encrypt
     * @param cipher
     *            the cipher
     * @return the string
     */
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
                throw new Exception("Must provide cipher");
            }
        }
        catch (Exception e)
        {
            System.out.println("Error while encrypting: " + e.toString());
        }
        return null;
    }

    /**
     * Creates the default cipher.
     *
     * @param secretKey
     *            the secret key
     * @param encryptMode
     *            the encrypt mode
     * @return the cipher
     * @throws Exception
     *             the exception
     */
    public static Cipher createDefaultCipher(String secretKey, boolean encryptMode) throws Exception
    {
        return createDefaultCipher(createSHA512AESSecretKey(secretKey), encryptMode);
    }

    /*
     *
     * AES/CBC/NoPadding (128)
     * AES/CBC/PKCS5Padding (128)
     * AES/ECB/NoPadding (128)
     * AES/ECB/PKCS5Padding (128)
     * DES/CBC/NoPadding (56)
     * DES/CBC/PKCS5Padding (56)
     * DES/ECB/NoPadding (56)
     * DES/ECB/PKCS5Padding (56)
     * DESede/CBC/NoPadding (168)
     * DESede/CBC/PKCS5Padding (168)
     * DESede/ECB/NoPadding (168)
     * DESede/ECB/PKCS5Padding (168)
     * RSA/ECB/PKCS1Padding (1024, 2048)
     * RSA/ECB/OAEPWithSHA-1AndMGF1Padding (1024, 2048)
     * RSA/ECB/OAEPWithSHA-256AndMGF1Padding (1024, 2048)
     */

    /**
     * Creates the cipher.
     *
     * @param secretKey
     *            The key to use for encrypting/decrypting
     * @param cipherAlgorithm
     *            AES | AES/CBC/NoPadding | AES/ECB/PKCS5PADDING | etc. There must be an available provider
     * @param encryptMode
     *            true=encrypt, false=decrypt
     * @return the cipher
     * @throws Exception
     *             the exception
     */
    public static Cipher createCipher(SecretKeySpec secretKey, String cipherAlgorithm, boolean encryptMode) throws Exception
    {
        if (secretKey == null) throw new Exception("Must provide SecretKeySpec");

        if (cipherAlgorithm == null || cipherAlgorithm.isEmpty())
            throw new Exception("Must provide cipher algorithm (AES, AES/CBC/PKCS5Padding, etc.");

        Cipher cipher = Cipher.getInstance(cipherAlgorithm);
        cipher.init(encryptMode ? Cipher.ENCRYPT_MODE : Cipher.DECRYPT_MODE, secretKey);
        return cipher;
    }

    /**
     * Creates the default cipher.
     *
     * @param secretKey
     *            the secret key
     * @param encryptMode
     *            the encrypt mode
     * @return the cipher
     * @throws Exception
     *             the exception
     */
    public static Cipher createDefaultCipher(SecretKeySpec secretKey, boolean encryptMode) throws Exception
    {
        return createCipher(secretKey, DEFAULT_CIPHER_MODE, encryptMode);
    }

    /**
     * Encrypt SHA 512 AESPKCS 5 pad.
     *
     * @deprecated Due to weak crypto algorithm use encryptSHA512AES instead
     * @param utf8StrToEncrypt
     *            the utf 8 str to encrypt
     * @param digestInput
     *            the digest input
     * @return the string
     */
    /*public static String encryptSHA512AESPKCS5Pad(String utf8StrToEncrypt, String digestInput)*/

    /**
     * Encrypt SHA 512 AES.
     *
     * Replaces public static String encryptSHA512AESPKCS5Pad(String utf8StrToEncrypt, String digestInput)
     * @param utf8StrToEncrypt
     *            the utf 8 str to encrypt
     * @param digestInput
     *            the digest input
     * @return the string
     */
    public static String encryptSHA512AES(String utf8StrToEncrypt, String digestInput)
    {
        return encryptSHA512AES(utf8StrToEncrypt, createSHA512AESSecretKey(digestInput));
    }

    /**
     * Encrypt SHA 512 AESPKCS 5 pad.
     *
     * @deprecated Due to weak crypto algorithm use encryptSHA512AES instead
     * @param utf8StrToEncrypt
     *            the utf 8 str to encrypt
     * @param secretKey
     *            the secret key
     * @return the string
     */
    /*public static String encryptSHA512AESPKCS5Pad(String utf8StrToEncrypt, SecretKeySpec secretKey)*/

    /**
     * Encrypt SHA 512 AES.
     * Replaces public static String encryptSHA512AESPKCS5Pad(String utf8StrToEncrypt, SecretKeySpec secretKey)
     * @param utf8StrToEncrypt
     *            the utf 8 str to encrypt
     * @param secretKey
     *            the secret key
     * @return the string
     */
    public static String encryptSHA512AES(String utf8StrToEncrypt, SecretKeySpec secretKey)
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

    /**
     * Decrypt.
     *
     * @param strToDecrypt
     *            the str to decrypt
     * @param cipher
     *            the cipher
     * @return the string
     */
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

    /**
     * Decrypt.
     *
     * @param utf8StrToDecrypt
     *            the utf 8 str to decrypt
     * @param secretspec
     *            the secretspec
     * @return the string
     */
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

    /**
     * Decrypt.
     *
     * @param value
     *            the value
     * @param secretKey
     *            the secret key
     * @return the string
     */
    public static String decrypt(String value, String secretKey)
    {
        return decrypt(value, createSHA512AESSecretKey(secretKey));
    }
}
