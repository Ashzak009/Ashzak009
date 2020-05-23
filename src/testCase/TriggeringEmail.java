package testCase;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;
import org.testng.annotations.Test;
//import org.testng.annotations.Test;

public class TriggeringEmail 
{
	@Test
	public static void sendingPlainMail() throws EmailException
	{
		System.out.println("===========STARTED===============");
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("t991153@gmail.com", "Prashanth1"));
		//email.setSSLCheckServerIdentity(true);
		email.setSSLOnConnect(true);
		email.setFrom("d.v.krupa@gmail.com");
		email.setSubject("sending report");
		email.addTo("krupa.ecourierz@gmail.com");
		email.send();
		System.out.println("===========END===============");
	}
	@Test(enabled=false)
	public static void SendingMailWithAttachment() throws EmailException
	{
		// Create the attachment
		  EmailAttachment attachment = new EmailAttachment();
		  attachment.setPath("C:\\Users\\Windows\\Downloads\\721080676.pdf");
		  attachment.setDisposition(EmailAttachment.ATTACHMENT);
		  attachment.setDescription("Trial mail, sending label");
		  attachment.setName("Battu");

		  // Create the email message
		  MultiPartEmail email = new MultiPartEmail();
		  email.setHostName("mail.myserver.com");
		  //email.setSmtpPort(465);
		  email.addTo("krupa.ecourierz@gmail.com", "John Doe");
		  email.setFrom("t991153@gmail.com", "Me");
		  email.setSubject("LABEL");
		  email.setMsg("Here is the label you wanted");

		  // add the attachment
		  email.attach(attachment);

		  // send the email
		  email.send();
	}

}
