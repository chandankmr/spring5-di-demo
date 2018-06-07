package guru.springframework.services.impl;

import guru.springframework.services.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService {

    public static final String HELLOWORLD="Hello Java using Constructor Sree";
    @Override
    public String sayGreeting() {
        return HELLOWORLD;
    }
}
