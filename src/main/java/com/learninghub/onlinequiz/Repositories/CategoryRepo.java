package com.learninghub.onlinequiz.Repositories;

import com.learninghub.onlinequiz.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category,Integer > {

}
