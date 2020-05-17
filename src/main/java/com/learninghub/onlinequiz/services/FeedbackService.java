package com.learninghub.onlinequiz.services;

import com.learninghub.onlinequiz.models.Feedback;
import org.springframework.validation.BindingResult;

import java.util.List;

public interface FeedbackService {
     List<Feedback> getAllFeedbacks();

    void addFeedback(Feedback feedback);
}
