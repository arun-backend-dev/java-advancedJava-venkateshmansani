Type 2 JDBC Driver(JDBC Native API driver):
------------------------------------------------
-It is also called as partly java-partly native driver or partial java driver
-type2 jdbc drivers were developed in java language & native languages(c & c++).

/*
 *  ┌─────────────────┐     ┌──────────────────────┐     ┌─────────────────┐
 *  │                 │────>│  JDBC Driver          │<───>│  Oracle         │
 *  │                 │<────│  for Oracle           │     │  Database       │
 *  │                 │     └──────────────────────┘     └─────────────────┘
 *  │                 │
 *  │  Java           │     ┌──────────────────────┐     ┌─────────────────┐
 *  │  Application    │────>│  JDBC Driver          │<───>│  MySQL          │
 *  │                 │<────│  for MySQL            │     │  Database       │
 *  │                 │     └──────────────────────┘     └─────────────────┘
 *  │                 │
 *  │                 │     ┌──────────────────────┐     ┌─────────────────┐
 *  │                 │────>│  JDBC Driver          │<───>│  --------       │
 *  │                 │<────│  for --------         │     │  Database       │
 *  └─────────────────┘     └──────────────────────┘     └─────────────────┘
 */
 
 type 2 jdbc driver class name for oracle database :
 -----------------------------------------------------------
 oracle.jdbc.driver.OracleDriver

oracle----->package
jdbc,driver-------->sub packages
OracleDriver------>class name


Driver location:
-----------------
 ojdbc6_g.jar in Oracle 11G Express Edition.
 
JAR(Java Archive) file location:
--------------------------------

URL to access JDBC driver:
------------------------------
jdbc:oracle:oci8:@service_id

jdbc--------->protocol
oracle-------->sub protocol
oci8----------->logical name

OCI stands for Oracle call interface

To get service-id use the following SQL query:
-----------------------------------------------
SQL>select*from global_name;


Steps to develop database application by using JDBC driver:
----------------------------------------------------------
1)Loading a specific JDBC diver.
2)Establishing a connection between application and database
3)Performing the task
4)Closing a connection
 

javap:
--- ----
-it is a JDK tool is used to get the profile of a class or interface.
-profile contains list of variables,methods & constructors.
-all JDK tools are part of bin folder in JDK
-JDK stands for java development kit & it is called as java software.


Example:
-----------
C:\>javap java.lang.String
it will display all variables,methods,construcyors of java.lang.String

-description of variables,methods & constructors available in java API documentation


java.lang.Class
------------------
public static Class forName(String) throws ClassNotFounfException;
-the above method is used to load jdbc driver class





 