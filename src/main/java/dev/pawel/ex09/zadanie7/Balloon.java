package dev.pawel.ex09.zadanie7;

import java.util.Random;

public class Balloon {
    private double hel;

    public Balloon() {
        this.hel = new Random().nextDouble(0.005, 0.0091);
    }

    public double getLoad() {
        return (hel / 0.007) * 6;
    }
}
