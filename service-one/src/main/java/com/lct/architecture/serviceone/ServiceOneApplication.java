package com.lct.architecture.serviceone;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RequestMapping("/service1")
@RestController
public class ServiceOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceOneApplication.class, args);
	}


	@Value("service.2.url")
	String service2Url;

	@Bean
	RestTemplate restTemplate(){
		return  new RestTemplate();
	}

	@GetMapping("/message")
	public String message(){
		return "Service 1 + "
				+restTemplate().getForObject(service2Url, String.class)
				;
	}

}
