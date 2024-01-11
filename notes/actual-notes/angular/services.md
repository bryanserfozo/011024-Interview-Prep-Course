# Services and Dependency Injection

Services are used to organize and share business logic, models, data or functions with different components of an Angular Application

Each service is a singleton instance that can be injected into multiple components. Essentially creating reusable code

In Angular a service is a class that is used to share data across multiple components, and they live in a file with .services.ts extension

We use Dependency Injection to inject services into components of our application

Dependency Injection allows a class to receive its dependencies from an outside source, instead of creating them itself

-   This helps decouple our code

The framework uses an Injector where we register all the dependencies to me managed, it is repsonisble for creating service instances and injecting them into components

The Injector holds all the services, registers them with the NgModule or if otherwise specified with their provider

-   The provider tells where it the application to register the service
-   The registered services can be accessed via Depenency Injection token, which is a lookup key

## Creating/Using a service

To create a service use `ng g s name` this will create a name.service.ts file with the @Injectable decorator on the class

@Injectable marks a class as a service that can be injected

-   The proviedIn property allows you to set the service class, it also declares where it can be used
-   The Injector provides the single instance of our service
-   A hierarchy of injectors at the NgModule and component level can provide different instances of a service to their own compoents and child components