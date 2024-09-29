package com.demo.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements ICoach{

    @Override
    public String getDailyWorkOut() {
        return "Practice fast bowling for 15 minutes!!!";
    }
}
