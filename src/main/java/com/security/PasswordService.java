package com.security;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PasswordService {
	String name = " Gunvant";
	public static String encode(String txt) {
		Encoder encoder = Base64.getEncoder();
		return encoder.encodeToString(txt.getBytes());
	}
	
	int j =21;


int k =23;

	public static String decode(String encodeTxt) {
		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(encodeTxt);
		return new String(decode);
	}
	
}
