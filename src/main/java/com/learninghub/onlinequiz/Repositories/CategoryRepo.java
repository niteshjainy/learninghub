package com.learninghub.onlinequiz.Repositories;

import com.learninghub.onlinequiz.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepo extends JpaRepository<Category,Integer > {


    List<Object> findBySubjectCategory(String subjectCategory);
}
