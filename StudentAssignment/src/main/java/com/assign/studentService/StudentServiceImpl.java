package com.assign.studentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assign.entites.Student;
import com.assign.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> getAll() {
		return studentRepository.findAll();
	}

	@Override
	public void save(Student Student) {
		studentRepository.save(Student);
	}

	@Override
	public Student getByRollNo(int rollno) {
		return studentRepository.findById(rollno).orElse(null);
	}

	@Override
	public void delete(int id) {
		studentRepository.deleteById(id);
	}

	@Override
	public Student updateUserDobById(int rollno, Student student) {
		Student foundStudent = studentRepository.findById(rollno).orElseThrow(()->new RuntimeException("Student with id"+rollno+", is not found"));
		
		foundStudent.setDob(student.getDob());
		return studentRepository.save(foundStudent);
	}
}
