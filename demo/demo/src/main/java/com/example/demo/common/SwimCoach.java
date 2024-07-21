package com.example.demo.common;

public class SwimCoach implements  Coach{
    public SwimCoach(){
       System.out.println("In cosntructor: "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "SWIM 1000m to warm up";
    }
}
