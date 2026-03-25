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


/*
 After establishing connection
 
 
 below methods are from Connection interface if we want to access these methods we need to import java.sql.Connection
 
 methods:
 1)public abstract Statement createStatemet() throws SQLEXception
 2)public abstract PreparedStatement prepareStatement() throws SQLEXception
 3)public abstract CallableStatement prepareCall() throws SQLEXception

 
 NOTE:
 --------
 -all JDBC interfaces are implemented by JDBC driver vendors in JDBC driver software
 
 
 
 Statement interface:
 ---------------
 -used to execute static SQL queries.
 
 Examles:
 ---------
 1)insert into student values(1,"aaa",83)
 2)select * from student  where rollno=1;
 
 
 
 
 -------------------------------------------------------------
 
 peparedStatement interface
 -------------------------
 -it is used to execute dynamic SQL queries
 
 examples:
 ------------
 1)insert into student values(?,?,?)
 2)select * from student where rollno=?
 
 -------------------------------------------------------------
 
 CallableStatemnt interface:
 -----------------------------
 -used to execute PL/SQL programs
 
 examples:
 ---------
 1)Procedures
 2)Functions
 --------------------------------------------------------------
 
 Methods:
 ----------
 1)public abstract boolean execute(String) throws SQLException
 -the above ethod is used to exeute non select sql queries
 -it is suitable to execute DDL queries
 -DDL stands for data definition language
 
 2)public abstract int executeUpdate(String) throws SQLException
 -the above method used to execute non select sql queries
 -it is suitable to execute DML queries
 -DML stands for data manipulation language
 
 3)public abstract ResultSet executeQuery(String) throws SQLException
-it is used to execute select queries
-suitable to execute DQL queries 
-DQL stands for data query language. 
 
 
 */
   














