package com.learninghub.onlinequiz.services;

import com.learninghub.onlinequiz.models.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {
    public void addCategory(Category category);
    public void delete_category(Integer id);
    public  Category showCategoryById(Integer Id);
    public void updateCategory(Category category);
    public List<Category> displayAllCategory();

}
