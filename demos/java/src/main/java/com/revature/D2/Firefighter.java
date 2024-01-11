package com.revature.D2;

public class Firefighter extends FirstResponder implements Uniformed{

    // We NEED to provide implementation to this method since this class is not abstract meaning all methods must be
    // concrete
    @Override
    public void respondToDispatcherCall() {
        System.out.println("Go put out the fire!");
    }

    @Override
    public void suitUp() {
        System.out.println("Put fire-safe gear on and jump in the truck");
    }
}
