package com.mingzhi.goodjob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@SpringBootApplication
public class GoodjobApplication {

	@RequestMapping("/")
	public String hello() {
		return "hello goodjob";
	}
	public static void main(String[] args) {
		SpringApplication.run(GoodjobApplication.class, args);
	}

}
