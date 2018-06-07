package guru.springframework.services.impl;

        import guru.springframework.services.GreetingService;
        import org.springframework.context.annotation.Primary;
        import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingServiceImpl implements GreetingService {

    public static final String HELLOWORLD="Hello Java using Property Sree";
    @Override
    public String sayGreeting() {
        return HELLOWORLD;
    }
}

