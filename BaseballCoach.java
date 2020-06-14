package com.springdemo;

public class BaseballCoach implements Coach {
    //define a field for the dependency
    private FortuneService fortuneService;

    //create constructor for the dependency injections
    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    public BaseballCoach() {

    }

    @Override
    public String getDailyWorkout(){
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        //use fortuneService to get fortune
        return fortuneService.getFortune();
    }
}
