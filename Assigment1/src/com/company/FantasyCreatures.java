package com.company;

public abstract class FantasyCreatures {

    private Magic magic;
    private Features features;

    public FantasyCreatures(Features features,Magic magic){
        this.magic = magic;
        this.features = features;
    }


    public void permagic(){
        this.magic.magic();
    }

    public void perfeatures(){
        this.features.features();
    }

    public abstract void display();

    public Magic getMagic() {
        return magic;
    }

    public Features getFeatures() {
        return features;
    }

    public void setMagic(Magic magic) {
        this.magic = magic;
    }

    public void setFeatures(Features features) {
        this.features = features;
    }
}
