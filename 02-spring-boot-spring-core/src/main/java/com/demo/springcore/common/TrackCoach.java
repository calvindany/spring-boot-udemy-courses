package com.demo.springcore.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TrackCoach implements ICoach{

    public TrackCoach() {
        System.out.println("Track Coach Beans has been initialized");
    }

    @Override
    public String getDailyWorkOut() {
        return "Run a hard 5k!";
    }
}
