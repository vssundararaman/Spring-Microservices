/**
 * 
 */
package com.data.repository;

import java.util.List;

import com.data.model.Customer;

/**
 * @author vssundararaman
 *
 */
public interface CustomerRepository {

	List<Customer> findAll();
}
