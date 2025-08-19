package com.assign.controller;

import com.assign.entites.Student;
import com.assign.studentService.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    // Home page with CRUD buttons
    @GetMapping("/")
    public String viewHome() {
        return "index";
    }

    // Show form to create new student
    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("student", new Student());
        return "create";
    }

    // Save student after form submission
    @PostMapping("/save")
    public String saveStudent(@ModelAttribute Student student) {
        studentService.save(student);
        return "redirect:/";
    }

    // Show a student after asking rollno via prompt
    @GetMapping("/read/{rollno}")
    public String readStudent(@PathVariable int rollno, Model model) {
        Student student = studentService.getByRollNo(rollno);
        if (student == null) {
            return "redirect:/";
        }
        model.addAttribute("student", student);
        return "read";
    }

    // Show list of all students to edit/delete
    @GetMapping("/list")
    public String showAllStudents(Model model) {
        model.addAttribute("list", studentService.getAll());
        return "list";
    }

    // Show edit form for a student
    @GetMapping("/edit/{rollno}")
    public String showEditForm(@PathVariable int rollno, Model model) {
        Student student = studentService.getByRollNo(rollno);
        model.addAttribute("student", student);
        return "edit";
    }

    // Save updates to student
    @PostMapping("/update")
    public String updateStudent(@ModelAttribute Student student) {
        studentService.save(student);
        return "redirect:/";
    }

    // Delete student by ID
    @GetMapping("/delete/{rollno}")
    public String deleteStudent(@PathVariable int rollno) {
        studentService.delete(rollno);
        return "redirect:/list";
    }
}
