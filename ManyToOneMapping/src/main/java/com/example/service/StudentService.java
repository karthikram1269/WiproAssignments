package com.example.service;

import com.example.entities.Student;
import java.util.List;

public interface StudentService {
    Student saveStudent(Student student, Long schoolId);
    List<Student> getAllStudents();
    Student getStudentById(Long id);
}
