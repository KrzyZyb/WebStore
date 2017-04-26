package com.packt.webstore.domain;

public class Customer {
	String customerId;
	String adress;
	String name;
	int noOfOrdersMade;
	public Customer(String customerId, String adress, String name, int noOfOrdersMade) {
		super();
		this.customerId = customerId;
		this.adress = adress;
		this.name = name;
		this.noOfOrdersMade = noOfOrdersMade;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfOrdersMade() {
		return noOfOrdersMade;
	}
	public void setNoOfOrdersMade(int noOfOrdersMade) {
		this.noOfOrdersMade = noOfOrdersMade;
	}

}
