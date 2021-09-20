package com.company;

public class Dwarf extends FantasyCreatures {


    public Dwarf(){
        super(new FeaturesDwarf(), new NotMagic());
    }

    @Override
    public void display(){
        System.out.println("Damn elves");
    }
}
