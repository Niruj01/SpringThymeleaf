package com.guvi.springthymleaf.Repository;

import com.guvi.springthymleaf.Entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepository extends JpaRepository<Feedback,Integer>{
}
