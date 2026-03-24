Type 3 JDBC Driver(JDBC network proocol Driver):
--------------------------------------------------
-it is also called as JDBC net pure java driver or middleware driver.

Architecture
------------
/*
 *  ┌─────────────────────────────┐     ┌─────────────────────────|
 *  │      Java Application       │     │    Middleware System    │
 *  │                             │     │                         │
 *  │  ┌───────────────────────┐  │     │  ┌──────────────────┐   │
 *  │  │    Application Code   │  │     │  │  Type 1 Driver   │   │──┐
 *  │  └──────────┬────────────┘  │     │  └──────────────────┘   │  │
 *  │             │  ^            │     │                         │  │
 *  │             v  │            │     │  ┌──────────────────┐   │  │    ┌──────────┐
 *  │  ┌───────────────────────┐  │     │  │  Type 2 Driver   │   │  │<──>│ Database │
 *  │  │  Type 3 JDBC Driver   │<─│─    │  │                  │   │  │    └──────────┘
 *  │  │  (JDBC Net Pure Java) │  │     │  └──────────────────┘   │  │
 *  │  └───────────────────────┘  │     │                         │  |
 *  │                             │     │  ┌──────────────────┐   │  │
 *  │                             │     │  │  Type 4 Driver   │──>│──┘
 *  │                             │     │  └──────────────────┘   │
 *  └─────────────────────────────┘     └─────────────────────────|
 *           Local System                      Middleware System
 */
 
 -it psses the java instructions to middleware systems
 
 
 advantages:
 ------------
 -java calls are database independent from local system to middleware system.
 -it is a platform independent 
 -db software not needed on local system
 
 
 
 disadvantages:
 ---------------
 -extra layer added to this architecture i.e. middle ware system.
 
 Note:
 -----
 -Type 3 drivers were developed in java language.
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 