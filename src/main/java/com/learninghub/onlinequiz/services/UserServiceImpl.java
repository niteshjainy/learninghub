package com.learninghub.onlinequiz.services;

import com.learninghub.onlinequiz.Repositories.UserRepo;
import com.learninghub.onlinequiz.models.Category;
import com.learninghub.onlinequiz.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


import java.util.*;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserService userservice;

    @Autowired
    UserRepo userrepo;

    public ModelAndView addUser(User user, BindingResult result) {
        java.util.Date now = new java.util.Date();
        user.setUserActive(true);
        user.setCreatedAt(now);
        user.setUpdatedAt(now);
        user.setRole("User");

        if(result.hasErrors()){
            Map<String,String> errors = new HashMap<>();
            for(FieldError error: result.getFieldErrors()){
                errors.put(error.getField(),error.getDefaultMessage());
            }

            ModelAndView mv =new ModelAndView("registration.jsp");
            return mv;
        }

            userrepo.save(user);
            ModelAndView mv = new ModelAndView("home.jsp");
            mv.addObject("firstName",user.getUserFirstName());
            return mv;
    }


    @Override
    public List<User> getAllUser() {
        return (List<User>) userrepo.findAll();
    }

    public ModelAndView getRegistration(Model model){
        ModelAndView mv = new ModelAndView("registration.jsp");
            model.addAttribute("user",new User());
            return mv;

    }

    public ModelAndView home(Model model){
        ModelAndView mv = new ModelAndView("home.jsp");

        return mv;
    }

    public ModelAndView login(){
        ModelAndView mv = new ModelAndView("index.jsp");
        return mv;

    }


    public ModelAndView loginVerify(String email,String pass,BindingResult result){
        List<User> all =  userservice.getAllUser();
        int flag = 0;
        String name = null;
        for(User user1 : all) {
            if (email.equals(user1.getUserEmail()) && (pass.equals(user1.getUserPassword()))){
                    flag = 1;
                    name = user1.getUserFirstName();
                    break;
                }

        }
        if (flag == 0 || result.hasErrors()){
            ModelAndView mv = new ModelAndView("index.jsp");

            return mv;

        }
        else{
            ModelAndView mv = new ModelAndView("home.jsp");
            mv.addObject("firstName",name);
            return mv;


        }

    }


    public void delete_category(Integer id) {
        userrepo.deleteById(id);

    }

    public User getUserById(Integer id) {
        return userrepo.getOne(id);
    }

    public void updateUser(User user) {
        Date now = new Date();
        user.setCreatedAt(now);

        user.setUpdatedAt(now);
        user.setUserActive(false);
        userrepo.save(user);


    }



}
