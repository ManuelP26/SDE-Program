package com.company.states;

import com.company.choosingState;
import com.company.console.ConsoleReader;
import com.company.console.ConsoleWriter;

public class revealState implements choosingState {

    ConsoleWriter writer = new ConsoleWriter();
    ConsoleReader reader = new ConsoleReader();

    com.company.carFacade carFacade;
    int count;

    public revealState(com.company.carFacade carFacade, int count) {
        this.carFacade = carFacade;
        this.count = count;

    }

    @Override
    public void carPicker() {
        writer.write("Here is your car concrats!! Are you happy with the car you picked? (yes/no)");
        String answer = reader.readLine();

        if (answer.equals("no")) {
            writer.write("We are sorry, please choose a car that will satisfy you!");
            this.carFacade.changeState(new chooseCarState(this.carFacade, this.count), this.count);
        } else if (answer.equals("yes")) {
            writer.write("Thanks a lot! Enjoy your car!");
            System.exit(1);
        } else {
            writer.write("Sorry? Could you repeat that?");
        }
    }
}
