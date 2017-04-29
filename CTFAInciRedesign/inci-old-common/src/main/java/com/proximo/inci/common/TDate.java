package com.proximo.inci.common;



import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TDate
    implements Serializable, Cloneable, TDateInterface
{
    // simple format types
    public static final int FULL_DATE = 0;
    public static final int DATE_ONLY = 1;
    public static final int TIME_24_ONLY = 2;
    public static final int TIME_12_ONLY = 3;
    private static final int INTERNAL = 4;
    public static final int YYYYMMDD = 5;
    public static final int INTL_DATE = YYYYMMDD;
    public static final int MMDDYYYY = 6;
    public static final int MMDDYYYY_NOSEP = 7;
    public static final int MMDDYY_NOSEP = 8;
    public static final int MMDDYY = 9;
    public static final int DDMONYYYY = 10;
    public static final int MONYYYY = 11; // DR 1/3/00
    public static final int QYYYY = 12; // DR 1/3/00: quarter, YYYY
    public static final int YYYYMMDD_TIME_24 = 13;
    public static final int INTL_DATE_TIME = YYYYMMDD_TIME_24;
    public static final int DDMONYYYY_TIME24 = 14;
    public static final int HHMM12 = 15;
    public static final int HHMM24 = 16;
    public static final int MMDDYY_TIME_12 = 17;
    public static final int MMDDYY_TIME_24 = 18;
    public static final int MMDDYYYY_TIME_12 = 19;
    public static final int MMDDYYYY_TIME_24 = 20;
    public static final int MMDDYYYY_HHMM_12 = 21;
    public static final int MMDDYYYY_HHMM_24 = 22;
    public static final int ISO8601 = 23;
    public static final int DDMONTHYYYY = 24;
    public static final int MONTHDDYYYY = 25;

    private static DateFormat[] allFormats =
                    {
                       new SimpleDateFormat ("dd MM yyyy HH:mm:ss"),
                       new SimpleDateFormat ("dd MM yyyy"),
                       new SimpleDateFormat ("HH:mm:ss"),
                       new SimpleDateFormat ("hh:mm:ss a"),
                       new SimpleDateFormat ("yyyyMMddHHmmss"),
                       new SimpleDateFormat ("yyyy MM dd"),
                       new SimpleDateFormat ("MM/dd/yyyy"),
                       new SimpleDateFormat ("MMddyyyy")
                    };

    /* date formats (from SimpleDateFormat)
    yyyy = year
    MM = month
    dd = day
    HH = 24 hours time
    hh = 12 hour time
    mm = minute
    ss = second
    a = am/pm
    z = time zone name
    */

    // DR 5/22/98: month names
    public static String[] shortMonths =
                    { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
    public static String[] longMonths =
                    { "January", "February", "March", "April", "May", "June", "July", "August",
                        "September", "October", "November", "December" };
    public static String[] numMonths =
                    { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" };
    public static String[] numDays =
                    { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10",
                      "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
                      "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };

    // DR 9/26/99: day names
    public static String[] shortDays =
                    { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
    public static String[] codeDays =
                    { "Su", "M", "T", "W", "Th", "F", "S" };
    public static String[] longDays =
                    { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

    private String internalFormat;

    // WL 6/10/98
    private int year, day, month, hour, minute, second;

    public TDate ()
    {
        //Debug.write ("In TDate ()");
        // DR 5/21/98: default the date to today
        //internalFormat = new String ("00000101000000");
        set (new java.util.Date ());
    }

    public TDate (String s)
    {
        //Debug.write ("In TDate (String)");
        if (s == null || s.equals("")) setNull();
        else {
        	String x = TemplarUtil.stripNonNumbers (s);
        	if (x.length () != 14) throw new IllegalArgumentException ("Invalid string format used to construct TDate.");
            internalFormat = new String (s);
            setFields();
        }
    }

    public TDate (TDate theDate)
    {
        //Debug.write ("In TDate (TDate)");
        internalFormat = new String (theDate.getInternalFormat ());
        setFields();
    }

    public TDate(int yr, int mth, int dy)
    {
        set (new java.util.Date( (yr-1900), (mth-1), dy ));
    }

    // DR 10/30/00: Allocates a TDate object and initializes it to represent the specified number of milliseconds
    // since January 1, 1970, 00:00:00 GMT.
    public TDate (long l)
    {
        set (new java.util.Date(l));
    }

    public TDate (java.util.Date theDate)
    {
        //Debug.write ("In TDate (java.util.Date)");
        internalFormat = new String (TemplarUtil.utilDateToTDateString (theDate));
        setFields();
    }

    public TDate (java.sql.Date theDate)
    {
        //Debug.write ("In TDate (java.sql.Date)");
        // DR 3/31/98: if date is null, set null date
        internalFormat = new String (TemplarUtil.sqlDateToTDateString (theDate));
        setFields();
    }

    public static TDate rightNow ()
    {
        //Debug.write ("In TDate.rightNow ()");
        return new TDate (TemplarUtil.stringNow ());
    }

    public static String getNullDate () { return "00000101000000"; }
    public static TDate getNullDateObject ()
    {
        TDate d = new TDate ();
        d.setNull ();
        return d;
    }

    public void set (TDate date)
    {
        //Debug.write ("In TDate.set (TDate), date = " + date);
        internalFormat = date.getInternalFormat ();
        setFields();
    }

    public void set (String date)
    {
        //Debug.write ("In TDate.set (string), date = " + date);
        internalFormat = date;
        setFields();
    }

    public void set (java.util.Date date)
    {
        //System.out.println ("In TDate.set (java.util.Date), date = " + date);
        String d = TemplarUtil.utilDateToTDateString (date);
        if (d == null) internalFormat = "00000101000000";
        else internalFormat = d;
        setFields();
    }

    public void set (java.sql.Date date)
    {
        //Debug.write ("In TDate.set (java.sql.Date), date = " + date);
        internalFormat = TemplarUtil.sqlDateToTDateString (date);
        setFields();
    }

    public void setNull ()
    {
        //Debug.write ("In TDate.setNull");
        internalFormat = "00000101000000";
        setFields();
    }

    // DR 9/26/99: method to truncate hours minutes second from current object
    public void truncate ()
    {
        // if object is null, do nothing
        if (!isNull ()) {
            java.util.Date utilDate = new java.util.Date (
                    TemplarUtil.strToInt (internalFormat.substring (0, 4)) - 1900,
                    TemplarUtil.strToInt (internalFormat.substring (4, 6)) - 1,
                    TemplarUtil.strToInt (internalFormat.substring (6, 8))
                );
            set (utilDate);
        }
    }

    // comparison return values
    // 0 = equals
    // >0 = date 1 > date 2 (returns difference)
    // <0 = date 1 < date 2 (returns difference)
    public int compareTo (TDate date2) { return compareTo (this, date2); }

    public static int compareTo (TDate date1, TDate date2)
    {
        return date1.getInternalFormat ().compareTo (date2.getInternalFormat ());
    }

    public boolean equals (TDate date2) { return equals (this, date2); }

    public static boolean equals (TDate date1, TDate date2)
    {
        return (date1.getInternalFormat ().equals (date2.getInternalFormat ()));
    }

    public boolean isNull () { return internalFormat.equals ("00000101000000"); }

    public String getInternalFormat () { return internalFormat; };

    public java.sql.Date getSqlDate ()
    {
        //Debug.write ("In TDate.getSqlDate ()");
        // DR 2/22/98: if the date is null, then return null; the caller must
        // decide what to do
        java.sql.Date sqlDate = null;
        if (!isNull ())
            sqlDate = new java.sql.Date (
                    TemplarUtil.strToInt (internalFormat.substring (0, 4)) - 1900,
                    TemplarUtil.strToInt (internalFormat.substring (4, 6)) - 1,
                    TemplarUtil.strToInt (internalFormat.substring (6, 8))
                );
        return sqlDate;
    }
    public java.util.Date getUtilDate ()
    {
        //Debug.write ("In TDate.getUtilDate ()");
        // DR 7/31/98: if the date is null, then return null; the caller must
        // decide what to do
        java.util.Date utilDate = null;
        if (!isNull ())
            utilDate = new java.util.Date (
                    TemplarUtil.strToInt (internalFormat.substring (0, 4)) - 1900,
                    TemplarUtil.strToInt (internalFormat.substring (4, 6)) - 1,
                    TemplarUtil.strToInt (internalFormat.substring (6, 8)),
                    TemplarUtil.strToInt (internalFormat.substring (8, 10)),
                    TemplarUtil.strToInt (internalFormat.substring (10, 12)),
                    TemplarUtil.strToInt (internalFormat.substring (12, 14))
                );
        return utilDate;
    }

    public Calendar getCalendar ()
    {
        Calendar c = null;
        if (!isNull ())
            c = Calendar.getInstance ();
            c.set (TemplarUtil.strToInt (internalFormat.substring (0, 4)),
                   TemplarUtil.strToInt (internalFormat.substring (4, 6)) - 1,
                   TemplarUtil.strToInt (internalFormat.substring (6, 8)),
                   TemplarUtil.strToInt (internalFormat.substring (8, 10)),
                   TemplarUtil.strToInt (internalFormat.substring (10, 12)),
                   TemplarUtil.strToInt (internalFormat.substring (12, 14))
                );
        return c;
    }

	/** Returns the number of milliseconds since January 1, 1970, 00:00:00 GMT represented by this TDate object. */
	public long getTimeInMillis ()
	{
		long m = 0;
		java.util.Date d = getUtilDate ();
		if (d != null) m = d.getTime ();
		d = null;
		return m;
	}
	
    public static String format (TDate date, int format)
    {
        //Debug.write ("In TDate.format (TDate, format)");
        //Debug.write ("date = " + date);
        //Debug.write ("format = " + format);
        TDate d = new TDate (date);
        return d.formatIt (format);
    }
    public static String format (String date, int format)
    {
        //Debug.write ("In TDate.format (string, format)");
        //Debug.write ("date = " + date);
        //Debug.write ("format = " + format);
        TDate d = new TDate (date);
        return d.formatIt (format);
    }

    public String formatIt () { return formatIt (DATE_ONLY); }

    public String formatIt (int format)
    {
        //Debug.write ("In TDate.formatIt (format)");
        //Debug.write ("format = " + format);
        // return a string based on the specifed format
        String f = new String ("");

        // DR 1/15/99: added MMDDYY formats
        if (internalFormat.equals ("00000101000000")) f = "";
        else if (format == DDMONYYYY) {
            // DR 5/10/99: have to custom code this, snce SimpleDateFormat seems to give me an
            // ArrayOutOfBoundsException error
            f = internalFormat.substring (6, 8) + " " +
                    getShortMonth () + " " +
                    internalFormat.substring (0, 4);
        } else if (format == DDMONTHYYYY) {
            // DR 5/10/99: have to custom code this, snce SimpleDateFormat seems to give me an
            // ArrayOutOfBoundsException error
            f = internalFormat.substring (6, 8) + " " +
                    getLongMonth () + " " +
                    internalFormat.substring (0, 4);
        } else if (format == MONTHDDYYYY) {
            // DR 12/1/04
            f = getLongMonth () + " " + 
                    internalFormat.substring (6, 8) + ", " +
                    internalFormat.substring (0, 4);
        } else if (format == DDMONYYYY_TIME24) {
            // DR 12/30/00
            f = formatIt (DDMONYYYY) + " " + formatTime24 ();
        } else if (format == HHMM12) {
        	// DR 5/19/01
        	String h = null;
			int ih = getHour ();
			if (ih > 12) ih = ih - 12;
        	if (ih > 9) h = String.valueOf (ih);
        	else h = new String ("0" + ih);
        	String m = null;
        	if (getMinute () > 9) m = String.valueOf (getMinute ());
        	else m = new String ("0" + getMinute ());
        	f = new String (h + ":" + m + " " + ((getHour () >= 12) ? "PM" : "AM"));
        } else if (format == HHMM24) {
        	// DR 5/19/01
        	String h = null;
        	if (getHour () > 9) h = String.valueOf (getHour ());
        	else h = new String ("0" + getHour ());
        	String m = null;
        	if (getMinute () > 9) m = String.valueOf (getMinute ());
        	else m = new String ("0" + getMinute ());
        	f = new String (h + ":" + m);
        } else if (format == YYYYMMDD) {
            // DR 9/28/00
            f = internalFormat.substring (0, 4) + "/" +
                    internalFormat.substring (4, 6) + "/" +
                    internalFormat.substring (6, 8);
        } else if (format == YYYYMMDD_TIME_24) {
            // DR 10/8/00
            f = formatIt (YYYYMMDD) + " " + formatTime24 ();
        } else if (format == MMDDYY_TIME_12) {
            f = formatIt (MMDDYY) + " " + formatTime12();
        } else if (format == MMDDYY_TIME_24) {
            f = formatIt (MMDDYY) + " " + formatTime24 ();
        } else if (format == MMDDYYYY_TIME_12) {
            f = formatIt (MMDDYYYY) + " " + formatTime12 ();
        } else if (format == MMDDYYYY_HHMM_12) {
            f = formatIt (MMDDYYYY) + " " + formatIt(HHMM12);
        } else if (format == MMDDYYYY_TIME_24) {
            f = formatIt (MMDDYYYY) + " " + formatTime24 ();
        } else if (format == MMDDYYYY_HHMM_24) {
            f = formatIt (MMDDYYYY) + " " + formatIt(HHMM24);
        } else if (format == ISO8601) { // DR 12/17/02
        	String h = null;
        	if (getHour () > 9) h = String.valueOf (getHour ());
        	else h = new String ("0" + getHour ());
        	String m = null;
        	if (getMinute () > 9) m = String.valueOf (getMinute ());
        	else m = new String ("0" + getMinute ());
        	String s = null;
        	if (getSecond () > 9) s = String.valueOf (getSecond ());
        	else s = new String ("0" + getSecond ());
            f = new String (internalFormat.substring (0, 4) +
                    internalFormat.substring (4, 6) +
                    internalFormat.substring (6, 8) +
                    "T" + 
                    h + ":" + m + ":" + s);
        } else if (format == MONYYYY) { // DR 1/3/00
            f = getLongMonth () + ", " +
                    internalFormat.substring (0, 4);
        } else if (format == QYYYY) { // DR 1/3/00
            String q = new String ("1st Quarter");
            if (month > 3 && month < 7) q = new String ("2nd Quarter");
            else if (month > 6 && month < 10) q = new String ("3rd Quarter");
            else if (month > 9) q = new String ("4th Quarter");
            f = q + ", " + internalFormat.substring (0, 4);
        } else if ((format == MMDDYYYY) || (format == MMDDYYYY_NOSEP) ||
                (format == MMDDYY) || (format == MMDDYY_NOSEP)) {
            /*
            DR 6/22/98
            It seems as if MMDDYYYY and MMDDYYYY_NOSEP always return a day of month one less than it should be
            I'm not sure why; it may also be happening to other formats, and it may be due to our internal
            storage format (although it seems to be storing just the day, minimum value of 1).
            Workaround: if one of these formats selected, substract one from the day and recalculate
            */
            String sep = "/";
            if (format == MMDDYYYY_NOSEP || format == MMDDYY_NOSEP) sep = "";

            f = internalFormat.substring (4, 6) + sep +
                internalFormat.substring (6, 8) + sep;

            if ((format == MMDDYY) || (format == MMDDYY_NOSEP)) f = f + internalFormat.substring (2, 4);
            else f = f + internalFormat.substring (0, 4);
        } else {
            java.util.Date d = getUtilDate ();
            f = allFormats[format].format (d);
        }

        //Debug.write ("return = " + f);
        return f;
    }

    public static String formatIt (int format, java.sql.Date date)
    {
        //Debug.write ("In TDate.formatIt (format, java.sql.Date)");
        //Debug.write ("date = " + date);
        //Debug.write ("format = " + format);
        // return a string based on the specifed format
        return allFormats[format].format (date);
    }

    public String formatDate () { return formatIt (DATE_ONLY); }
    public String formatTime12 () { return formatIt (TIME_12_ONLY); }
    public String formatTime24 () { return formatIt (TIME_24_ONLY); }
    public String formatDateTime () { return formatIt (FULL_DATE); }
    public String formatShortDateTime24 () { return formatIt (MMDDYY_TIME_24); }
    public String formatDateTime12 () { return formatIt (MMDDYYYY_TIME_12); }
    public String formatDateHHMM12 () { return formatIt (MMDDYYYY_HHMM_12); }
    public String formatDateTime24 () { return formatIt (MMDDYYYY_TIME_24); }
    public String formatDateHHMM24 () { return formatIt (MMDDYYYY_HHMM_24); }

    public String toString ()
    {
        return "TDate: " + internalFormat;
    }

    public String getStringForSql ()
    {
        return (isNull () ? "null" : "'" + getSqlDate ().toString () + "'");
    }

    public String getShortMonth ()
    {
        java.util.Date d = getUtilDate ();
        return shortMonths [d.getMonth ()];
    }

    public String getNumMonth() {
        return numMonths [month - 1];
    }

    public String getNumDay() {
        return numDays [day - 1];
    }

    public String getLongMonth ()
    {
        java.util.Date d = getUtilDate ();
        return longMonths [d.getMonth ()];
    }
    public static String getShortMonth (int month) { return shortMonths [month]; }
    public static String getLongMonth (int month) { return longMonths [month]; }

    // DR 9/26/99: get day codes, names, etc
    public String getShortDay () { return shortDays [weekday ()]; }
    public String getLongDay () { return longDays [weekday ()]; }
    public String getCodeDay () { return codeDays [weekday ()]; }
    public static String getShortDay (int weekday) { return shortDays [weekday]; }
    public static String getLongDay (int weekday) { return longDays [weekday]; }
    public static String getCodeDay (int weekday) { return codeDays [weekday]; }

    // DR 11/19/98
    public String getAMPM()
    {
        if (hour > 11) return "PM";
        else return "AM";
    }
    public String getNumHour()
    {
        if (hour > 11) return TemplarUtil.lpad (String.valueOf (hour - 12), 2, '0');
        else return TemplarUtil.lpad (String.valueOf (hour), 2, '0');
    }
    public String getNumMiliaryHour()
    {
        return TemplarUtil.lpad (String.valueOf (hour), 2, '0');
    }
    public String getNumMinute()
    {
        return TemplarUtil.lpad (String.valueOf (minute), 2, '0');
    }
    public String getNumYear()
    {
        return String.valueOf (year);
    }
    public String getNumSecond()
    {
        return TemplarUtil.lpad (String.valueOf (second), 2, '0');
    }

    // WL 5/22/98: This method is needed in objects related to contract.
    // DR 6/13/98: simplified by just calling the constructor and making
    // a new object class
    public Object clone()
    {
        return new TDate (this);
    }

    // WL 6/10/98
    private void setFields() {
        year = TemplarUtil.strToInt (internalFormat.substring (0, 4));
        month = TemplarUtil.strToInt (internalFormat.substring (4, 6));
        day = TemplarUtil.strToInt (internalFormat.substring (6, 8));

        // DR 11/19/98
        hour = TemplarUtil.strToInt (internalFormat.substring (8, 10));
        minute = TemplarUtil.strToInt (internalFormat.substring (10, 12));
        second = TemplarUtil.strToInt (internalFormat.substring (12, 14));
        //Debug.write("TDate.setFields(): year=" + year + ", month=" + month + ", day=" + day);
    }

   /**
    * Advances this day by n days. For example.
    * d.advance(30) adds thirdy days to d
    * @param n the number of days by which to change this
    * day (can be < 0)
    */

   public void advance(int n)
   {
        // DR 1/3/01: a bug chops the time off of the julian date when calling toJulian ().  To fix,
        // I'm just adding the time back on since this function only deals in whole days
        int h = TemplarUtil.strToInt (internalFormat.substring (8, 10));
        int m = TemplarUtil.strToInt (internalFormat.substring (10, 12));
        int s = TemplarUtil.strToInt (internalFormat.substring (12, 14));

        fromJulian(toJulian() + n);

        hour = h;
        minute = m;
        second = s;
        setInternalFormat ();
   }

   // DR 11/30/99: advance 1 month forward
   public void addOneMonth()
   {
        month++;
        if (month == 13) {
            year++;
            month = 1;
        }
        setInternalFormat ();
   }

   // DR 4/26/01: go 1 month backward
   public void subtractOneMonth()
   {
        month--;
        if (month == 0) {
            year--;
            month = 12;
        }
        setInternalFormat ();
   }

   // DR 11/30/99: set the internal string based on the current values of the
   // individual variables
   private void setInternalFormat ()
   {
        internalFormat = TemplarUtil.lpad (String.valueOf (year), 4, '0') +
                        TemplarUtil.lpad (String.valueOf (month), 2, '0') +
                        TemplarUtil.lpad (String.valueOf (day), 2, '0') +
                        TemplarUtil.lpad (String.valueOf (hour), 2, '0') +
                        TemplarUtil.lpad (String.valueOf (minute), 2, '0') +
                        TemplarUtil.lpad (String.valueOf (second), 2, '0');
   }

   public int getDay()
   /**
    * Gets the day of the month
    * @return the day of the month (1...31)
    */

   {  return day;
   }

   public int getMonth()
   /**
    * Gets the month
    * @return the month (1...12)
    */

   { return month;
   }

   public int getYear()
   /**
    * Gets the year
    * @return the year (counting from 0, <i>not</i> from 1900)
    */

   { return year;
   }

   public void setDay(int dy)
   /**
    * Sets the day
    */
   {
     day = dy;
     setInternalFormat ();
   }

   public void setMonth(int mt)
   /**
    * Sets the month
    */
   {
     month = mt;
     setInternalFormat ();
   }

   public void setYear(int yr)
   /**
    * Sets the year
    */
   {
     year = yr;
     setInternalFormat ();
   }

   // DR 11/19/98
   public int getHour () { return hour; }
   public int getMinute () { return minute; }
   public int getSecond () { return second; }

   // SP 1/26/01
   public void setHour (int hr) 
   { 
   		hour = hr;      
   		setInternalFormat ();
   }
   public void setMinute (int mn) 
   { 
   		minute = mn; 
   		setInternalFormat ();
   }
   public void setSecond (int sc) 
   { 
   		second = sc; 
   		setInternalFormat ();
   }

   /**
    * Gets the weekday
    * @return the weekday (0 = Sunday, 1 = Monday, ...,
    * 6 = Saturday)
    */

   public int weekday() {
        if (isNull()) return -1;
        return (toJulian() + 1)% 7;
   }

   /**
    * The number of days between this and day parameter
    * @param b any date
    * @return the number of days between this and day parameter
    * and b (> 0 if this day comes after b)
    */

   public int daysBetween(TDate b)
   {  return toJulian() - b.toJulian();
   }

   /**
    * Computes the number of days between two dates
    * @return true iff this is a valid date
    */
   private boolean isValid()
   {  TDate t = new TDate();
      t.fromJulian(this.toJulian());
      return t.day == day && t.month == month
         && t.year == year;
   }

   private int toJulian()
   /**
    * @return The Julian day number that begins at noon of
    * this day
    * Positive year signifies A.D., negative year B.C.
    * Remember that the year after 1 B.C. was 1 A.D.
    *
    * A convenient reference point is that May 23, 1968 noon
    * is Julian day 2440000.
    *
    * Julian day 0 is a Monday.
    *
    * This algorithm is from Press et al., Numerical Recipes
    * in C, 2nd ed., Cambridge University Press 1992
    */
   {  int jy = year;
      if (year < 0) jy++;
      int jm = month;
      if (month > 2) jm++;
      else
      {  jy--;
         jm += 13;
      }
      int jul = (int) (java.lang.Math.floor(365.25 * jy)
      + java.lang.Math.floor(30.6001*jm) + day + 1720995.0);

      int IGREG = 15 + 31*(10+12*1582);
         // Gregorian Calendar adopted Oct. 15, 1582

      if (day + 31 * (month + 12 * year) >= IGREG)
         // change over to Gregorian calendar
      {  int ja = (int)(0.01 * jy);
         jul += 2 - ja + (int)(0.25 * ja);
      }
      return jul;
   }

   private void fromJulian(int j)
   /**
    * Converts a Julian day to a calendar date
    * @param j  the Julian date
    * This algorithm is from Press et al., Numerical Recipes
    * in C, 2nd ed., Cambridge University Press 1992
    */
   {  int ja = j;

      int JGREG = 2299161;
         /* the Julian date of the adoption of the Gregorian
            calendar
         */

      if (j >= JGREG)
      /* cross-over to Gregorian Calendar produces this
         correction
      */
      {  int jalpha = (int)(((float)(j - 1867216) - 0.25)
             / 36524.25);
         ja += 1 + jalpha - (int)(0.25 * jalpha);
      }
      int jb = ja + 1524;
      int jc = (int)(6680.0 + ((float)(jb-2439870) - 122.1)
          /365.25);
      int jd = (int)(365 * jc + (0.25 * jc));
      int je = (int)((jb - jd)/30.6001);
      day = jb - jd - (int)(30.6001 * je);
      month = je - 1;
      if (month > 12) month -= 12;
      year = jc - 4715;
      if (month > 2) --year;
      if (year <= 0) --year;

      internalFormat = String.valueOf(year) +
                       getNumMonth() + getNumDay() +
                       "000000";

      //Debug.write("TDate.fromJulian(): internalFormat=#" + internalFormat + "#");
   }

    public boolean isLeapYear ()
    {
        return isLeapYear (this.year);
    }

    public static boolean isLeapYear (int year)
    {
        GregorianCalendar gc = new GregorianCalendar ();
        gc.setTime (new java.util.Date (year - 1900, 0, 1));
        return gc.isLeapYear (year);
    }

    public int getDaysInMonth ()
    {
        return getDaysInMonth (this.year, this.month);
    }
    public static int getDaysInMonth (int year, int month)
    {
        int days = 0;

        // 1 = January
        if ((month == 1) || (month == 3) || (month == 5) || (month == 7)
            || (month == 8) || (month == 10) || (month == 12))
            days = 31;
        else if ((month == 4) || (month == 6) || (month == 9) || (month == 11))
            days = 30;
        else {
            if (isLeapYear (year)) days = 29;
            else days = 28;
        }

        return days;
    }

    public void addSeconds (int seconds)
    {
        int year = TemplarUtil.strToInt (internalFormat.substring (0, 4));
        int month = TemplarUtil.strToInt (internalFormat.substring (4, 6));
        int day = TemplarUtil.strToInt (internalFormat.substring (6, 8));
        int hour = TemplarUtil.strToInt (internalFormat.substring (8, 10));
        int minutes = TemplarUtil.strToInt (internalFormat.substring (10, 12));
        int second = TemplarUtil.strToInt (internalFormat.substring (12, 14));

        second = second + seconds;
        //System.out.println ("seconds = " + second);
        while (seconds > 59) {
            seconds = seconds - 60;
            minutes = minutes + 1;
            //System.out.println ("minutes = " + minutes);
            while (minutes > 59) {
                minutes = minutes - 60;
                hour = hour + 1;
                //System.out.println ("hours = " + hour);
                while (hour > 23) {
                    hour = hour - 24;
                    day = day + 1;
                    //System.out.println ("days = " + day);
                    // DR 1/12/99: this had a big problem; when the month ends, just don't add 1 day,
                    // but set the day to 1 and advance the month
                    while (day > getDaysInMonth (year, month)) {
                        day = 1;
                        month = month + 1;
                        //System.out.println ("months = " + month);
                        while (month > 12) {
                            month = 1;
                            year = year + 1;
                            //System.out.println ("years = " + year);
                        }
                    }
                }
            }
        }

        // now what if they subtracted it
        while (seconds < 0) {
            seconds = seconds + 60;
            minutes = minutes - 1;
            while (minutes < 0) {
                minutes = minutes + 60;
                hour = hour - 1;
                while (hour < 0) {
                    hour = hour + 24;
                    day = day - 1;
                    while (day < 0) {
                        // DR 1/12/99: this is a problem - go back to the last day of the new month,
                        // don't just set to day + 1.  Also make the same check for the month-year relation
                        //day = day + 1;
                        month = month - 1;
                        if (month == 0) {
                            year = year - 1;
                            month = 12;
                        }
                        day = getDaysInMonth (year, month);
                    }
                }
            }
        }
        // reset
        internalFormat = String.valueOf (year) +
                            TemplarUtil.lpad (String.valueOf (month), 2, '0') +
                            TemplarUtil.lpad (String.valueOf (day), 2, '0') +
                            TemplarUtil.lpad (String.valueOf (hour), 2, '0') +
                            TemplarUtil.lpad (String.valueOf (minutes), 2, '0') +
                            TemplarUtil.lpad (String.valueOf (second), 2, '0');
        setFields();
   }

   public static TDate getDateNullDate ()
   {
    TDate d = new TDate ();
    d.setNull ();
    return d;
   }

    public TDate getNextSunday(int numWeeks) {
        int wkDay = weekday();
        int daysAway = 0;
        if (numWeeks > 0)
            daysAway = (7 - wkDay) + (numWeeks - 1) * 7;
        else if (numWeeks < 0)
            daysAway = - ((wkDay == 0) ? 7 : wkDay) + (numWeeks + 1) * 7;

        advance(daysAway);
        return this;
    }
    
    //Gets the next occurrence of a particular day (dayCode), from
    //a particular date (now). Similar to getNextSunday
    //For example, to get the next Tuesday after a particular date, 
    //call, getNextDay(aDate, 2)
    public static TDate getNextDay(TDate now, int dayCode)
    {
        TDate nextDay = (TDate)now.clone();
        nextDay.getNextDay(1, dayCode);
        nextDay.setHour(0);
        nextDay.setMinute(0);
        nextDay.setSecond(0);
        return nextDay;
    }
    
    //Gets the next occurrence of a particular day (dayCode), after
    //a certain amt of weeks (numWeeks). SImilar to getNextSunday
    public TDate getNextDay(int numWeeks, int dayCode)
    {
        int wkDay = weekday();
        int daysAway = 0;
        if (numWeeks > 0)
        {
        	if(wkDay == 0) daysAway = dayCode;
        	else if(dayCode - wkDay < 0) daysAway = 7 - (wkDay - dayCode);
        	else daysAway = dayCode - wkDay;
        	daysAway = daysAway + ((numWeeks - 1) * 7);
        }
        else if (numWeeks < 0)
        {
        	if(wkDay == dayCode) daysAway = 7;
        	else daysAway = wkDay + (wkDay == 0 ? 0 : 1);
        	daysAway = - (daysAway + ((numWeeks + 1) * 7));
        }
            
        advance(daysAway);
        return this;
    }

    public static String convertTDateToCol (TDate d)
    {
        String s = d.getInternalFormat ();
        String c = s.substring (4, 6) + "/" +
                s.substring (6, 8) + "/" +
                s.substring (0, 4);
        return c;
    }

    // DR 9/28/00: ensures that the string is in format YYYY/MM/DD
    public static boolean validateInternationalDate (String s)
    {
        if (s.length () != 10) return false;
        if (s.charAt (4) != '/' || s.charAt (7) != '/') return false;
        String strip = new String (TemplarUtil.stripChar (s, '/'));
        try {
            int year = TemplarUtil.strToInt (strip.substring (0, 4));
            int month = TemplarUtil.strToInt (strip.substring (4, 6));
            int day = TemplarUtil.strToInt (strip.substring (6, 8));
            if (year < 0) return false;
            if (month < 0 || month > 12) return false;
            if (day < 1 || day > getDaysInMonth (year, month)) return false;
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }

    // 9/28/00
    public void setWithInternationalDate (String s)
    throws IllegalArgumentException
    {
        if (!validateInternationalDate (s)) throw new IllegalArgumentException ("Invalid international date format.");
        internalFormat = s.substring (0, 4) + s.substring (5, 7) + s.substring (8, 10) + "000000";
        setFields();
    }

	// DR 11/17/01: had to move this method from TemplarUtil, since there was cyclical dependency during the build
    public static TDate getNextSunday(TDate now) {
        TDate nextSunday = (TDate)now.clone();
        nextSunday.getNextSunday(1);
        nextSunday.setHour(0);
        nextSunday.setMinute(0);
        nextSunday.setSecond(0);
        return nextSunday;
    }
	
	// DR 11/17/01: had to move this method from TemplarUtil, since there was cyclical dependency during the build
    public static TDate getPrevSunday(TDate now) {
        TDate prevSunday = (TDate)now.clone();
        prevSunday.getNextSunday(-1);
        prevSunday.setHour(0);
        prevSunday.setMinute(0);
        prevSunday.setSecond(0);
        return prevSunday;
    }
	
    public static int getWeekdayCount(int year, int month){
		int days = getDaysInMonth(year,month);
		int weekdays =0;
		TDate date = new  TDate();
		date.setNull();
		date.setYear(year);
		date.setMonth(month);
		for(int i =1; i <= days; i++){
			date.setDay(i);
			// 0 is Sunday  & 6 is Sat
			if ((date.weekday() != 0)  && (date.weekday() != 6))
				weekdays++;
		}
		return weekdays;
	}

   /**
    * Computes the difference between two TDates in seconds
    * @return long seconds
    */
	public static long difference (TDate a, TDate b)
	{
		return Math.abs (a.daysBetween (b)) * 86400 +
					(Math.abs (a.getHour () - b.getHour ())) * 3600 +
					(Math.abs (a.getMinute () - b.getMinute ())) * 60 +
					Math.abs (a.getSecond () - b.getSecond ());
	}
	
	/** Sets this TDate object to the current date/time.
	 */
	public void setNow ()
	{
        set (new java.util.Date ());
	}
	
}
