package com.demo.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements ICoach{
    @Override
    public String getDailyWorkOut() {
        return "Run a hard 5k!";
    }
}
