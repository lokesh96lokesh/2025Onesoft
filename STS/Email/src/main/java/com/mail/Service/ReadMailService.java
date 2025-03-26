package com.mail.Service;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import jakarta.mail.Folder;
import jakarta.mail.Message;
import jakarta.mail.Session;
import jakarta.mail.Store;

@Service
public class ReadMailService {
	
	 @Value("${spring.mail.username}")
	    private String username;
	 
	 @Value("${spring.mail.password}")
	    private String password;
	 
	 @Value("${spring.mail.host}")
	    private String host;
	 
	 @Value("${spring.mail.port}")
	    private int port;
	
	public String readmail() {
        try {
            // Configure properties
            Properties properties = new Properties();
            properties.put("mail.store.protocol", "imaps");
            properties.put("mail.imaps.ssl.enable", "true");

            // Connect to email
            Session session = Session.getInstance(properties);
            Store store = session.getStore("imaps");
            store.connect(host, port, username, password);

            // Access Inbox
            Folder inbox = store.getFolder("INBOX");
            inbox.open(Folder.READ_ONLY);

            // Read Emails
            Message[] messages = inbox.getMessages();
            StringBuilder result = new StringBuilder();

            for (Message message : messages) {
                result.append("Subject: ").append(message.getSubject()).append("\n");
                result.append("From: ").append(message.getFrom()[0]).append("\n");
                result.append("------------------------\n");
            }

            // Close Resources
            inbox.close(false);
            store.close();
            System.out.println("hello");
            return result.toString();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Error: " + e.getMessage();
        }
    }
}


