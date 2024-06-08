package com.banbif.holamundo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HolamundoApplicationTests {

	@Test
	void contextLoads() {
	}

}

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HolamundoApplicationTests {

    @Test
    public void testTwo() {
        String[] args = {}; // Provide any necessary arguments
        HolamundoApplication.two(args);
        // Add assertions or verification logic here if needed
    }
}