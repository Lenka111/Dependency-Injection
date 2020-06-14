package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve a bean from the spring container
        Coach baseballCoach = context.getBean("baseballCoach", Coach.class);
        Coach trackCoach = context.getBean("myTrackCoach", Coach.class);

        //FortuneService theFortuneService = context.getBean("myFortuneService", FortuneService.class );

        //call methods on the bean

        System.out.println(baseballCoach.getDailyFortune());
        System.out.println(baseballCoach.getDailyWorkout());

        System.out.println(trackCoach.getDailyWorkout());
        System.out.println(trackCoach.getDailyFortune());

        //close the context
        context.close();
    }
}
