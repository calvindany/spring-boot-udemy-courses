package com.demo.springcore.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class CricketCoach implements ICoach{

    public CricketCoach() {
        System.out.println("Cricket Coach Beans has been initialized");
    }

    @Override
    public String getDailyWorkOut() {
        return "Practice fast bowling for 15 minutes!!!";
    }
}
