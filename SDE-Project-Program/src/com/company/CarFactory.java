package com.company;

public class CarFactory {
    public Car getCar(String carType){
        if(carType == null){
            return null;
        }
        if (carType.equalsIgnoreCase("POLO")){
            return new Polo();
        } else if (carType.equalsIgnoreCase("GOLF")){
            return new Golf();
        } else if (carType.equalsIgnoreCase("SCIROCCO")){
            return new Scirocco();
        }
        return null;
    }
}
