package com.learninghub.onlinequiz.controllers;

import com.learninghub.onlinequiz.ExtendClass.AdminTracker;
import com.learninghub.onlinequiz.ExtendClass.Tracker;
import com.learninghub.onlinequiz.Repositories.QuestionRepo;
import com.learninghub.onlinequiz.models.Category;
import com.learninghub.onlinequiz.models.Question;
import org.aspectj.weaver.tools.Trace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Optional;

@RestController
public class QuestionController {

    @Autowired
    QuestionRepo questionRepo;

    @PostMapping(path="/question",consumes = {"application/json"}) //specifiy what type of dat to sent to server
    public Question addQuestion(@RequestBody Question question) {
        Date today=new Date();
        question.setCreatedBy("");
        question.setUpdatedBy("");
        question.setCreatedAt(today);
        question.setUpdatedAt(today);
        questionRepo.save(question);
        Category c1 =new Category(1, "java");
        question.setCategory(c1);
        return question;
    }

    @GetMapping(path="/question")
    public Iterable<Question> getQuestions(){
        return questionRepo.findAll();
    }

    @RequestMapping("/question/{questionId}")
    public Optional<Question> getQuestion(@PathVariable("questionId") int questionId){
        return questionRepo.findById(questionId);
    }

    @DeleteMapping("/question/{questionId}")
    public String deleteQuestion(@PathVariable int questionId){
        Question q= questionRepo.getOne(questionId);
        questionRepo.delete(q);
        return "deleted";
    }

    @PutMapping("/question")
    public Question updateQuestion(@RequestBody Question question) {
        questionRepo.save(question);
        return question;
    }
}
