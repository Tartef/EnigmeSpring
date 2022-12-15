package com.example.enigmespring2;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EnigmeSpring2ApplicationTests {

    @Test
    public String home(){
        return "Hello World!";
    }

}
