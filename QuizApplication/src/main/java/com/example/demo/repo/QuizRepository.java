package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Integer>{

}
