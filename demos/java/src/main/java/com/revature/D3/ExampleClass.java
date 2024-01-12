package com.revature.D3;

public class ExampleClass {

    private String title;

    public ExampleClass(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "ExampleClass{" +
                "title='" + title + '\'' +
                '}';
    }




    // Exploring overriding a static and private method
    public static void staticMethod(){
        System.out.println("This is a static method");
    }


    private void privateMethod(){
        System.out.println("This is the original private method");
    }
}
