# UAS-PEMROGRAMANKOMPUTER-R.A.SITI-SAFA-MAREFA-09011282328073
NAMA: R.A SITI SAFA MAREFA
KELAS: SK1A
NIM: 09011282328073
UAS PROGRAM KOMPUTER

1. Seorang pelanggan sedang berbelanja di sebuah toko online. Terdapat sebuah barang dengan harga tertentu dan diskon berdasarkan jumlah pembelian. Implementasikan program Java untuk menghitung total harga yang harus dibayar oleh pelanggan. Jika pelanggan membeli barang dengan jumlah kurang dari 5, tidak ada diskon.Jika pelanggan membeli barang antara 5 hingga 10, berikan diskon 5%.Jika pelanggan membeli barang antara 11 hingga 20, berikan diskon 10%.Jika pelanggan membeli barang lebih dari 20, berikan diskon 20%. Tampilkan total harga setelah diskon.
   
import java.util.Scanner;

public class UAS_progkom1 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      // menginput jumlah barang yang dibeli pelanggan
      System.out.print("Masukkan jumlah barang yang dibeli: ");
      int TotalBarang = scanner.nextInt();

      // harga per-barang
      System.out.print("Masukkan harga per-barang: ");
      double harga1Barang = scanner.nextDouble();

      // total harga sebelum diskon
      double totalHarga = TotalBarang * harga1Barang;

      // mendapat diskon berdasarkan jumlah pembelian
      double diskon = 0.0;
      if (TotalBarang >= 5 && TotalBarang <= 10) {
         diskon = 0.05;
      } else if (TotalBarang >= 11 && TotalBarang <= 20) {
         diskon = 0.1;
      } else if (TotalBarang > 20) {
         diskon = 0.2;
      }

      // total harga setelah diskon
      double totalHargaSetelahDiskon = totalHarga - (totalHarga * diskon);
      System.out.println("Total harga setelah diskon: " + totalHargaSetelahDiskon);

      scanner.close();
   }
}

2. Buatlah program Java untuk melakukan autentikasi pengguna berdasarkan username dan password. Jika username dan password yang dimasukkan sesuai dengan nilai yang telah ditentukan, tampilkan pesan "Autentikasi Berhasil". Jika tidak, tampilkan pesan "Autentikasi Gagal".

import java.util.Scanner;

public class UAS_progkom2 {
    public static void main(String[] args) {

        // menentukan username dan password yang benar
        String usernameTrue = "Safa";
        String passwordTrue = "sunghoon123";

        // memasukkan username dan password
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String usernameInput = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String passwordInput = scanner.nextLine();

        // Memeriksa apakah username dan password sesuai dengan nilai yang benar
        if (usernameInput.equals(usernameTrue) && passwordInput.equals(passwordTrue)) {
            System.out.println("Autentikasi Berhasil");
        } else {
            System.out.println("Autentikasi Gagal");
        }

        scanner.close();
    }
}

3. Buat program Java untuk menampilkan deret Fibonacci hingga suku ke-n. Deret Fibonacci adalah deret bilangan yang setiap suku setelah dua suku pertama adalah penjumlahan dari kedua suku sebelumnya.

   import java.util.Scanner;

public class UAS_progkom3 {

    public static void main(String[] args) {
        // input nilai n
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai n untuk deret Fibonacci: ");
        int n = scanner.nextInt();

        // print deret Fibonacci hingga suku ke-n
        System.out.println("Deret Fibonacci hingga suku ke-" + n + ":");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        // Menutup scanner
        scanner.close();
    }

    // menghitung nilai suku ke-n dalam deret Fibonacci
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}

4. Buat program Java untuk memfaktorisasi suatu bilangan bulat positif menjadi faktor-faktornya. Misalnya, jika input adalah 12, hasilnya harus menampilkan "Faktorisasi 12: 2 * 2 * 3".

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

5. Buatlah program Java untuk kalkulator sederhana yang dapat melakukan operasi penjumlahan, pengurangan, perkalian, dan pembagian. Gunakan metode untuk setiap operasi.

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

6. Buat program Java untuk mengecek apakah suatu kata atau frase adalah palindrom atau tidak. Gunakan metode untuk melakukan pengecekan.

import java.util.Scanner;

public class UAS_Progkom6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kata atau frase: ");
        String input = scanner.nextLine();

        String cleanedInput = input.replaceAll("\\s", "").toLowerCase();

        // mengecek apakah kata atau frase adalah palindrom
        if (isPalindrom(cleanedInput)) {
            System.out.println("\"" + input + "\" adalah palindrom.");
        } else {
            System.out.println("\"" + input + "\" bukan palindrom.");
        }
        scanner.close();
    }

    // mengecek apakah suatu kata atau frase adalah palindrom
    public static boolean isPalindrom(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}

7. Buatlah kelas Java untuk mengelola buku-buku dalam suatu perpustakaan. Setiap buku memiliki atribut judul, penulis, dan tahun terbit. Implementasikan metode untuk menampilkan informasi buku dan metode untuk meminjam buku.

public class UAS_progkom7 {

    private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean tersedia;

    // inisialisasi buku
    public UAS_progkom7(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.tersedia = true;
    }

    // menampilkan informasi buku
    public void tampilkanInfoBuku() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Status: " + (tersedia ? "Tersedia" : "Tidak Tersedia"));
    }

    // untuk meminjam buku
    public void pinjamBuku() {
        if (tersedia) {
            System.out.println("Buku tersedia & dapat dipinjam.");
            tersedia = false;
        } else {
            System.out.println("Buku tidak tersedia.");
        }
    }

    public static void main(String[] args) {
        UAS_progkom7 buku1 = new UAS_progkom7("Negeri 5 Menara", "Ahmad Fuadi", 2009);

        // menampilkan informasi buku sebelum dipinjam
        System.out.println("Informasi buku sebelum dipinjam:");
        buku1.tampilkanInfoBuku();

        // meminjam buku
        buku1.pinjamBuku();

        // menampilkan informasi buku setelah dipinjam
        System.out.println("\nInformasi buku setelah dipinjam:");
        buku1.tampilkanInfoBuku();
    }
}

8. Buat kelas Java untuk mengelola akun pengguna. Setiap akun memiliki atribut username, password, dan status aktif/nonaktif. Implementasikan metode untuk mengaktifkan atau menonaktifkan akun.

public class UAS_progkom8 {

    private String username;
    private String password;
    private boolean aktif;

    // inisialisasi atribut akun
    public UAS_progkom8(String username, String password) {
        this.username = username;
        this.aktif = false;
    }

    // menampilkan informasi akun
    public void tampilkanInfoAkun() {
        System.out.println("Username: " + username);
        System.out.println("Status: " + (aktif ? "Aktif" : "Nonaktif"));
    }

    // mengaktifkan akun
    public void aktifkanAkun() {
        if (!aktif) {
            System.out.println("Akun berhasil diaktifkan.");
            aktif = true;
        } else {
            System.out.println("Akun sudah aktif.");
        }
    }

    // menonaktifkan akun
    public void nonaktifkanAkun() {
        if (aktif) {
            System.out.println("Akun berhasil dinonaktifkan.");
            aktif = false;
        } else {
            System.out.println("Akun sudah nonaktif.");
        }
    }

    public static void main(String[] args) {
        // membuat objek akun
        UAS_progkom8 akun1 = new UAS_progkom8("safamarefa", "Sunghoon123");

        // menampilkan informasi akun sebelum diaktifkan
        System.out.println("Informasi akun sebelum diaktifkan:");
        akun1.tampilkanInfoAkun();

        // mengaktifkan akun
        akun1.aktifkanAkun();

        // menampilkan informasi akun setelah diaktifkan
        System.out.println("\nInformasi akun setelah diaktifkan:");
        akun1.tampilkanInfoAkun();

        // menonaktifkan akun
        akun1.nonaktifkanAkun();

        // menampilkan informasi akun setelah dinonaktifkan
        System.out.println("\nInformasi akun setelah dinonaktifkan:");
        akun1.tampilkanInfoAkun();
    }
}

9. Buat program Java yang menggunakan struktur data stack untuk memeriksa apakah urutan kurung buka dan kurung tutup pada suatu ekspresi matematika sudah benar.

import java.util.Stack;

public class UAS_progkom9 {
    public static boolean isBracketSequenceValid(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char c : expression.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        String expression1 = "((4 + 2) * 2)";
        String expression2 = "((4 + 2) * 2";
        String expression3 = "((4 + 2) * 2))";
        String expression4 = "((4 + 2) * 2]";

        System.out.println(expression1 + " : " + isBracketSequenceValid(expression1));
        System.out.println(expression2 + " : " + isBracketSequenceValid(expression2));
        System.out.println(expression3 + " : " + isBracketSequenceValid(expression3));
        System.out.println(expression4 + " : " + isBracketSequenceValid(expression4));

    }
}
