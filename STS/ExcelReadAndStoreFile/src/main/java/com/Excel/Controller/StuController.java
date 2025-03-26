package com.Excel.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.Excel.Entity.Student;
import com.Excel.Service.StuService;

@RestController
@RequestMapping("/excel")
public class StuController {
	@Autowired
	StuService service;

	@PostMapping("/upload")
	public String uploadExcel(@RequestParam MultipartFile file) {
		return service.saveExcelData(file);
		// return ResponseEntity.ok("Data inserted successfully!");
	}

	@GetMapping("/getall")
	public List<Student> getAll() {
		return service.getAll();
	}

	@PostMapping("/uploadDB")
	public String saveExcel(@RequestParam MultipartFile file) {
		return service.saveExcel(file);
	}

	@PostMapping("/read")
	public ResponseEntity<List<Student>> readExcelFile(@RequestParam("file") MultipartFile file) {
		List<Student> students = service.readExcelData(file);
		return ResponseEntity.ok(students);
	}
}
