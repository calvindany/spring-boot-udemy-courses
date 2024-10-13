package com.demo.springcore.rest;

import com.demo.springcore.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.demo.springcore.common.ICoach;

@Configuration
public class SportConfig {
    @Bean("custombean")
    public ICoach swimCoach() {
        return new SwimCoach();
    }
}
