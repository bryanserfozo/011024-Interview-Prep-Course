# Data Binding

In Angular, Data binding provides the communication between a component and the DOM

Angular supports 1 way and 2 way data binding

## 1-way data binding

1-way data binding allows us to manipulate views through models, and its achieved through:

-   String interpolation: binding data from a typescript class to the template using the double curly braces {{}}

-   Property binding: allows us to bind values to the attributes of HTML elements. Uses []

-   Event binding: allows us to bind DOM events such as keystrokes, button clicks, etc to a function in the component. Uses ()

# One way databinding example

## 2-way data binding

In 1-way data binding changes in the template are not reflected in the component, to solve this we use 2-way data binding

This is achieved by combining property binding and event binding. Uses [(ngModel)]

This is useful for gathering user input

# Event Emitters

EventEmitters are used to emit custom events, synchronously or asynchronously, and register handlers for those events by subscribing to an instance

You use the @Input and @Output decorators to flow data between components

-   If we have to flow data into a component you use @Input
-   If we have to emit the event or data from a component we use @Output


# Structural Directives

Directives are markers on a DOM element that tells Angular to change the appearance, behavior, and/or layout of the DOM element and its children

Structural directives are used to manipulate and change the structure of DOM elements

There are three built-in structural directives:

ngIf: allows us to add or remove DOM elements based upon a Boolean expression

-   you can also add an #elseBlock

ngFor: allows us to repeat a part of the HTML template once per each item from an iterable list

ngSwith: allows us to switch betwen different elements depending on the expression. It is used with the following directives

-   ngSwitchCase
-   ngSwitchDefault

`<ng-template>` is designed to hold some template code


# Attribute Directives

Attribute Directives are used to change the look and behavior of the DOM element

There are two built in attribute directives:

ngClass: used for adding or removing CSS classes on an HTML element. It can allow us to apply CSS classes dynamically based on expression evaulation

ngStyle: allows you to dynamically change the style of an HTML element based on an expression

You can also create your own custom directives using the Angular CLI command `ng generate directive name`

-   This will create a name.directive.ts file, and automatically declares it in the AppModule file