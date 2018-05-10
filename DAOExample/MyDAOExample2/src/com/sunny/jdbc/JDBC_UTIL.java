package com.sunny.jdbc;

import java.sql.*;


public class JDBC_UTIL {

	static{		//to avoid multiple check of class loading we use this static block as static block will be loaded once
		try {
		
			Class.forName("com.mysql.jdbc.Driver");

			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
		public static Connection myOracleConnection() throws SQLException{
			String url1="jdbc:oracle:thin:@localhost:1521:XE";
			Connection con=DriverManager.getConnection(url1,"system","system");
			return con;
		}
		public static Connection getMySQLConnection() throws SQLException{
			String url2="jdbc:mysql://localhost:3306/sunny";
			Connection con=DriverManager.getConnection(url2,"root","root");
			return con;
		}
		
		public static void mycleanup1(Statement st,Connection con){
			try {
				if(st!=null)
					st.close();
				if(con !=null)
					con.close();
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
	
		}
			public static void mycleanup2(ResultSet rs,Statement st,Connection con){
				try {
					if(st!=null)
						st.close();
					if(con !=null)
						con.close();
					if(rs!=null)
						rs.close();
					
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				
				
		
		}
		
		
	}
	
	
//here function name cleanup is same but Parameter counts are differENT
