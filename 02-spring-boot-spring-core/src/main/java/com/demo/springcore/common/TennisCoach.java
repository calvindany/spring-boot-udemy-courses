package com.demo.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements ICoach{
    @Override
    public String getDailyWorkOut() {
        return "Practice your backhand volley";
    }
}
