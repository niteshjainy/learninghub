package com.learninghub.onlinequiz.services;

import com.learninghub.onlinequiz.models.Feedback;
import com.learninghub.onlinequiz.repo.FeedbackRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackServiceImpl implements FeedbackService {

    @Autowired
    FeedbackRepo feedbackrepo;

    public List<Feedback> getAllFeedbacks(){
        return feedbackrepo.findAll();
    }
}
