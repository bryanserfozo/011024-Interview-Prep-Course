# Spring MVC

Spring MVC is a request driven structure centered around a central Servlet using the front controller design pattern

Servlets are the underlying technology that allows Java to interface between clients through the internet

## Front Controller Design Pattern

<img src = "https://www.tutorialspoint.com/spring/images/spring_dispatcherservlet.png">

The front controller design pattern provides a single handler for all incoming requests for a resource in an application, then dispatches the requests to the appropriate secondary handler for that type of request.

It uses a helper api to achieve the dispatching mechanism, it is broken up into four differen components

Front controller is the single point of entry for requests, it directs requests to the dispatcher

Dispatcher is reposponsible for managing the actions and the views, including locating and routing to specific actions that will service a request, and finding the correct view

Helper classes are used to break up the logic of specific features, and makes the program easier to build and maintaine

Views represent and display information that we want to display to the client

The Spring DispatchServlet is completely integrated with the Spring IOC container

The Dispatch Servlet routes requests to handlers, view resolvers, and also provides support for uploading files

Since DispatchServlet is a servlet itself it must mapped it in the web.xml

View Resolvers will retrieve the correct view from controller

# InternalViewResourceResolver

The InternalResourceView is a Wrapper class for JSP or other resources within the same web application. It can be used to expose model objects as request attributes and forward requests to a specified resource URL using the RequestDispatcher. In particular the InteralResourceViewResolver supports definitions for InternalResourceViews for a simple and straightforward resolution of @Controller class methods.

# Spring MVC Annotations

## @Controller:

Will mark the class as a controller, which is a special kind of spring bean that handles requests, the dispatcher will scan for these classes, and send requests to the correct controller

## @RequestMapping:

Used to map a uri to a specific class, or to a specific method inside of a controller, you can also include the http method if it is over a method

## @RequestBody:

Use this annotation to gain access to the object sent with the request

## @ResponseBody:

This annotation will automatically convert the return of the method to the correct json object to send in the response back to the client

## @RestController:

A class level annotation that combines @RequestMapping and @ResponseBody, allows you to return from the controller methods normally, without a ResponseBody annotation

## Path Paremeters and Query Parameters

Path Parameters and Query Parameters are ways to send information to the server without using a POST request, these should only be used to send information that is none confidential. To set these up you use the @RequestParam and @PathVariable in the method parameters

Path Variable allows you to add a value after the last slash of the request uri, ex `http://url/get/variable`

Query Parameters use a ? in the uri then you define the parameters you are sending over, ex `http:url/get?var=name`

# Spring MVC vs Spring Boot

<img src ="https://qph.cf2.quoracdn.net/main-qimg-f7b39b4879b57e33cf3cbcedf9b66f25-pjlq">

## Spring Boot Flow Architecture

<img src = "https://www.researchgate.net/profile/Sr-Swamy/publication/341151097/figure/fig2/AS:887752266616836@1588668042046/Fig-2-Architecture-flow-of-spring-boot-Applications-Spring-boot-uses-all-the-features.ppm">