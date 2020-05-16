package com.learninghub.onlinequiz.services;

import com.learninghub.onlinequiz.Repositories.UserRepo;
import com.learninghub.onlinequiz.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Service
public interface UserService {

    public ModelAndView addUser(User user,BindingResult result);
    public List<User> getAllUser();

    public ModelAndView getRegistration(Model model);

    public ModelAndView home(Model model);

}
