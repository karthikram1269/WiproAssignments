package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	private String title;
	
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	
	private String correctAnswer;
	
	@Enumerated(EnumType.STRING)
	private DifficultyLevel difficultyLevel;
	
	@Enumerated(EnumType.STRING)
	private Category category;

	public Question(Category category) {
		super();
		this.category = category;
	}

	public Question(@NotNull String title, String option1, String option2, String option3, String option4,
			String correctAnswer, DifficultyLevel difficultyLevel, Category category) {
		super();
		this.title = title;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.correctAnswer = correctAnswer;
		this.difficultyLevel = difficultyLevel;
		this.category = category;
	}

	
	
}
