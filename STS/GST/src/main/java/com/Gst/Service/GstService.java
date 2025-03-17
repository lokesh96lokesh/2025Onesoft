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

	public int getPercentage(int a) {
		return gd.getPercentage(a);
	}
}
