package com.learninghub.onlinequiz.services;

import com.learninghub.onlinequiz.Repositories.CategoryRepo;
import com.learninghub.onlinequiz.models.Category;
import com.learninghub.onlinequiz.models.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryService categoryservice;

    @Autowired
    CategoryRepo categoryRepo;

    public void addCategory(Category category){
        Date now = new Date();
        category.setCreatedAt(now);
        category.setCreatedBy("");
        category.setUpdatedAt(now);
        category.setUpdatedBy("");
        categoryRepo.save(category);
    }

    @Override
    public void deleteCategory(Integer id) {
        categoryRepo.deleteById(id);

    }

    @Override
    public Category showCategoryById(Integer id) {
        return categoryRepo.getOne(id);

    }


    @Override
    public void updateCategory(Category category) {
        Date now = new Date();
        category.setCreatedAt(now);
        category.setCreatedBy("");
        category.setUpdatedAt(now);
        category.setUpdatedBy("");
         categoryRepo.save(category);


    }

    @Override
    public List<Category> displayAllCategory() {
        return  categoryRepo.findAll();
    }


}
