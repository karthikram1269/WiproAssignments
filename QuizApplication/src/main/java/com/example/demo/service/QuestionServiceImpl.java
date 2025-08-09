package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Category;
import com.example.demo.entities.Question;
import com.example.demo.exception.QuestionNotFoundException;
import com.example.demo.repo.QuestionRepository;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionRepository repo;

    @Override
    public Question saveQuestion(Question question) {
        return repo.save(question);
    }

    @Override
    public List<Question> getQuestionsByCategory(Category category) {
        return repo.findByCategory(category);
    }

    @Override
    public Question getQuestion(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new QuestionNotFoundException(
                        "Question with ID " + id + " not found"));
    }

    @Override
    public Page<Question> findAllQuestions(Pageable pageable) {
        return repo.findAll(pageable);
    }

    @Override
    public void deleteQuestion(Long id) {
        if (!repo.existsById(id)) {
            throw new QuestionNotFoundException("Cannot delete. Question with ID " + id + " not found");
        }
        repo.deleteById(id);
    }

    @Override
    public Question patchQuestionById(Long id, Question q) {
        Question existingQuestion = repo.findById(id)
                .orElseThrow(() -> new QuestionNotFoundException(
                        "Question with ID " + id + " not found"));

        if (q.getCategory() != null)
            existingQuestion.setCategory(q.getCategory());
        if (q.getCorrectAnswer() != null)
            existingQuestion.setCorrectAnswer(q.getCorrectAnswer());
        if (q.getDifficultyLevel() != null)
            existingQuestion.setDifficultyLevel(q.getDifficultyLevel());
        if (q.getTitle() != null)
            existingQuestion.setTitle(q.getTitle());
        if (q.getOption1() != null)
            existingQuestion.setOption1(q.getOption1());
        if (q.getOption2() != null)
            existingQuestion.setOption2(q.getOption2());
        if (q.getOption3() != null)
            existingQuestion.setOption3(q.getOption3());
        if (q.getOption4() != null)
            existingQuestion.setOption4(q.getOption4());

        return repo.save(existingQuestion);
    }
}
