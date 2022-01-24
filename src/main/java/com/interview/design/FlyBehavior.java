package com.interview.design;

public interface FlyBehavior {

    void fly();
}

class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I'm flying...");
    }
}

class FlyNoWay implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}

class FlyRocketPowered implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket");
    }
}
