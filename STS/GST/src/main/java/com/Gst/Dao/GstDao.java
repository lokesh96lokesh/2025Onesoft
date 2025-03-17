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

	public int getPercentage(int a) {
		List<GstEntity> gstList = gr.findAll();
		
		for(GstEntity gst :gstList) {
			if(gst.getHsncode()==a)
				return gst.getPercentage();
		}
		return 0;
	}
}
