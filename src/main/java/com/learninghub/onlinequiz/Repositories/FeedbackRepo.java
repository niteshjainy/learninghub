package com.learninghub.onlinequiz.Repositories;

import com.learninghub.onlinequiz.models.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepo extends JpaRepository <Feedback, Integer> {
}
