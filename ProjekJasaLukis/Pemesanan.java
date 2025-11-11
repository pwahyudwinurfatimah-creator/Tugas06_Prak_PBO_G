
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
