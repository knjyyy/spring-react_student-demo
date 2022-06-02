package com.rk3.msusermanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsUserManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsUserManagementApplication.class, args);
	}

}
