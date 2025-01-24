public class Zadanie3 {
    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 4, 3, 2, 1};

        int n = tab.length;
        for (int i = 0; i < n / 2; i++) {
            System.out.println(tab[i] == tab[n - i - 1]);
        }
    }
}
