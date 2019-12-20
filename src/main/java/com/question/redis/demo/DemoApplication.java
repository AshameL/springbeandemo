package com.question.redis.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootApplication
@Slf4j
public class DemoApplication {



	public static void main(String[] args) {
		System.out.println("helloooooooooo!");

		SpringApplication.run(DemoApplication.class, args);
	}

}
