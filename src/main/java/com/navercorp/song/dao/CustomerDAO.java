package com.navercorp.song.dao;

import com.navercorp.song.dto.Customer;

public interface CustomerDAO 
{
	public void insert(Customer customer);
	public Customer findByCustomerId(int custId);
}
