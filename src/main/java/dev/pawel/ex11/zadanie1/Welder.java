package dev.pawel.ex11.zadanie1;

public class Welder extends Person{
    private final String seniority;

    public Welder(String name, String seniority) {
        super(name);
        this.seniority = seniority;
    }

    @Override
    public void display() {
        System.out.println(super.getName() + " " + seniority);
    }
}
