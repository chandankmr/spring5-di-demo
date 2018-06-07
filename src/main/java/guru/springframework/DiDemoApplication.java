package guru.springframework;

import guru.springframework.controllers.ConstructorInjectedController;
import guru.springframework.controllers.MyController;
import guru.springframework.controllers.PropertyInjectedController;
import guru.springframework.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(DiDemoApplication.class, args);
		PropertyInjectedController controller=ctx.getBean("propertyInjectedController",PropertyInjectedController.class);
		//SetterInjectedController controller=ctx.getBean("setterInjectedController",SetterInjectedController.class);
		//ConstructorInjectedController controller=ctx.getBean("constructorInjectedController",ConstructorInjectedController.class);
		//MyController controller=ctx.getBean("myController",MyController.class);
		System.out.println(controller.hello());
	}
}
