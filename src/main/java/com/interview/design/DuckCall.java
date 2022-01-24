package com.interview.design;

public class DuckCall {
    QuackBehavior quackBehavior;

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performQuack(){
        quackBehavior.quack(); // simulate the sound of duck and try to seduce mallard duck
    }
}
