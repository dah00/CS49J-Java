package com.ComboLockSolution;
import java.util.ArrayList;
import java.util.List;
/* Declare a class ComboLock that works like the combination lock ina gym locker.
The lock is constructed with a combination three numbers between 0 and 39.     *
* @param secret1 a number between 0 and 39
* @param secret2 a number between 0 and 39
* @param secret3 a number between 0 and 39
* @throws Exception invalid number(s) for combination.     */

public class ComboLock {

    private int secret1;
    private int secret2;
    private int secret3;
    private int current;
    ArrayList attempts;


    public ComboLock(int secret1, int secret2, int secret3) throws Exception {
        if (secret1 > 39 || secret1 < 0 || secret2 > 39 || secret2 < 0 || secret3 > 39 || secret3 < 0)
            throw new Exception("Each number should be between 0 to 39");
        this.secret1 = secret1;
        this.secret2 = secret2;
        this.secret3 = secret3;
        current = 0;
        attempts = new ArrayList<>();
    }

    /**
     * Get the current position (for testing only)     *
     * * @return the current position
     */
    protected int getCurrent() {
        return current;
    }

    /**
     * Reset the current to 0
     */
    public void reset() {
        current = 0;
        attempts = new ArrayList<>();
    }

    /**
     * Turn the dial by ticks to the left
     * * (counterclockwise, current increases)
     * *     * @param ticks
     */
    public void turnLeft(int ticks) {
        current = (current + ticks) % 40;
        attempts.add("l" + current);
    }

    /**
     * Turn the dial by ticks to the right
     * * (clockwise, current decreases)
     * *     * @param ticks
     */
    public void turnRight(int ticks) {
        current = (current - ticks + 40) % 40;
        attempts.add("r" + current);
    }

    /**
     * The lock opens if the user first turned it right to the first number in the combination,
     * * then left to the second, and then right to the third.
     * *     * @return if the lock opens
     */
    public boolean open() {
        // 1) check number of turns
        if (attempts.size() == 3) {
            // 2) check first turn if 1) correct
            if (attempts.get(0).equals("r" + secret1)) {
                // 3) check second turn if 1) and 2) both correct
                if (attempts.get(1).equals("l" + secret2))
                    // check last turn if 1) to 3) all correct
                    return attempts.get(2).equals("r" + secret3);
            }
        }
        return false;
    }
}