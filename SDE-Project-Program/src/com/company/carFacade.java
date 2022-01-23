package com.company;

import com.company.states.chooseCarState;
import com.company.states.chooseColorState;
import com.company.states.revealState;

public class carFacade {
    final static int CHOOSINGCAR = 0;
    final static int CHOOSINGCOLOR = 1;
    final static int REVEAL = 2;

    choosingState state;
    int count = 0;

    public carFacade(int count) {
        this.count = count;
            if (count == 0) {
                this.state = new chooseCarState(this);
            } else if (count == 1) {
                this.state = new chooseColorState(this);
            } else if (count == 2) {
                this.state = new revealState(this);
            }
        }

        public void changeState(choosingState state, int count){
            this.state = state;
            this.count = count;
        }

        public void carPicker(){
            this.state.carPicker();
        }
    }

