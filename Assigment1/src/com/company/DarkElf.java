package com.company;

public class DarkElf extends FantasyCreatures {

    public DarkElf(){
        super(new FeaturesDarkElf(), new DarkMagic());
    }

    @Override
    public void display(){
        System.out.println("Darkness favors us");
    }
}
