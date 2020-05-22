package com.learninghub.onlinequiz.controllers;

import com.learninghub.onlinequiz.models.Feedback;
import com.learninghub.onlinequiz.services.FeedbackServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class FeedbackController {

    @Autowired
    FeedbackServiceImpl feedbackserviceimpl;

    @RequestMapping("/getAllFeedbacks")
    public ModelAndView getAllFeedbacks() {
        ModelAndView mv = new ModelAndView("showfeedbacks.jsp");
        List<Feedback> fback = feedbackserviceimpl.getAllFeedbacks();
        System.out.println(fback);
        mv.addObject("feedbacks", fback);
        return mv;
    }

    @PostMapping("/addFeedback")
    public ModelAndView addFeedback(@ModelAttribute Feedback feedback) {
        ModelAndView mv = new ModelAndView("home.jsp");
        feedbackserviceimpl.addFeedback(feedback);
        return mv;
    }
}