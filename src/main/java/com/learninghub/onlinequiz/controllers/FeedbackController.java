package com.learninghub.onlinequiz.controllers;

import com.learninghub.onlinequiz.models.Feedback;
import com.learninghub.onlinequiz.services.FeedbackServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class FeedbackController {

    @Autowired
    FeedbackServiceImpl feedbackserviceimpl;

    @RequestMapping("/getAllFeedbacks")
    public ModelAndView getAllFeedbacks(){
        ModelAndView mv=new ModelAndView("showfeedbacks.jsp");
        List<Feedback> feedbacks=feedbackserviceimpl.getAllFeedbacks();
        mv.addObject("feedbacks", feedbacks);
        return mv;
    }
}
