package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/hello")
	public String sayHelloWorld(){
		return "EAD";
	}

	@GetMapping("/displayInfo")
	public String display(@RequestParam(name="aId") String accId,@RequestParam(name="bal")double balance){
		return "Account holder is "+accId+"and balance is"+balance;
	}

}
