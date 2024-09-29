package com.demo.springcore.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// @Lazy
//@ Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BaseballCoach implements ICoach{

    public BaseballCoach() {
        System.out.println("Baseball Coach Beans has been initialized");
    }

    @Override
    @Primary
    public String getDailyWorkOut() {
        return "Spend 30 menutes in battling practice";
    }

    //    Define init method
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println("in doMyStartUpStuff: " + getClass().getSimpleName());
    }

    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println("in doMyCleanupStuff: " + getClass().getSimpleName());
    }
}
