package edu.learn.didemo.controller;

import edu.learn.didemo.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {
    private ConstructorInjectedController constructorInjectedController;

    @BeforeEach
    public void setUp() {
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void testGreeting(){
        assertEquals(GreetingServiceImpl.HELLO_TEJAS, constructorInjectedController.sayHello());
    }
}