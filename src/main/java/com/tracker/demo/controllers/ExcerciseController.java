package com.tracker.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/excercise")
public class ExcerciseController {

    @GetMapping("/excercises")
    public String getExcercise (){
        return "";
    }

}
