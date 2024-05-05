package com.guvi.springthymleaf.Controller;

import com.guvi.springthymleaf.Entity.Feedback;
import com.guvi.springthymleaf.Service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;

    @GetMapping("/")
    public String index(){
        return "index";
    }


    @PostMapping(value = "/save")
    public String addFeedBack(@ModelAttribute Feedback feedBack){
        feedbackService.saveInDb(feedBack);
        return "feedBackSave";
    }

}
