package com.banbif.holamundo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GreetingServiceTest {

    @Autowired
    private GreetingService greetingService;

    @Test
    public void testGreet() {
        String name = "World";
        String expectedGreeting = "Hello, " + name + "!";
        String actualGreeting = greetingService.greet(name);

        assertEquals(expectedGreeting, actualGreeting);
    }
}
