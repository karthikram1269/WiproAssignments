package com.example.service;

import com.example.entities.School;
import java.util.List;

public interface SchoolService {
    School saveSchool(School school);
    List<School> getAllSchools();
    School getSchoolById(Long id);
}
