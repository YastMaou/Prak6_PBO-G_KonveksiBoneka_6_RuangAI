// ANGGOTA 2: Static Nested Class Produksi
public class KonveksiBoneka {
    // ... (kode dari Anggota 1 tetap dipertahankan)
    
    // STATIC NESTED CLASS PRODUKSI
    public static class Produksi {
        // Atribut produksi
        private String namaDesainer;
        private int jumlahBoneka;
        private int estimasiHari;
        private double biayaProduksi;
        
        // Constructor
        public Produksi(String namaDesainer, int jumlahBoneka, int estimasiHari, double biayaProduksi) {
            this.namaDesainer = namaDesainer;
            this.jumlahBoneka = jumlahBoneka;
            this.estimasiHari = estimasiHari;
            this.biayaProduksi = biayaProduksi;
        }
        
        // Method tampilkan info produksi
        public void tampilkanProduksi() {
            System.out.println("=== INFO PRODUKSI ===");
            System.out.println("Nama Desainer: " + namaDesainer);
            System.out.println("Jumlah Boneka: " + jumlahBoneka + " pcs");
            System.out.println("Estimasi Hari: " + estimasiHari + " hari");
            System.out.println("Biaya Produksi per Boneka: Rp " + biayaProduksi);
            System.out.println("--------------------");
        }
        
        // Getter untuk perhitungan (Anggota 3 akan pakai)
        public int getJumlahBoneka() {
            return jumlahBoneka;
        }
        
        public double getBiayaProduksi() {
            return biayaProduksi;
        }
    }
}