package com.demo.springcore.rest;

import com.demo.springcore.common.ICoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private ICoach myCoach;
    private ICoach anotherCoach;
    private ICoach swimCoach;

    // Define constructor for dependency injection
    @Autowired
    public DemoController(
            @Qualifier("baseballCoach") ICoach theCoach,
            @Qualifier("baseballCoach") ICoach theAnotherCoach,
            @Qualifier("custombean") ICoach newSwimCoach
    ){
        System.out.println("In Constructor: " + getClass().getSimpleName());
        myCoach = theCoach;
        anotherCoach = theAnotherCoach;
        swimCoach = newSwimCoach;
    }

    // Define Setter Injection
    /*
    @Autowired
    public void setCoach(@Qualifier("CricketCoach") ICoach coach) {
        myCoach = coach;
    }
    */

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkOut();
    }

    @GetMapping("/dailyworkout-swimcoach")
    public String getDailyWorkout2() {
        return swimCoach.getDailyWorkOut();
    }

    @GetMapping("/check")
    public String check() {
        return "Compared beans: myCoach == anotherCoach, " + (myCoach == anotherCoach);
    }
}
