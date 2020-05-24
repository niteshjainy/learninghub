package com.learninghub.onlinequiz.controllers;

import com.learninghub.onlinequiz.Repositories.CategoryRepo;
import com.learninghub.onlinequiz.models.Category;
import com.learninghub.onlinequiz.services.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;
@RestController
public class CategoryController {
    @Autowired
    CategoryServiceImpl impl;

    @PostMapping("/addcategory")
    public void addCategory(@RequestBody Category category) {
        impl.addCategory(category);

    }

    @GetMapping("/getallcategory")
    public List<Category> getCategories() {
        return impl.displayAllCategory();
    }

    @GetMapping("/{id}")
    public Category showCategoryById(@RequestParam Integer id) {
        return impl.showCategoryById(id);
    }

    @GetMapping("/editcategory")
    public ModelAndView editcategory(){
        ModelAndView mv = new ModelAndView("editcategory.jsp");
        return mv;
    }

    @PutMapping("/editcategory")
    public void UpdateCategory(@RequestBody Category category){
         impl.updateCategory(category);
}
     @DeleteMapping("/deleteCategory/{id}")
             public void deleteCategory(@RequestParam Integer id) {
         impl.delete_category(id);

     }





}
