# SQL Questions
1.  Explain what SQL is. What are some SQL RDBMS Vendors? *What is an RDBMS*?
    *  Structured Query Language - allows us to interact with and manipulate relational databases like Oracle, Postgres, MySQL
2.  Draw a simple ERD for modeling Students and Classes
    
3.  What are the 5 sublanguages of SQL? Which commands correspond to them?
    * DDL - data definition language - CREATE, ALTER, MODIFY, DROP, TRUNCATE
    * DML - data manipulation language - SELECT, INSERT, UPDATE, DELETE
    * DCL - data control language - GRANT, REVOKE
    * DQL - data query language - SELECT
    * TCL - transaction control language - SAVEPOINT, ROLLBACK, COMMIT

4.  What is the difference between DELETE, DROP, and TRUNCATE commands?

    * DROP removes a table entirely; DELETE will remove specific rows (unless no WHERE clause); TRUNCATE will empty a table of all data but leave the schema intact
    * DROP and DELETE can be rolled back; TRUNCATE cannot
    
5.  What are some SQL clauses you can use with SELECT statements?

    * WHERE, HAVING, AND, OR, GROUP BY, ORDER BY, LIMIT, LIKE
    
6.  What is the difference between WHERE and HAVING? 

    * WHERE operates on individual records; HAVING is used with GROUP BY and aggregate functions to operate on groups of records. Read more [here]( https://www.java67.com/2019/06/difference-between-where-and-having-in-sql.html#ixzz6kwoJQmXd)*.
    
7.  Explain what the ORDER BY and GROUP BY clauses do.

    * ORDER BY sorts the results set on a particular column (ascending or descending)
    * GROUP BY is used with an aggregate function to combine records together

  - Practice [here](https://www.w3schools.com/sql/sql_orderby.asp).
    
8.  Explain the concept of relational integrity.

    * Every foreign key in the database points to a valid, existing record
    * If this is broken, we have what is called an "orphan record"
    
9.  List the integrity constraints.

    * UNIQUE, NOT NULL, PRIMARY KEY, FOREIGN KEY, DEFAULT, CHECK
    
10.  Define the word “schema”.

    * Refers to the structure of the database - the columns of each table, their data types, and any constraints on them
    
11.  What is a candidate key? What about a surrogate key?

    * Candidate key is a set of one or more columns that can uniquely identify a record
    * Surrogate key is a column that can uniquely identify a record (can act as Primary Key)

12.  What conditions lead to orphan records? (*Think about what happens when we delete from a table that a child table is dependent on because it feautres its Primary keys as foreign keys within the table*)
    
13.  What are some SQL data types?

    * CHAR, VARCHAR, NUMERIC, INT
    
14.  What is normalization? What are the levels? (0 - 3NF)

    * The process of reducing redundancy in a database
    * 1NF: the key (PK must exist; columns must be atomic and granular)
    * 2NF: the whole key (1NF + every column relates to PK)
    * 3NF: nothing but the key (2NF + no transitive dependencies)

15.  What are the properties a transaction must follow? (*A.C.I.D*)

    * Atomicity - all or nothing (transaction must fully complete or rollback)
    * Consistency - data remains in a consistent state after the transaction
    * Isolation - transactions do not interfere with one another when running
     * Durability - data will persist even in case of catastrophic failure

    
16.  Explain the different isolation levels. What read phenomena do each prevent?

    * READ UNCOMMITTED - fastest, allows dirty reads
    * READ COMMITTED - prevents dirty reads, allows non-repeatable reads
    * REPEATABLE READ - prevents non-repeatable reads, allows phantom reads
    * SERIALIZABLE - slowest, prevents phantom reads
  
17.  What is the difference between joins and set operators?

    * Joins combine tables horizontally
    * Set operators combine results sets vertically

18.  What are the types of joins? Explain the differences.

    * INNER JOIN - only joins records that match based on join predicate
    * OUTER JOIN - joins all records in both tables, will have `null` as value if doesn't exist
    * LEFT JOIN - joins all records in left table, plus any records that match join predicate on right
    * RIGHT JOIN - joins all records in right table, plus any records that match join predicate on left
    * NATURAL JOIN - joins tables based on columns that have the same name in both tables
    * CROSS JOIN - cartesian product of records in both tables, i.e. each record in one table paired with each in another (results in M x N records)
    * SELF JOIN - joins a table with itself, FK points to PK of same table - e.g. employees table has reportsTo column for referencing manager in same table
    
19.  What is a cascade delete?

    * Setting that allows referenced records to be deleted as well, if record being deleted has a foreign key
    * Ensures referential integrity, prevents orphaned records
    
21.  What is the difference between scalar and aggregate functions? Give examples of each
    * Scalar - operates on a single value, e.g. UPPER, LOWER, TRIM, CONCAT, DATE
    * Aggregate - operates on multiple values, e.g. MIN, MAX, AVG, SUM
<br>
  
## JDBC Questions
1. What is JDBC?

    * A Java API used to execute queries on various databases. Uses JDBC drivers to connect with the database

2. What are the core interfaces / classes in JDBC?

    * `DriverManager`, `Connection`, `Statement`, `PreparedStatement`, `CallableStatement`, `ResultsSet`

3. What is a stored procedure and how would you call it in Java?
    -  [Stored Procedures](https://stackoverflow.com/questions/459457/what-is-a-stored-procedure)
    -  To call it, use the JDBC API’s `CallableStatement` interface, resource [here](https://www.geeksforgeeks.org/how-to-use-callable-statement-in-java-to-call-stored-procedure/)

4. What is the difference between Statement and PreparedStatement?

    * PreparedStatements are pre-compiled by the JVM. The database doesn't have to compile the SQL each and every time it is executed. PreparedStatement can be parameterized, which can make the SQL more readable. Furthermore, PreparedStatement will properly escape reserved characters to prevent SQL injection attacks.

5. Steps to executing an SQL query using JDBC?

    1. Register the driver using `.forName()` (or let `DriverManager` detect and load automatically from classpath)
    2. Create the connection (`DriverManager.getConnection(url,username,password)`)
    3. Create a statement for executing the SQL query (`Statement st = conn.createStatement()`);
    4. Execute the SQL query (`ResultSet rs = st.executeQuery(String sql)`)
    5. Use `ResultSet` to get values returned (`rs.getInt(1)`, etc)
    6. Close the connection (`conn.close()`) 

6. How to execute stored procedures using JDBC?

    * Use the `Callable` statement interface

7. Which interface is responsible for transaction management? 
    > `Connection` Interface.  See this resource here about [JDBC and Transaction management](https://www.javatpoint.com/transaction-management-in-jdbc#:~:text=In%20JDBC%2C%20Connection%20interface%20provides%20methods%20to%20manage%20transaction)

<br>
