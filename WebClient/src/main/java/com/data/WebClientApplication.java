package com.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.data.repository.CustomerRepository;
import com.data.repository.RemoteCustomerRepository;

@SpringBootApplication
@EnableDiscoveryClient
public class WebClientApplication {
	
	public static final String CUSTOMER_SERVICE_URL="http://CUSTOMERSERVICE";
	
	public static void main(String[] args) {
		SpringApplication.run(WebClientApplication.class, args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
	
	@Bean
	public CustomerRepository customerRepository(){
		return new RemoteCustomerRepository(CUSTOMER_SERVICE_URL);
	}
}
