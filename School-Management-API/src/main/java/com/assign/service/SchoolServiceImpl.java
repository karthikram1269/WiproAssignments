package com.assign.service;

import com.assign.entities.School;
import com.assign.repository.SchoolRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    private SchoolRepository repo;

    @Override
    public School saveSchool(School school) {
        return repo.save(school);
    }

    @Override
    public List<School> getAll() {
        return repo.findAll();
    }

    @Override
    public School getById(long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public School updateAddress(long id, String newAddress) {
        School school = repo.findById(id).orElseThrow(() -> new RuntimeException("School not found"));
        school.setSchoolAdress(newAddress);
        return repo.save(school);
    }

    @Override
    public List<School> getByAddress(String address) {
        return repo.findByAddress(address);
    }

    @Override
    public List<School> getSchoolsByTeacherExperience(int exp) {
        return repo.findSchoolsWithExperiencedTeachers(exp);
    }
}
