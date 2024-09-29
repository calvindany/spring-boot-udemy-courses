package com.demo.springcore.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements ICoach{

    @Override
    @Primary
    public String getDailyWorkOut() {
        return "Spend 30 menutes in battling practice";
    }
}
