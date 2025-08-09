package com.example.demo.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.demo.entities.Category;
import com.example.demo.entities.Question;

public interface QuestionService {

	Question saveQuestion(Question q);
	Question getQuestion(Long id);
	Page<Question> findAllQuestions(Pageable pg);
	void deleteQuestion(Long id);
	Question patchQuestionById(Long id, Question q);
	List<Question> getQuestionsByCategory(Category category);
	
	
}
