package com.harsh.learn_spring_basics.Controller;

import com.harsh.learn_spring_basics.game.*;

public class GameRunner {

    GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run(){
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
