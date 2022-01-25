package com.interview.ooa.dogdoor;

public class BarkRecognizer {
    private final DogDoor dogDoor;

    public BarkRecognizer(DogDoor dogDoor) {
        this.dogDoor = dogDoor;
    }

    public void recognize(Bark bark){
        System.out.println("\nBarkRecognizer heard a '" + bark.getSound() + "'");
        // recognizer 将 bark 的比对委托给 bark 类
        if (bark.equals(dogDoor.getAllowedBark())){
            dogDoor.open();
        }else {
            System.out.println("This dog is not allowed");
        }

    }
}
