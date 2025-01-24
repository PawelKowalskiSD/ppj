package dev.pawel.ex11.zadanie4;

import java.util.Arrays;

public class Developer extends Employee {
    private final String[] programmingLanguages;

    public Developer(String name, double baseSalary, String[] programmingLanguages) {
        super(name, baseSalary);
        this.programmingLanguages = programmingLanguages;
    }

    public Developer(String name, double baseSalary) {
        super(name, baseSalary);
        programmingLanguages = new String[0];
    }

    @Override
    public double getSalary() {
        return super.getBaseSalary() + ((getBaseSalary() * 0.02) * programmingLanguages.length);
    }

    @Override
    public void work() {
        System.out.println(this.getName() + " is coding in " + Arrays.toString(programmingLanguages));
    }

    public void work(String language) {
        for (String findLanguage : programmingLanguages)
            if (findLanguage.equals(language))
                System.out.println(this.getName() + " is coding in " + language);
        System.out.println(this.getName() + " doesn't know " + language);
    }
}
