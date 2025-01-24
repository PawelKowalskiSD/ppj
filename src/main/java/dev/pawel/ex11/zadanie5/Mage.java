package dev.pawel.ex11.zadanie5;

public class Mage extends Character{
    private final double mana;

    public Mage(String name, double health, double damage, double mana) {
        super(name, health, damage);
        this.mana = mana;
    }

    @Override
    public void attack(Character target) {
        super.attack(target);
    }
}
