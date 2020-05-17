package com.learninghub.onlinequiz.Repositories;

import com.learninghub.onlinequiz.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface QuestionRepo extends JpaRepository<Question,Integer> {

}
