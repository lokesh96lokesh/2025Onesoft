package com.MarkSheet.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;import org.yaml.snakeyaml.error.Mark;

import com.MarkSheet.Entity.MarkSheet;
import com.MarkSheet.Repository.MarksheetRepository;

@Repository
public class MarksheetDao {
	@Autowired
	MarksheetRepository r;
	public String postMethod(List<MarkSheet> m) {
		r.saveAll(m);
		return "Save All Details SuccessFully";
	}
	public List<MarkSheet> getMethod() {
		return r.findAll();
	}

}
