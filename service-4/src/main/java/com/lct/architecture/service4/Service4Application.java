package com.lct.architecture.service4;

import com.lct.architecture.service3.Service3Application;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RequestMapping("/service4")
@RestController
public class Service4Application {

	public static void main(String[] args) {
		SpringApplication.run(Service4Application.class, args);
	}


	@GetMapping("/message")
	public String message(){
		return "Service 4 "
				+ "+ Hello "
				;
	}

}
