package edu.learn.didemo.controller;

import edu.learn.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
    @Autowired
    //@Qualifier("setterGreetingService")
    // We can  use either way on method
    public void setGreetingService(@Qualifier("setterGreetingService")GreetingService greetingService) {
        this.greetingService = greetingService;
    }

}
