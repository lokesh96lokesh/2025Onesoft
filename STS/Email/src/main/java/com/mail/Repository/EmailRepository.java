package com.mail.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mail.Entity.MailSend;

public interface EmailRepository extends JpaRepository<MailSend, Integer>{

	

}
