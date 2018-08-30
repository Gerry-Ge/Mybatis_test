package org.gerry.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("org.gerry.Mappers")
@ComponentScan(basePackages={"org.gerry.services.*","org.gerry.aops.*"})
public class SpringBootApplicationT {

	public static void main(String[] args){
		SpringApplication.run(SpringBootApplicationT.class, args);
	}
}
=======
package org.gerry.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("org.gerry.Mappers")
@ComponentScan(basePackages={"org.gerry.services.*","org.gerry.aops.*"})
public class SpringBootApplicationT {

	public static void main(String[] args){
		SpringApplication.run(SpringBootApplicationT.class, args);
	}
}
