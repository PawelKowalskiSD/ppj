public class Zadanie6 {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Niepoprawna liczba argumentów!");
            return;
        }
        String flag = args[0];
        String startStr = args[1];
        String endStr = args[2];
        String stepStr = args[3];
        try {
            double start, end, step;
            if (flag.equals("-i")) {
                start = Integer.parseInt(startStr);
                end = Integer.parseInt(endStr);
                step = Integer.parseInt(stepStr);
            } else if (flag.equals("-d")) {
                start = Double.parseDouble(startStr);
                end = Double.parseDouble(endStr);
                step = Double.parseDouble(stepStr);
            } else {
                System.out.println("Niepoprawna flaga!");
                return;
            }
            if (start > end) {
                System.out.println("Początek nie może być większy od końca zakresu!");
                return;
            }
            if (step <= 0) {
                System.out.println("Różnica musi być dodatnia!");
                return;
            }
            for (double i = start; i <= end; i += step) {
                if (flag.equals("-i")) {
                    System.out.println((int) i);
                } else
                    System.out.println(i);
            }
        } catch (NumberFormatException e) {
            System.out.println("Niepoprawna wartość liczby!");
        }
    }
}
