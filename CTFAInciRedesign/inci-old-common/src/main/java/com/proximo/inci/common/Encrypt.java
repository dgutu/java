package com.proximo.inci.common;

import java.lang.*;
import java.util.*;
import java.io.*;

//************************************************************
/**Hashes based on two algorithms:
 * 		com.proximo.isuite.inter.Hash for secure UNIX style hashing
 * 		com.proximo.isuite.inter.Hash for secure UNIX style hashing
 *		
 * Despite the name of this class, real encryption may not be  performed.  It hashes
 * a password (or any text).  "Encryption" implies that the text can be
 * decrypted; there is no way to decrypt values hashed using TYPE_CRYPT.
 * TYPE_PROX_SEC is an encryption routine, but it is VERY weak.
 */
public class Encrypt
{
	public static final String TYPE_CRYPT = "CRYPT";
	public static final String TYPE_CRYPT_CHECKSUM = "CR-CS";
	public static final String TYPE_PROX_SEC = "PS";
	
	//************************************************************
	/**Hashes based on com.proximo.isuite.inter.Hash class.  Assumes the hash type is TYPE_CRYPT
	 */
    public static String encrypt (String word)
    {
    	return encrypt (word, TYPE_CRYPT);
    }

	//************************************************************
	/**Encrypts/hashed based on the TYPE passed in
	 */
    public static String encrypt (String word, String type)
    {
    	String e = null;
    	if (type.equals (TYPE_CRYPT)) e = new String (TYPE_CRYPT + ":" + Hash.getHashCode (word));
		else if (type.equals (TYPE_CRYPT_CHECKSUM)) {
			long cs = TemplarUtil.calcCheckSum (word);
			e = new String (TYPE_CRYPT_CHECKSUM + ":" + cs + ":" + Hash.getHashCode (word));
		} else if (type.equals (TYPE_PROX_SEC)) e = new String (TYPE_PROX_SEC + ":" + ProxSecEncrypt.getHashCode (word));
    	else e = new String (word);
    	return e;
    }

	//************************************************************
	/**Determines if a word is encrypted using TYPE_CRYPT
	 */
    public static boolean isEncrypted (String word)
    {
    	return isEncrypted (word, TYPE_CRYPT_CHECKSUM);
    }

	//************************************************************
	/**Determines if a word is encrypted using the TYPE passed in
	 */
    public static boolean isEncrypted (String word, String type)
    {
    	return (word.indexOf (type + ":") == 0);
    }

	//************************************************************
	/**Determines if a word is encrypted using any supported hash
	 */
    public static boolean isEncryptedAny (String word)
    {
    	return (isEncrypted (word, TYPE_CRYPT) || isEncrypted (word, TYPE_CRYPT_CHECKSUM) || isEncrypted (word, TYPE_PROX_SEC));
    }

	//************************************************************
	/**@deprecated This method should no longer be used.  Calling its methods will result in run-time assertions.
	 */
    public static String encryptTwice (String word)
    throws Exception
    {
        throw new Exception ("Method Encrypt.encryptTwice is deprecated.  It can no longer be used.");
    }

	//************************************************************
	/**Must be called with the first parm of the word to encrypt.
	 * Second parm is optional.  If it is a "Y" then the encrypted word is written to a file called "encrypt.txt"
	 */
    public static void main (String args[])
    {
        String type = new String (TYPE_CRYPT);
        String newWord = encrypt (args[0], args[1]);

        System.out.println ("The word encrypted is=[" + newWord + "]");

        if (args[2].equals ("Y")) {
            try {
                FileWriter f = new FileWriter("encrypt.txt", true);
                BufferedWriter b = new BufferedWriter(f);
                b.write (newWord);
                b.close ();
            } catch (IOException e) { System.out.println ("Error writing file"); }
        }
        System.exit (0);
    }
}
