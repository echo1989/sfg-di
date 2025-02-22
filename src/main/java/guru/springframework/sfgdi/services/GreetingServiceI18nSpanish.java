package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")
public class GreetingServiceI18nSpanish implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - ES";
    }
}
