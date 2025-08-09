package com.example.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Category;
import com.example.demo.entities.DifficultyLevel;
import com.example.demo.entities.DifficultyLevel;
import com.example.demo.entities.QuestionWrapper;
import com.example.demo.entities.Quiz;
import com.example.demo.entities.Response;
import com.example.demo.service.QuizService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@RequiredArgsConstructor
@Slf4j
@RestController 
@RequestMapping("/api/v1/quiz")
public class QuizController {
	
	private final QuizService service;

	@PostMapping("/create")
	public Quiz createQuiz(
	    @RequestParam Category category,
	    @RequestParam DifficultyLevel difficultyLevel,
	    @RequestParam String title
	) {
	    return service.createQuiz(category.name(), difficultyLevel.name(), title);
	}

	
	@GetMapping("/getQuizByID/{id}")                  
    public List<QuestionWrapper> getQuizQuestions(@PathVariable Integer id){
        return service.getQuizQuestions(id);
    }
    
    
    
    @PostMapping("/submitQuiz/{id}")
    public Integer submitQuiz(@PathVariable int id, @RequestBody List<Response> responses){
    	Integer i = service.calculateResult(id, responses);
    	log.info(" got score : "+i);
        return i;
    }
	
}
