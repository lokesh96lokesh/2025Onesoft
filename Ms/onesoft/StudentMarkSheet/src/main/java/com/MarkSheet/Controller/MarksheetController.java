package com.MarkSheet.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MarkSheet.Entity.MarkSheet;
import com.MarkSheet.Service.MarkSheetService;

@RestController
@RequestMapping("/markSheet")
public class MarksheetController {
	@Autowired
	MarkSheetService s;
	
	@PostMapping("/postmap")
	public String postMethod(@RequestBody List<MarkSheet> m) {
		return s.postMethod(m);
	}
	
	@GetMapping("/getAll")
	public List<MarkSheet> getMethod() {
		return s.getMethod();
	}
	
	
}
