package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.School;


@Repository
public interface SchoolRepository extends JpaRepository<School, Long> {

}
