package com.github.cc3002.citricjuice.model.gameflow.phases;

import com.github.cc3002.citricjuice.model.gameflow.AbstractPhase;
import com.github.cc3002.citricjuice.model.gameflow.Turn;

public class Phase4 extends AbstractPhase {

    public Phase4(Turn turn) {
        super(turn);
    }

    @Override
    public void start() {
        int roll =turn.getPlayer().roll();
        turn.getPlayer().move(roll);
    }

}