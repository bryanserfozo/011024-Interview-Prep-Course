# Java Basics
* What is Java? / Why Java?

  - An high level OOP language, used for different applications, platform indepedent(write once run anywhere). It a compiled language that is statically typed and has many rich API libraries.
 
* What is JRE / JDK / JVM?

  - JVM: Java Virtual Machine runs compiled Java Code on your OS
  - JRE: Java Runtime Environment. Provides built in libraries to run code, JVM
  - JDK: Java Developer Kit. Developer Tools, debugger, compiler, and JRE
  
* What is an object / class?
 - A class is a blueprint for creating objects (contains constructors, methods and fields). An object is like a house made from a blueprint, known as a virtualization of a real life object.
  
* What is the root class from which every class extends?
  
  - The Object Class

* What are the primitive data types in Java?

  - byte, char, int, double, long, float, short, boolean
 
* Where are Strings stored?

  - The String Pool which is stored within the heap
  
* Explain stack vs heap?

  - Heap is where objects are stored in memor. Stack is where local variable references are kept -- a new stack FRAME is created for each method invocation
  
* What are annotations?

  - Uses the @ syntax. Indicates some metadata that the compiler should know when compiling. Does not affect the execution of the program
  
* What is a POJO? What is a bean?

  - POJO: Plain Old Java Object
  - Bean: A special POJO that extends Serializable and it is entirely encapsulated (has private fields that are only accessible through getters/setters)
  
* How can you force garbage collection in Java?

  - You can't. You can suggest it by using System.gc();
  
* Why are strings immutable in java?

  - Identical String literals are collected in the "String pool" in an effort to conserve memory. Reference variables will then point to the same String object instance. Changing the object's state in the String pool will make changes to all references to that String object. Instead, when a change to a String is made, the JVM makes a new String object, and the reference variable points to the new String in the String pool.
  
* What is the difference between `String`, `StringBuilder`, and `StringBuffer`?

  - String is immutable in Java while StringBuilder and StringBuffer are mutable. StringBuilder is not threadsafe, whereas StringBuffer is.
  
* What are the access modifiers in Java? Explain them.

  - public - can be accessed from any package
  - protected - can be accessed in the same package and any external subclasses
  - default - can be accessed in the same package
  - private - only members of the same class
  
* What are the non-access modifiers in Java?

  - Static, final, abstract, sychronized, transient, volatile, strictfp
 
* What is the difference between `static` and `final` variables?

 - static variables are shared by all the instances of objects and it has only single copy. A final variable is a constant and it cannot be changed. However, if the variable holds a reference to an object, the state of the object may still be changed and manipulated.
  
* What are the default values for all data types in Java?

  - Objects - null
  - int, short, byte, long, float, double - 0
  - boolean - false
  - char - 'u0000' (null character)
  
* What is a wrapper class?

  - Wrapper class is a wrapper around a primitive data type. It represents primitive data types in their corresponding class instances e.g. a boolean data type can be represented as a Boolean class instance. All of the primitive wrapper classes in Java are immutable i.e. once assigned a value to a wrapper class instance cannot be changed further.
  
* What is autoboxing / unboxing?

  - Auto-boxing is the automatic conversion of primitives to their wrapper classes by the compiler. Useful for adding primitives to collections. Unboxing is the reverse process
  
* Is Java pass-by-value or pass-by-reference?

  - Java is strictly pass by value. Even when object references are passed as arguments, it is the value of the reference that is passed
  
* What makes a class immutable?

  - Declare the class as final so it can't be extended.
  - Make all fields private so that direct access is not allowed.
  - Don't provide setter methods for variables.
  - Make all mutable fields final so that it's value can be assigned only once.

  
* If two objects are equal, do they have the same hashcode? If not equal?

 - If two objects have the same hashcode then they are NOT necessarily equal. But if objects are equal, then they MUST have same hashcode.

* What data types are supported in switch statements?

  - int, char, short, byte, Strings, enums
  
* How to pass multiple values with a single parameter into a method?

 - Use varags `...`
  
* Can we access static/non-static variables from static/non-static methods (see example)?
```java
public class A {
  public static int x = 1;
  public int y = 2;

  public static void doStuff() {
    System.out.println(y);
  }

  public void doMoreStuff() {
    System.out.println(x);
  }
}
```
<br>
  
* What methods are available in the Object class?
 
  - .getClass,.hashcode,.toString,.equals, .clone, .finalize

* How would you clone an object?

 - First, tag the class with the Cloneable marker interface. Next, invoke clone(). The clone method is declared in java.lang.Object and does a shallow copy.
  
* What is the difference between `==` and `.equals()`?

 - == - tests to see if two reference variables refer to the exact same instance of an object.
 - .equals() - tests to see if the two objects being compared to each other are equivalent, but they need not be the exact same instance of the same object.
 
* What is an enhanced for loop?

 - Enhanced for loop allows easier traversal of Collections (actually any arrays or Iterables) - syntax: for (Object o : collection) {...}
  
* What are 3 usages of `super` keyword?

  - to refer to immediate parent class instance variable.
  - super() is used to invoke immediate parent class constructor (also can pass params)
  - to invoke immediate parent class method.
  
  <br>
  
## OOP
* What are the 4 pillars of OOP / Explain each?

  - Inheritance : A class that is derived from another class is called a subclass (also a derived class, extended class, or child class). The class from which the subclass is derived is called a superclass (also a base class or a parent class).
  - Abstraction : Hiding Implementation
  - Encapsulation : Has to do with seperating data. Information is available only to thing that need that information. Private fields who can be can be accessed through mutators(getters and setters)
  - Polymorphsim : Subclasses of a class can define their own unique behaviors and yet share some of the same functionality of the parent class. An object can also be referenced by its supertype "parent" class, for example ParentClass obj = new SubClass();
 
* Is this allowed? Is this an example of method overloading or overriding?

- Overriding. This is an example of covariant return types: a method is allowed to return objects that are child classes of the return type. Also, when overriding a method, the return type of the new method can be a child class of the original return type

```java
public abstract class Super {
  public abstract Collection getCollection();
}

public abstract class Sub extends Super {
  public abstract List getCollection();
}
```

* What is the difference between an abstract class and an interface?

  - An abstract class can have both concrete and abstract methods whereas an interface must have only abstract methods if any (unless the default keyword is used). Interface methods are implicitly public and abstract, interface variables are implicitly public, static, and final, but these do not apply in abstract classes. Neither can be instantiated
  
* What are the implicit modifiers for interface variables?

 - public, static, final
  
* What is the difference between method overloading and overriding?

- Method overloading - Within the same class when one declares more than method with the same name but different signature (parameters).

- Method overriding - In a subclass when one declares an identical method from the superclass, this method overrides the one in the superclass
  
* Can you overload / override a main method? static method? a private method? a default method? a protected method?

  - Main: Overloading, but not override b/c static
  - Static: Overload but not override b/c belongs to a class(not inherited)
  - Private: overload, override b/c doesn't get inherited
  - Default: Both
  - Protected: Both
  
* Difference between extends and implements?

  - Extends is for classes, implements is for implementing interfaces
  
* What are enumerations (enums)?

   - A special Java type that defines a collection of constants
  
  
* First line of constructor?

  - The compiler will insert super() as the first line - it cannot be used anywhere else in constructor except for the first line
  
* Can you instantiate this class? Why or why not?

  - Yes because it has a default no args constructor since we haven't created another constructor 

```java
public class Hello {}
```

<br>

## Collections / Generics
* What are collections in Java?
  
  - A general data structure that contains Objects. Also the name of the API 

* What are the interfaces in the Collections API?

- Iterable, Collection, List, Queue, Set, Map
  
* What is the difference between a `Set` and a `List`?

 - Set does not allow duplicates (its members are unique)
  
* What is the difference between a `Array` and an `ArrayList`?

  - An array is static and its size cannot be changed, but an ArrayList can grow/shrink
  
* What is the difference between `ArrayList` and `Vector`?

  - Vector is synchronized (threadsafe) whereas ArrayList is not.
  - Vector doubles in size whereas ArrayList only grows by 50%
  
* What is the difference between HashTable and HashMap?

  - Hashmap permits null values and the null key.
  - Hashtable is synchronized whereas Hashmap is not.
  
* Are Maps in the Collections API?

  - Yes, but they do not implement Collection or Iterable interfaces
  
* What happens here?

  - The list was initialized to hold String values through the use of Generics. We cannot add an object of type person because of this.

```java
List<String> mylist = new ArrayList<>();
mylist.add("hello");
mylist.add(new Person()); // what happens?
```
* What are generics? What is the diamond operator (`<>`)?
 
 - A way of specifying a type within a data structure - they enforce type safety. <> operator lets you infer generic types from the LHS of assignment operation


<br>

## Exceptions
* What is the difference between `final`, `.finalize()`, and `finally`?

  - final: final keyword can be used for class, method and variables. A final class cannot be subclassed and it prevents other programmers from subclassing a secure class to invoke insecure methods. A final method can't be overridden. A final variable can't change from its initialized value.

  - finally: finally, a key word used in exception handling, creates a block of code that will be executed after a try/catch block has completed and before the code following the try/catch block. The finally block will execute whether or not an exception is thrown. For example, if a method opens a file upon exit, then you will not want the code that closes the file to be bypassed by the exception-handling mechanism. This finally keyword is designed to address this contingency.

  - finalize(): finalize method is used just before an object is destroyed and called just prior to garbage collection.

* `throw` vs `throws` vs `Throwable`?

  - throw - the keyword that will actually "throw" an exception in code

  - throws - keyword in method signature after params that declare which exception the method might throw

  - Throwable - the root (super) class of exceptions, allow a class to be "thrown"
 

* Do you need a catch block? Can have more than 1? Order of them?
  
  - Catch block is not necessary - try/finally will compile. You can have more than one catch block, but the order must be from most narrow exception to most broad/general.

* What is base class of all exceptions?

  - The base class is Exception
  
* List some checked and unchecked exceptions?

  - Checked: ClassNotFoundException, InterruptedException, IOException
  - Unchecked: TypeMismatchException, IndexOutOfBoundsException, NullPointerException, ArithmeticException
  
  
* Is this an example of a checked or unchecked exception?

  - Unchecked

```java
public class MyException extends RuntimeException {}
```

<br>



  
