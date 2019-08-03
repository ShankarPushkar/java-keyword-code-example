package com.stackroute;

import com.stackroute.oopsadvance.*;
import com.stackroute.oopsconcept.YahamaFZS;

public class Main {
    public static void main(String[] args) {
        //Calling Child Class of Yahama
        YahamaFZS yahamaFZS = new YahamaFZS();
        yahamaFZS.Details();
        //Calling Parent class methods
        yahamaFZS.start();
        yahamaFZS.stop();
        //Calling Parent Class from oopsadvance package
        ConstructorAndGetSet constructorAndGetSet = new ConstructorAndGetSet();
        //Setting Values to parent class
        constructorAndGetSet.setName("Pushkar");
        constructorAndGetSet.setAge(20);
        constructorAndGetSet.setId(1);
        //Using Getter Method to access the variables
        System.out.println("ID:" + constructorAndGetSet.getId()
                + " Name:" + constructorAndGetSet.getName()
                + " Age :" + constructorAndGetSet.getAge());
        //Making OuterClass Object
        OuterClass outerClass=new OuterClass();
        //Making InnerClass Object
        OuterClass.InnerClass innerclass=outerClass.new InnerClass();
        //Calling InnerClass
        innerclass.print();
        OuterClass.InnerClass.NestedClass nestedInnerClass=innerclass.new NestedClass();
        nestedInnerClass.display();
        //Lambda Expressions
        new Thread(()->{
            System.out.println("() is used to pass parameter");
            System.out.println("->");
            System.out.println("{} is used to put the data inside Run");
        }
        ).start();
    }
}