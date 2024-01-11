package com.revature.D1;

public class Product {
    // Imagine this class is used to describe the products of some company x

    // We want to encapsulate this class so we will mark all of our INSTANCE fields as private
    private String productName;

    private double price;

    //Next we need getters and setters so we can modify or mutate the information in this class

    // Getters GET the information from a field
    public String getProductName(){
        return this.productName;
    }

    // Setters SET the information in a field
    public void setProductName(String productName){
        this.productName = productName;
    }

    // Provide getters and setters for the price value as well
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        // Now with this method I can directly control what information gets stored inside the variable
        // I can prevent a negative number (or zero) from being entered as the price
        if (price > 0){
            this.price = price;
        } else{
            this.price = 10;
        }

    }
}
