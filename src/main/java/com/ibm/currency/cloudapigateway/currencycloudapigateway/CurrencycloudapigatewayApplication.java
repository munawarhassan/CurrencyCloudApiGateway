package com.ibm.currency.cloudapigateway.currencycloudapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CurrencycloudapigatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencycloudapigatewayApplication.class, args);
	}

}
