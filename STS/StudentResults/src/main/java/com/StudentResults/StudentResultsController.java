package com.StudentResults;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/SecondaryApi")
public class StudentResultsController {
	
		@Autowired
		StudentResultsService ss;
		
		 
		    @PostMapping("/save")
		    public Results saveStudentResult() {
		        return ss.saveStudentResult();
		    }

		    @GetMapping("/topper")
		    public Results getTopper() {
		        return ss.getTopper();
		    }

		    @GetMapping("/top3")
		    public List<Results> getTopThreeRankers() {
		        return ss.getTopThreeRankers();
		    }

		    @GetMapping("/range/{min}/{max}")
		    public List<Results> getStudentsByMarksRange(@PathVariable int min, @PathVariable int max) {
		        return ss.getStudentsByMarksRange(min, max);
		    }

		}

