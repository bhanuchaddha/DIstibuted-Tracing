package com.lct.architecture.service2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RequestMapping("/service2")
@RestController
public class Service2Application {

	public static void main(String[] args) {
		SpringApplication.run(Service2Application.class, args);
	}


	@Value("service.3.url")
	String service3Url;

	@Bean
	RestTemplate restTemplate(){
		return  new RestTemplate();
	}

	@GetMapping("/message")
	public String message(){
		return "Service 2 "
				+restTemplate().getForObject(service3Url, String.class)
				;
	}

}
