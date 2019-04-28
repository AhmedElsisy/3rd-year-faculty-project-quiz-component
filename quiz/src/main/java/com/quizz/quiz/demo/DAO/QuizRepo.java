package com.quizz.quiz.demo.DAO;

import com.quizz.quiz.demo.Entities.Quiz;
import org.springframework.data.repository.CrudRepository;

public interface QuizRepo extends CrudRepository<Quiz,String> {
}
