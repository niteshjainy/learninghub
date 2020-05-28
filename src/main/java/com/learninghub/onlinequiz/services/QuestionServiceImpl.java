package com.learninghub.onlinequiz.services;

import com.learninghub.onlinequiz.Repositories.CategoryRepo;
import com.learninghub.onlinequiz.Repositories.QuestionRepo;
import com.learninghub.onlinequiz.models.Category;
import com.learninghub.onlinequiz.models.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    QuestionRepo questionrepo;
    @Autowired
    CategoryRepo categoryrepo;


    @Override
    public void addQuestion(Question questionObj) {

        Category category=categoryrepo.findById(1).get();

        questionObj.setCategory(category);
        Date today=new Date();
        questionObj.setCreatedBy("");
        questionObj.setUpdatedBy("");
        questionObj.setCreatedAt(today);
        questionObj.setUpdatedAt(today);
        questionrepo.save(questionObj);

    }

    @Override
    public List<Question> getQuestions() {
        return questionrepo.findAll();
    }

    @Override
    public String deleteQuestionById(Integer id) {
        questionrepo.deleteById(id);
        return "deleted";
    }

    @Override
    public String updateQuestion(Question question) {
        Date today=new Date();
        question.setCreatedBy("");
        question.setUpdatedBy("");
        question.setCreatedAt(today);
        question.setUpdatedAt(today);
        questionrepo.save(question);
        return "updated";
    }

    @Override
    public Question getQuestionById(Integer id) {
        return questionrepo.getOne(id);
    }
}
