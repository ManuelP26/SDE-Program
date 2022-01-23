package com.company.states;

import com.company.Color;
import com.company.ColorFactory;
import com.company.choosingState;
import com.company.console.ConsoleReader;
import com.company.console.ConsoleWriter;

public class chooseColorState implements choosingState {

    ConsoleWriter writer = new ConsoleWriter();
    ConsoleReader reader = new ConsoleReader();

    ColorFactory colorFactory = new ColorFactory();
    com.company.carFacade carFacade;
    int count;

    public chooseColorState(com.company.carFacade carFacade, int count) {
        this.carFacade = carFacade;
        this.count = count;

    }

    @Override
    public void carPicker(){
        writer.write("In what color would you like your car? (blue/green/red)");
        String color = reader.readLine();

        if (color.equals("blue")) {
            Color blue = colorFactory.getColor("BLUE");
            blue.call();
            this.colorChosen();
        } else if (color.equals("green")) {
            Color green = colorFactory.getColor("GREEN");
            green.call();
            this.colorChosen();
        } else if (color.equals("french racing blue")) {
            Color frenchRacingBlue = colorFactory.getColor("FRENCH RACING BLUE");
            frenchRacingBlue.call();
            this.colorChosen();
        } else if (color.equals("red")) {
            Color red = colorFactory.getColor("RED");
            red.call();
            this.colorChosen();
        } else {
            System.out.println("It would appear that color is not available, we are sorry.");
        }
    }

    public void colorChosen() {
        writer.write("please wait while the car is being revealed....");
        this.carFacade.changeState(new revealState(this.carFacade, this.count), this.count);
    }
}
