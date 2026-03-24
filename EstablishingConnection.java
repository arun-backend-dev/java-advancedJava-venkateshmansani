package com.arunit.jdbc;
import java.sql.*;

public class EstablishingConnection {
public static void main(String[] args) {
	try {
		Class c=Class.forName("oracle.jdbc.driver.OracleDriver");
//		Connection con=DriverManager.getConnection();
	}catch(ClassNotFoundException ce) {
		ce.printStackTrace();
	}
}
}
