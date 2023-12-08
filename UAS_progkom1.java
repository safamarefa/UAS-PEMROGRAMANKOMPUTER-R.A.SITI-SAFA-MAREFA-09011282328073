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
