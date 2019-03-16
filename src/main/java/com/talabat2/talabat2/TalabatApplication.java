package com.talabat2.talabat2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.talabat2.talabat2.domain.rest")
public class TalabatApplication {

	public static void main(String[] args) {
		SpringApplication.run(TalabatApplication.class, args);
	}

}

