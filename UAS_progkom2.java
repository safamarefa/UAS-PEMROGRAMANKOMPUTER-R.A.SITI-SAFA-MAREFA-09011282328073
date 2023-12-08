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