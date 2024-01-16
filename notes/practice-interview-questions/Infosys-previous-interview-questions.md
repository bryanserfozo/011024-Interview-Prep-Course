# Java

## Core Java
- What is Java?
    - Multi-paradigmed, high-level programming language
    - Platform-Independent (Write Once, Run Anywhere)
    - OOP - Object Oriented Programming Language (Deals with classes and objects)
    - Statically-typed (We need to declare types and they can't change (except when they can))
    - Garbage Collection, Automatic Memory Management
        - Objects' memory is handled automatically aka we don't need to manually delete objects once we're down with them
- JDK JRE JVM 
    - JDK (Java Development Kit) -> Tools we need to develop Java apps, contains JRE
    - JRE (Java Runtime Environment) -> Runtime environment for Java, contains the necessary libraries needed to execute a Java program, contains the JVM
    - JVM (Java Virtual Machine) -> In charge of actually executing the code, converts ByteCode (The compiled java files) into MachineCode which can then be executed directly by the computer
- What are Constructors?
    - Constructors are used to instantiate or create an object from a class 
        - Arguments are used to initialize values into an object's field
            - no-args takes in no arguments
            - partial which takes in some but not all arguments
            - all-args which takes in a value for every field that needs to be set
        - Default Constructor
            - In the case a class does not a constructor explicitly defined, Java will provide a default no-args constructor so we can still instantiate the object
            - Would appear in a class like so
            ```Java
            public class ExampleClass{
                // Java will provide a default constructor in this class till I explicitly provide one myself
            }
            ```

- What are the parts of Java Memory?
    - Stack
        - In charge of method calls (think of a stack overflow error)
        - In charge of local variable
    - Heap
        - In charge of objects (including the String pool)
- What are static and final? What are the differences?
    - Static makes a variable/method belong to the class (exists outside instantiation)
    - Final makes a variable immutable. Applying final to an object makes it so the referenced object cannot be changed, but fields within that object can still be updated via mutators
    - Final can be applied to a method or a class
        - Applying final to a method means it cannot be overridden
        - Applying final to a class means it cannot be extended


- What are strings?
    - String is an array of chars
    - Immutable (Cannot be modified without the creation of a new string)

- Final vs finally
    - Final
        - Non-Access Modifier
        - Final classes can no longer be extended
        - Final methods cannot be overridden
        - Final variable cannot be changed (read only)
    - Finally
        - Used in a try-catch-finally block
        - Executed after try or catch blocks

- String vs StringBuffer vs StringBuilder
    - StringBuilder and StringBuffer are the mutable versions of String
        - StringBuffer is threadsafe whereas StringBuilder is not

- What Java JIT compiler is?
    - Just-In-Time compiler. Essentially, when we compile our code it converts it to bytecode, the JIT compiler converts it dynamically to machine exectuable code whenever needed.
    - Optimizes the runtime operations of Java



## OOP
- What is Polymorphism?
    - One of the pillars of OOP
    - Means many forms
    - Achieved through the use of method overriding and overloading

- Method Override vs Overload
    - Different pieces of Polymorphism
    - Overloading
        - Method with the same name in the class but with different parameters
        - Constructors are the most common use of overloading
    - Overriding
        - Child class provides a different implementation of a parent-class method

- What is abstraction? 
    - One of the pillars of OOP
    - Means hiding implementation details
    - Like using a remote control, we receive a simplified interface but we don't know the details behind the scene
    - Can be acheived using abstract classes and interface

- Abstract class vs interface 
    - Abstract Class
        - Blueprint for an object (Class) but it differs from a regular class in the sense that it have both concrete (regular) and abstract methods
            - Abstract method is a method without implementation (method body)
        - Abstract classes cannot be instantiated 
        - Must be EXTENDED by an implementing class that provides functionality (method body) to the abstract methods declared
    - Interface
        - A declaration of methods. Basically a contract that stipulates what methods a class will have
        - Contains methods that are abstract and must be implemented by the implementing class
        - Mainly exists to solve the problem of multiple inheritance (diamond problem)
        - May include default or static methods (Java 8 and beyond)
        - Must be IMPLEMENTED by a class

- Can you override a private or static method in Java? 
    - Static
        - Can't override but can shadow the method so it looks like overriding but it's actually a new method entirely
            - Static method belongs to the class
    - Private
        - Methods cannot be overridden since it does not get inherited (belongs to the class in which it was defined)



## Exceptions
- What are java exceptions? 
    - Thrown when a problem occurs
    - Include details as to what the problem was
    - Runtime Exceptions
        - Unchecked Exceptions
        - Caught during exception
        - ArrayIndexOutOfBounds
    - Compile Time Exception
        - Checked exception
        - Caught upon compilation
        - IOException 
    - Different from Errors
        - Exceptions are mistakes that can be recovered from (usually non-fatal to the program)
        - Errors are usually something fundamentally wrong with the code (StackOverflowError, OutOfMemoryError)

- Exceptions parent class 
    - Throwable is the parent class of all Exceptions (think about the fact that exceptions are "thrown" )
    - If we want to create a custom exception we'd do the following
        - Extend Exception for a Checked Exception or extend RuntimeException for an unchecked exception
        - Override the constructor so we can provide a message relating to the exception thrown
- Handling exceptions 
    - Try-catch block
        - Try some code, if it encounters and exception we "catch" the exception in the catch block and run some alternate code that prevents the program from halting
    - Ducking the exception
        - Adding the `throws` keyword to the method signature allowing to say that this method throws some exception which will be handled whenever this method is called


## Collections
- Arraylist vs Linkedlist 
    - ArrayList
        - Implements List Interface
        - Store information in an array under the hood
        - Best for retrieval but slower for insertion/deletion
    - LinkedList
        - Implements Queue interface and List Interface
        - Stores information in nodes with pointers
        - Node.next() to access next node
        - Best for insertion/deletion but slower for retrieval

- Generics
    - Enforces compile-time type safety
    - denoted with <>
    - Can be used with wildcards to essentially have a blanket statement for all types that fit some criteria
        - `<? extends Number>` would refer to any class that extends number, so it would be valid for Integer, Double, Float, Long, Short, and Byte

- What is the collection API?
    - A Java Framework used to outline more complex data structures than just arrays
        - List
            - Similar to an array in Java
            - Ordered/Indexed, Allows Duplicates, Dynamic in Size (Arrays in java are dynamically sized)
        - Set
            - Unordered, do not allow duplicates, dynamic in size
        - Queue
            - Representations of lines (think of an amusement park ride)
            - FIFO
        - Map (kinda)
            - Does not implement iterable
            - Key, value pairs (think a real-life dictionary)



## Adv Java (Just be honest with questions like these)
- What was introduced during Java 8
- Threads 
- ConcurrentHashMap 
- What is a logger? 
- Do you understand Java Threads?
- What Java version are you using? 
- What is the difference between versions 8 and  11? 
- Difference between collections & streams 




# SQL

## Basic SQL
- What is SQL 
    - Structured Query Language
    - Used to manipulate data in relational databases via queries
    - CRUD Operations
        - Create (`INSERT`)
        - Read (`SELECT`)
        - Update (`UPDATE`)
        - Delete (`DELETE`)
    - Sublanguages for specific types of queries

- Delete/Drop/Truncate 
    - Delete
        - Removes specific rows from table based off criteria, leaves structure intact
        - `DELETE FROM TABLE WHERE name = 'Bryan`
    - Drop
        - Removes all data and the table itself from memory
        - `DROP TABLE TABLENAME`
    - Truncate
        - Removes all data from the table but not the table itself
        - `TRUNCATE TABLENAME`

- Normalization 
    - Normalization is an attempt to remove redudant information from our table
    - 0NF
        - No attempt to remove redudant table
    - 1NF
        - Break data into atomic values (smallest logical values to store)
        - Requires Primary Key 
    - 2NF
        - Removes partial dependencies (dependent on only one part of the key)
    - 3NF 
        - Removes transitive dependencies
 
- Retrieving a substring from a table 
    - This is simple enough we'll use like command
    - `SELECT FROM TABLENAME WHERE NAME LIKE '%i_ '`
        - Results that will come back from this inclue names like "Abigail, Travis, Bobbie" since they have any number of characters before the i and exactly 1 character after the i
            - % denotes any number of characters
            - _ denotes one character exactly
- What is a Join?
    - A Join is a way for us to combine tables based off their relationships. Tables are normally joined on a common column between the two tables (represented with a primary key/ foreign key relationship)
        - Inner Join (JOIN)
        - Outer Join (Full Join)
        - Left Join
        - Right Join
        - Other less useful joins:
            - Cross Join
            - Self Join

- What is SQL Transaction? 
    - Simple put, a block of DML operations (CRUD operations) that either all get executed at once or not executed if any of them fail (ACID properties)

- What are the SQL relations? 
    - Sometimes referred to as multiplicity 
    - Describes the different ways table can be related to each other
    - 1:1 (One to One, person to social security)
    - 1:M (One to many, Books at a library, one person can check out multiple books but a single book can only be held by one person at a time)
    - M:1 (Flip side to 1:M)
    - M:M (Many to Many which is a combo of a 1:M relationship and a M:1 relationship, think school classes. One studen can sign up for many classes (1:M) and Many students can sign up for one class (M:1))

- What is a Primary key? 
    - Unique identifier for a table in a relational database
    - Unique and it is not null (meaning every record has a key and that key is different from all the other keys)

- What SQL Databases have you used? 
    - Circumstantial question
    - Multiple SQL vendors that exist
        - PostgreSQL
        - MySQL
        - Aurora
        - Similar, almost like different flavors of ice cream
            - They're all types of sql but have slightly differing syntax



## ORM
- Hibernate
- Criteria API 
- HQL
- Describe hibernate ORM
- What are some annotations you used in Hibernate? 


# Spring / MSA

## Spring Core
- What is Spring? Benefits of using it?
    - Spring is a family of frameworks for Java that are used to help us develop enterprise level applications quickly and easily. 
    - Has multiple projects associated with specific tasks (Web MVC, Data JPA, Boot, Security) that are designed to be plug and play for your application based off your needs
    - Annotation-Based Configuration is supported, as well as programatic configruation and xml configuration
        - Configuring the dependencies and how they're wired together (dependency injection and IOC)
    
- What is dependency injection? 
    - Dependency Injection is a design pattern where we attempt to remove dependencies of a program to some external location
    - Dependency Injection is used to seperate the responsibility of components
    - By Injecting an object as a depenedency it allows for loose coupling
    - Additional Benefits is that it makes things significantly easier to test (through the use of mocked classes and such)

- What IoC (inversion of control) is? 
    - Passing off the responsibilty of a task to something else
    - In our case, we're passing off the responsibility of creation, configuration and management of our beans to Spring so we have more time to focus on developing functionality.

- What Spring Core Annotations do you know? 
    - @ComponentScan (Scans for stereotype annotations)
    - @Component
    - @Repository
    - @Service
    - @Controller
    - @Autowired
    - @Configuration

- What is a Controller?
    - A controller is a class that regulates web traffic
    - First thing that accepts web request and directs it to the appropriate place
    - Spring has a front-controller design pattern (i.e. one controller that takes in EVERY request and sends each one to the appropriate handler)

## Spring Data JPA
- How did you connect Spring JPA?
    - Need to have the Spring Data JPA project dependency (spring-boot-starter works for this)
    - Provide database credentials in the application.properties (username, password and database jdbc url)
- What Spring Data JPA annotations do you know?
    - @Entity
    - @Table
    - @Column
    - @Id
    - @GeneratedValue
    - @Query (Used to define custom queries in our DAO interfaces)

## Spring Web MVC
- What is Spring MVC?
    - Spring MVC is a module in the spring framework (model, view, controller design pattern). Model describes data and business rules of the app, view controls UI and display details, and controller handles all the web requests and controlling the flow between the other two. Used to handle to our web traffic.

- What is @RestController
    - Annotation used for building RESTful web apps. Combines the annotations @Controller and @ResponseBody so it becomes more conveinent to handle HTTP requests in a RESTful way (Returning into JSON)

- Changing port in spring
    - We can change this for development purposes 
    - server.port=9090 in application.properties file
- What Spring Web MVC annotations do you know?
    - @RestController
    - @RequestBody
    - @ResponseBody
    - @GetMapping, PostMapping, PutMapping, DeleteMapping
    - @RequestMapping
    - @PathVariable
    - @RequestParam

## Spring Boot
- What is Spring Boot? Benefits?
    - Spring boot was a particularly impactful Spring project designed to "boot" up our application as quickly as possble
        - Opionated framework meaning it has preset configuration details based off common use cases
        - Helpful tools like an embedded tomcat server for web development
        - Starter code is easy to generate with start.spring.io 

- What are some spring boot annotations?
    - @SpringBootApplication
    - @SpringBootConfiguration

- Type of dependency injection in Spring boot. What is the difference between them?
    - Constructor Injection
        - Preferred method
        - More secure since it guarantees the dependencies will be filled
    - Setter Injection
        - Used for partial dependencies
        - Also helpful for solving circular dependencies

- Profiles 
    - You can different "profiles" in Spring boot depending on the use case you're trying develop. You may have a production and dev profile which will allow you to use specific beans and enviroment details when utilizing each profile. Specify the profile in the application.properties file

## Microservices
- What are micro-services? 
    - Breaking our application in smaller mini-applications that interact with each other through some sort of messaging. Advantages of this is more flexible projects with individual pieces that can scale as the need arises.
    - Each microservice acts as its own application with its own db. 



# Angular / Frontend

## Angular
- directives 
- components 
- databinding 
- how to call two way databinding 
- how to create a component 
- Components of Angular 
- Which Angular version I have used. 
- When we use angular services. 
- What Angular AOT compiler is? 
- What is jasmine and how did you use it? 
- can you display only one HTML page or many?
- list of Angular lifecycle hooks

## Basic Frontend 
- forms
- var, let, const 
- Difference between HTML and XHTML 
- typeOf in Javascript 
- example of errors in JavaScript 
 


# Soft Skills
- How did you get here? 
- How did you deal with someone not pulling their weight?
    - Situtional Explantion
    - STAR method
        - Situation (X person was not pulling their weight)
        - Task  (We were completing a user story)
        - Action (What action you took)
        - Result (Result of that action)
- First Question was just to tell them a little about myself
- Asked about the roles & responsibilities of current project being worked on
- Asked to describe my P2 to them, like describe the overall application and whats function is
- What technologies have you utilized? 
- How were the technologies utilized in your project? 
- Tel me about yourself
- Tell me about your job experience? 
- Describe the projects you worked on at your previous job? 
- Describe how you will troubleshoot an API error that is in production.
- Tell me about yourself?
- Describe a problem that you had and how did you fix it?



