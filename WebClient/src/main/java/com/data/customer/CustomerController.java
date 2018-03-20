/**
 * 
 */
package com.data.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.data.repository.CustomerRepository;

/**
 * @author vssundararaman
 *
 */
@Controller
public class CustomerController {
	
	@Autowired
	CustomerRepository customerRepository;

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/customers")
	public String home(Model model) {
		System.out.println("Inside the Client");
		model.addAttribute("customers", customerRepository.findAll());
		return "customer";
	}
}
