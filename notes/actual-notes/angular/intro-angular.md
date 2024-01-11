## AngularJS vs Angular 4+

AngularJS is a javascript-based open source web framework, that doesn't support the features of a server-side programming language, nor dynamic page loading

Angular 4+ is a complete rewrite of Angular JS, with a complete comparison below:

| Angular JS                                                                                         | Angular 4+                                                                                                                       |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| Uses MVC architecture to build the applications.                                                   | Uses component based UI to build the applications.                                                                               |
| AngularJS is written in JavaScript.                                                                | Angular is compatible with the most recent versions of TypeScript that have powerful type checking and object-oriented features. |
| To bind an image/property or an event with AngularJS, you have to remember the right ng directive. | Angular focuses on “( )” for event binding and “[ ]” for property binding.                                                       |
| AngularJS doesn't support mobiles.                                                                 | Angular support mobiles.                                                                                                         |

Angular uses Typescript, and uses several main building block we will discuss this week:

-   modules
-   components
-   templates
-   metadata
-   data binding
-   directives
-   services
-   dependency injection

# Angular CLI

The Angular CLI is a command-line interface for Angular, that helps us get started with creating an Angular application

-   It sets up the project in Typescript, and installs dependencies like Webpack, Karma for testing, and others

To install the Angular CLI use `npm install -g @angular/cli`

To create a new Angular project use `ng new app-name`

To start your application use `ng serve --open`

## Angular File Structure

-   e2e holds files for end-to-end tests, and test specific config files
-   node_modules holds all of our dependencies
-   src folder holds the source code for our application

# Create our angular application

# Angular Modules

In angular a module is a group of components that are related, and can be combined with other modules to create an entire application

There are two types of modules, root modules and feature modules

In our Angular applications we have a single root module, which is where our application is bootstrapped, and the application can have zero or more feature modules, which can be groups of related components

To create a feature module, you can run the cli command `ng generate module modulename --module app.module`

## @NgModule Decorator

We use the @NgModule decorator to mark a class as an angular module

In the AppModule we use @NgModule to setup the root of the appliction, but if you wanted, you could create other modules and include them in the main application module

NgModule takes metadata and describes how to compile a compents templates how to create an injector at runtime

The Angular CLI creates the AppModule where we use the NgModule for us, it takes the following metadata:

-   declarations: a list of components, directives, and pipes which belong to the app
-   imports: alist of modules, which are used by the component templates
-   providers: a list of service providers the application needs
-   boostrap: contains the root component of the application

The steps to starting an Angular application (bootstrapping):

1. the main.ts in an entry poin of an angular application
2. We bootstrap an angular application and pass app.module.ts as an argument. In app.module.s we tell angular to bootstrap the AppComponent
3. Angular analyzes this AppComponent and knows there is an app-root selector defined
4. Angular handles app-root in the index.html file
5. index.html gets loaded on the browser

# Components and @Component Decorator

Components are the basic building blocks of our application

The purpose of components is so we can break up our UI and logic into individual pieces, each component has a specific purpose

An Angular application has one root component (AppComponent) which is specified in the bootstrap array under the main ngModule

We declare a component with the @Component Decorator

The @Component decorator needs to be imported from the @angular/core module, and will be used in the ts file of your component

Components can also have associated HTML, and CSS files to describe how the component should look

Inside of our @Component decorator there are a few properties:

-   selector: a css selector that tells angular to crate and insert an instance of this component into a specified element
-   templateUrl: the module relative address to the components THL template, or an inline HTML template
-   styleUrls: an array of css files or inline css styles

You can use inline templates in the Angular HTML template using double curly braces {{}} to bind data from our components

You declare these properties inside of the export of the compoent class

The easiest way to create a component is `ng generate component c-name` this will generate all the relevant files for a component


# Component Lifecycle Methods

The life cycle of a Angular component is:

-   Creation
-   Render
-   Create/Render Children
-   Check for data changes
-   Destroy before remove it from DOM

These events are called LifeCycle hooks, and these have 8 different function calls that correspond to the lifecycle event

<img src = "https://geeksarray.com/images/blog/angular-component-lifecycle.png" height = "600">

**constructor** - The constructor of the component class gets executed first, before the execution of any other lifecycle hook. If we need to inject any dependencies into the compoent, then the constructor is the best place to do it

**ngOnChanges** - Called whenever the input properties of the component change. It returns _SimpleChanges_ object which holds any current and previous property values

**ngOnInit** - Called once to intialize the component and set the input properties. It initializes the component after Angular first displays the data-bound properties

**ngDoCheck** - Called during all change-detection tuns that Angular cant detect on its own. Also called immediately after the ngOnChanges method

**ngAfterContentInit** - Invoked once after Angular performs any content projection into the components view

**ngAfterContentChecked** - Invoked after each time Angular checks for content projected into the component, it is called after ngAfterContentInit, and every subsequent ngDoCheck

**ngAfterViewInit** - Invoked adter Angular initalizes the compoents view and its child views

**ngAfterViewChecked** - Invoked after each time Angular checks for content prjected into the component. It is called after ngAfterViewInit and every subsequent ngAfterContentChecked

**ngOnDestroy** - Invoked before Angular destroys the directive of component