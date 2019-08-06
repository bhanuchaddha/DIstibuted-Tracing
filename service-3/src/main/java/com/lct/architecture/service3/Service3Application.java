package com.lct.architecture.service3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RequestMapping("/service3")
@RestController
public class Service3Application {

	public static void main(String[] args) {
		SpringApplication.run(Service3Application.class, args);
	}


	@Value("service.4.url")
	String service4Url;

	@Bean
	RestTemplate restTemplate(){
		return  new RestTemplate();
	}

	@GetMapping("/message")
	public String message(){
		return "Service 3 + "
				+restTemplate().getForObject(service4Url, String.class)
				;
	}

}
