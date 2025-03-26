package com.StuDetails.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.StuDetails.Entity.Student;
import com.StuDetails.Repository.StudentRepository;

@Repository
public class StudentDao {
	@Autowired
	StudentRepository sr;
	public String postvalue(Student s) {
		sr.save(s);
		return "Saved successfully";
	}
	
	public String postAll(List<Student> s) {
		sr.saveAll(s);
		return "Successfully posted";
	}
	
	public List<Student> getvalue() {
		return sr.findAll();
	}
	public String putmethod(int a, Student b) {
		Student stu = sr.findById(a).get();
		stu.setName(b.getName());
		stu.setAge(b.getAge());
		sr.save(stu);
		return "Using putMethod saved Succesfully";
	}
	public String deletebyId(int a) {
		sr.deleteById(a);
		return "deleted SuccessFully";
	}
	

}
