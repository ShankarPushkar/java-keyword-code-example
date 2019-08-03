package com.stackroute;

import com.stackroute.oopsconcept.YahamaFZS;

public class Main {
    public static void main(String[] args) {
        //Calling Child Class of Yahama
        YahamaFZS yahamaFZS = new YahamaFZS();
        yahamaFZS.Details();
        //Calling Parent class methods
        yahamaFZS.start();
        yahamaFZS.stop();
    }
}
