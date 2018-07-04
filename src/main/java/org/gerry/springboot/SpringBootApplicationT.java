package org.gerry.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"org.gerry.services.*","org.gerry.aops.*"})
public class SpringBootApplicationT {

	public static void main(String[] args){
		SpringApplication.run(SpringBootApplicationT.class, args);
	}
}
