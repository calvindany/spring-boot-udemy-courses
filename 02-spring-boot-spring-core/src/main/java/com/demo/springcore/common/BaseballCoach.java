package com.demo.springcore.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BaseballCoach implements ICoach{

    public BaseballCoach() {
        System.out.println("Baseball Coach Beans has been initialized");
    }

    @Override
    @Primary
    public String getDailyWorkOut() {
        return "Spend 30 menutes in battling practice";
    }
}
