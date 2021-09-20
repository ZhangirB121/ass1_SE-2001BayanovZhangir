package com.company;

public class Human extends FantasyCreatures {

    public Human(){
        super(new FeaturesHuman(), new NotMagic());
    }

    @Override
    public void display(){
        System.out.println("For the Alliance");
    }
}
