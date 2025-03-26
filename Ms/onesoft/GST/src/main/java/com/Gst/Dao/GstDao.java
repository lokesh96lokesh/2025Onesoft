package com.Gst.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Gst.Entity.GstEntity;
import com.Gst.Repository.GstRepository;

@Repository
public class GstDao {
	@Autowired
	GstRepository gr;

	public String postAll(List<GstEntity> g) {
		gr.saveAll(g);
		return "Posted SuccessFully";
	}
//finding percentage for match hsn code
	public List<GstEntity> getPercentage(int a) {
		return  gr.findAll();
	}
}
