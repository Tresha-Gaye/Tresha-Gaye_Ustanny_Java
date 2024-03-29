package com.trilogyed.gamestoreinvoicing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class GamestoreInvoicingApplication {

	public static void main(String[] args) {
		SpringApplication.run(GamestoreInvoicingApplication.class, args);
	}

}
