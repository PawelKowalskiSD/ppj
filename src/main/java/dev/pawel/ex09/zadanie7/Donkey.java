package dev.pawel.ex09.zadanie7;

public class Donkey {
    private double mass;
    Balloon []balloon;

    public Donkey(double mass) {
        this.mass = mass;
        this.balloon = new Balloon[100];
    }

    // Method to add a balloon to the donkey
    public void addBalloon(Balloon balloon) {

    }

    // Method to check if the donkey can fly
    public boolean isFlying() {
        double totalLift = 0;
        for (Balloon balloon : balloon) {
            totalLift += balloon.getLoad();
        }
        return totalLift >= mass * 1000;
    }

    public int getBalloonCount() {
        return balloon.length;
    }
}
