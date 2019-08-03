package com.stackroute.oopsadvance;


public class OuterClass {
    int getOuterClassValue = 20;
    private static int getOuterClassPrivateValue = 30;

    // StaticClass can only access Static Variable of OuterClass
    public static class NestedClass {
        public void display() {
            System.out.println("Accessing Static Value from OuterClass : " + getOuterClassPrivateValue);
        }
    }

    //InnerClass can acess both static and Non Static Variable of OuterClass
    public class InnerClass {
        public void print() {
            System.out.println("Accesing Value from OuterClass: " + getOuterClassValue);
            System.out.println("Accessing Static Value from OuterClass : " + getOuterClassPrivateValue);
        }
        public class NestedClass{
            public void display(){
                print();
            }
        }
    }
}
