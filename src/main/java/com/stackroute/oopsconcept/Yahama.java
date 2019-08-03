package com.stackroute.oopsconcept;

//implementing CarInterface
public class Yahama implements CarInterface {
    //Overriding Interface Methods
    @Override
    public String start() {
        System.out.println("Yahama is running");
        return null;
    }

    //Overriding Interface Methods
    @Override
    public String stop() {
        System.out.println("Yahama is stuck in traffic, please stop, save fuel");
        return null;
    }
}
