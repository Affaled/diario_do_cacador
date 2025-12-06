package org.affaled.model;

import java.util.Random;

public class Dice {

    Random random = new Random();

    public int roll() {
        return random.nextInt(6+1);
    }

    public boolean rollTarget(int target) {
        return random.nextInt(6+1) >= target;
    }
}
