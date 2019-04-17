package com.quizz.quiz.demo.DAO;

import com.quizz.quiz.demo.Entities.Questions;
import com.quizz.quiz.demo.Entities.Quiz;

public interface DAOO {
    public void addQuiz(Quiz q);
    public void addQuestions(Questions q);
}
