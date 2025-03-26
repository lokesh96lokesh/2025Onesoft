package com.Bank.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@Entity
@Table(name = "Bank_details")
@AllArgsConstructor
public class Bank {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String bankname;
	private String branch;
	private String ifsc_code;
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getBankname() {
//		return bankname;
//	}
//	public void setBankname(String bankname) {
//		this.bankname = bankname;
//	}
//	public String getBranch() {
//		return branch;
//	}
//	public void setBranch(String branch) {
//		this.branch = branch;
//	}
//	public String getIfsc_code() {
//		return ifsc_code;
//	}
//	public void setIfsc_code(String ifsc_code) {
//		this.ifsc_code = ifsc_code;
//	}
	
}
