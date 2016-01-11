package com.navercorp.song.dto;

public class Customer 
{
	int custId;
	String name;
	int age;
	
	public Customer(int cusId, String name, int age) {
		this.custId = cusId;
		this.name = name;
		this.age = age;
		
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}