package com.mail.Service;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.mail.Dao.EmailDao;
import com.mail.Entity.MailSend;
import com.mail.Repository.EmailRepository;

import jakarta.mail.internet.MimeMessage;

@Service
public class EmailService {

	@Autowired
	private JavaMailSender ms;

	@Autowired
	private EmailDao dao;

	@Value("${spring.mail.username}") // take the value in application properties
	private String sender;

	// using request param key value pair
	public String sendMail(String to, String subject, String body) {
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo(to);
		msg.setSubject(subject);
		msg.setText(body);
		ms.send(msg);
		return "send SuccessFully";
	}

	// single mail send using json format requestbody
	public String sendMails(MailSend e) {
		try {
			SimpleMailMessage sm = new SimpleMailMessage();
			sm.setFrom(sender);
			sm.setTo(e.getReceipient());
			sm.setText(e.getMsgBody());
			sm.setSubject(e.getSubject());
			ms.send(sm);
			return dao.sendMails(e);
		} catch (Exception er) {
			return er.getMessage();
		}
	}

	// bulk sending
	public String bulkemail(List<MailSend> maillist) {
		try {
			for (MailSend sent : maillist) {
				SimpleMailMessage sm = new SimpleMailMessage();
				sm.setFrom(sender);
				sm.setTo(sent.getReceipient());
				sm.setText(sent.getMsgBody());
				sm.setSubject(sent.getSubject());
				ms.send(sm);
			}
			return dao.bulkemail(maillist);
		} catch (Exception e) {
			System.out.println("hello there is a exception");
			return e.getMessage();
		}
	}

	// image attachement
	public String imgmailSend(MailSend m) {
		MimeMessage msg = ms.createMimeMessage();
		try {
			MimeMessageHelper msh = new MimeMessageHelper(msg,true);
			msh.setFrom(sender);
			msh.setTo(m.getReceipient());
			msh.setText(m.getMsgBody());
			msh.setSubject(m.getSubject());
			// Validate and Attach Image
			File file = new File(m.getAttachment());
			if(file.exists()&&file.isFile()) {
				FileSystemResource source =  new FileSystemResource(file);
				msh.addAttachment(source.getFilename(), source);
			}else {
				return "attachement not found!";
			}
			ms.send(msg);
			dao.imgmailSend(m);
			
			return "Image send and store Succesffully";
		} catch (Exception e) {
			e.printStackTrace();
			dao.imgmailSend(m);//store error details in dao
			return "failed to send email: "+ e.getMessage();
		}
	}
}
