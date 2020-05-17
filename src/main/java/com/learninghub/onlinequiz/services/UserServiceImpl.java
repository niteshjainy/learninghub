package com.learninghub.onlinequiz.services;

import com.learninghub.onlinequiz.Repositories.UserRepo;
import com.learninghub.onlinequiz.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserService userservice;

    @Autowired
    UserRepo userrepo;

    public String addUser(User user, BindingResult result) {
        java.util.Date now = new java.util.Date();
        user.setUserActive(true);
        user.setCreatedAt(now);
        user.setUpdatedAt(now);

        if(result.hasErrors()){
            return "registration";
        }
        userrepo.save(user);
        return "home";
    }


    @Override
    public List<User> getAllUser() {
        return null;
    }

    public String getRegistration(Model model){
            model.addAttribute("user",new User());
            return "registration";

    }

    public String home(Model model){
        return "home";
    }

}
