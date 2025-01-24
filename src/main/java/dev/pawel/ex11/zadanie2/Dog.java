package dev.pawel.ex11.zadanie2;

public class Dog extends Mammal{
    public Dog(String furColor) {
        super(furColor);
    }

    public void bark() {
        System.out.println("Woof! Woof!");
    }
}
