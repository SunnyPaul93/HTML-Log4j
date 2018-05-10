package com.sunny.jdbc;

import java.util.List;

public class JdbcCustomerDAO implements CustomerDAO {

	@Override
	public int addCustomer(CustomerTO cto) {
		String sql = "insert into jdbcCustomers values(?,?,?,?,?,?,?)";

		return JdbcTemplate.update(sql, cto.getCid(), cto.getCname(), cto.getEmail(), cto.getPhone(), cto.getCity(),
				cto.getBal(), cto.getStatus());
	}

	@Override
	public int updateCustomer(CustomerTO cto) {
		String sql="update jdbcCustomers set cname=?,email=?,phone=?,city=?,balance=?,status=? where cid=?";
		return JdbcTemplate.update(sql, cto.getCid(), cto.getCname(), cto.getEmail(), cto.getPhone(), cto.getCity(),
				cto.getBal(), cto.getStatus());
	}

	@Override
	public int deleteCustomer(int cid) {
		String sql="delete from jdbcCustomers where cid=?";
			return JdbcTemplate.update(sql,cid);
	}

	@Override
	public CustomerTO getCustomerByCid(int cid) {
		String sql="select * from jdbcCustomers where cid=?";
		Object obj=JdbcTemplate.queryForObject(sql, new CustomerRowMapper(),cid);	//since object is varx so 0 or more argument
		CustomerTO cto=(CustomerTO) obj;
		return cto;
	}

	@Override
	public CustomerTO getCustomerByEmail(String email) {
		String sql="select * from jdbcCustomers where email=?";
		Object obj=JdbcTemplate.queryForObject(sql, new CustomerRowMapper(),email);	//since object is varx so 0 or more argument
		CustomerTO cto=(CustomerTO) obj;
		return cto;
	}

	@Override
	public List<CustomerTO> getAllCustomers() {
		String sql="select * from jdbcCustomers";
		return JdbcTemplate.queryForList(sql, new CustomerRowMapper());			//since object is varx so 0 or more argument
		}

	@Override
	public List<CustomerTO> getAllCustomersByCity(String city) {
		String sql="select * from jdbcCustomers where city=?";
		return JdbcTemplate.queryForList(sql, new CustomerRowMapper(),city);
		}

	@Override
	public List<CustomerTO> getAllCustomersByStatus(String status) {
		String sql="select * from jdbcCustomers where status=?";
		return JdbcTemplate.queryForList(sql, new CustomerRowMapper(),status);
	}

	@Override
	public List<CustomerTO> getAllCustomersByBal(double bal) {
		String sql="select * from jdbcCustomers where balance<=?";
		return JdbcTemplate.queryForList(sql, new CustomerRowMapper(),bal);

	}

}

/*
 * create table jdbcCustomers(cid int primary key,cname char(30),email
 * char(30),phone char(10),city char(15),balance double,status char(10));
 */
