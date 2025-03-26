package com.Excel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Excel.Entity.Student;

public interface StuRepository extends JpaRepository<Student, Integer>{

}
