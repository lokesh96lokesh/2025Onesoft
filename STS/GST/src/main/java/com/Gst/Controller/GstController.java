package com.Gst.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Gst.Entity.GstEntity;
import com.Gst.Service.GstService;

@RestController
@RequestMapping(value = "/GST")
public class GstController {
	@Autowired
	GstService gs;
	
	@PostMapping("/postAll")
	public String postAll(@RequestBody List<GstEntity> g) {
		return gs.postAll(g);
	}
	
	@GetMapping("/getPercentageHsn/{a}")
	public int getPercentage(@PathVariable int a) {
		return gs.getPercentage(a);
	}
	
	
}
