package com.StuDetails.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StuDetails.Dao.StudentDao;
import com.StuDetails.Entity.Student;
import com.StuDetails.Exception.LowAgeException;

@Service
public class StudentService {
	@Autowired
	StudentDao sd;
	public String postvalue(Student s) throws LowAgeException {
		if(s.getAge()<18)
			throw new LowAgeException("Age is Low Exception");
		return sd.postvalue(s);
	}
	
	public String postAll(List<Student> s) {
		return sd.postAll(s);
	}
	public List<Student> getvalue() {
		return sd.getvalue();
	}
	public String putmethod(int a, Student b) {
		return sd.putmethod(a,b);
	}
	public String deletebyId(int a) {
		return sd.deletebyId(a);
	}
	
	
}
