package com.example.demo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy
public class TrackCoach implements Coach{
    public TrackCoach(){
        System.out.println("In a class"+ getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "practice of Tracking 15min daily";
    }
}
