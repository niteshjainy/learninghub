package com.learninghub.onlinequiz.controllers;

import com.learninghub.onlinequiz.Repositories.UserRepo;
import com.learninghub.onlinequiz.models.User;
import com.learninghub.onlinequiz.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

    @GetMapping("/getuser/{userId}")
    public Optional<User> getUserById(@PathVariable Integer userId){
        return userrepo.findById(userId);
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

    @GetMapping("/deletedusers")
    public List<User> showDeletedUser(){
        return userrepo.findAll().stream()
                .filter(user -> user.getUserActive() == false)
                .collect(Collectors.toList());
    }




    @DeleteMapping("/deleteduser/{userId}")
    public void delete_user(@PathVariable Integer userId){
        userrepo.deleteById(userId);

    }






    @GetMapping("/getusers")
    public List<User> get() {
      return userrepo.findAll().stream().filter(user -> user.getUserActive() == true).collect(Collectors.toList());
    }

    @GetMapping("/removeuser/{userId}")
    public void deleteuser(@PathVariable int  userId) {
        User user = userrepo.getOne(userId);
        impl.updateUser(user);

    }

    @GetMapping("/getalluser")
    public List<User> getallusers(){
        return userrepo.findAll();
    }

}





