package com.company.states;

import com.company.*;
import com.company.choosingState;
import com.company.console.ConsoleReader;
import com.company.console.ConsoleWriter;

public class chooseCarState implements choosingState {

    ConsoleWriter writer = new ConsoleWriter();
    ConsoleReader reader = new ConsoleReader();

    CarFactory carFactory = new CarFactory();
    com.company.carFacade carFacade;
    int count;

    public chooseCarState(com.company.carFacade carFacade, int count) {
        this.carFacade = carFacade;
        this.count = count;

    }

    @Override
    public void carPicker(){
        writer.write("Hello there! welcome to the VW dealership. What car would you like? (polo/golf/scirocco)");
        String car = reader.readLine();

        if (car.equals("polo")) {
            Car polo = carFactory.getCar("POLO");
            polo.call();
            this.carChosen();
        } else if (car.equals("golf")) {
            Car golf = carFactory.getCar("GOLF");
            golf.call();
            this.carChosen();
        } else if (car.equals("scirocco")) {
            Car scirocco = carFactory.getCar("SCIROCCO");
            scirocco.call();
            this.carChosen();
        } else {
            System.out.println("We are terribly sorry but it would appear we don't have that car in the showroom at the moment");
        }
    }

    public void carChosen() {
        this.carFacade.changeState(new chooseColorState(this.carFacade, this.count), this.count);
    }
}

