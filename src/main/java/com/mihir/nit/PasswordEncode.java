package com.mihir.nit;

import java.util.Base64;

public class PasswordEncode {

	public String getEncodedStr(String text) {
		return Base64.getEncoder().encodeToString(text.getBytes());
	}
}
