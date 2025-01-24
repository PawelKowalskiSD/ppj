package dev.pawel.ex11.zadanie5;

public class Warrior extends Character{
    private final double armor;

    public Warrior(String name, double health, double damage, double armor) {
        super(name, health, damage);
        this.armor = armor;
    }

    @Override
    public void attack(Character target) {
        super.attack(target);
    }
}
