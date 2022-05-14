package com.mxs.core.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.mxs.usecase")
public class CoreModuleApplication {
	public static void main(String[] args) {
		SpringApplication.run(CoreModuleApplication.class, args);
	}
}
