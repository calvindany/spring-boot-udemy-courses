package com.demo.springcore.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TennisCoach implements ICoach{

    public TennisCoach() {
        System.out.println("Tennis Coach Beans has been initialized");
    }

    @Override
    public String getDailyWorkOut() {
        return "Practice your backhand volley";
    }
}
