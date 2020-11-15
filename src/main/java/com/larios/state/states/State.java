package com.larios.state.states;

import com.larios.state.ui.Player;

public abstract class State {
    public Player player;

    public State(Player player){
        this.player = player;
    }

    public abstract String onLock();
    public abstract String onPlay();
    public abstract String onNext();
    public abstract String onPrevious();
}
