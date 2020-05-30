package com.learninghub.onlinequiz.controllers;

import com.learninghub.onlinequiz.Repositories.UserRepo;
import com.learninghub.onlinequiz.models.User;
import com.learninghub.onlinequiz.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class UserController{
    @Autowired
    UserServiceImpl impl;

    @Autowired
    UserRepo userrepo;

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
        return impl.login();
    }

    @PostMapping("/index")
    public ModelAndView index(@ModelAttribute("username") String  username , @ModelAttribute("password") String password,BindingResult result){
        return impl.loginVerify(username,password,result);
    }


    @GetMapping("/showdeletedusers")
    public ModelAndView deletedUsers(){
        ModelAndView mv = new ModelAndView("deleteduser.jsp");
        return mv;
    }






    @GetMapping("/getusers")
    public List<User> get() {
        return userrepo.findAll();
    }

    @DeleteMapping("/deleteuser/{userId}")
    public void deleteuser(@PathVariable Integer userId) {
        User user = userrepo.getOne(userId);
        user.setUserActive(false);
        userrepo.deleteById(userId);

    }
    }





