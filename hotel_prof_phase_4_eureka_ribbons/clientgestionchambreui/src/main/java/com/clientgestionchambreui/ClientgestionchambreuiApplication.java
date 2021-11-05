package com.clientgestionchambreui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients("com.clientgestionchambreui")
public class ClientgestionchambreuiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientgestionchambreuiApplication.class, args);
	}

}
