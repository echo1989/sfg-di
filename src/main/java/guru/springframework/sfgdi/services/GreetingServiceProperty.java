package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceProperty implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}
