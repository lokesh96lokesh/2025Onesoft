package com.StudentDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentDetailsController {

    @Autowired
    StudentDetailsService ss;

    @GetMapping("/getAll")
    public List<Student> getAllStudents() {
        return ss.getAllStudents();
    }

    @GetMapping("/getbyid/{id}")
    public Student getStudentById(@PathVariable int id) {
        return ss.getStudentById(id);
    }

    @PostMapping("/post")
    public Student addStudent(@RequestBody Student s) throws InvalidAgeException {
        return ss.addStudent(s);
    }

    @PutMapping("/updatebyid/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody Student s) {
        return ss.updateStudent(id, s);
    }

    @DeleteMapping("/deletebyid/{id}")
    public String deleteStudent(@PathVariable int id) {
    	return ss.deleteStudent(id);  
    }
}
