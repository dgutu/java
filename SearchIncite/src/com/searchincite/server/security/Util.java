package com.searchincite.server.security;

public class Util {

	public static char[] generateStrongPassword(int length) {
		
		char[] pwd = new char[length];
		try {
			java.security.SecureRandom random = java.security.SecureRandom
					.getInstance("SHA1PRNG");

			byte[] intbytes = new byte[4];

			for (int i = 0; i < length; i++) {
				random.nextBytes(intbytes);
				pwd[i] = pwdChars[Math.abs(getIntFromByte(intbytes)
						% pwdChars.length)];
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

		return pwd;
	}

	private static int getIntFromByte(byte[] bytes) {
		int returnNumber = 0;
		int pos = 0;
		returnNumber += byteToInt(bytes[pos++]) << 24;
		returnNumber += byteToInt(bytes[pos++]) << 16;
		returnNumber += byteToInt(bytes[pos++]) << 8;
		returnNumber += byteToInt(bytes[pos++]) << 0;
		return returnNumber;
	}

	private static int byteToInt(byte b) {
		return (int) b & 0xFF;
	}

	private static char[] pwdChars = "abcdefghijklmnopqrstuvqxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789~!@#$%^&*()"
			.toCharArray();

}
