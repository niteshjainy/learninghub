package com.learninghub.onlinequiz.controllers;

import com.learninghub.onlinequiz.models.User;
import com.learninghub.onlinequiz.services.UserService;
import com.learninghub.onlinequiz.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController{
    @Autowired
    UserServiceImpl impl;

    @GetMapping("/registration")
    public ModelAndView registration(Model model){
       return impl.getRegistration(model);

    }

    @GetMapping({"/","/home"})
    public ModelAndView home(Model model){
        return impl.home(model);
    }

    @PostMapping("/registration")
    public ModelAndView registration(@ModelAttribute("user") User user,BindingResult result){
        return impl.addUser(user,result);

    }
    @GetMapping("/index")
    public ModelAndView index(Model model,String error,String logout){
        return impl.login(model,error,logout);
    }
    @PostMapping("/index")
    public ModelAndView index(@RequestBody String email,@RequestBody String pass,BindingResult result){
        return impl.loginVerify(email,pass,result);
    }



}


