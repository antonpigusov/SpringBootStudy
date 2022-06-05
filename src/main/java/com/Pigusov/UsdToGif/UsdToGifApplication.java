package com.Pigusov.UsdToGif;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"controllers"})
@EnableFeignClients
public class UsdToGifApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsdToGifApplication.class, args);
	}

}
