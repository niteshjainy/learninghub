package com.learninghub.onlinequiz.services;

import com.learninghub.onlinequiz.Repositories.UserRepo;
import com.learninghub.onlinequiz.models.Feedback;
import com.learninghub.onlinequiz.Repositories.FeedbackRepo;
import com.learninghub.onlinequiz.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;
import java.util.Optional;

@Service
public class FeedbackServiceImpl implements FeedbackService {

    @Autowired
    FeedbackRepo feedbackrepo;
    @Autowired
    UserRepo userrepo;


    public List<Feedback> getAllFeedbacks() {
        return feedbackrepo.findAll();
    }

    public void addFeedback(Feedback feedback) {
        User user = userrepo.findById(1).get();
        if (user != null) {
            feedback.setUser(user);
            java.util.Date now = new java.util.Date();
            feedback.setCreatedAt(now);
            feedback.setUpdatedAt(now);
            feedbackrepo.save(feedback);
        }
    }
}
