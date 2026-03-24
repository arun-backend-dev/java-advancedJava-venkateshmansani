Type 1 Driver(JDBC ODBC Bridge Driver):
--------------------------------------------

Java Application
        |
        v
   JDBC Driver (Type 1)
        |
        v
     ODBC Tool
        |
  -------------------------
  |           |           |
  v           v           v
ODBC       ODBC        ODBC
Driver     Driver      Driver
(Oracle)   (MySQL)     (Other)
  |           |           |
  v           v           v
Oracle DB   MySQL DB   Other DB


-All JDBC drivers are classes in java.

Type 1 JDBC Driver class name:
-----------------------------------
sun.jdbc.odbc.JdbcOdbcDriver

package - sun
sub packages- jdbc.odbc
classname-JdbcOdbcDriver

This driver part of java software(Java Development kit).

NOTE:Type 1 JDBC driver removed from JDK 1.8 onwards

Type 1 JDBC Driver architecture:
-------------------------------------

+--------------------------------------+
|          Java Application            |
|                                      |
|   +-----------------------------+    |
|   |      Application Code       |    |
|   +-------------^---------------+    |
|                 |                    |
|   +-------------v---------------+    |
|   |  Type 1 JDBC Driver         |    |
|   |  (JDBC-ODBC Bridge Driver)  |    |
|   +-----------------------------+    |
+--------------------|-----------------+
                     |
                     v
                +----------+
                | ODBC Tool|
                +----|-----+
                     |
                     v
                +-----------+
                | ODBC Driver|
                +----|------+
                     |
                     v
                +------------+
                |  Database  |
                +------------+


Advantages of type 1 JDBC driver:
-----------------------------------
-Only one driver that supports all ODBC enabeled database

Disadvantages of type 1 JDBC driver:
--------------------------------------
-Performance overhead since java calls should go through via jdbc driver and driver
-It is a platform dependant.
-Database client softwate(ODBC software) needs to be installed on local syatem.



NOTE:
--------------------------------------
-Type 1 driver developed in  "C" language.











