package com.question.controller;

import com.question.entities.Question;
import com.question.services.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    private QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping("/create")
    public Question create(@RequestBody Question question){
       return questionService.create(question);
    }

    @GetMapping("/get")
    public List<Question> getAll(){
        return questionService.getAll();
    }

    @GetMapping("/get/{id}")
    public Question get(@PathVariable Long id){
        return questionService.get(id);
    }

    @GetMapping("/quiz/{quizId}")
    public List<Question> getQuestionByQuizId(@PathVariable Long quizId){
        return questionService.QuestionByQuizId(quizId);
    }
}
