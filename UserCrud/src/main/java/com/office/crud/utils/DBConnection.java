package com.office.crud.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	public static Connection getDBConnection() {
		Connection connection=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_handler", "root", "ChangeMe@123");
			return connection;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return connection;
	}
}
