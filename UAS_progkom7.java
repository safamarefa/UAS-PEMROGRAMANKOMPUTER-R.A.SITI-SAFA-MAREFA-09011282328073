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
