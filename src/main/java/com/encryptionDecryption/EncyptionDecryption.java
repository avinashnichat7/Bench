package com.encryptionDecryption;

import org.springframework.context.annotation.Bean;

import java.util.Base64;

public class EncyptionDecryption {
    public static void main(String[] args) {

        String password = "password";

        System.out.println(password);
        byte[] encrypt = Base64.getEncoder().encode(password.getBytes());
        System.out.println("Encrypt = " + new String(encrypt));

        byte[] decrypt = Base64.getDecoder().decode(encrypt);
        System.out.println("Decrypt = " + new String(decrypt));


//        @Bean
//        public BcryptPasswordEncoder bcryptPasswordEncoder(){
//
//            return; new BcryptPasswordEncoder();
//
//        }
    }
}
