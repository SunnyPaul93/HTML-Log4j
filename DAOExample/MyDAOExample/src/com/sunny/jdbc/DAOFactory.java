package com.sunny.jdbc;

public class DAOFactory {

	static CustomerDAO customerDAO;
	
	static{
		customerDAO=new JdbcCustomerDAO();		//Craete DBC customer DAO only once
	}
	
	public static CustomerDAO getCustomerDAO(){
		return customerDAO;
	}
}
