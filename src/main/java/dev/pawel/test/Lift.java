package dev.pawel.test;

public class Lift {
    private int floorLift = 0;
    private int value;

    public Lift(int value) {
        this.value = value;
    }

    public void go(int input) {
        if(value < input)
            throw new IllegalArgumentException("Wrog cos");

        if(floorLift < input) {
            System.out.print("Go up: " + floorLift);
            while (floorLift < input) {
                floorLift++;
                System.out.print(" " + floorLift);
            }
            System.out.println();
        } else if (floorLift > input) {
            System.out.print("Go down: " + floorLift);
            while (floorLift > input) {
                floorLift--;
                System.out.print(" " + floorLift);
            }
            System.out.println();
        } else {
            System.out.println("jest na floor");
        }
    }
    @Override
    public String toString() {
        return "Winda jest na floor: " + floorLift;
    }
    public static void cos () {

    }
}
