package com.codeshop.carhire.repository;

import com.codeshop.carhire.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer,Long> {

}
