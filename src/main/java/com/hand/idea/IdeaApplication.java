package com.hand.idea;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.hand.idea.mapper")
public class IdeaApplication {

	public static void main(String[] args) {

		SpringApplication.run(IdeaApplication.class, args);
	}
}
