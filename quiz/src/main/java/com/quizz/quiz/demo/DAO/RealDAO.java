package com.quizz.quiz.demo.DAO;

import com.quizz.quiz.demo.Entities.Questions;
import com.quizz.quiz.demo.Entities.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Random;

@Repository

public class RealDAO implements DAOO {
    @Autowired
    private QuizRepo quizrepo ;

    @Autowired
    private QuestionsRepo questrepo;

    public   static ArrayList<Quiz> QuizDAO = new ArrayList<>();
    public   static ArrayList<Questions> QuestionsDAO = new ArrayList<>();
    @Override
    public void addQuiz(Quiz q) {
        quizrepo.save(q);
    }

    @Override
    public void addQuestions(Questions q) {
        questrepo.save(q);
    }

    @Override
    public String getQuiz(String type) {
        QuizDAO = new ArrayList<>();
        quizrepo.findAll().forEach(QuizDAO::add);
        String ans = new String();
        ans = "-1";
        ArrayList<Quiz> toty = new ArrayList<>();
        for(int i = 0 ; i < QuizDAO.size(); ++i){
            if (QuizDAO.get(i).type.equals(type)){
                toty.add(QuizDAO.get(i));

            }

        }
        Random r = new Random();
        int rand = r.nextInt(toty.size());
        ans = toty.get(rand).ID;
        return ans;
    }

    @Override
    public ArrayList<Questions> getQuestions(String ID) {
        QuestionsDAO = new ArrayList<>();
        questrepo.findAll().forEach(QuestionsDAO::add);
        ArrayList<Questions> ans = new ArrayList<>();
        for (int i = 0 ; i < QuestionsDAO.size();++i){
            if (QuestionsDAO.get(i).QuizID.equals(ID)){
                ans.add(QuestionsDAO.get(i));
            }
        }
        return ans;
    }

}
