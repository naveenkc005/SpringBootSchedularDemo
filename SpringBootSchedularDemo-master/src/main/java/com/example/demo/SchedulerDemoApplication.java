package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SchedulerDemoApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(SchedulerDemoApplication.class, args);
		MyScheduler sc = new MyScheduler();
		sc.teja();
	}
}
