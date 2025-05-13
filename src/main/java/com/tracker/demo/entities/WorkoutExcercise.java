package com.tracker.demo.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class WorkoutExcercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(targetEntity = Excercise.class)
    private Excercise excerciseId;

    @ManyToOne(targetEntity = Workout.class)
    private Workout workoutId;

    private int sets;

    private int reps;

    private double weight;
}
