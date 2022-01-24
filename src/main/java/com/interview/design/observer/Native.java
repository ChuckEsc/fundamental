package com.interview.design.observer;

import java.util.Observable;
import java.util.Observer;

public class Native {
    public static void main(String[] args) {
        NativeSubject subject = new NativeSubject();
        NativeObserver observer = new NativeObserver();
        subject.addObserver(observer);
        subject.setChanged();
        subject.changing("changing...");
    }
}

class NativeSubject extends Observable {

    public NativeSubject() {
        super();
    }

    @Override
    protected synchronized void setChanged() {
        super.setChanged();
    }

    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o);
    }

    @Override
    public synchronized void deleteObserver(Observer o) {
        super.deleteObserver(o);
    }

    @Override
    public void notifyObservers() {
        super.notifyObservers();
    }

    public void changing(String change) {
        System.out.println("change = " + change);
        notifyObservers();
    }
}

class NativeObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("subject is changing...");
    }
}