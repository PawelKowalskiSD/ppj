package dev.pawel.ex09.zadanie3;

import java.util.Random;

public record Fruit(String name, double weight) {
    public Fruit(String name) {
        this(name, new Random().nextDouble(0.5, 0.81));
    }
}
