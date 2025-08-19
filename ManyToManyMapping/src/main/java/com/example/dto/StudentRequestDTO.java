package com.example.dto;

import java.util.List;

import lombok.Data;

@Data
public class StudentRequestDTO {
    private String name;
    private int age;
    private List<Long> courseIds;  
}
