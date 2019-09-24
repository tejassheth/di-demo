package edu.learn.didemo;

import edu.learn.didemo.controller.ConstructorInjectedController;
import edu.learn.didemo.controller.MyController;
import edu.learn.didemo.controller.PropertyInjectedController;
import edu.learn.didemo.controller.SetterInjectedController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	private static Logger logger = LoggerFactory.getLogger(DiDemoApplication.class);
	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(DiDemoApplication.class, args);
		MyController controller= (MyController) ctx.getBean("myController");
		controller.hello();

		logger.info(ctx.getBean(PropertyInjectedController.class).sayHello());
		logger.info(ctx.getBean(SetterInjectedController.class).sayHello());
		logger.info(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}


}
