package com.interview.ooa.dogdoor;

public class DogDoorSimulator {
    public static void main(String[] args) {
        Dog bruceDog = new Dog("Bruce", "woof");
        Bark bruceBark = new Bark(bruceDog.getBarkSound());
        DogDoor dogDoor = new DogDoor(bruceBark);
        Remote remote = new Remote(dogDoor);
        BarkRecognizer recognizer = new BarkRecognizer(dogDoor);
        System.out.println("\nFido barks to go outside");
        System.out.println("\nFido starts to barking");
        recognizer.recognize(bruceBark);
        System.out.println("\nFido has gone outside");
        System.out.println("\nFido has all down");
        try {
            Thread.currentThread().sleep(10000);
        }catch (InterruptedException e){
        }
        System.out.println("\nFido has stuck outside");
        System.out.println("\nFido starts to barking");
        Dog fidoDog = new Dog("Fido", "hugh");
        recognizer.recognize(new Bark(fidoDog.getBarkSound()));
        recognizer.recognize(bruceBark);
        System.out.println("\nFido's back inside");
    }
}
