package com.learninghub.onlinequiz.controllers;

import com.learninghub.onlinequiz.models.User;
import com.learninghub.onlinequiz.services.UserService;
import com.learninghub.onlinequiz.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.validation.BindingResult;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController{
    @Autowired
    UserServiceImpl impl;

    @GetMapping("/registration")
    public String registration(Model model){
       return impl.getRegistration(model);

    }

    @GetMapping({"/","/home"})
    public String home(Model model){
        return impl.home(model);
    }

    @PostMapping("/registration")
    public String registration(@ModelAttribute("user") User user,BindingResult result){
        return impl.addUser(user,result);

    }



}


