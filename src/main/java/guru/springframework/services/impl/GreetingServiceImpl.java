package guru.springframework.services.impl;

import guru.springframework.services.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service  @Primary
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLOWORLD="Hello Java!";
    @Override
    public String sayGreeting() {
        return HELLOWORLD;
    }
}
