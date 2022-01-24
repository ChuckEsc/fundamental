package com.interview.ooa.dogdoor;

import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {

    private boolean open;
    private Bark allowedBark;

    public DogDoor(Bark allowedBark) {
        this.open = false;
        this.allowedBark = allowedBark;
    }

    public Bark getAllowedBark() {
        return allowedBark;
    }

    public void setAllowedBark(Bark allowedBark) {
        this.allowedBark = allowedBark;
    }

    public void open(){
        System.out.println("The dog door opens");
        open = true;
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                close();
                timer.cancel();
            }
        }, 5000);
    }

    public void close(){
        System.out.println("The dog door closes");
        open = false;
    }

    public boolean isOpen(){
        return open;
    }
}
