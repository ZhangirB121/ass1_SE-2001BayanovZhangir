package com.company;

public class Orc extends FantasyCreatures {

    public Orc(){
        super(new FeaturesOrc(), new Shamanizm());
    }


    @Override
    public void display(){
        System.out.println("For the Horde");
    }
}
