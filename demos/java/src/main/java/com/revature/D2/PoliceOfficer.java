package com.revature.D2;

public class PoliceOfficer extends FirstResponder{
    @Override
    public void respondToDispatcherCall() {
        // Now we need to respond to the dispatcher call differently
        System.out.println("Catch the bad guy!");
    }
}
