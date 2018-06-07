package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import guru.springframework.services.impl.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("propertyGreetingServiceImpl")
   public GreetingService propertyGreetingServiceImpl;

    public String hello(){
        return propertyGreetingServiceImpl.sayGreeting();
    }
}
