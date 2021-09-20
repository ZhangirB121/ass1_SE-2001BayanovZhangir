package com.company;

public class Elf extends FantasyCreatures {

    public Elf(){
        super(new FeaturesElf(), new WhiteMagic());
    }

    @Override
    public void display(){
        System.out.println("Damn dwarf");
    }
}
