/** Copyright 1997 to present by Proximo Consulting Services, Inc
The copyright to the computer program(s) herein is the property of 
Proximo Consulting Services, Inc.  The program(s) may be used and/or
copied only with the written permission of Proximo Consulting Services, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.common;

//**********************************************************************
/** A simple class for debugging that implements DebugInterface.
 *	Just writes to System.out.println
 *
 */

public class DebugPrinter
	implements DebugInterface
{
	public DebugPrinter () { }
	
    public void alwaysWriteDebug (String line) { System.out.println (line); }
    public void writeDebug (String line) { System.out.println (line); }
}
