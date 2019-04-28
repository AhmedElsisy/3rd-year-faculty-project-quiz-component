package com.quizz.quiz.demo.DAO;

import com.quizz.quiz.demo.Entities.Questions;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface QuestionsRepo extends CrudRepository<Questions, UUID> {
}
