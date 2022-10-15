package com.udemy.customerdata;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.udemy.customerdata.entities.Customer;
import com.udemy.customerdata.repository.CustomerRepository;

@SpringBootTest
class CustomerdataApplicationTests {

	@Autowired
	private CustomerRepository repo;

	@Test
	void testCustomerData() {
		Customer c = new Customer();
		c.setName("Ahemad");
		c.setEmail("abc@gmail.com");
		repo.save(c);
	}

	@Test
	void testUpdateCustomer() {
		Customer customer = repo.findById(1).get();
		customer.setName("Sayed");
		customer.setEmail("2idli3wada@gmail.com");
		repo.save(customer);
	}
	
	@Test
	void testCustomerFech() {
		Customer customer=repo.findById(1).get();
		System.out.println(customer);
	}
	
	@Test
	void testDeleteCustomer() {
		repo.deleteById(2);
		repo.deleteById(3);
	}

}
