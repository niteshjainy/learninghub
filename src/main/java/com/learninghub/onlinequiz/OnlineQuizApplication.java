package com.learninghub.onlinequiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
@ComponentScan(basePackages={"com.learninghub.onlinequiz"})
public class OnlineQuizApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineQuizApplication.class, args);
	}

}
