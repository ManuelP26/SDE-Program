package com.company.states;

import com.company.choosingState;
import com.company.console.ConsoleReader;
import com.company.console.ConsoleWriter;

public class chooseColorState implements choosingState {

    ConsoleWriter writer = new ConsoleWriter();
    ConsoleReader reader = new ConsoleReader();

    com.company.carFacade carFacade;

    public chooseColorState(com.company.carFacade carFacade) {
        this.carFacade = carFacade;

    }

    @Override
    public void carPicker(){
    }
}
