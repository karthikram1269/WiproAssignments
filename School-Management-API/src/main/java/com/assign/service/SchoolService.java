package com.assign.service;

import com.assign.entities.School;
import java.util.List;

public interface SchoolService {

    School saveSchool(School school);
    List<School> getAll();
    School getById(long id);
    School updateAddress(long id, String newAddress);

    List<School> getByAddress(String address);       
    List<School> getSchoolsByTeacherExperience(int exp); 
}
