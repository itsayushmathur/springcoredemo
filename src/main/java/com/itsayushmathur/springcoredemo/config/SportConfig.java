package com.itsayushmathur.springcoredemo.config;

import com.itsayushmathur.springcoredemo.common.Coach;
import com.itsayushmathur.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    
    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
