package com.example.service;

import com.example.entities.School;
import com.example.repository.SchoolRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SchoolServiceImpl implements SchoolService {

    private final SchoolRepository schoolRepository;

    public SchoolServiceImpl(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    @Override
    public School saveSchool(School school) {
        return schoolRepository.save(school);
    }

    @Override
    public List<School> getAllSchools() {
        return schoolRepository.findAll();
    }

    @Override
    public School getSchoolById(Long id) {
        return schoolRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("School not found with id " + id));
    }
}
