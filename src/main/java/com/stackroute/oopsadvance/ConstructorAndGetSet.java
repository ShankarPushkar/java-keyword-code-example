package com.stackroute.oopsadvance;

public class ConstructorAndGetSet {
    private String name;
    private int age;
    private int id;

    //Default Constructor
    public ConstructorAndGetSet() {
    }

    //Parameterized Constructor
    public ConstructorAndGetSet(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
/*  Abstraction OOPS Concept: Using Getter Method to access private variable
    Using Setter Method to set the private variable */

    //Getter Method
    public String getName() {
        return name;
    }

    //Setter Method
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
