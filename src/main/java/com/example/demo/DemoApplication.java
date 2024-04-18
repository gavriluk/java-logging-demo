package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;


@SpringBootApplication
@EnableScheduling
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Scheduled(fixedDelay = 1000, initialDelay = 1000)
	public void scheduledTask() {
		Logger log = LoggerFactory.getLogger(DemoApplication.class);
		log.error("Some error");
		log.info("Some info");
		log.debug("Come get some");
		log.trace("Trace it baby");
	}

}
