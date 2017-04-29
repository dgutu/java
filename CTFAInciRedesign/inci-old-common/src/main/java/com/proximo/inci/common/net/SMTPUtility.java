package com.proximo.inci.common.net;

import java.util.Vector;
import java.util.Properties;
import java.util.StringTokenizer;
import javax.mail.*;
import javax.mail.internet.*;
import java.io.*;
import javax.activation.*;

//************************************************************
/** This class has general utilities to send e-mails.
 */
public class SMTPUtility {

	static ProxMailAuthenticator auth = null;
	static String ccList = null;

	//************************************************************
	/** Sets the user id and password for sending a mail through an SMTP server that requires authentication.
	 *	Must be called before each call to any method that actually sends mail.
	 */
	// DR 12/7/01: save ID and password for sending mail; must be called before each call to sendMail, if required
	static public void setSMTPUserIDPassword (String id, String pwd)
	{
		if (auth != null) auth = null;
		auth = new ProxMailAuthenticator (id, pwd);
	}

	//************************************************************
	/** Can be called to clear the previous data set by calling setSMTPUserIDPassword
	 */
	// DR 1/16/02: clear the auth info
	static public void clearAuthInfo ()
	{
		auth = null;
	}

	//************************************************************
	/** Sends a mail with the specified subject line and body.  Sends to a single e-mail address.
	 *	The mail is always rich-text format.  If "from" has a "+" in it, then everything after 
	 * "+" is the "personal" address, while before is the real address
	 */
    static public void sendMail(String from, String to, String smtp, String subject, String body)
    throws MessagingException, AddressException
    {
        String[] s = {to};
        sendMail(from, s, smtp, subject, body);
        s = null;
    }

	//************************************************************
	/** Sends a mail with the specified subject line and body.  Sends to a single e-mail address.
	 *	The body may be multiple strings.
	 *	The mail is always rich-text format.If "from" has a "+" in it, then everything after 
	 * "+" is the "personal" address, while before is the real address
	 */
    static public void sendMail(String from, String to, String smtp, String subject, String[] body)
    throws MessagingException, AddressException
    {
        String[] s = {to};
        sendMail(from, s, smtp, subject, body);
    }

	//************************************************************
	/** Sends a mail with the specified subject line and body and attachment.  The attachment must exist in
	 *  the place specified by directory and file parameters (file is the file name).  The directory must be on the
	 *	computer on which this class executes or to which the computer has a drive mapping.
	 *  Sends to a single e-mail address.
	 *	The mail is always rich-text format.
	 * If "from" has a "+" in it, then everything after 
	 * "+" is the "personal" address, while before is the real address
	 */
    static public void sendFileAttach(String from, String to, String smtp, String subject, String body, String directory, String file)
    throws MessagingException, AddressException
    {
        String[] s = {to};
        sendFileAttach(from, s, smtp, subject, body, directory, file);
        s = null;
    }

	//************************************************************
	/** Sends a mail with the specified subject line and body.  Sends to multiple e-mail addresses.
	 *	The mail is always rich-text format.If "from" has a "+" in it, then everything after 
	 * "+" is the "personal" address, while before is the real address
	 */
    static public void sendMail(String from, String[] to, String smtp, String subject, String body)
    throws MessagingException, AddressException
    {
        String[] bodyArray = {null, body, null};
        sendMail(from, to, smtp, subject, bodyArray);
    }

	//************************************************************
	/** Sends a mail with the specified subject line and body.  Sends to a single e-mail address.
	 *	The mail is always simple text format.If "from" has a "+" in it, then everything after 
	 * "+" is the "personal" address, while before is the real address
	 */
    static public void sendTextMail(String from, String to, String smtp, String subject, String body)
    throws MessagingException, AddressException
    {
        String[] s = {to};
        sendTextMail(from, s, smtp, subject, body);
        s = null;
    }

	//************************************************************
	/** Sends a mail with the specified subject line and body.  Sends to multiple e-mail addresses.
	 *	The mail is always simple text format.If "from" has a "+" in it, then everything after 
	 * "+" is the "personal" address, while before is the real address
	 */
    static public void sendTextMail(String from, String[] to, String smtp, String subject, String body)
    throws MessagingException, AddressException
    {
        String[] bodyArray = {body, null, null};
        sendMail(from, to, smtp, subject, bodyArray);
    }

	/** If "from" has a "+" in it, then everything after 
	 * "+" is the "personal" address, while before is the real address
	 */
	static private InternetAddress getInternetAddress (String from)
    throws AddressException
	{
		//System.out.println ("from = " + from);
		try {
			InternetAddress addr = null;
			int x = from.indexOf ("+");
			//System.out.println ("x = " + x);
			if (x != -1) {
				String email = from.substring (0, x);
				String personal = from.substring (x + 1);
				//System.out.println ("email = " + email);
				//System.out.println ("personal = " + personal);
				addr = new InternetAddress(email);
				addr.setPersonal (personal);
			} else addr = new InternetAddress(from);
			return addr;
		} catch (UnsupportedEncodingException e) {
			throw new AddressException (e.toString ());
		}
	}
	
	//************************************************************
	/** Sends a mail with the specified subject line and body.  Sends to multiple e-mail addresses.
	 *	The body may be multiple strings.
	 *	The mail is always rich-text format.
	 * If "from" has a "+" in it, then everything after 
	 * "+" is the "personal" address, while before is the real address
	 */
    static public void sendMail(String from, String[] to, String smtp, String subject, String[] body)
    throws MessagingException, AddressException
    {
        int i;
        //System.out.println("dEBUG1");
        for(i = 0; i < to.length; i++) {
            //System.out.println("dEBUG2");
    	    Properties props = System.getProperties();
    	    //System.out.println("dEBUG3");
    	    // Setup mail server
    	    props.put("mail.smtp.host", smtp);
    	    props.put("mail.smtp.auth", "true");
    	    //System.out.println("dEBUG4");
            // Get session
    	    Session session = Session.getInstance(props, auth);
    	    //System.out.println("dEBUG5");
            // Define message
            //System.out.println("dEBUG6");
            MimeMessage message = new MimeMessage(session);
            //System.out.println("dEBUG7");
			message.setFrom(getInternetAddress (from));
    	    //System.out.println("dEBUG8");
            message.addRecipient(Message.RecipientType.TO,
            new InternetAddress(to[i]));
            //System.out.println("dEBUG10");
            message.setSubject(subject);
            //System.out.println("dEBUG11");
            //message.setText(body);
            //System.out.println("dEBUG12");
			if (ccList != null && !ccList.trim().equals(""))
				message.setRecipients(Message.RecipientType.CC, InternetAddress.parse(ccList) );

            MimeMultipart multipart = new MimeMultipart("alternative");
            BodyPart bodyPartText = new MimeBodyPart();
            BodyPart bodyPartHtml = new MimeBodyPart();
            BodyPart bodyPartImage = new MimeBodyPart();

            if (body[2] != null) {
                bodyPartImage.setDisposition(Part.INLINE);
                FileDataSource fds = new FileDataSource(body[2]);
                bodyPartImage.setFileName(fds.getName());
                bodyPartImage.setDataHandler(new DataHandler(fds));
                bodyPartImage.setHeader("Content-ID", "23abc@pc27");
                //-----message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
            }

            // THESE METHODS JUST RETURN TEXT OR HTML, RESPECTIVELY
            String textContent = body[0];
            String htmlContent = body[1];

            // SEND A HTML AND TEXT ALTERNATIVE EMAIL FOR THOSE WHO DON'T SUPPORT HTML
            if (body[0] != null && !body[0].equals("")) {
                message.setText(textContent);
            }

            if (body[1] != null) {
                bodyPartText.setContent("", "text/plain");
                bodyPartHtml.setContent(htmlContent, "text/html");

                multipart.addBodyPart(bodyPartText, 0);
                multipart.addBodyPart(bodyPartHtml ,1);
                if (body[2] != null) multipart.addBodyPart(bodyPartImage, 2);
                message.setContent(multipart);
            }

            // SEND THE MESSAGE
            Transport.send( message );
            //System.out.println("dEBUG13");
            message = null;
            session = null;
            props = null;
        }
        auth= null;
        ccList = null;
    }

	//************************************************************
	/** Sends a mail with the specified subject line and body and attachment.  The attachment must exist in
	 *  the place specified by directory and file parameters (file is the file name).  The directory must be on the
	 *	computer on which this class executes or to which the computer has a drive mapping.
	 *  Sends to a multiple e-mail addresses.
	 *	The mail is always simple text format.
	 * If "from" has a "+" in it, then everything after 
	 * "+" is the "personal" address, while before is the real address
	 */
    static public void sendFileAttach(String from, String[] to, String smtp, String subject, String body, String directory, String file)
    throws MessagingException, AddressException
    {
        Vector fileVec = new Vector();
        fileVec.addElement(new File(directory, file));
        
        sendFileAttach(from, to, smtp, subject, body, fileVec);
    }
    
    static public void sendFileAttach(String from, String[] to, String smtp, String subject, String body, Vector fileVec)
    throws MessagingException, AddressException
    {
        int i;
        for(i = 0; i < to.length; i++) {
            Properties props = System.getProperties();
            // Setup mail server
    	    props.put("mail.smtp.host", smtp);
    	    props.put("mail.smtp.auth", "true");
    	    // Get session
    	    Session session = Session.getInstance(props, auth);
    		// Define message
    	    MimeMessage message = new MimeMessage(session);
    	    // create the message part
			message.setFrom(getInternetAddress (from));
            message.addRecipient(Message.RecipientType.TO,
            new InternetAddress(to[i]));
            message.setSubject(subject);
            message.setText(body);

            MimeBodyPart messageBodyPart = new MimeBodyPart();
            //fill message
            messageBodyPart.setText(body);
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);
            
            // fill the Vector of files to be attached
            for (int k = 0; k < fileVec.size(); k++) {
                File attachment = (File)fileVec.elementAt(k);
                messageBodyPart = new MimeBodyPart();
                FileDataSource fileDataSource =new FileDataSource(attachment);
                messageBodyPart.setDataHandler(new DataHandler(fileDataSource));
                messageBodyPart.setFileName(attachment.getName());
                multipart.addBodyPart(messageBodyPart);
            }
            
            message.setContent(multipart);
            Transport.send( message );
        }
        auth= null;
    }

	//************************************************************
	/** Sends a mail with the specified subject line and body and attachment.  The attachment must exist in
	 *  the place specified by directory and file parameters (file is the file name).  The directory must be on the
	 *	computer on which this class executes or to which the computer has a drive mapping.
	 *  Sends to a multiple e-mail addresses.
	 *	The mail is always HTML format.If "from" has a "+" in it, then everything after 
	 * "+" is the "personal" address, while before is the real address
	 */
    static public void sendHTMLFileAttach(String from, String[] to, String smtp, String subject, String body, String directory, String file)
    throws MessagingException, AddressException
    {
        Vector fileVec = new Vector();
        fileVec.addElement(new File(directory, file));
        sendHTMLFileAttach(from, to, smtp, subject, body, fileVec);
    }
    
    static public void sendHTMLFileAttach(String from, String[] to, String smtp, String subject, String body, Vector fileVec)
    throws MessagingException, AddressException
    {
        int i;
        for(i = 0; i < to.length; i++) {
            Properties props = System.getProperties();
            // Setup mail server
    	    props.put("mail.smtp.host", smtp);
    	    props.put("mail.smtp.auth", "true");
    	    // Get session
    	    Session session = Session.getInstance(props, auth);
    		// Define message
    	    MimeMessage message = new MimeMessage(session);
    	    // create the message part
			message.setFrom(getInternetAddress (from));
            message.addRecipient(Message.RecipientType.TO,
            new InternetAddress(to[i]));
            message.setSubject(subject);
            //message.setText(body);

            Multipart multipart = new MimeMultipart();

            //fill message
            //messageBodyPart.setText(body);
            MimeBodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setContent(body, "text/html");
            multipart.addBodyPart(messageBodyPart);

            // fill the Vector of files to be attached
            for (int k = 0; k < fileVec.size(); k++) {
                File attachment = (File)fileVec.elementAt(k);
                messageBodyPart = new MimeBodyPart();
                FileDataSource fileDataSource =new FileDataSource(attachment);
                messageBodyPart.setDataHandler(new DataHandler(fileDataSource));
                messageBodyPart.setFileName(attachment.getName());
                multipart.addBodyPart(messageBodyPart);
            }
            
            message.setContent(multipart);
            Transport.send( message );
        }
        auth= null;
    }

	//************************************************************
	/** Reads a from a POP mail account.  This method is provided only as a test.  If the mail is read without error
	 *	a true is returned.  false is returned if any error is encountered.
	 */
	public static boolean readMail (String host, String userName, String password) throws Exception {

        boolean mailRead = false;
        // Create empty properties
        Properties props = new Properties();

        // Get session
        Session session = Session.getInstance(props, null);

        // Get the store
        Store store = session.getStore("pop3");
        store.connect(host, userName, password);
        // Get folder
        Folder folder = store.getFolder("INBOX");
        folder.open(Folder.READ_ONLY);

        BufferedReader reader = new BufferedReader (
        new InputStreamReader(System.in));

        // Get directory
        Message message[] = folder.getMessages();

        for (int i=0, n=message.length; i<n; i++) {
        //System.out.println(i + ": " + message[i].getFrom()[0]+ "\t" + message[i].getSubject());
        //System.out.println("dEBUG1");
        mailRead = true;
        //System.out.println("dEBUG2");
        message[i].setFlag(Flags.Flag.DELETED, true);
        //System.out.println("dEBUG3");
        }
    // Close connection
    //System.out.println("dEBUG4");
    folder.close(true);
    //System.out.println("dEBUG5");
    store.close();
    //System.out.println("dEBUG6");
    return mailRead;
    }

	//************************************************************
	/** This method will open a pop mail box and read through all messages.  If the from e-mail on the message
	 *	equals the from parameter (case-sensitive) the attachment of the message (if any) is downloaded to
	 *  the directory indicated by the directory parameter.  The directory must be on the
	 *	computer on which this class executes or to which the computer has a drive mapping.
	 *  The file name of the attachment is kept.  The message is then deleted.
	 */
    //GN 09/04/2001 for LancomePro
    public static boolean saveMailAtt (String host, String userName, String password, String from, String directory)
        throws Exception
    {
        //System.out.println("in save");
        //System.out.println("userName " + userName);
        //System.out.println("password " + password);
        //System.out.println("host " + host);
        int msgFound = -1;
        boolean mailRead = false;
        // Create empty properties
        Properties props = new Properties();

        // Get session
        Session session = Session.getInstance(props, null);

        // Get the store
        //System.out.println("get Store, connect");
        Store store = session.getStore("pop3");
        store.connect(host, userName, password);
        // Get folder
        //System.out.println("get Folder, INBOX");
        Folder folder = store.getFolder("INBOX");
        folder.open(Folder.READ_ONLY);

        BufferedReader reader = new BufferedReader (
        new InputStreamReader(System.in));

        // Get directory
        Message message[] = folder.getMessages();

        Address[] address;
        //System.out.println("# of msg " + message.length);

        for (int i=0, n=message.length; i<n; i++)
        {
            address = message[i].getFrom();
            //System.out.println("from: " + address[0].toString());
            //System.out.println("infrom: " + from);
            if (from.equals(address[0].toString()))
            {
               //System.out.println("msg found");
               msgFound = i;
            }
        }
        for (int i=0, n=message.length; i<n; i++)
        {
            address = message[i].getFrom();
            if (from.equals(address[0].toString()))
            {
                if (msgFound != i)
                {
                    mailRead = true;
                    message[i].setFlag(Flags.Flag.DELETED, true);
                    //System.out.println("bad msg, i = " + i);
                }
                else
                {
                    //System.out.println("good msg" + i);
                    try{
                        Object obj = message[i].getContent();

                        if (message[i].isMimeType("multipart/mixed"))
                        {
                            Multipart multi = (Multipart)obj;
                            Part part = multi.getBodyPart(1);
                            String disp = part.getDisposition();

                            if (disp == null || disp.equalsIgnoreCase(Part.ATTACHMENT))
                            {
                                File dir = new File(directory);
                                if (dir.exists())
                                {
                                    if (!dir.isDirectory())
                                    {
                                        dir.mkdir();
                                    }
                                }
                                else
                                {
                                    dir.mkdir();
                                }

                                String att = directory + part.getFileName();
                                //System.out.println("Filename = " + att);
                                FileOutputStream out = new FileOutputStream(att);
                                InputStream in = part.getInputStream();
                                int c;
                                while ((c = in.read()) != -1)
                                {
                                    out.write(c);
                                }
                                out.flush();
                                out.close();
                            }
                            /*else
                            {
                                System.out.println(obj.toString());
                            }*/
                        }
                        mailRead = true;
                        //message[i].setFlag(Flags.Flag.DELETED, true);
                        //System.out.println("Done");
                    }catch (MessagingException mex){
                        mex.printStackTrace();
                        throw new Exception ("Error with the message. " + mex);
                    }catch (java.io.IOException ioe){
                        ioe.printStackTrace();
                        throw new Exception ("Error with the IO. " + ioe);
                    }catch (Exception e){
                        e.printStackTrace();
                        throw new Exception ("Other error. " + e);
                    }
                }
            }
        }
        // Close connection
        folder.close(true);

        store.close();

        return mailRead;
    }
	
	/**
     * Set cc list in Email, each email list should seperated by comma.
     * Added by yyang @ 10.7.2004
     */
	public static void setCCList(String cc){
		if (ccList != null) ccList = null;
		ccList = cc;
	}	

	public static String getCCList(){
		return ccList;
	}	
	
	//************************************************************
	/** A mail will be sent if this class is called from the command line.  The parameter order is:
	 *
	 *		0 = to e-mail address
	 *		1 = from e-mail address
	 *		2 = subject line
	 *		3 = body of the mail
	 *		4 = SMTP server IP
	 *		5 = directory of the attachment (optional)
	 *		6 = file name of the attachment (optional)
	 *
	 * 	Calling from the command line only works with the Proximo SMTP server.
	 */
    // DR 8/17/00:
	public static void main (String args[])
	{
	    System.out.println ("Starting Mail Utility");
		System.out.println("by Proximo Consulting Services, Inc.\n" +
							"Copyright© 2000-2005, All Rights Reserved\n" +
							"This program is protected by United States and International copyright law.");

	    try {
			System.setSecurityManager (new SecurityManager ());

			String to[] = {args[0]};
			String from = new String (args[1]);
			String subject = new String (args[2]);
			String body = new String (args[3]);
			String mailServer = new String (args[4]);
			String directory = null;
			String attachment = null;
			System.out.println ("args.length = " + args.length);
			System.out.println ("args = " + args);
			if (args.length > 5) {
			    directory = new String (args[5]);
			    attachment = new String (args[6]);
			}

			System.out.println ("mailServer = " + mailServer);
            StringTokenizer st = new StringTokenizer(mailServer, "+");
            int count = 0;
            String mailServerIP = null;
            String userID = null;
            String password = null;
            while (st.hasMoreElements ()) {
                count++;
                if (count == 1) mailServerIP = st.nextToken ();
                else if (count == 2) userID = st.nextToken ();
                else if (count == 3) password = st.nextToken ();
            }

			if (userID == null || password == null) SMTPUtility.setSMTPUserIDPassword ("donotreply@proximolistmanager.com", "qp56xn");
			else SMTPUtility.setSMTPUserIDPassword (userID, password);

			if (directory != null)
                SMTPUtility.sendHTMLFileAttach (from, to, mailServerIP, subject, body, directory, attachment);
			else
			    SMTPUtility.sendMail (from, to, mailServerIP, subject, body);

		} catch (Exception e) {
			System.out.println ("Error sending e-mail: " + e.toString ());
			System.exit (-1);
		}
	}
}

class ProxMailAuthenticator extends javax.mail.Authenticator
{
	PasswordAuthentication pa;

	public ProxMailAuthenticator (String id, String pwd)
	{
		pa = new PasswordAuthentication (id, pwd);
	}

	public PasswordAuthentication getPasswordAuthentication()
	{
		return pa;
	}
}
