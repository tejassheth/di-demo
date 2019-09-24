package edu.learn.didemo.controller;

import edu.learn.didemo.services.GreetingService;

public class PropertyInjectedController  {
    public GreetingService greetingService;

    String sayHello(){
        return greetingService.sayGreeting();
    }
}
