package com.example.feignservice;

import com.example.feignservice.Beans.Auteur;
import com.example.feignservice.Controllers.ControllerLib;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableFeignClients("com.example")

public class FeignServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(FeignServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(ControllerLib lib){
		return args -> {
			List<Auteur> aut = lib.getAllAuteurs();
			System.out.println(aut);

		};
	}

}
