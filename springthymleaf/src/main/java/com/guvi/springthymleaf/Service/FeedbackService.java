package com.guvi.springthymleaf.Service;


import com.guvi.springthymleaf.Entity.Feedback;
import com.guvi.springthymleaf.Repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackService {

   @Autowired
    private FeedbackRepository feedBackRepository;

   public void saveInDb(Feedback feedBack){
       feedBackRepository.save(feedBack);
   }
}
