package com.learninghub.onlinequiz.services;

import com.learninghub.onlinequiz.Repositories.UserRepo;
import com.learninghub.onlinequiz.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import java.util.List;

@Service
public interface UserService {

    public String addUser(User user,BindingResult result);
    public List<User> getAllUser();

    public String getRegistration(Model model);

    public String home(Model model);
}
