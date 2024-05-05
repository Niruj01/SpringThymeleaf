package com.guvi.springthymleaf.Entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Data
@Table(name="feedbackTable")
@AllArgsConstructor
@NoArgsConstructor
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String bookName;

    private String feedBack;
}
