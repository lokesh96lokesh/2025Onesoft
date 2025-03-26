package com.mail.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mail.Entity.MailSend;
import com.mail.Repository.EmailRepository;

@Repository
public class EmailDao {
	@Autowired
	EmailRepository er;

	public String sendMails(MailSend e) {
		er.save(e);
		return "Mail Sent SuccessFully";
	}

	public String bulkemail(List<MailSend> maillist) {
		er.saveAll(maillist);
		return "Bulk email Sended Successfully";
	}

	public MailSend imgmailSend(MailSend m) {
		return er.save(m);
	}

}
