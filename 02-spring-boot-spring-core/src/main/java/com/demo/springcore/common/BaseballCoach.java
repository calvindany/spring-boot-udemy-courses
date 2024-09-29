package com.demo.springcore.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// @Lazy
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
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
