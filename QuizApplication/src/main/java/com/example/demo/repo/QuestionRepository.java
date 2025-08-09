package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Category;
import com.example.demo.entities.Question;

@Repository
public interface QuestionRepository  extends JpaRepository<Question, Long>{

	@Query(value = "SELECT * FROM question q WHERE q.category = :category AND q.difficulty_level = :difficulty ORDER BY RAND() LIMIT 3", nativeQuery = true)
    List<Question> findRandomQuestionByCategoryAndLevel(@Param("category") String category, @Param("difficulty") String difficulty);

    List<Question> findByCategory(Category category);	
}
