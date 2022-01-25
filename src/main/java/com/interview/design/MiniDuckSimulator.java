package com.interview.design;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        // 通过setter更改
        MallardDuck rocketDuck = new MallardDuck();
        rocketDuck.setFlyBehavior(new FlyRocketPowered());
        rocketDuck.performFly();
    }
}
