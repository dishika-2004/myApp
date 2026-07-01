package com.dishika.myApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyAppApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(MyAppApplication.class, args);
		
		//normally creating an object
		// Dev dev = new Dev();
        // dev.build();

		//using beans
		Dev obj = context.getBean(Dev.class);
		obj.build();

	}

}
