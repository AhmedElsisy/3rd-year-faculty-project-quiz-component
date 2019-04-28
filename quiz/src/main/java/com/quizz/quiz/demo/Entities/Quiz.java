package com.quizz.quiz.demo.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Quiz {
    @Id
    public String ID;
    public String name;
    public String type;

}
