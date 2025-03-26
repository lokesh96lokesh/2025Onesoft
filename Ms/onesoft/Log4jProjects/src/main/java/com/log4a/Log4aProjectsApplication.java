package com.log4a;


//import org.apache.log4j.BasicConfigurator;//
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;//
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;






@SpringBootApplication
public class Log4aProjectsApplication {
	
	public static void main(String[] args) {
		Logger Log = Logger.getLogger(Log4aProjectsApplication.class);
		
		SpringApplication.run(Log4aProjectsApplication.class, args);
		PropertyConfigurator.configure("log4j.properties");//console + file
		//BasicConfigurator.configure(); // console
		Log.info("information");
		Log.error("error");
		Log.warn("Warning");
		Log.fatal("crictical error");
		Log.debug("debuugging");
		System.out.println("hello");
	
	}

}
