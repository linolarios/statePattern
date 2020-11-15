package com.larios.state;

import com.larios.state.ui.Player;
import com.larios.state.ui.UI;

public class Demo {

    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
