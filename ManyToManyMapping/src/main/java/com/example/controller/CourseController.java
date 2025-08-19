package com.example.controller;

import com.example.dto.CourseDTO;
import com.example.entities.Course;
import com.example.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    private final CourseService courseService;
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping("/save")
    public CourseDTO saveCourse(@RequestBody CourseDTO dto) {
        Course course = new Course();
        course.setTitle(dto.getTitle());
        course.setDescription(dto.getDescription());

        Course saved = courseService.saveCourse(course);

        CourseDTO response = new CourseDTO();
        response.setId(saved.getId());
        response.setTitle(saved.getTitle());
        response.setDescription(saved.getDescription());
        return response;
    }

    @GetMapping
    public List<CourseDTO> getAllCourses() {
        return courseService.getAllCourses().stream().map(course -> {
            CourseDTO dto = new CourseDTO();
            dto.setId(course.getId());
            dto.setTitle(course.getTitle());
            dto.setDescription(course.getDescription());

            // 👇 populate student IDs
            if (course.getStudents() != null) {
                dto.setStudentIds(
                    course.getStudents().stream()
                          .map(student -> student.getId())
                          .collect(Collectors.toList())
                );
            }
            return dto;
        }).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public CourseDTO getCourseById(@PathVariable Long id) {
        Course course = courseService.getCourseById(id);
        CourseDTO dto = new CourseDTO();
        dto.setId(course.getId());
        dto.setTitle(course.getTitle());
        dto.setDescription(course.getDescription());

        // 👇 populate student IDs
        if (course.getStudents() != null) {
            dto.setStudentIds(
                course.getStudents().stream()
                      .map(student -> student.getId())
                      .collect(Collectors.toList())
            );
        }
        return dto;
    }

}
