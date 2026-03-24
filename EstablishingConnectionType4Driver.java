package com.arunit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class EstablishingConnectionType4Driver {
	public static void main(String[] args) {
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection(null, null, null);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
