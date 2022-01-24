package com.interview.generic;

import java.io.Serializable;

public class Main {
    public static void main(String[] args) {
        Printer<Integer> printer = new Printer<Integer>(42);
        printer.print();

        DoublePrint<Integer, String> doublePrint = new DoublePrint<Integer, String>(23, "John");
        doublePrint.print();

        ExtendsPrint<Guitar> extendsPrint = new ExtendsPrint<>(new Guitar());
        extendsPrint.print();


    }
}

class Printer<T extends Serializable> {
    T thingToPrint;

    public Printer(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
    }
}

class DoublePrint<K, V> {
    K oneThing;
    V otherThing;

    public DoublePrint(K oneThing, V otherThing) {
        this.oneThing = oneThing;
        this.otherThing = otherThing;
    }

    public void print() {
        System.out.println("oneThing = " + oneThing);
        System.out.println("otherThing = " + otherThing);
    }
}

class Instrument {
}

class Guitar extends Instrument {
}


class ExtendsPrint<Whatever extends Instrument> {

    Whatever ins;

    public ExtendsPrint(Whatever ins) {
        this.ins = ins;
    }

    public void print() {
        System.out.println("this a Extends Print");
    }
}