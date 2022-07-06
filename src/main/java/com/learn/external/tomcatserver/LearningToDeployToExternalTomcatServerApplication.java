package com.learn.external.tomcatserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class LearningToDeployToExternalTomcatServerApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(LearningToDeployToExternalTomcatServerApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder app) {
		return app.sources(LearningToDeployToExternalTomcatServerApplication.class);
	}
	
}
