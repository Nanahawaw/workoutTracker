package com.tracker.demo.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/workout")
public class WorkoutController {

    @PostMapping("/")
    public String postWorkout(){
        return "";
    }

    @GetMapping("/")
    public  String getWorkouts(){
        return "";
    }

    @PutMapping("/${id}")
    public  String editWorkout(){
        return "";
    }

    @DeleteMapping("/${id}")
    public  String deleteWorkout(){
        return "";
    }
}
