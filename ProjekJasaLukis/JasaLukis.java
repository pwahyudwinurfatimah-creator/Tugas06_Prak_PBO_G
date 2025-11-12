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


//Tugas Nomor 2 Railene
    public class Pemesanan{
        // Atribut pemesanan
        String namaPelanggan;
        String jenisBarang;
        String desainLukisan;
        double harga;

        // Constructor buat set data awal pas pesanan dibuat
        public Pemesanan(String namaPelanggan, String jenisBarang, String desainLukisan, double harga) {
            this.namaPelanggan = namaPelanggan;
            this.jenisBarang = jenisBarang;
            this.desainLukisan = desainLukisan;
            this.harga = harga;
        }

        // Method buat nampilin detail (sesuai soal)
        public void tampilkanDetailPemesanan() {
            System.out.println("\n--- NOTA PEMESANAN ---");
            // Mengakses atribut 'namaJasa' milik Class Luar (JasaLukis) - Ini syarat soalnya
            System.out.println("Jasa Lukis     : " + namaJasa); 
            System.out.println("Nama Pelanggan : " + namaPelanggan);
            System.out.println("Barang         : " + jenisBarang);
            System.out.println("Desain         : " + desainLukisan);
            System.out.println("Harga          : Rp " + harga);
            System.out.println("----------------------");
        }
    }

    public Pemesanan buatPemesanan(String nama, String jenis, String desain, double harga) {
        return new Pemesanan(nama, jenis, desain, harga);
    }
}