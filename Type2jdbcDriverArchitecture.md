Type2 JDBC Driver Architecture :
------------------------------------

                Type 2 JDBC Driver Architecture
                --------------------------------


        +--------------------------------------+
        |           Java Application           |
        |                                      |
        |   +------------------------------+   |
        |   |      Application Code        |   |
        |   +--------------+---------------+   |
        |                  ^                   |
        |                  |                   |
        |   +--------------+---------------+   |
        |   |   Type 2 JDBC Driver         |   |
        |   | (JDBC Native API Driver)     |   |
        |   +------------------------------+   |
        +------------------+-------------------+
                           |
                           |  <---------->
                           v
                   +------------------+
                   |  Native Library  |
                   +--------+---------+
                            |
                            |  <---------->
                            v
                     (    Database    )


Explanation:
- Application Code uses Type 2 JDBC Driver
- Driver communicates with Native Library
- Native Library interacts with Database


NOTE:
------
-type 1 drivr converts java calls into odbc class where as type 2 driver converts java calls into native calls.

Advantages of Type2 Driver:
-----------------------------
-it is little fast as compared to type1 driver

DisAdvantages of Type2 Driver:
-----------------------------
-seperate driver required for every database
-all databases are not having type2 drivers
-it is platform dependent
-database software needs to be installed on same computer.








