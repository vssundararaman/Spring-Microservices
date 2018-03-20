/**
 * 
 */
package com.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.data.model.Customer;

/**
 * @author vssundararaman
 *
 */
@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer, Long>{
	List<Customer> findAll();
}
