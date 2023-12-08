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