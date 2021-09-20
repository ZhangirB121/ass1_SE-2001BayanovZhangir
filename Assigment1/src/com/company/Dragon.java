package com.company;

public class Dragon extends FantasyCreatures {

    public Dragon(){
        super(new FeaturesDragon(), new FieryBreath());
    }

    @Override
    public void display(){
        System.out.println("RAAAAAAAAA");
    }
}
