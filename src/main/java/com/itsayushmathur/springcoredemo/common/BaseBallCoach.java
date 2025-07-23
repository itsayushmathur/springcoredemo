package com.itsayushmathur.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach{

    public BaseBallCoach(){
        System.out.println("In Constructor: "+ getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "30 Min Batting Practice";
    }
}
