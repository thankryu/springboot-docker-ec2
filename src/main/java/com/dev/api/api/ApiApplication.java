package com.dev.api.api;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Slf4j
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	@RequestMapping("/")
	public String hello(){
		log.trace("trace message");
		log.debug("debug message");
		log.info("info message"); // default
		log.warn("warn message");
		log.error("error message");
		return "hello api";
	}

	@RequestMapping("/abc")
	public String hello2(){
		log.trace("trace message");
		log.debug("debug message");
		log.info("info message"); // default
		log.warn("warn message");
		log.error("error message");
		return "hello api2";
	}
}
