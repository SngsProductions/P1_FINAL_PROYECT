package co.edu.unbosque.model;

import java.util.Properties;
import java.util.Random;

import javax.mail.Authenticator;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

public class Email {

    private Transport t;
    private Properties prop;
    private RecipientType m;
    private MimeMessage mail;
    private String ad_user;
    private String ad_pass;
    private String dest_email;
    private String content_e;
    private String code_aut;
    private String code;
    private String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private Random r;
    private StringBuilder sb;
    private int length;

    public Email() {
    }

    public Email(String email) {

        prop = new Properties();
        prop.put("mail.smtp.host", "smtp.office365.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(prop, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(ad_user, ad_pass);
            }
        });

        ad_user = "pruebasSngCode@outlook.es";
        ad_pass = "picoEsGay";
        dest_email = email;

        try {
            mail = new MimeMessage(session);
            mail.setFrom(new InternetAddress(ad_user));
            mail.setRecipients(RecipientType.TO, InternetAddress.parse(email));

            mail.setSubject("Código de autenticación");
            mail.setText("Tu código de autenticación es: " + generateCode());
            Transport.send(mail);
            System.out.println("EMAIL SENT SUCCESSFULLY");

        } catch (MessagingException e) {
            System.out.println("FAILED TO SEND EMAIL: " + e.getMessage());
        }
    }

    private String generateCode() {
        r = new Random();
        sb = new StringBuilder();
        length = 8;

        for (int i = 0; i < length; i++) {
            int index = r.nextInt(chars.length());
            char rchar = chars.charAt(index);
            sb.append(rchar);
        }
        code = sb.toString();
        return code;
    }

	public MimeMessage getMail() {
		return mail;
	}

	public void setMail(MimeMessage mail) {
		this.mail = mail;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
    
    
}