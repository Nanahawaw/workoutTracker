package com.tracker.demo.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Data
@Entity
public class Workout {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne(targetEntity = User.class)
    private User userId;

    private Date scheduledDate;

    private String comment;

    private CreatedDate createdAt;
}
