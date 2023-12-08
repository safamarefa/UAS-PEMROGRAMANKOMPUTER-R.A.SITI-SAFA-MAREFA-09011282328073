import java.util.Scanner;

public class UAS_progkom5 {
    public static void main(String[] args) {

        // input dua bilangan
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan pertama: ");
        double bilangan1 = scanner.nextDouble();
        System.out.print("Masukkan bilangan kedua: ");
        double bilangan2 = scanner.nextDouble();

        // print menu operasi
        System.out.println("Pilih operasi:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");

        // memilih operasi
        System.out.print("Masukkan nomor operasi: ");
        int pilihan = scanner.nextInt();

        // melalukan sebuah operasi pilihan para pengguna
        switch (pilihan) {
            case 1:
                System.out.println("Hasil penjumlahan: " + penjumlahan(bilangan1, bilangan2));
                break;
            case 2:
                System.out.println("Hasil pengurangan: " + pengurangan(bilangan1, bilangan2));
                break;
            case 3:
                System.out.println("Hasil perkalian: " + perkalian(bilangan1, bilangan2));
                break;
            case 4:
                System.out.println("Hasil pembagian: " + pembagian(bilangan1, bilangan2));
                break;
            default:
                System.out.println("Pilihan operasi tidak valid.");
        }
        scanner.close();
    }

    // penjumlahan
    public static double penjumlahan(double a, double b) {
        return a + b;
    }

    // pengurangan
    public static double pengurangan(double a, double b) {
        return a - b;
    }

    // perkalian
    public static double perkalian(double a, double b) {
        return a * b;
    }

    // pembagian
    public static double pembagian(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Pembagian nol tidak valid.");
            return Double.NaN; // hasil pembagian tidak valid
        }
    }
}