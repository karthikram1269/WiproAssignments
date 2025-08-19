package com.assign.repository;

import com.assign.entities.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SchoolRepository extends JpaRepository<School, Long> {

    @Query("SELECT s FROM School s WHERE s.schoolAdress = :address")
    List<School> findByAddress(@Param("address") String address);

    @Query("SELECT s FROM School s WHERE s.teachers.experience = :experience")
    List<School> findSchoolsWithExperiencedTeachers(@Param("experience") int experience);

    @Query(
        value = "SELECT * FROM school s WHERE s.school_adress = :address",
        nativeQuery = true
    )
    List<School> searchByAddressNative(@Param("address") String address);
    
    

    @Query(
        value = "SELECT * FROM school s JOIN teacher t ON s.teacher_id = t.id WHERE t.experience = :exp",
        nativeQuery = true
    )
    List<School> searchByTeacherExperienceNative(@Param("exp") int exp);
}
