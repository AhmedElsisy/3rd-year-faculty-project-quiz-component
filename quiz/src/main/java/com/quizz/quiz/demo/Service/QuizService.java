package com.quizz.quiz.demo.Service;

import com.quizz.quiz.demo.DAO.DAOO;
import com.quizz.quiz.demo.Entities.Questions;
import com.quizz.quiz.demo.Entities.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class QuizService {
    DAOO dAo;
    public Quiz q ;
    public Questions questions;
    @Autowired
    QuizService(DAOO dAo){
        this.dAo = dAo;
    }

    public void AddQuiz(Quiz qq){
        q = new Quiz();
        q.ID = qq.ID;
        q.type = qq.type;
        q.name = qq.name;
        AddQuizToDatabase();
    }
    public void AddQuestion(Questions qq){
        questions = new Questions();
        questions.QuizID = qq.QuizID;
        questions.question = qq.question;
        questions.choice1 = qq.choice1;
        questions.choice2 = qq.choice2;
        questions.choice3 = qq.choice3;
        questions.choice4 = qq.choice4;
        questions.rightanswer = qq.rightanswer;
        AddQuestionToDatabase();
    }

    void AddQuizToDatabase(){
        dAo.addQuiz(q);

    }
    void AddQuestionToDatabase(){
        dAo.addQuestions(questions);
    }
}
