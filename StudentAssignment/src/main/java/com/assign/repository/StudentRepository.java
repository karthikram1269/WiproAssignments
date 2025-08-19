package com.assign.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.assign.entites.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{

}
