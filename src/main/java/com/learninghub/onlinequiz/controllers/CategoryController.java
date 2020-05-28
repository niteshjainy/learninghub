package com.learninghub.onlinequiz.controllers;

import com.learninghub.onlinequiz.Repositories.CategoryRepo;
import com.learninghub.onlinequiz.models.Category;
import com.learninghub.onlinequiz.services.CategoryServiceImpl;
import com.sun.org.apache.xpath.internal.operations.Mod;
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
    public ModelAndView addCategory(@ModelAttribute Category category) {
        ModelAndView mv=new ModelAndView("addcategory.jsp");
        impl.addCategory(category);
        mv.addObject("msg", "Added successfull");
        return mv;
    }

    @GetMapping("/getallcategory")
    public ModelAndView getCategories() {
        ModelAndView mv=new ModelAndView("adminshowcategory.jsp");
        List<Category> category=impl.displayAllCategory();
        mv.addObject("category",category);
        return mv;
    }

    @GetMapping("/getall")
    public ModelAndView getAll() {
        ModelAndView mv=new ModelAndView("addquestion.jsp");
        List<Category> category=impl.displayAllCategory();
        mv.addObject("category",category);
        return mv;
    }

    @GetMapping("/getcategories")
    public List<Category> get() {
        return impl.displayAllCategory();
    }

    @GetMapping("/{id}")
    public Category showCategoryById(@PathVariable Integer id) {
        return impl.showCategoryById(id);
    }

    @DeleteMapping("/deletecategory/{id}")
    public void deleteCategory(@PathVariable Integer id) {
        impl.deleteCategory(id);
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







}
