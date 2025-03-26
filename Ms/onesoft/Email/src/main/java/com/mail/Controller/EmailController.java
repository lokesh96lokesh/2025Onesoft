package com.mail.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mail.Entity.MailSend;
import com.mail.Repository.EmailRepository;
import com.mail.Service.EmailService;

@RestController
@RequestMapping("/EMail")
public class EmailController {

	@Autowired
	EmailService es;
	
	@Autowired
	EmailRepository er;
	
	// using request param key value pair
	@PostMapping("/send-Mail")
	public String sendMail(@RequestParam String to, @RequestParam String subject, @RequestParam String body) {
		return es.sendMail(to, subject, body);
	}

	// using json format requestbody
	@PostMapping("/simpleMail")
	public String sendMails(@RequestBody MailSend e) {
		return es.sendMails(e);
	}

	// bulk sending
	@PostMapping("/bulk")
	public String bulkemail(@RequestBody List<MailSend> maillist) {
		return es.bulkemail(maillist);
	}
	
	//image attachement
	@PostMapping("/imageupload")
	public String imgsend(@RequestBody MailSend m) {
		return es.imgmailSend(m);
	}
	
	@GetMapping("/get/{id}")
	public Optional<MailSend> getMethodName(@PathVariable int id) {
		return er.findById(id);
	}
	
}









