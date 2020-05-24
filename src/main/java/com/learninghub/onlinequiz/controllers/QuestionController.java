package com.learninghub.onlinequiz.controllers;

import com.learninghub.onlinequiz.ExtendClass.AdminTracker;
import com.learninghub.onlinequiz.ExtendClass.Tracker;
import com.learninghub.onlinequiz.Repositories.QuestionRepo;
import com.learninghub.onlinequiz.models.Category;
import com.learninghub.onlinequiz.models.Question;
import com.learninghub.onlinequiz.services.QuestionServiceImpl;
import org.aspectj.weaver.tools.Trace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
public class QuestionController {

    @Autowired
    QuestionServiceImpl impl;

    @PostMapping("/addquestion") //specifiy what type of dat to sent to server
    public void  addQuestion(@RequestBody Question question) {
        impl.addQuestion(question);
    }



    @GetMapping(path="/question")
    public List<Question> getQuestions(){
        return impl.getQuestions();
    }

    @RequestMapping("/question/{questionId}")
    public Question getQuestion(@PathVariable("questionId") int questionId){
        return impl.getQuestionById(questionId);
    }

    @DeleteMapping("/question/{questionId}")
    public String deleteQuestion(@PathVariable int questionId){
        return impl.deleteQuestionById(questionId);
    }

    @PutMapping("/question")
    public String updateQuestion(@RequestBody Question question) {
        return impl.updateQuestion(question);

    }
}
