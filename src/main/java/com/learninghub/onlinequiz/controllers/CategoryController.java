package com.learninghub.onlinequiz.controllers;

import com.learninghub.onlinequiz.Repositories.CategoryRepo;
import com.learninghub.onlinequiz.models.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class CategoryController {
    @Autowired
    CategoryRepo categoryrepo;

    @PostMapping("/category")
    public void addCategory(@RequestBody Category category){
        Date now = new Date();
        category.setCreatedAt(now);
        category.setCreatedBy("");
        category.setUpdatedAt(now);
        category.setUpdatedBy("");
        categoryrepo.save(category);

    }

}
