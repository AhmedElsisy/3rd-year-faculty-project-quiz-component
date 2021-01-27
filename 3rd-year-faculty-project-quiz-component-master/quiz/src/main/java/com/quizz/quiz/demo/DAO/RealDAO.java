package com.quizz.quiz.demo.DAO;

import com.quizz.quiz.demo.Entities.Questions;
import com.quizz.quiz.demo.Entities.Quiz;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

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
    @Override
    public String SearchQuizBySkill(String s)
    {
        for( int i = 0 ; i < QuizDAO.size() ; i ++ )
        {
            if(QuizDAO.get(i).type.equals(s))
            {
                return QuizDAO.get(i).ID ;
            }
        }
        return "invalid type" ;
    }
    @Override
    public ArrayList<Questions> Return_Questions( String id )
    {
        ArrayList<Questions> Questionss = new ArrayList<>();
        for( int i = 0 ; i < QuestionsDAO.size() ; i ++ )
        {
            if( QuestionsDAO.get(i).QuizID == id )
            {
                Questionss.add(QuestionsDAO.get(i));
            }
        }
        return  Questionss ;
    }
}