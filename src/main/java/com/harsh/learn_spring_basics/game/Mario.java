package com.harsh.learn_spring_basics.game;

public class Mario implements GamingConsole{

    public void up(){
        System.out.println("Mario Jump");
    }

    public void down(){
        System.out.println("Mario Roll");
    }

    public void left(){
        System.out.println("Mario speed down");
    }

    public void right(){
        System.out.println("Mario accelerate");
    }
}
