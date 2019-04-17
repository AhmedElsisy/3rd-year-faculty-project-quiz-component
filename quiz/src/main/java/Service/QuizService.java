package Service;

import DAO.DAOO;
import Entities.Questions;
import Entities.Quiz;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

public class QuizService {
    DAOO dAo;
    public Quiz q ;
    public Questions questions;
    @Autowired
    QuizService(DAOO dAo){
        this.dAo = dAo;
    }

    public void AddQuiz(String t,String quest,String choice1,String choice2,String choice3,String choice4,String rightanswer){
        q = new Quiz();
        q.type = t;
        UUID temp = UUID.randomUUID();
        q.ID = temp;
        questions = new Questions();
        questions.ID = temp;
        questions.question = quest;
        questions.choice1 = choice1;
        questions.choice2 = choice2;
        questions.choice3 = choice3;
        questions.choice4 = choice4;
        questions.rightanswer = rightanswer;
        AddToDatabase();
    }
    void AddToDatabase(){
        dAo.addQuiz(q);
        dAo.addQuestions(questions);
    }
}
