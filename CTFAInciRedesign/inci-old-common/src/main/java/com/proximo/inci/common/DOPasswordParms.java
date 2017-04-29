package com.proximo.inci.common;

public class DOPasswordParms
    extends DODataRecord
{
	private static final long serialVersionUID = 101L; // improves speed of serialization

    public int alpha, numeric, length;
    public boolean startLetter;

    public DOPasswordParms ()
    {
        this (1, 1, 6, true);
    }

    public DOPasswordParms (int alpha, int numeric, int length, boolean startLetter)
    {
        this.alpha = alpha;
        this.numeric = numeric;
        this.length = length;
        this.startLetter = startLetter;
    }
}
