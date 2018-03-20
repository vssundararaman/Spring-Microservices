/**
 * 
 */
package com.data.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.data.model.Customer;
import com.data.repository.CustomerRepository;

/**
 * @author vssundararaman
 *
 */
@RestController
public class CustomerController {
	
	@Autowired
	CustomerRepository customerRepository;

	@RequestMapping("/customers")
	public Customer[] all(){
		
		System.out.println("Inside Data Layer");
		
		List<Customer> customers = customerRepository.findAll();
		return customers.toArray(new Customer[customers.size()]);
	}
}
