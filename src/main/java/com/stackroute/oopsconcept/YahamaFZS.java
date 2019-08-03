package com.stackroute.oopsconcept;

//extending Yahama(Parent Class)
public class YahamaFZS extends Yahama {
    private String modelNumber;
    private int price;

    public void Details() {
        modelNumber = "FZS V3";
        price = 122000;
        System.out.println("Model Numbes is :" + modelNumber + "Its Price is:" + price);
    }

}
