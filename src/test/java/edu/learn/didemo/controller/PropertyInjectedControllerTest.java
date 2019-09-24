package edu.learn.didemo.controller;

import edu.learn.didemo.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @BeforeEach
    public void setUp(){
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingServiceImpl = new GreetingServiceImpl();
    }

    @Test
    void testGreeting(){
        assertEquals(GreetingServiceImpl.HELLO_TEJAS, propertyInjectedController.sayHello());
    }
}