package com.quizz.quiz.demo.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Questions {
    @Id
    public UUID ID;
    public String QuizID;
    public String question;
    public String choice1;
    public String choice2;
    public String choice3;
    public String choice4;
    public String rightanswer;

}
