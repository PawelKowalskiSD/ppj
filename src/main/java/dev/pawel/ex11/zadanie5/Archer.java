package dev.pawel.ex11.zadanie5;

public class Archer extends Character{
    private final int arrows;

    public Archer(String name, double health, double damage, int arrows) {
        super(name, health, damage);
        this.arrows = arrows;
    }

    @Override
    public void attack(Character target) {
        super.attack(target);
    }
}
