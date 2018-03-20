/**
 * 
 */
package com.data.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.data.model.Customer;

/**
 * @author vssundararaman
 *
 */
public class RemoteCustomerRepository implements CustomerRepository {

	@Autowired
	protected RestTemplate restTemplate;

	protected String serviceUrl;

	public RemoteCustomerRepository(String serviceUrl) {
		this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl : "http://" + serviceUrl;
	}

	@Override
	public List<Customer> findAll() {
		System.out.println("Inside Client Method");
		Customer[] customers = restTemplate.getForObject(serviceUrl+"/customers", Customer[].class);
		return Arrays.asList(customers);
	}

}
