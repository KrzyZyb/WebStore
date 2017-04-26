package com.packt.webstore.domain.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.domain.repository.CustomerRepository;
@Repository
public class InMemoryCustomerRepository implements CustomerRepository {
	private List<Customer> listOfCustomers = new ArrayList<Customer>();
	
	public InMemoryCustomerRepository(){
		Customer klientMichal = new Customer("C1","Wrocław 52-220", "Michał", 0);
		listOfCustomers.add(klientMichal);
		Customer klientRafal = new Customer("C2","Wrocław 52-250", "Rafał", 0);
		listOfCustomers.add(klientRafal);
		Customer klientIza = new Customer("C3","Dłogomiłowice 47-100", "Iza", 0);
		listOfCustomers.add(klientIza);
	}

	@Override
	public List<Customer> getAllCustomers() {
		return listOfCustomers;
	}

}
