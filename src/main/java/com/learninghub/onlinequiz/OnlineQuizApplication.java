package com.learninghub.onlinequiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class OnlineQuizApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineQuizApplication.class, args);
	}

}
