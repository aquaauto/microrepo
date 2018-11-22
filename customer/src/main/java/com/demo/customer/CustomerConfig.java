package com.demo.customer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.annotation.ObjectIdGenerators.UUIDGenerator;

@Configuration
public class CustomerConfig {

	@Bean
	public UUIDGenerator getUUIDGenerator() {
		return new UUIDGenerator();
	}
}
