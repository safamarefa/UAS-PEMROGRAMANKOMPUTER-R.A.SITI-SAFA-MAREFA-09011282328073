import java.util.Scanner;

public class UAS_progkom4 {
    public static void main(String[] args) {

        // input bilangan bulat positif
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat positif: ");
        int bilangan = scanner.nextInt();

        // print faktorisasi bilangan
        System.out.print("Faktorisasi " + bilangan + ": ");
        faktor(bilangan);
        scanner.close();
    }

    // fungsi melakukan faktorisasi bilangan
    public static void faktor(int n) {
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i);
                n /= i;
                if (n > 1) {
                    System.out.print(" * ");
                }
            }
        }
    }
}
