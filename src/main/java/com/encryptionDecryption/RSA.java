package com.encryptionDecryption;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.*;
import java.util.Base64;

import static java.nio.charset.StandardCharsets.UTF_8;

public class RSA {
    private PrivateKey privateKey;
    private PublicKey publicKey;

    public RSA() throws NoSuchAlgorithmException {

        KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
        generator.initialize(1024);
        KeyPair keyPair = generator.generateKeyPair();
        privateKey = keyPair.getPrivate();

        publicKey = keyPair.getPublic();


    }

    public static void main(String[] args) throws Exception {


        RSA rsa = new RSA();

        String encode = rsa.encode("Hello World".getBytes());
        System.out.println(encode);
        String decrypt = rsa.decrypt(encode);

        System.out.println(decrypt);
    }

    public String encrypt(String message) throws IllegalBlockSizeException, BadPaddingException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {

        byte[] msg = message.getBytes();

        Cipher cipher = Cipher.getInstance("RSA");

        cipher.init(Cipher.ENCRYPT_MODE, publicKey);

        byte[] encryptByte = cipher.doFinal(msg);

        return encode(encryptByte);
    }

    private String encode(byte[] msg) {

        return Base64.getEncoder().encodeToString(msg);
    }

    public String decrypt(String message) throws Exception {

        byte[] encyptedByteMessage = decode(message);
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");

        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] decode = Base64.getDecoder().decode(message);
        byte[] decryptMessage = cipher.doFinal(decode);

        return new String(decryptMessage);
    }

    private byte[] decode(String messageBytes) {

        return Base64.getDecoder().decode(messageBytes);
    }
}
