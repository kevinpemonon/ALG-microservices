package com.mchambres;

import java.sql.SQLException;

//import org.h2.tools.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;






@SpringBootApplication
@EnableDiscoveryClient
public class MchambresApplication {
	
	/*@Bean(initMethod = "start", destroyMethod = "stop")
	public Server inMemoryH2DatabaseaServer() throws SQLException {
	    return Server.createTcpServer(
	      "-tcp", "-tcpAllowOthers", "-tcpPort", "9090");
	}*/

	public static void main(String[] args) {
		SpringApplication.run(MchambresApplication.class, args);
	}
}
