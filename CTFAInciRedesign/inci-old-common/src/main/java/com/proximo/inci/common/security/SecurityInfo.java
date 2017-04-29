package com.proximo.inci.common.security;

public class SecurityInfo
{
	private static final long serialVersionUID = 102L; // improves speed of serialization

    public static String AppName = "Proximo Security Manager";
    public static String Version = "2.12 (Build 013)";
    public static String Copyright = "by Proximo Consulting Services, Inc.\n" +
                                    "Copyright© 1998-2006, All Rights Reserved\n" +
                                    "This program is protected by United States and International copyright law.";

    static public void main(String args[])
    {
        System.out.println ("");
        System.out.println ("");
        System.out.println (AppName);
        System.out.println (Version);
        System.out.println (Copyright);
        System.exit (0);
    }

}
