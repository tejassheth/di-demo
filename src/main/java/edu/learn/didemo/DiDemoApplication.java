package edu.learn.didemo;

import edu.learn.didemo.controller.MyController;
import edu.learn.didemo.examplebean.FakeDataSource;
import edu.learn.didemo.examplebean.FakeJmsBroker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@Slf4j
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(DiDemoApplication.class, args);
		MyController controller= (MyController) ctx.getBean("myController");
		FakeDataSource fakeDataSource=(FakeDataSource) ctx.getBean(FakeDataSource.class);
		log.info(fakeDataSource.toString());
        FakeJmsBroker fakeJmsBroker=(FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);
        log.info(fakeJmsBroker.toString());

	}


}
