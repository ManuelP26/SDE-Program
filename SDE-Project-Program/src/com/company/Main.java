package com.company;

public class Main {

    public static void main(String[] args) {
        carFacade carFacade = new carFacade(0);
        while (true){
            carFacade.carPicker();
        }
    }
}
