package com.learninghub.onlinequiz.services;

import com.learninghub.onlinequiz.Repositories.CategoryRepo;
import com.learninghub.onlinequiz.Repositories.QuestionRepo;
import com.learninghub.onlinequiz.models.Category;
import com.learninghub.onlinequiz.models.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.Null;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    QuestionRepo questionrepo;
    @Autowired
    CategoryRepo categoryrepo;


    @Override
    public void addQuestion(@RequestParam Map<String, String> questionObj) {

        Question question = new Question();
        String id= (questionObj.get("id"));
        if(id!=null)
        {
            question.setQuestionId(Integer.parseInt(id));
        }
        String subjectCategory= questionObj.get("subjectCategory");
        Category category = (Category) categoryrepo.findBySubjectCategory(subjectCategory).get(0);
        question.setCategory(category);

        question.setQuestion(questionObj.get("question"));
        question.setFirstOption(questionObj.get("firstOption"));
        question.setFourthOption(questionObj.get("fourthOption"));
        question.setThirdOption(questionObj.get("thirdOption"));
        question.setSecondOption(questionObj.get("secondOption"));
        question.setAnswer(questionObj.get("answer"));

        Date today=new Date();

        question.setCreatedBy("");
        question.setUpdatedBy("");
        question.setCreatedAt(today);
        question.setUpdatedAt(today);
        questionrepo.save(question);


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
