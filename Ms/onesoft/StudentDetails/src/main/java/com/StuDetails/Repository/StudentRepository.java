package com.StuDetails.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StuDetails.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
