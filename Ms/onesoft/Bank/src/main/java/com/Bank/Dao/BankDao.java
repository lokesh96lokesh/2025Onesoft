package com.Bank.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Bank.Entity.Bank;
import com.Bank.Repository.BankRepository;
@Repository
public class BankDao {
	@Autowired 
	BankRepository br;
	public String postAll(List<Bank> b) {
		br.saveAll(b);
		return "Saved SuccessFully";
	}
	public String getIFSC(String a) {
		List<Bank> branch = br.findAll();
		String store ="";
		for(Bank b :branch) {
			if(b.getIfsc_code().equals(a))
				store =b.getBranch();
		}
		return store;
	}

}
