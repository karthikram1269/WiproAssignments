package com.example.demo;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuizApplication {
//implements ApplicationRunner
//	@Autowired
//	private QuestionRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(QuizApplication.class, args);
		System.out.println(" Today is a good day");
	}

//	@Override
//	public void run(ApplicationArguments args) throws Exception {
//	    Question q = new Question(
//	        "which country introduced the Java language",
//	        "india", "usa", "japan", "china",
//	        "india", DifficultyLevel.EASY, Category.JAVA
//	    );
//	    repo.save(q);
//	}

}
