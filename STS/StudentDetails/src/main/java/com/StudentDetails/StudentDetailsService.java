package com.StudentDetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentDetailsService {

    @Autowired
    StudentDetailsDao sd;
   
    
    public List<Student> getAllStudents() {
        return sd.getAllStudents();
    }

   
    public Student getStudentById( int id) {
        return sd.getStudentById(id);
    }

    
    public Student addStudent( Student s) throws InvalidAgeException {
        return sd.addStudent(s);
    }

  
    public Student updateStudent( int id,  Student s) {
        return sd.updateStudent(id, s);
    }

   
    public String deleteStudent( int id) {
    	return sd.deleteStudent(id);  
    }
}
