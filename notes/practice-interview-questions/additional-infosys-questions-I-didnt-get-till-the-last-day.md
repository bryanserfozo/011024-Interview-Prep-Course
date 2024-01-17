# Additional Infosys Prep Questions - 200 Total Questions Surveyed

- NOTE: I didn't receive this list of questions till the very last day of the interview prep course, given to me with the words "Requesting to use it as well for Java Prep Sessions."
Words cannot express how angry this makes me since they made it seem like these questions needed to be covered but gave me no time to do so. Do your best to study these questions, that's really all I can ask, appreciate you all stepping up and working hard during the sessions


# Java - 80 Questions

## Core Java - 13 questions (6.5% of Total Questions, 16.25% of Topic Questions)
- What is an object?
- What are constructors, what are they used for? - Asked 3 times
- What is the benefit of using protected and private
- What does the static keyword do? - Asked 2 times
- What are the two different types of memory available in Java - Asked 3 times
- what is the difference between JDK, JVM, & JRE? - Asked 2 times
- Explain Exception Handling
 

## OOP - 40 Questions (20% of Total Questions, 50% of Topic Questions)
- What is polymorphism? - Asked 9 times
- what is overloading? How do you accomplish overloading? - Asked 5 times
- How method overloading is different from method overriding?
- What's the difference between abstraction and encapsulation? - Asked 2 times
- What is abstraction? - Asked 3 times
- What is the difference between Java abstract class and interface? - Asked 6 times
- Can we implement multiple inheritances in Java?
- What is Encapsulation? - Asked 2 times
- What is inheritance? - Asked 3 times
- What is OOP? Benefits of OOP? - Asked 4 times
- Explain four major OOP concepts in Java. - Asked 2 times
- How have you used OOP concepts in your project? - Asked 2 times


## Collections - 6 Questions (3% of Total Questions, 7.5% of Topic Questions)
- What is a wrapper class? - Asked 2 times
- What is autoboxing?
- What is the difference between an Arraylist and a vector? 
- What is the difference between hashmap and hashtable?
- What is the difference between HashSet and HashMap?

## Anything Else Java Related - 21 Questions (10.5% of Total Questions, 26.25% of Topic Questions)
- What is Unit Testing and Why do we use it?
- Difference between final finally finalize. - Asked 3 times
- What version of Java have you used? 
- What are some features that Java 8 added? - Asked 5 times
- What is a lambda expression? How do you write a lambda function? - Asked 4 times
- What is Functional Interface?
- Have you ever run out of memory in Java?
- What are streams
- How to use streams
- What is Jpa
- Explain the Java MVC framework
- What is Transient in Java?

# SQL - 11 Questions (5.5% of Total Questions)
- What is the difference between char and varchar? - Asked 2 times
- what are the different sql joins? - Asked 2 times
- In SQL, what is a left join? Given two tables, what would the LEFT JOIN return?
- In SQL, what is a union? Given two tables, what would the UNION return?
- What are subqueries?
- What do you know about SQL querying?
- Can you write SQL Queries?
- Explain Hibernate.
- Did you use a database?

# Spring - 19 questions (9.5% of Total Questions)
- What is Spring?
- How is exception handling done in Spring Boot? - Asked 2 times
- What is dependency injection? Types - Asked 2 times
- What is Autowiring in Spring? - Asked 2 times
- What is Spring MVC? - Asked 2 times
- what is the difference between annotations @getmapping and @requestmapping?
- Explain how would you design or implement an endpoint.
- What is 400, 401, 200
- Benefits of Spring JPA
- What is Spring Boot? Benefits of using Spring Boot? - Asked 2 times
- What is Spring Boot Actuator?
- Difference between Spring Boot and MVC
- How you used Spring in your projects?
- How does data persistence work with Spring data JPA?

# Angular - 37 questions (18.5% of Total Questions)
- What is a Component in Angular? - Asked 3 times
    - A component in Angular is a fundamental building block that encapsulates a part of the user interface and its behavior. It consists of a TypeScript class, an HTML template, and optional style files. Components are used to create reusable and modular UI elements.
- Which files gets generated when you create an Angular component?
    - When you create an Angular component, the following files are generated:
        - Component TypeScript file (e.g., component.ts)
        - Component HTML file (e.g., component.html)
        - Component CSS/Style file (e.g., component.css)

- How to make a Component available to be used by other Components
    - To make a component available for use by other components, you need to export the component class in its TypeScript file using the 'export' keyword. For example:
        ```typescript
        export class MyComponent { /* ... */ }
        ```
- Data binding in angular? - Asked 5 times
    - Data binding in Angular allows synchronization of data between the component and the view. There are several types of data binding, including:
        - Interpolation ({{ data }})
        - Property binding ([property]="data")
        - Event binding ( (event)="handler()" )
        - Two-way binding ([(ngModel)]="data")
- How would you save the previous input and display it on the UI when typing into a text box in Angular?
    - You can achieve this by using ngModel for two-way data binding and storing the previous input in a variable. For example:
        ```typescript
        <input [(ngModel)]="inputData" (input)="savePreviousInput()">
        ```
- What are annotations in angular?
    - Annotations in Angular refer to the decorators used to add metadata to classes, allowing Angular to understand and process them. Common decorators include @Component, @Directive, @Injectable, etc.

- How do you connect your frontend with your backend using Angular and Spring Boot? - Asked 3 times
    - You can connect Angular with Spring Boot by making HTTP requests. Angular's HttpClient module is commonly used to send HTTP requests to Spring Boot REST APIs. Configure API endpoints in Angular and handle them in Spring Boot controllers.

- What are some Angular lifecycle hooks?
    - Angular lifecycle hooks are methods that provide visibility into the component lifecycle. Some hooks include ngOnInit, ngOnDestroy, ngAfterViewInit, etc.

- What is ngoninit in Angular? - Asked 2 times
    - ngOnInit is a lifecycle hook in Angular that is called after the component has been initialized. It is commonly used to perform component initialization tasks.

- name some Angular directives and what they do? - Asked 3 times
    - *ngIf: Conditionally renders content based on a given expression.
    - *ngFor: Iterates over a collection and renders content for each item.
    - *ngSwitch: Renders content based on a series of conditions.

- What does an *ngif do - Asked 2 times
    - *ngIf is a structural directive in Angular that conditionally renders or removes content based on the truthiness of an expression.

- ngFor? - Asked 2 times
    - ngFor is a structural directive that iterates over a collection (array or iterable) and repeats a template for each item in the collection.

- What are some angular dependencies?
    - Angular dependencies include core Angular modules like FormsModule, HttpClientModule, RouterModule, etc. These modules provide essential functionality for building Angular applications.

- how do you accomplish input validation in Angular? - Asked 2 times
    - Input validation in Angular is achieved through built-in validators and custom validation functions. Validators can be applied to form controls using directives like ngModel or reactive form validators.

- How do you validate a form? - Asked 2 times
    - Form validation in Angular can be done using template-driven forms or reactive forms. Validators are applied to form controls, and the form's overall validity can be checked to determine if it is valid or not.

- What are Decorators (Angular)? - Asked 2 times
    - Decorators in Angular are used to annotate classes, providing metadata that Angular uses to understand and configure the class. Common decorators include @Component, @Directive, @Injectable, etc.

- What are the methods in Angular?
    - Angular components and services can have methods defined within their classes. The methods perform specific tasks or actions and are called in response to events or application logic.

- What are pipes and how you use them? - Asked 2 times
    - Pipes in Angular are used for data transformation in the template. They take in data as input and transform it before displaying it in the view. Examples include the date pipe, uppercase pipe, etc.

- what is $root in angular
    - In Angular, there is no concept of $root. In AngularJS (Angular 1), $rootScope was a global scope accessible throughout the application. Angular 2 and later versions do not have a direct equivalent to $rootScope.

- what is the difference between Angular 1 and Angular 2?
    - Angular 2 and later versions are a complete rewrite of AngularJS (Angular 1). Some key differences include the introduction of components, a more modular architecture, improved performance, and the use of TypeScript as the primary language.

# HTML/CSS/JS - 5 questions (2.5% of Total Questions)
- What types are in JavaScript?
- different in JavaScript and typescript.
- What is the difference from HTML & XHTML (There are 12 differences)
- What is CSS used for?
- What is the difference from Display none & Visibility hidden?

# Misc - 5 questions (2.5% of Total Questions)
- Do you have experience in automation tools? - Asked 2 times
- Do you have experience using Selenium? - Asked 2 times
- Do you know How to Write JSON into SQL?


# Coding Challenges - 27 Questions (13.5% of Total Questions)

## Java - 21 Questions (10.5% of Total Questions, 77.77% of Topic Questions)
- Print the first unique character in a given string
- write a code that display only duplicate words in a string
- given an array of numbers get two numbers that is close to zero.
- Get the second non repeatable character from a string (aaggehhttuyy)
- Count the words in a string using a hashmap? Ex: String: “this is code” Answer: 3
- Write a function to count the amount of each character from a string.
- Sort an array. Find the unique character in a String
- Code example of using a lambda expression to add two integers. A functional interface is created and implemented with lambda.
- Find the second largest element in an array.
- Write a program to return the third largest int from an array.
- Write a java method to check for repeated letters in a string: ex. ""Google"" = g : 2, o : 2"
- coding challenge to remove duplicates
- print the characters and their number of occurrences in a given string
- Print an array of integers and get the max and min numbers
- Remove duplicates from this array (Integer Array)
- Coding challenge to sort arrays into a descending order
- search a string for non repeated characters and capitalize them
- write the program find the 2nd non-repeated value.
- write a program that takes in a string, separates each character with a space, then alternates from uppercase to lowercase. For example: google -> G o O g L e
- code a method that finds duplicate letters in a string
- Write a java program to find the second non repeated character in a string

## SQL - 6 Questions (3% of Total Questions, 22.22% of Topic Questions)
- Select two of the highest marks from students (sql)
- create a Join based on some verbal instructions given
- Write an SQL query to return the two highest values from a table in SQL.
- sql statement to sort a table by the student's grades averaged
- Write a SQL query to find the student with the highest marks in a subject
- Write a SQL query to only return the row with employee with the second highest salary

# Soft Skills - 16 Questions (8% of Total Questions)
- Walk me through setting up and creating a web application from start to finish. What steps would you take to make the angular and spring boot project? - Asked 2 times
- Do you know any other technologies?
- Tell me about yourself - Asked 5 times
- explain the workflow of a project you did previously
- What components did you work on for your last project? - Asked 4 times
- What technology was covered during your time in college?
- Have you worked with Spring Boot and Angular in your projects, explain. - Asked 2 times
- Asked about basic information, like diploma, gradation date, any prior experience.


