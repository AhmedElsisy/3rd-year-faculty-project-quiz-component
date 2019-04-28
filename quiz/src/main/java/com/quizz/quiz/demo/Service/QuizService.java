package com.quizz.quiz.demo.Service;

import com.quizz.quiz.demo.DAO.DAOO;
import com.quizz.quiz.demo.Entities.Questions;
import com.quizz.quiz.demo.Entities.Quiz;
import com.quizz.quiz.demo.Entities.UserQuestions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;


@Service

public class QuizService {
    public static String TheID;
    public static ArrayList<Questions> temp ;
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
        questions.ID = UUID.randomUUID();
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


    public ArrayList<UserQuestions> getQuestions(String type){
        TheID = dAo.getQuiz(type);
        temp = new ArrayList<>();
        temp = dAo.getQuestions(TheID);
        ArrayList<UserQuestions> ans = new ArrayList<>();
        for (int i = 0 ; i < temp.size() ; ++i){
            Questions tt ;
            tt = temp.get(i);
            UserQuestions toto = new UserQuestions();
            toto.choice1 = tt.choice1;
            toto.choice2 = tt.choice2;
            toto.choice3 = tt.choice3;
            toto.choice4 = tt.choice4;
            toto.question = tt.question;
            ans.add(toto);
        }
        return ans;
    }
    public boolean ifUserPass(ArrayList<String> answers){
        int counter = 0;
        for (int i = 0 ; i < answers.size(); ++i){
            if (temp.get(i).rightanswer.equals(answers.get(i)))
                counter++;
        }
        double rate = (double)counter / temp.size();
        if (rate > 0.5)
            return true;
        return false;
    }
}
