package guru.springframework.controllers;

import guru.springframework.services.impl.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import static org.junit.Assert.assertEquals;

public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp() throws Exception{
        this.setterInjectedController=new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception{
      assertEquals(GreetingServiceImpl.HELLOWORLD,setterInjectedController.hello());
    }

}

