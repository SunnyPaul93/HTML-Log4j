//Without Templete 
package com.sunny.jdbc;

import java.util.List;

public class Lab {
	public static void main(String[] args) {
		CustomerDAO cdao = DAOFactory.getCustomerDAO();

		// Add Customer
		CustomerTO cto = new CustomerTO(221, "Madhu", "madhu@gmail.com", "7654312384", "Bangalore", 56000, "Active");
		int x = cdao.addCustomer(cto);
		System.out.println("Insert Statement done is :" + x);

		// Update Customer
		cto = new CustomerTO(115, "Priya", "riya@gmail.com", "9000927262", "Bangalore", 90000, "Active");
		x = cdao.updateCustomer(cto);

		cto = new CustomerTO(201, "RaniRoy", "rani93@gmail.com", "8273645464", "Silchar", 65770, "InActive");
		x = cdao.updateCustomer(cto);

		System.out.println("Update Statement done is :" + x);

		// Delete Customer
		x = cdao.deleteCustomer(220);
		System.out.println("Delete Statement done is :" + x);

		// Get Customer Info By Cid
		CustomerTO cto1 = cdao.getCustomerByCid(101);
		System.out.println(cto1);
		cto1 = cdao.getCustomerByCid(201);
		System.out.println(cto1);

		// Get Customer Info By Email
		cto1 = cdao.getCustomerByEmail("aditi@gmail.com");
		System.out.println(cto1);

		// Get Customer Info By All Customers
		System.out.println("---------All Customers--------");
		List<CustomerTO> list = cdao.getAllCustomers();
		for (CustomerTO cto2 : list) {
			System.out.println(cto2);
		}

		// Get Customer Info By City
		System.out.println("--------By City--------");
		list = cdao.getAllCustomersByCity("Silchar");
		for (CustomerTO cto2 : list) {
			System.out.println(cto2);
		}

		// Get Customer Info By Status
		System.out.println("----------By Status-------");
		list = cdao.getAllCustomersByStatus("Active");
		for (CustomerTO cto2 : list) {
			System.out.println(cto2);
		}

		// Get Customer Info By Bal
		System.out.println("----------By Balance-------");
		list = cdao.getAllCustomersByBal(66000);
		for (CustomerTO cto2 : list) {
			System.out.println(cto2);
		}

	}

}

/*
 * create table jdbcCustomers(cid int primary key,cname char(30),email
 * char(30),phone char(10),city char(15),balance double,status char(10));
 */
