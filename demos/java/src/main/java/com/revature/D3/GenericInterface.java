package com.revature.D3;

public interface GenericInterface <T>{

    // So in this interface I can use T as sort of a dynamic type so essentially when this interface gets implemented
    // The user must a choose a type for T and it will substitute in everywher I put T

    public T add(T number1, T number2);
}
