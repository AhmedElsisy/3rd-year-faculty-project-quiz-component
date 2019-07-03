package com.quizz.quiz.demo.DAO;

import com.quizz.quiz.demo.Entities.Questions;
import com.quizz.quiz.demo.Entities.Quiz;

import java.util.List;

public interface DAOO {
    public void addQuiz(Quiz q);
    public void addQuestions(Questions q);
    public String SearchQuizBySkill(String s);
    public List<Questions> Return_Questions( String id );
}
