package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.services.GreetingServiceConstructor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new GreetingServiceConstructor());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}