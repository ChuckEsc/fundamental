package com.interview.ooa.dogdoor;

public class Bark {
    private String sound;

    public Bark(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public boolean equals(Object bark){
        if (bark instanceof Bark){
            Bark otherBark = (Bark) bark;
            return otherBark.sound.equalsIgnoreCase(this.sound);
        }
        return false;
    }
}
