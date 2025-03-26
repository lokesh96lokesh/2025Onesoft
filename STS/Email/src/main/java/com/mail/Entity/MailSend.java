
package com.mail.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="email")
public class MailSend {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String receipient;
	private String msgBody;
	private String subject;
	@Lob
	private String attachment;
}
