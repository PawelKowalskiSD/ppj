package dev.pawel.ex11.zadanie5;

public class Character {
    private final String name;
    private final double health;
    private final double damage;

    public Character(String name, double health, double damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public void attack(Character target) {

    }

    public boolean isAlive() {
        return true;
    }
}
