package edu.learn.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    public static final String HELLO_TEJAS= "Hello Tejas!!!!";
    @Override
    public String sayGreeting() {
        return HELLO_TEJAS;
    }
}
