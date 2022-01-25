package com.interview.ooa.dogdoor;

public class Dog {
    private String name;
    private String barkSound;

    public Dog(String name, String barkSound) {
        this.name = name;
        this.barkSound = barkSound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBarkSound() {
        return barkSound;
    }

    public void setBarkSound(String barkSound) {
        this.barkSound = barkSound;
    }
}
