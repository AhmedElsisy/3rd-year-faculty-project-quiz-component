package com.quizz.quiz.demo.API;

import com.quizz.quiz.demo.Entities.Questions;
import com.quizz.quiz.demo.Entities.Quiz;
import com.quizz.quiz.demo.Service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("quiz")
@RestController

public class Controller {
    public QuizService quizService;

    @Autowired
    Controller(QuizService quizService){
        this.quizService = quizService;
    }

    //@PostMapping("quiz/addquiz")
    @PostMapping
    public void addQuiz(@RequestBody Quiz q){
        quizService.AddQuiz(q);
    }
    //@PostMapping("quiz/addquestion")
    public void addQuestion(@RequestBody Questions q){
        quizService.AddQuestion(q);
    }
}
