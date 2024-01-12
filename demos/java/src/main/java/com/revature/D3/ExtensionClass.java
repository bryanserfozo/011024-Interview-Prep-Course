package com.revature.D3;

public class ExtensionClass extends ExampleClass{
    public ExtensionClass(String title) {
        super(title);
    }


    // Now we'll attempt to override that static method
    public static void staticMethod(){
        System.out.println("Method has been \"overridden\"");
    }




}
