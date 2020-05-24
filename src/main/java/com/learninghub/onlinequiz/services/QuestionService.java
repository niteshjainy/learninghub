package com.learninghub.onlinequiz.services;

import com.learninghub.onlinequiz.models.Question;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public interface  QuestionService {
    public void  addQuestion( Question question) ;
    public List<Question> getQuestions();
    public String deleteQuestionById(Integer id);
    public String updateQuestion(Question question);
    public Question getQuestionById(Integer id);
}
