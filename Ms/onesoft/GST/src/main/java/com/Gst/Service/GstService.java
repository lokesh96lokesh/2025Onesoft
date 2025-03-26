package com.Gst.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Gst.Dao.GstDao;
import com.Gst.Entity.GstEntity;

@Service
public class GstService {
	@Autowired
	GstDao gd;

	public String postAll(List<GstEntity> g) {
		return gd.postAll(g);
	}

	public List<GstEntity> getPercentage(int a) {
		List<GstEntity> gstList = gd.getPercentage(a);
		int store=0;
		for(GstEntity gst :gstList) {
			if(gst.getHsncode()==a)
				 store= gst.getPercentage();
		}
		return gstList;
	}
}
