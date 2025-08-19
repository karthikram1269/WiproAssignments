package com.example.dto;

import java.util.List;

public class CourseDTO {
    private Long id;
    private String title;
    private String description;
    private List<Long> studentIds; // optional, include only if you want student references

    // Getters & Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public List<Long> getStudentIds() {
        return studentIds;
    }
    public void setStudentIds(List<Long> studentIds) {
        this.studentIds = studentIds;
    }
}
