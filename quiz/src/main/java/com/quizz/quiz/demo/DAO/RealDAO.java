package com.quizz.quiz.demo.DAO;

import com.quizz.quiz.demo.Entities.Questions;
import com.quizz.quiz.demo.Entities.Quiz;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository

public class RealDAO implements DAOO {
    private  static ArrayList<Quiz> QuizDAO = new ArrayList<>();
    private  static ArrayList<Questions> QuestionsDAO = new ArrayList<>();
    @Override
    public void addQuiz(Quiz q) {
        QuizDAO.add(q);
    }

    @Override
    public void addQuestions(Questions q) {
        QuestionsDAO.add(q);
    }
}
