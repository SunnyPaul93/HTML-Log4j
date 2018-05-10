package com.sunny.jdbc;

import java.util.List;

public interface CustomerDAO {

	public int addCustomer(CustomerTO cto);
	public int updateCustomer(CustomerTO cto);
	public int deleteCustomer(int cid);
	
	public CustomerTO getCustomerByCid(int cid);
	public CustomerTO getCustomerByEmail(String email);
	
	public List<CustomerTO> getAllCustomers();
	public List<CustomerTO> getAllCustomersByCity(String city);
	public List<CustomerTO> getAllCustomersByStatus(String status);
	public List<CustomerTO> getAllCustomersByBal(double bal);

	
}
