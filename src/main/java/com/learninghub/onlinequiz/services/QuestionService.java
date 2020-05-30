package com.learninghub.onlinequiz.services;

import com.learninghub.onlinequiz.models.Category;
import com.learninghub.onlinequiz.models.Question;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Service
public interface  QuestionService {
    public void  addQuestion( @RequestParam Map<String, String> questionObj) ;
    public List<Question> getQuestions();
    public String deleteQuestionById(Integer id);
    public String updateQuestion(Question question);
    public Question getQuestionById(Integer id);
}
