package com.encryptionDecryption;

public class Base64 {
    public static void main(String[] args) {

        String password = "password";

        System.out.println(password);
        byte[] encrypt = java.util.Base64.getEncoder().encode(password.getBytes());
        System.out.println("Encrypt = " + new String(encrypt));

        byte[] decrypt = java.util.Base64.getDecoder().decode(encrypt);
        System.out.println("Decrypt = " + new String(decrypt));


//        @Bean
//        public BcryptPasswordEncoder bcryptPasswordEncoder(){
//
//            return; new BcryptPasswordEncoder();
//
//        }
    }
}
