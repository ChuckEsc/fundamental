package com.interview.basic;

public class PhraseMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"24/7", "multiTier", "30,000 foot", "B-to-B",
                "win-win", "frontend", "web-based", "pervasive", "smart",
                "sixsigma", "critical-path", "dynamic"};

        String[] wordListTwo = {"empowered", "sticky",
                "value - added", "oriented", "centric", "distributed",
                "clustered", "branded", "outside - the - box", "positioned",
                "networked", "focused", "leveraged", "aligned",
                "targeted", "shared", "cooperative", "accelerated"};

        String[] wordListThree = {"process", "tippingpoint", "solution", "architecture", "core competency",
                "strategy", "mindshare", "portal", "space", "vision",
                "paradigm", "mission"};


        int length = wordListOne.length;
        double v = Math.random() * length;
        System.out.println("Math.random() = " + Math.random());
        System.out.println("v = " + Math.ceil(v));
        System.out.println("wordListOne[(int) Math.ceil(v)] = " + wordListOne[(int) Math.ceil(v)]);
    }
}
