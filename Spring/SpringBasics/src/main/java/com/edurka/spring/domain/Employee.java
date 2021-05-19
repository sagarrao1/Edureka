package com.edurka.spring.domain;

public class Employee {
	
	private int id;
	private String name;
	private Address address;

	public Employee() {
		System.out.println("--- Employee Object created ----");
	}
		
//	Constructor injector
	public Employee(Address address) {
		System.out.println("Constructor injector method called");
		this.address = address;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Address getAddress() {
		return address;
	}
	
//	Setter Injector
	public void setAddress(Address address) {
		System.out.println("Setter Injector method called");
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	

	public void MyDestroyMethod() {
		System.out.println("Destroy method called ..");
	}
 
	public void MyInitMethod() {
		System.out.println("MyInitMethod method called ..");
	}

	
	

}
