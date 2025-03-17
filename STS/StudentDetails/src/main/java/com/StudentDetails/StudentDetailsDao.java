package com.StudentDetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDetailsDao {
	@Autowired
	StudentDetailsRepository sr;

    public List<Student> getAllStudents() {
        return sr.findAll();
    }

    public Student getStudentById(int id) {
        return sr.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));
    }

    public Student addStudent(Student s) throws InvalidAgeException{
        if (s.getAge() < 18) {
        	throw new InvalidAgeException("Age must be greater than 18!");
        }
        	return sr.save(s);
        }

    public Student updateStudent(int id, Student studentDetails) {
        Student student = getStudentById(id);
        student.setRollNumber(studentDetails.getRollNumber());
        student.setName(studentDetails.getName());
        student.setGender(studentDetails.getGender());
        student.setAge(studentDetails.getAge());
        student.setCourse(studentDetails.getCourse());
        student.setAttendance(studentDetails.getAttendance());
        return sr.save(student);
    }

    public String deleteStudent(int id) {
    	sr.deleteById(id);
    	return "deleted";
    }

}
