package com.learninghub.onlinequiz.repo;

import com.learninghub.onlinequiz.models.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepo extends JpaRepository <Feedback, Integer> {
}
