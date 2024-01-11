package com.revature.D2;

public abstract class FirstResponder {
    // Abstract on a class marks it as an abstract class (can have both concrete and abstract methods)
    // Abstract on a method means we don't provide implementation (only can be used in an abstract class or interface)

    // First responders respond to 911 calls usually in different ways, but they all can respond to 911 calls
    public abstract void respondToDispatcherCall(); // No Method body attached to an abstract method
}
