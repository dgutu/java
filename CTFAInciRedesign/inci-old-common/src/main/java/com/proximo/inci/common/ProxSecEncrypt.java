package com.proximo.inci.common;

import java.lang.*;

public class ProxSecEncrypt
{
    public static final int A = (int) 'A';
    public static final int Z = (int) 'Z';
    public static final int a = (int) 'a';
    public static final int z = (int) 'z';
    public static final int ZERO = (int) '0';
    public static final int NINE = (int) '9';

    /** Encrypts a word according to the very weak Proximo encryption algorithm */
    public static String getHashCode (String word)
    {
        if (word == null) return null;

        String newWord = new String ("");

        int l = word.length ();
        int i;
        char c;
    	int d1, d2, d3;

        for (i = 0; i < l; i++) {

            c = word.charAt (i);

            d3 = (int) c + l;
            newWord = newWord + String.valueOf ((char) d3);

        }

        return newWord;
    }

}
