package com.StudentMarkSheet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/StudentMarkSheet")
public class StudentMarkSheetController {

	    @Autowired
	    StudentMarkSheetService ss;

	    @PostMapping("/post")
	    public MarkSheet createMarkSheet(@RequestBody MarkSheet m) {
	        return ss.saveMarkSheet(m);
	    }

	    @GetMapping("/getAll")
	    public List<MarkSheet> getAllMarkSheets() {
	        return ss.getAllMarkSheets();
	    }
	    @GetMapping("/getAll/{rollNo}")
	    public int getAllMarkSheets(@PathVariable int rollNo) {
	        return ss.getAllMarkSheets(rollNo);
	    }
	}
