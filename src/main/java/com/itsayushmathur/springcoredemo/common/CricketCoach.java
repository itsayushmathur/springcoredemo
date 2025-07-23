package com.itsayushmathur.springcoredemo.common;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("In Constructor: "+ getClass().getSimpleName());
    }
    //define our init method
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("In doMyStartupStuff: "+ getClass().getSimpleName());
    }

    //define our destroy method
    @PreDestroy
    public void doMyClosingStuff(){
        System.out.println("In doMyClosingStuff: "+ getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes. ;)";
    }
}
