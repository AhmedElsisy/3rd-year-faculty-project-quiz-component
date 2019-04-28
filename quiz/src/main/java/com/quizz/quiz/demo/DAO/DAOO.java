package com.quizz.quiz.demo.DAO;

import com.quizz.quiz.demo.Entities.Questions;
import com.quizz.quiz.demo.Entities.Quiz;

import java.util.ArrayList;

public interface DAOO {
    public void addQuiz(Quiz q);
    public void addQuestions(Questions q);
    public String getQuiz(String type);
    public ArrayList<Questions> getQuestions(String ID);
}
