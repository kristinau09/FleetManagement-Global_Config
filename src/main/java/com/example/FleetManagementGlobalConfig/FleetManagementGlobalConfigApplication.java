package com.example.FleetManagementGlobalConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class FleetManagementGlobalConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(FleetManagementGlobalConfigApplication.class, args);
	}

}
