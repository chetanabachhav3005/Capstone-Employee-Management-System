package com.hdfc.capstone.employee.utils;

import java.nio.charset.StandardCharsets;
import java.time.LocalDate;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class AESUtils {
	    private static final String ALGORITHM = "AES";
	    private static final String TRANSFORMATION = "AES/ECB/PKCS5Padding";
	    private static final String SECRET_KEY = "12345678912345678912345678912345";

	    public static byte[] encrypt(LocalDate dateOfBirth) throws Exception {
	        SecretKeySpec key = new SecretKeySpec(SECRET_KEY.getBytes(StandardCharsets.UTF_8), ALGORITHM);
	        Cipher cipher = Cipher.getInstance(TRANSFORMATION);
	        cipher.init(Cipher.ENCRYPT_MODE, key);
	        return cipher.doFinal(dateOfBirth.toString().getBytes(StandardCharsets.UTF_8));
	    }

	
}
