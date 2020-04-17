package com.example;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "test-endpoint")
public class TestEndpoint {

	@ReadOperation
	public String test() {
		return "Test";
	}

}
