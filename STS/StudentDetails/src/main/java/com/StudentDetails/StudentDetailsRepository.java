package com.StudentDetails;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDetailsRepository extends JpaRepository<Student, Integer> {

}
