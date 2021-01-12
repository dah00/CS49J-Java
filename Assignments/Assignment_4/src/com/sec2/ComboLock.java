package com.sec2;

public class ComboLock {
    private int secret1, secret2, secret3;
    // The value -1 is the default value so that
    // if dial1,2,3 is different than -1
    // we will know that it's been dialed already.
    private int dial1 = -1;
    private int dial2 = -1;
    private int dial3 = -1;
    private int currentNumber = 0;

    public ComboLock (int secret1, int secret2, int secret3){
        this.secret1 = secret1;
        this.secret2 = secret2;
        this.secret3 = secret3;
    }

    public void reset(){
        dial1 = dial2 = dial3 = -1;
    }

    public void turnLeft(int ticks){
        dial2 = (currentNumber + ticks) % 40;
        currentNumber = dial2;
    }

    public void turnRight(int ticks){
        // First dial
        if (dial1 == -1) {
            dial1 = (40 - ticks + currentNumber) % 40;
            currentNumber = dial1;
        }
        // Third dial
        else{
            dial3 = (40 - ticks + currentNumber) % 40;
            currentNumber = dial3;
        }


    }

    public boolean open(){
        if ((dial1 == secret1) && (dial2 == secret2) && (dial3 == secret3))
            return true;
        else{
            reset();
            return false;
        }

    }
}
