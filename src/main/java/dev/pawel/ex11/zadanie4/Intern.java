package dev.pawel.ex11.zadanie4;

public class Intern extends Employee {
    private final String university;
    private long cupsOfCoffeeDelivered;

    public Intern(String name, double baseSalary, String university, long cupsOfCoffeeDelivered) {
        super(name, baseSalary);
        this.university = university;
        this.cupsOfCoffeeDelivered = cupsOfCoffeeDelivered;
    }

    @Override
    public double getSalary() {
        if(university.charAt(0) >= 'A' && university.charAt(0) <= 'M')
            return super.getSalary() + (cupsOfCoffeeDelivered * 0.1);
        else if (university.charAt(0) >= 'N' && university.charAt(0) <= 'Z')
            return super.getSalary() + (cupsOfCoffeeDelivered * 0.15);
        else if (university.equals("PJATK"))
            return super.getSalary() + (cupsOfCoffeeDelivered * 0.12);
        return super.getSalary();
    }

    @Override
    public void work() {
        cupsOfCoffeeDelivered++;
    }
}
