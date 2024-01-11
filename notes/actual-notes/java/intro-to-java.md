# Introduction to Java

## Java is a programming language that is:

High-leveled: Easy to read syntax, automatic mem management, garbage collection

Compiled: Progams are converted or compiled into Byte Code

Strongly Typed: Variables types must be defined at compile, and cannot be assigned

Object Oriented: Has constructs of classes and objects built in that allows programmers to follow the principles of Object Oriented Programming

## Advantages of Java (why we like to use it):

Java is platform idependent, you write once and run anywhere, this due to the JVM

It is widely popular with a rich API and countless libraries

It is Object Oriented

It has simple syntax to learn, based on the C programming language

It is free, and supported by Oracle

Has automatic mem management, and garbage collection

# JDK, JRE, JVM

<img src = "https://www.softwaretestinghelp.com/wp-content/qa/uploads/2020/02/All-Java-components-Diagram.png">

## Java Development Kit (JDK):

This provides developer tools to develop Java Applications, it comes with:

-   The JRE
-   Debugger
-   Devtools
-   Compiler

## Java Runtime Environment (JRE):

This provides the build in libraries that Java needs to run code, it comes with:

-   the JVM
-   all neccessary libraries to run java code
-   it is the minimum requirement to run a Java program

## Java Virtual Machine (JVM):

This converts your Java Byte Code into machine readible code

-   This is OS specific
-   Includes the Classloader, runtime data area, execution engine, and heap and stack area

# First Java Program

# Java Primitive Types w/Default Values

The only thing keeping Java from being completely Object Oriented,

The primitives include:

| Datatype | Size                             | Values                                     |
| -------- | -------------------------------- | ------------------------------------------ |
| boolean  | 1 bit                            | true or false                              |
| byte     | 8 bit integer                    | -128 to 127                                |
| short    | 16 bit integer                   | -32768 to 32767                            |
| int      | 32 bit integer                   | ~ -2 billion to 2 billion                  |
| long     | 64 bit integer                   | -2^64 to 2^64-1                            |
| float    | 32 bit floating point            | -3.40252357 x 10^34 to 1.40239846 x 10^-45 |
| double   | 64 bit floating point            | -1.7976... x 10^308 to 4.9407... x 10^-324 |
| char     | 16 bit unicode character         |                                            |
| String   | Not a prim, but treated like one |                                            |

## Data type Default value

-   boolean: false
-   char: \u000 (0)
-   int: 0
-   float: 0.0f
-   reference types (objects): null

## Datatype casting:

Widening: Will occur automatically, Java will convert a smaller data type to a larger type

Narrowing: Will need to be done manually, converting a larger data type to a smaller data type

# Java Classes vs Objects

## Classes in Java

A class is a blueprint for an object

-   It will contail all of the properties and methods that the object will have

## Objects in Java

An object is a virtualization of a real world object

Created from a class, and hold states, behaviors, and indentity

States: property attributes (fields)

Behaviors: methods (a function that is attached to an object)

Identity: the name of the object

## Modularization

Writing code that is available/reusable in different places

-   Break up the code into smaller reusable pieces
-   We use Classes and objects to achieve this
-   Allows us to simplify our code

# Java Methods and Parameters, main method

## Methods are blocks of code which only run when called

-   Declared inside of classes, they must have a return type, name, and parameter list followed by curly braces

`return type name(params, param2, param3, so on and so forth){}`

## Parameters are specified inside of the parenthesis of the method

There is a special method called `main`, it is where the program execution occurs

-   There is only one per "program"

# Packages/Imports

`package com.revature.mypackage;`

This line declares the package in which the class will reside. This must always be the first (non-commented) line in a .java file. Packages are a way of organizing classes, interfaces, and enums in a hierarchical manner. Packages follow a naming convention of lowercase characters separated by periods in the reverse way you would specify a web domain - thus, com.revature.mypackage instead of mypackage.revature.com.


Also, classes can be referenced anywhere in a program by their "fully qualified class name" - which is the package declaration followed by the class, in order to uniquely identify the class. In our example, the fully qualified class name is com.revature.mypackage.HelloWorld.


But typically we do not want to write out a verbose package and class name together. Instead, we can use an import statement after our package declaration to pull in other classes. We can then just use the class name without the package. By default, everything in the java.lang package is imported (which gives us the System class we used in the previous example). Other packages and classes must be imported by the programmer explicitly.

# Wrapper Classes

Wrapper classes are classes that let you treat primitives as Objects. This is necessary - for example - for certain methods which only accept objects and not primitives. **Boxing** is the process of converting a primitive to its wrapper class. Java has a feature called **autoboxing** which will automatically convert primitives to wrapper classes implicitly. **Unboxing** is the reverse - converting a wrapper class to its primitive. Below the wrapper classes are listed:

| Primitive | Wrapper Class |
| --------- | ------------- |
| boolean   | Boolean       |
| byte      | Byte          |
| short     | Short         |
| char      | Character     |
| int       | Integer       |
| long      | Long          |
| float     | Float         |
| double    | Double        |

Wrapper classes have static helper methods like `.parseX()` and `.valueOf()` for explicit primitive conversion.

# Stack and Heap

Inside the JVM, our application memory is divided into the "stack" and the "heap". The stack is where method invocations and reference variables are stored in stack frames. For example, when the JVM invokes the main method a stack frame is created for it and placed on the stack. Multiple stacks are possible - for example, when a thread is created it is given its own stack.

The heap, in contrast, is a central location in memory where all objects are stored. New objects are created via the new keyword and (optionally) assigned to a reference variable, which can then be re-assigned to reference different objects later. Thus, multiple reference variables could point to the same object in memory.

## Java Pass By Value

<img src = "https://blog.penjee.com/wp-content/uploads/2015/02/pass-by-reference-vs-pass-by-value-animation.gif">

Java uses pass by value when passing variable to methods

- This means a copy of the value is passed into the method, and original is not modifed

Java objects appear like they are pass by reference, however they are still pass by value

# Strings

In Java, Strings are **not** primitives - they are immutable, constant objects derived from the String class. To be immutable means that the state or value of the object cannot be altered once created.

Because Strings are immutable, all of the methods in the String class return a **new** String - the original is not modified. For example:
```java
String str1 = "my string";
str1.concat(" is the best!");
System.out.println(str1);
```
will print out `my string`. Why? Because the `.concat()` method **returns** a completely different string which we are not assigning to any variable, and the original object is not changed (it is immutable). Thus, `str1` still refers to the String "my string". In order to make the code print "my string is the best!", we would need to change line 2: `str1 = str1.concat(" is the best!");` which **re-assigns** the reference variable `str1` to the new String returned from the method (the original String hasn't changed, however).

### String Pool
When Strings are created they are placed in a special location within the heap called the String Pool. When String literals are created, if there is an existing String that matches in the String Pool, the reference variable will point to the existing value. Duplicates will not exist in the String Pool. This is important because Strings take up a lot of memory. Being able to reuse the same value throughout your application is advantageous.

One way to circumvent the above process is to use the `new` keyword along with the String constructor, which will explicitly create a new String object in memory, even if one already exists in the String Pool.

```java
String a = "foo";
String b = "foo";
String c = new String("foo");
System.out.println(a == b); // true
System.out.println(a == c); // false
```

## StringBuffer and StringBuilder

Since Strings are immutable, it becomes inefficient to use them if we are making many new Strings constantly, for example if we are generating new Strings in a `for` or `while` loop. Instead, we can use the `StringBuilder` and `StringBuffer` classes, both of which are **mutable**. `StringBuilder` contains helpful methods like `.append()` and `.insert()` which mutate its internal sequence of characters. `StringBuffer` is like `StringBuilder` but is synchronized, which is useful for multi-threaded applications.

| Class | Immutable? | Thread-safe? | Speed |
| ----  | ---------- | ------------ | ----- |
| String | Y | Y | Slowest |
| StringBuilder | N | N | Fastest |
| StringBuffer | N | Y | Fast |

# Constructors
When we use the `new` keyword in order to create an object, the JVM is invoking a special class member called a **constructor**. A constructor declares how an object is to be instantiated and initialized from the class "blueprint". A constructor is declared like a method, except **its method signature does not contain a return type, and a constructor always has the same name as the class**. The new object created by the constructor is always of the class in which the constructor is declared. A simple example is shown below:

```java
public class ConstructorExample {

  int myNumber;

  public static void main(String[] args) {
    ConstructorExample ce = new ConstructorExample(3); // a
	  System.out.println(ce.myNumber); // b
  }
  
  public ConstructorExample(int myNumber) { // c
    this.myNumber = myNumber; // d
  }
}
```

## `this` keyword
When this program is run, it will print `3`. How does this happen? The constructor is defined on line "c" with one input parameter. Note that the constructor does not have a return type. On line "d", the **parameter** myNumber is assigned to the **instance variable** myNumber via the `this` keyword. `this` refers to the object which is being instantiated - it is used to initialize instance variables, or - to call other constructors (this is called constructor chaining).

When the program above is run, the `main` method is executed. On line "a", a new `ConstructorExample` object is created and assigned to the variable `ce`. The constructor is invoked with the `new` keyword and the int `3` is passed as the argument. `this` assigns the value 3 to the instance variable `myNumber` on the object returned, as explained above. Finally, the instance variable is printed out and the program finishes execution.

## `super` keyword
There is another keyword important for constructors - the `super` keyword, which references the "super", or parent, class. When invoked as a method (`super()`), the parent class constructor will be called. A `super()` call (or a `this()` call) **must** be the first line of any constructor. If not explicitly provided, the compiler will inject `super()` it on the first line implicitly.

## `Default` constructor
In `MySimpleClass` below, we can see a constructor with no arguments used with the `new` keyword. This is valid code, but we didn't define a constructor, so how is this possible? It turns out the compiler will inject a "default" constructor for us if we do not define one ourselves. The "default" constructor takes no arguments and simply calls `super()` (see above) - sometimes it is referred to as the "default, no-args" constructor. However, be warned that if we define our own constructor(s) in the class, we will **not** receive a default constructor from the compiler.

Thus, the simple class:
```java
public class MySimpleClass {}
```
has a default no-args constructor that can be called: 
```java
MySimpleClass someVariable = new MySimpleClass();
```

# Modifiers

We already saw two different **modifiers** on the `main` method above - one is an **access modifier** and the other is a **non-access modifier**. 

## Access Modifiers

Access modifiers are keywords which define the ability of other code to access the given entity. Modifiers can be placed on classes, interfaces, enums, and class members. The access modifiers are listed below:

| Modifier | Access Level |
| --- | --- |
| `public` | Available anywhere |
| `protected` | Within the same package, and this class' sub-classes |
| `default` | Within the same package |
| `private` | Only within the same class |
<br>

The `default` access level requires additional clarification - this access level is "default" because **there is no keyword** to be used. This access level is also known as "package private".

Using `private` modifiers on instance variables - along with public getter and setter methods - helps with **encapsulation**, which is one of the pillars of object-oriented programming.

## Non-Access Modifiers

Java also has **non-access** modifiers which can be placed on various class members:
* `static` - denotes "class" scope, meaning the member resides on the class itself, not object instances.
  * `static` variables can be accessed through the class, e.g. `MyClass.staticVariable`
  * `static` methods can be called directly without needing an instance of the class, e.g. `MyClass.someMethod()`
* `final`
  * when applied to a variable, it means the variable **cannot be re-assigned**
  * when applied to a class, it means the class **cannot be extended**
  * when applied to a method, it means the method **cannot be overriden**
* `abstract`
  * when applied to a class, the class **cannot be instantiated** directly (instead, it should be *inherited*)
  * when applied to a method, only the method signature is defined, not the implementation. Also, the class where the method resides must also be abstract. Concrete subclasses **must implement the abstract method**.
* `synchronized` - relevant to threads and preventing deadlock phenomena
* `transient` - marks a variable as non-serializable, meaning it will not be persisted when written to a byte stream
* `volatile` - marks a variable to never be cached thread-locally. Obscure, rarely-used keyword.
* `strictfp` - restricts floating point calculations for portability. Obscure, rarely-used keyword.


# Variable Scopes

When a variable is declared in a Java program, it is attached to a specific **scope** within the program, which determines where the variable resides. The different **scopes of a variable** in Java are:
* Instance, or object, scope
* Class, or static, scope
* Method scope
* Block scope

Instance scope means that the variable is attached to individual objects created from the class. When an instance-scoped variable is modified, it has no effect on other, distinct objects of the same class.

Class scoped variables reside on the class definition itself. This means that when objects update a class-scoped variable, the change is reflected across all instances of the class. Class scope is declared with the `static` keyword. Methods can also be declared as class scope. However, `static` methods cannot invoke instance methods or variables (think about it: which specific object would they reference?). Static methods and variables should be referenced through the class directly, not through an object. For example: `MyClass.myStaticMethod()` or `MyClass.myStaticVariable`.

Method scope is the scope of a variable declared within a method block, whether static or instance. Method-scoped variables are only available within the method they are declared; they do not exist after the method finishes execution (the stack frame is popped from the stack and removed from memory after execution).

Block scoped variables only exist within the specific control flow block, of which there are several in Java: `for`, `while`, and `do-while` loops, `if/else-if/else` blocks, `switch` cases, or even just regular blocks of code declared via curly braces (`{}`). After the block ends, variables declared within it are no longer available.

# Control Flow Statements

Java, like most other languages, has a few keywords that define statements which control the flow of program execution:
* `if/else if/else`
* `for`
* `while`
* `do-while`
* `switch`

## If statements
The basic syntax of `if` statements:
```java
if (condition) { // this is the only block that is required - others are optional
  statement1;
} else if (condition2) {
  statement2;
} else {
  statement3;
}
```

## For loops
For-loops are used for iteration, often in conjunction with data structures. They include 3 statements in parentheses - a declaration, condition, and statement (typically increment or decrement).
```java
for (int i=0; i < myData.length; i++) {
  // typical for loop
  System.out.println(myData[i]);
}
```

Any object which implements the `Iterable` interface can be iterated over using an **enhanced for-loop**. The syntax is given in an example:

```java
List<String> myList = getListOfStrings();
for (String myStr : listOfStrings) {
  System.out.println(myStr);
}
```

## While statements
While statements test a condition - if the condition evaluates to true the block of code is run, otherwise the block is skipped. The block is looped through as long as the condition remains `true`.
```java
while (true) {
  // infinite loop!
}
```

An alternative to `while` loops is the `do-while` loop. This guarantees that the block will always run at least once:
```java
do {
  // always runs at least once!
} while(condition); // condition evaluated after the block of code, and the do block will run subsequently until the condition evaluates to false
```

## Switch statements
`switch` statements attempt to match some variable with the value it contains. This type of statement works with `byte`, `short`, `char`, and `int` primitives, along with enumerated types (`enum`s) and - since Java 7 - `String`s. The basic syntax is:

```java
switch(variable) {
  case 'A': System.out.println("Case A matches!"); break; // break is REQUIRED, unless you want control flow to "fall through" to the next case, or unless your switch case returns something and exits the method
  case 'B': System.out.println("Case B matches!"); break;
  case 'C': System.out.println("Case C matches!"); break;
  default: System.out.println("this will run if other cases don't match"); break;
}
```
# Java Operators

| Operator             | Precedence                              |
| -------------------- | --------------------------------------- |
| postfix              | x++ x--                                 |
| prefix               | ++x --x                                 |
| multiplicative       | \* / %                                  |
| additive             | + -                                     |
| shift                | << >> >>>                               |
| relational           | < > <= >=                               |
| equality             | == !=                                   |
| bitwise AND          | &                                       |
| bitwise exclusive OR | ^                                       |
| bitwise OR           | \|                                      |
| logical AND          | &&                                      |
| logical OR           | \|\|                                    |
| ternary              | expression ? true option : false option |
| assignment           | = += -= /= %=                           |

### When we talk about logical AND
 | true && true = true   |
 | true && false = false |
 | false && true = false |
 | false && false = false|




### When we talk about logical OR

true || true = true
true || false = true
false || true = true
false || false = false

## Logical AND and OR will short circuit

-   the operation can determine the outcome by looking at only one side of the expression

# Arrays
An array is a contiguous block of memory storing a group of sequentially stored elements of the same type. Arrays in Java are of a fixed size and cannot be resized after declaration. Arrays are declared with square brackets after the type of the array like so:
```java
int[] myInts = new int[]{1, 2, 3, 4};
String[] languages = {"Java", "JavaScript", "SQL"};
int[] intArray = new int[20];
```

Items in an array are referenced via their index in square bracket notation, which begins with `0` for the first element. Arrays also have a `length` property specifying the length of the array. This is helpful when iterating over arrays with a `for` loop:
```java
String[] myArr = {"first", "second", "third"};
for (int i = 0; i < myArr.length; i++) {
  System.out.println(myArr[i]);
}
```

## Varargs
Instead of writing our `main` method the standard way, we can use an alternative notation:
```java
public static void main(String... args) { }
```

Here we are using the `varargs` construct `...` which replaces the array notation. `varargs` stands for "variable arguments", and allows us to set an argument to a method whose size is determined at runtime. Java will create an array under the hood to fit the arguments provided. You can only ever have 1 varargs parameter in a method, and it **MUST** be the last parameter defined (otherwise, how would the JVM know the difference between the last value in varargs and the next parameter of the method?). You can omit the vararg value when invoking the method and Java creates an array of size 0.

```java
public class VarargsExample {
  public static void someMethod(int a, int... manyInts) {
    System.out.println("First argument: " + a);
	System.out.println("Next argument: ");
	for (int i = 0; i < manyInts.length; i++) {
	  System.out.println(manyInts[i]);
	}
  }
  
  public static void main(String[] args) {
    VarargsExample.someMethod(1, 3, 4, 5, 6);
	// First argument: 1
	// Next argument:
	// 3
	// 4
	// 5
	// 6
  }
}
```