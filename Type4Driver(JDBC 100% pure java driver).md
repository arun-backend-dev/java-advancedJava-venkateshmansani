Type 4 driver:
------------------
-it is also called as JDBC native protocol driver or Thin driver


/*
 *  ┌────────────────┐          (Type 4 Driver)            ┌──────────────────┐
 *  │                │                ↗                    │                  │
 *  │                │──────>┌────────────────┐<──────────>│ Oracle Database  │
 *  │                │<──────│ JDBC Driver    │            │                  │
 *  │                │       │ for Oracle     │            └──────────────────┘
 *  │                │       └────────────────┘
 *  │                │
 *  │    Java        │          (Type 4 Driver)            ┌──────────────────┐
 *  │    Application │                ↗                    │                  │
 *  │                │──────>┌────────────────┐<──────────>│ MySQL Database   │
 *  │                │<──────│ JDBC Driver    │            │                  │
 *  │                │       │ for MySQL      │            └──────────────────┘
 *  │                │       └────────────────┘
 *  │                │
 *  │                │          (Type 4 Driver)            ┌──────────────────┐
 *  │                │                ↗                    │                  │
 *  │                │──────>┌────────────────┐<──────────>│ ------- Database │
 *  │                │<──────│ JDBC Driver    │            │                  │
 *  └────────────────┘       │ for -------    │            └──────────────────┘
 *                           └────────────────┘
 */
 
 
 -type 4 drivers developed in java language only
 
 
 Type 4 driver class name for oracle db:
 --------------------------------------
 oracle.jdbc.driver.OracleDriver
 
 
 URL to access driver:
 ---------------------
 jdbc:oracle:thin:@domain-name:port-number:service-id.
 
 
 
 -if the db software installed on same computer use localhost as a domain name other wise use computer name as a domain name
 
 
 oracle db port number: 1521
 
 
 
 
 
 
 
 