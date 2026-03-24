Driver:
-------------------
-A driver is a software and it is used to connect application and database.driver softwares are developed by first party vendors ,2nd party vendors and 3rd party vendors.


Java app-------------------->by Sun microsystems
Oracle database------------->by Oracle corporation
Driver---------------------->by others


-In the above example sun micro systems is a first party vendor and oracle corp is 2nd party vendor and other than these two are 3rd party vendors.

-There are 2 categories of drivers :
   1)ODBC  (Open db connectivity) Drivers
   2)JDBC  (Java db connectivity) Drivers
   
   
   
-All ODBC drivers are part of ODBC tool

-Non java applications uses ODBC drivers to connect databases.


-When ever java came and exist then they connected  java app and database  by using odbc drivers but connection failed because there was no compatibility between java and and odbc

-To solve the above problem JDBC drivers were introduced.
-There are 4 types of drivers 
 1)Type 1 driver (JDBC ODBC bridge driver)
 2)Type 2 driver (JDBC Native API driver)
 3)Type 3 driver (JDBC Network protocol driver)
 4)Type 4 driver (JDBC Native protocol driver).
 
-There are 2 ways to connect Java application and database.
   1)By using JDBC & ODBC drivers
   2)By using JDBC drivers only
   
   
   
   
 Java app <------> JDBC driver<---->ODBC driver <---->Database
  |                                                      |
  |                                                      |
  |                                                      |
  |-----------------------JDBC driver--------------------|
                             |
                             |
                    Type 2 or type 4 driver     
 
 
 Specification:
 ----------------
-A specification is a set of rules and guidelines that are used to develop applications and environments.

-JDBC specification used by vendors to develop jdbc drivers and jdbc specification used by java programmers to develop database apps.
 
 
 
 
 