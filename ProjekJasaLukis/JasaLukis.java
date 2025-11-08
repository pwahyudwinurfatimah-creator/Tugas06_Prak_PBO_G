package ProjekJasaLukis;

public class JasaLukis {
    private String namaJasa;
    private String alamat;
    private String[] daftarBarang;

    // Constructor untuk inisialisasi data jasa
    public JasaLukis(String namaJasa, String alamat, String[] daftarBarang) {
        this.namaJasa = namaJasa;
        this.alamat = alamat;
        this.daftarBarang = daftarBarang;
    }

    // Method menampilkan info jasa
    public void tampilkanInfoJasa() {
        System.out.println("===== INFORMASI JASA LUKIS =====");
        System.out.println("Nama Jasa   : " + namaJasa);
        System.out.println("Alamat      : " + alamat);
        System.out.print("Daftar Barang yang Dapat Dipesan: ");
        for (String b : daftarBarang) {
            System.out.print(b + " ");
        }
        System.out.println("\n================================\n");
    }

    // Getter agar inner class di file lain tetap bisa akses nama jasa
    public String getNamaJasa() {
        return namaJasa;
    }
}
