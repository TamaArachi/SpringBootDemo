package com.example.demoApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.Configuration.DemoAppConfig;
import com.example.Impl.DemoAppImpl;

@SpringBootApplication
public class DemoApplication {
	
	

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext(DemoAppConfig.class);
		DemoAppImpl appImplBean = context.getBean("demoAppImpl",DemoAppImpl.class);
		String output = appImplBean.helloWorld("Mona");
		System.out.println(output);
	}

}
