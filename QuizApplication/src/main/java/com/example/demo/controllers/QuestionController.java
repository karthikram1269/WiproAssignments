package com.example.demo.controllers;

import java.util.List;

import org.springdoc.core.annotations.ParameterObject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entities.Category;
import com.example.demo.entities.Question;
import com.example.demo.service.QuestionService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@RestController
@Slf4j
@RequestMapping("/api/v1/questions")
public class QuestionController {

    private final QuestionService service;

    @PostMapping
    public Question addQuestion(@Valid @RequestBody Question question) {
        log.info("Received request to add a question");
        return service.saveQuestion(question);
    }

    @GetMapping("/{id}")
    public Question getQuestion(@PathVariable Long id) {
        log.info("Fetching question with ID: {}", id);
        return service.getQuestion(id); // Exception handled globally
    }

    @GetMapping
    public Page<Question> getAllQuestions(@ParameterObject Pageable pageable) {
        log.info("Fetching all questions, page: {}", pageable.getPageNumber());
        return service.findAllQuestions(pageable);
    }

    @DeleteMapping("/{id}")
    public String deleteQuestion(@PathVariable Long id) {
        log.info("Deleting question with ID: {}", id);
        service.deleteQuestion(id);
        return "Deleted question successfully with ID: " + id;
    }

    @PatchMapping("/{id}")
    public Question patchQuestion(@PathVariable Long id, @RequestBody Question updatedFields) {
        log.info("Patching question with ID: {}", id);
        return service.patchQuestionById(id, updatedFields);
    }

    @GetMapping("/category/{category}")
    public List<Question> getQuestionsByCategory(@PathVariable Category category) {
        log.info("Fetching questions by category: {}", category);
        return service.getQuestionsByCategory(category);
    }
}
