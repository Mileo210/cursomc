package com.miguel.cursomc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.miguel.cursomc.resources")
public class CursomcApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

}
