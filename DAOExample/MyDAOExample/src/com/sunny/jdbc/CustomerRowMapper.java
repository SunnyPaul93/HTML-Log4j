package com.sunny.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerRowMapper implements RowMapper {

	@Override
	public Object mapRow(ResultSet rs) throws SQLException {
		CustomerTO cto=new CustomerTO();
		cto.setCid(rs.getInt(1));
		cto.setCname(rs.getString(2));
		cto.setEmail(rs.getString(3));
		cto.setPhone(rs.getString(4));
		cto.setCity(rs.getString(5));
		cto.setBal(rs.getDouble(6));
		cto.setStatus(rs.getString(7));
		return cto;
	}

}
