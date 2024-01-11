# Typescript Intro

Typescript is an open-source, objected-oriented, typed, superset of Javascript, created by Microsoft

-   It contains all functionality of JavaScript
-   With additions of classes, interfaces, inheritance, modules, and more
-   It is portable across browsers and devices
-   It supports strong/static typing

Typescript is not directly readible by the browser, you must transpile the typescript into javascript before running it in the browser or in node

To install typescript, we use `npm install -g typescript`

To compile the TS into JS, you use the `tsc` command which will output a javascript file with the same name

## Datatypes

Like Javascript you still declare variables with var, let, const, however you now must declare a type:

-   ex. `let varname : [type] = value`

There are 11 datatypes in Typescript

-   Boolean: true or false
-   Number: integer, or decimal number
-   String: text inclosed in single or double quotes
-   Undefined: same as JS
-   Null: same as JS
-   Any: acts as normal JS variables
-   Void: used for functions that do not return anything
-   Arrays: dynamic size like JS, store a single datatype
-   Tuples: an array that can store a fixed number of objects
-   Enum: declare a set of named constants
-   Never: represents a type of value that never occur

# Classes and Access Modifiers

In typscript the `class` keyword is used to declare a class, and the `new` keyword can be used to create a new instance of a class

You can implement inheritance with typescript classes using the extends keyword, similar to Java

Typescript has three access modifiers:

-   public: the default modifier, can be accessed anywhere
-   private: can only be accessed inside the class
-   protected: can only be accessed inside of the class or child classes

We can also make properties read only with the readonly modifier

In typscript, the code we write is globally scoped by default. To restrict this, typescript provide modules and namespaces. All variables, classes, and functions declared in a module are not accessible outside of said module

You can create a module using the export keyword, and you can use other modules by using the import keyword

Typescript supports getters and setters to access and set class members, you simple put set and get keyword to create these mutators. You can use these as properties rather than functions.

# Interfaces

Interfaces allus us to create contracts that other classes/objects can implement

You define an interface withe the `interface` keyword, which incldes the properties you want the class/object to have

You can include optional properties with the `?`

The typescript compiler does not convert the interface, it just uses it for type checking

# Decorators

A decorator is a special kind of declaration attached to a class, method, accessor, property, or parameter, they look like annotations from Java

In typscripe we have to enable experimental support for decorators in the tsconfig.json file to true

## Types of Decorators

Class is declared before a class declaration that is applied to the constructor of the class, and is used to observe, modify, or replace a class definition

Method is declared before a method declaration, and is applied to the property descriptor for the method, they are used to observe, modify, or replace a method definition

Property, are used to listen to state changes in a class

Parameter is declared before a parameter declaration and is applied to the function for a class constructor or method declaration

Accessor is applied to the property descriptor for an accessor

We will see the use of Decorators often in Angular