//package entityModels;
//import java.util.Date;
//
//import org.apache.commons.mail.DefaultAuthenticator;
//import org.apache.commons.mail.Email;
//import org.apache.commons.mail.EmailAttachment;
//import org.apache.commons.mail.EmailException;
//import org.apache.commons.mail.MultiPartEmail;
//import org.apache.commons.mail.SimpleEmail;
//
//
//public class Sendmail extends MyRunner {
//
//	
//	   public static void sendTestReportEmail() throws EmailException {
//	        System.out.println("==========Test Started==================");
//	        MultiPartEmail email = new MultiPartEmail();
//	        email.setHostName("smtp.gmail.com");
//	        email.setSmtpPort(465);
////	        email.setAuthenticator(new DefaultAuthenticator("mudili.sivakumar@gaiansolutions.com", "Gaian1602@123"));
//	        email.setAuthenticator(new DefaultAuthenticator("anil.g@gaiansolutions.com", "Suchi@0503"
//	        		+ ""));
//
//	        email.setSSLOnConnect(true);
//	        email.setFrom("anil.g@gaiansolutions.com");
//	        email.setSubject("Auto Generated Mail : PI UI Automation test report");
//	        email.setMsg("Dear Team,\n\n"
//	        		+ "please find the PI UI Automation test report\n\n"
//	        		+ "Thanks & Regards\n"
//	        		+ "QA Automation Team.\n\n"
//	        		+ "Note: For browser compatibility problems, please download and open the report");
//	        email.addCc("mudili.sivakumar@gaiansolutions.com");
//	        email.addTo("anil.g@gaiansolutions.com");
//	        email.addCc("charu.hasini@gaiansolutions.com");
//	        email.addCc("divya.bharathi@gaiansolutions.com");
//
//
//	        
//	        
////	        email.addTo("third@example.com");
//
//	        // Attach the HTML file
//	        EmailAttachment attachment = new EmailAttachment();
//	        System.out.println(report1);
//
////	        Date d = new Date();
////	        String fileName = d.toString().replace(":", "_").replace(" ", "_") + ".html";
//	        attachment.setPath(System.getProperty("user.dir") +"/"+report1);
//	        
//	        attachment.setDisposition(EmailAttachment.ATTACHMENT);
//	        email.attach(attachment);
//	      
//
//	        email.send();
//	        System.out.println("==========Email sent==================");
//	    }
//}
