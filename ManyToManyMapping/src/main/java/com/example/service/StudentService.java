package com.example.service;

import com.example.entities.Student;
import java.util.List;

public interface StudentService {
    Student saveStudent(Student student, List<Long> courseIds);
    List<Student> getAllStudents();
    Student getStudentById(Long id);
}
