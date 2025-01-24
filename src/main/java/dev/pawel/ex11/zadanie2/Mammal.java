package dev.pawel.ex11.zadanie2;

public class Mammal extends Animal {
    private final String furColor;

    public Mammal(String furColor) {
        this.furColor = furColor;
    }

    public void run() {
        System.out.println("Mammal is running");
    }
}
