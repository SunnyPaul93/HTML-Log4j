package com.sunny.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class JdbcCustomerDAO implements CustomerDAO {

	@Override
	public int addCustomer(CustomerTO cto) {
		int x = 0;
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = JDBC_UTIL.getMySQLConnection();

			String sql = "insert into jdbcCustomers values(?,?,?,?,?,?,?)";
			ps = con.prepareStatement(sql);

			ps.setInt(1, cto.getCid());
			ps.setString(2, cto.getCname());
			ps.setString(3, cto.getEmail());
			ps.setString(4, cto.getPhone());
			ps.setString(5, cto.getCity());
			ps.setDouble(6, cto.getBal());
			ps.setString(7, cto.getStatus());
			x = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBC_UTIL.mycleanup1(ps, con);
		}
		return x;
	}

	@Override
	public int updateCustomer(CustomerTO cto) {
		int x = 0;
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = JDBC_UTIL.getMySQLConnection();

			String sql = "update jdbcCustomers set cname=?,email=?,phone=?,city=?,balance=?,status=? where cid=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, cto.getCid());
			ps.setString(2, cto.getCname());
			ps.setString(3, cto.getEmail());
			ps.setString(4, cto.getPhone());
			ps.setString(5, cto.getCity());
			ps.setDouble(6, cto.getBal());
			ps.setString(7, cto.getStatus());
			x = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBC_UTIL.mycleanup1(ps, con);
		}
		return x;
	}

	@Override
	public int deleteCustomer(int cid) {
		int x = 0;
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = JDBC_UTIL.getMySQLConnection();

			String sql = "delete from jdbcCustomers where cid=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, cid);
			x = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			JDBC_UTIL.mycleanup1(ps, con);
		}
		return x;

	}

	@Override
	public CustomerTO getCustomerByCid(int cid) {
		CustomerTO cto=null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs=null;
		try {
			con = JDBC_UTIL.getMySQLConnection();

		String sql = "select * from jdbcCustomers where cid=?";
		ps = con.prepareStatement(sql);
		ps.setInt(1,cid);
		rs=ps.executeQuery();
		if(rs.next()){
			cto=new CustomerTO();
			cto.setCid(rs.getInt(1));
			cto.setCname(rs.getString(2));
			cto.setEmail(rs.getString(3));
			cto.setPhone(rs.getString(4));
			cto.setCity(rs.getString(5));
			cto.setBal(rs.getDouble(6));
			cto.setStatus(rs.getString(7));
			
		}
		}catch(Exception e){
			e.printStackTrace();
		}
		finally {
			JDBC_UTIL.mycleanup2(rs, ps, con);
		}
		return cto;

																						
	}

	@Override
	public CustomerTO getCustomerByEmail(String email) {
		CustomerTO cto=null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs=null;
		try {
			con = JDBC_UTIL.getMySQLConnection();

		String sql = "select * from jdbcCustomers where email=?";
		ps = con.prepareStatement(sql);
		ps.setString(1,email);
		rs=ps.executeQuery();
		if(rs.next()){
			cto=new CustomerTO();
			cto.setCid(rs.getInt(1));
			cto.setCname(rs.getString(2));
			cto.setEmail(rs.getString(3));
			cto.setPhone(rs.getString(4));
			cto.setCity(rs.getString(5));
			cto.setBal(rs.getDouble(6));
			cto.setStatus(rs.getString(7));
			
		}
		}catch(Exception e){
			e.printStackTrace();
		}
		finally {
			JDBC_UTIL.mycleanup2(rs, ps, con);
		}
		return cto;

}

	@Override
	public List<CustomerTO> getAllCustomers() {
		List<CustomerTO> list=new ArrayList<CustomerTO>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs=null;
		try {
			con = JDBC_UTIL.getMySQLConnection();

		String sql = "select * from jdbcCustomers";
		ps = con.prepareStatement(sql);
		rs=ps.executeQuery();
		while(rs.next()){
			CustomerTO cto=new CustomerTO();
			cto.setCid(rs.getInt(1));
			cto.setCname(rs.getString(2));
			cto.setEmail(rs.getString(3));
			cto.setPhone(rs.getString(4));
			cto.setCity(rs.getString(5));
			cto.setBal(rs.getDouble(6));
			cto.setStatus(rs.getString(7));
			list.add(cto);
		}
		}catch(Exception e){
			e.printStackTrace();
		}
		finally {
			JDBC_UTIL.mycleanup2(rs, ps, con);
		}
		return list;

	}

	@Override
	public List<CustomerTO> getAllCustomersByCity(String city) {
		List<CustomerTO> list=new ArrayList<CustomerTO>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs=null;
		try {
			con = JDBC_UTIL.getMySQLConnection();

		String sql = "select * from jdbcCustomers where city=?";
		ps = con.prepareStatement(sql);
		ps.setString(1,city);
		rs=ps.executeQuery();
		while(rs.next()){
			CustomerTO cto=new CustomerTO();
			cto.setCid(rs.getInt(1));
			cto.setCname(rs.getString(2));
			cto.setEmail(rs.getString(3));
			cto.setPhone(rs.getString(4));
			cto.setCity(rs.getString(5));
			cto.setBal(rs.getDouble(6));
			cto.setStatus(rs.getString(7));
			list.add(cto);
		}
		}catch(Exception e){
			e.printStackTrace();
		}
		finally {
			JDBC_UTIL.mycleanup2(rs, ps, con);
		}
		return list;

	}

	@Override
	public List<CustomerTO> getAllCustomersByStatus(String status) {
		List<CustomerTO> list=new ArrayList<CustomerTO>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs=null;
		try {
			con = JDBC_UTIL.getMySQLConnection();

		String sql = "select * from jdbcCustomers where status=?";
		ps = con.prepareStatement(sql);
		ps.setString(1,status);
		rs=ps.executeQuery();
		while(rs.next()){
			CustomerTO cto=new CustomerTO();
			cto.setCid(rs.getInt(1));
			cto.setCname(rs.getString(2));
			cto.setEmail(rs.getString(3));
			cto.setPhone(rs.getString(4));
			cto.setCity(rs.getString(5));
			cto.setBal(rs.getDouble(6));
			cto.setStatus(rs.getString(7));
			list.add(cto);
		}
		}catch(Exception e){
			e.printStackTrace();
		}
		finally {
			JDBC_UTIL.mycleanup2(rs, ps, con);
		}
		return list;

	}

	@Override
	public List<CustomerTO> getAllCustomersByBal(double bal) {
		List<CustomerTO> list=new ArrayList<CustomerTO>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs=null;
		try {
			con = JDBC_UTIL.getMySQLConnection();

		String sql = "select * from jdbcCustomers where balance<=?";
		ps = con.prepareStatement(sql);
		ps.setDouble(1,bal);
		rs=ps.executeQuery();
		while(rs.next()){
			CustomerTO cto=new CustomerTO();
			cto.setCid(rs.getInt(1));
			cto.setCname(rs.getString(2));
			cto.setEmail(rs.getString(3));
			cto.setPhone(rs.getString(4));
			cto.setCity(rs.getString(5));
			cto.setBal(rs.getDouble(6));
			cto.setStatus(rs.getString(7));
			list.add(cto);
		}
		}catch(Exception e){
			e.printStackTrace();
		}
		finally {
			JDBC_UTIL.mycleanup2(rs, ps, con);
		}
		return list;


	}

}

/*
 * Here Without JdbcTemplete Code Duplicacy occur in JdbcCustomerDAO
 * create table jdbcCustomers(cid int primary key,cname char(30),email
 * char(30),phone char(10),city char(15),balance double,status char(10));
 */
