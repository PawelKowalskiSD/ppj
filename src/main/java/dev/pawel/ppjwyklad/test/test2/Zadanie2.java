import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input2 = 0;
        System.out.println("Wprowadź operacje: +, -, /, , %, ^, pierwiastek: ");
        String operation = scanner.next();
        String pierwiastek = "pierwiastek";

        System.out.println("Wprowadź x: ");
        int input1 = scanner.nextInt();

        if (!operation.equals(pierwiastek)) {
            System.out.println("Wprowadź y: ");
            input2 = scanner.nextInt();
        }

        int result = switch (operation) {
            case "+" -> input1 + input2;
            case "-" -> input1 - input2;
            case "/" -> input1 / input2;
            case "" -> input1 * input2;
            case "%" -> input1 % input2;
            case "^" -> (int) Math.pow(input1, input2);
            case "pierwiastek" -> (int) Math.sqrt(input1);
            default -> 0;
        };

        String formattedResult = result != 0 ? "Wynik: " + result : "Nieprawidłowe wprowadzone dane";
        System.out.println(formattedResult);

    }
}
