package dev.pawel.ex11.zadanie4;

public class Executive extends Manager {
    private double stockOptions;

    public Executive(String name, double baseSalary, double stockOptions) {
        super(name, baseSalary);
        this.stockOptions = stockOptions;
    }

    @Override
    public double getSalary() {
        return super.getBaseSalary() + (super.getBaseSalary() * stockOptions);
    }

    @Override
    public void work() {
        System.out.println(
                this.getName()
                        + " is managing a team of "
                        + super.getTeamSize()
                        + " people.\nTheir stock has value "
                        + this.stockOptions
        );
    }

    public void setStockOptions(double value) {
        if (value >= 0.0 && value <= 100.00)
            stockOptions = value;
        else
            System.out.println("value need to be >= 0.0 and <=  100.00");
    }
}
