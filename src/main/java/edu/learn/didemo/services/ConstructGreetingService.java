package edu.learn.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello- I was injected via the constructor!!!";
    }
}
