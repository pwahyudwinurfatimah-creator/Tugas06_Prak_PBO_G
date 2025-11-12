package ProjekJasaLukis; // Pastikan package-nya sama kayak file JasaLukis

public class MainApp {

    public static void main(String[] args) {
        // 1. Siapin array barang dulu (Syarat Constructor JasaLukis)
        String[] listBarang = {"Tas Kanvas", "Sepatu", "Helm Fullface", "Jaket Denim"};

        // 2. Bikin Objek Toko (Outer Class)
        // Masukin: Nama Jasa, Alamat, Array Barang
        JasaLukis toko = new JasaLukis("Railene Custom Art", "Jl. Lenteng Agung No. 99", listBarang);

        // 3. Tampilkan Info Toko (Method Anggota 1)
        toko.tampilkanInfoJasa();

        System.out.println(">>> MEMULAI SIMULASI TRANSAKSI <<<\n");

        // 4. Bikin 2 Pesanan (Tugas Anggota 3)
        // Kita pake method 'buatPemesanan' yang udah ditanam di JasaLukis tadi
        // Perhatikan tipe datanya: JasaLukis.Pemesanan
        JasaLukis.Pemesanan order1 = toko.buatPemesanan("Budi", "Helm Fullface", "Motif Gundam", 850000);
        JasaLukis.Pemesanan order2 = toko.buatPemesanan("Siti", "Sepatu", "Bunga Daisy", 350000);

        // 5. Tampilkan Detail Pesanan (Panggil Method Anggota 2 / Punya Lu)
        order1.tampilkanDetailPemesanan();
        order2.tampilkanDetailPemesanan();

        // 6. Hitung Total Biaya (Logika Anggota 3)
        // Kita akses atribut .harga langsung dari objek order
        double totalPendapatan = order1.harga + order2.harga;

        System.out.println("\n=== LAPORAN KEUANGAN ===");
        System.out.println("Jumlah Pesanan  : 2");
        System.out.println("Total Pemasukan : Rp " + (long)totalPendapatan);
        System.out.println("========================");
    }
}