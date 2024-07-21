package com.example.demo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    public TennisCoach(){
        System.out.println("In a class"+ getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "daily 30mins practice of tennis";
    }
}
