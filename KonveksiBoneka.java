public class KonveksiBoneka {
    // CODE ANGGOTA 1 (KAMU)
    private String namaKonveksi;
    private String lokasi;
    private String jenisBoneka;

    public KonveksiBoneka(String namaKonveksi, String lokasi, String jenisBoneka) {
        this.namaKonveksi = namaKonveksi;
        this.lokasi = lokasi;
        this.jenisBoneka = jenisBoneka;
    }

    public void tampilkanInfoKonveksi() {
        System.out.println("=== INFO KONVEKSI ===");
        System.out.println("Nama Konveksi: " + namaKonveksi);
        System.out.println("Lokasi: " + lokasi);
        System.out.println("Jenis Boneka: " + jenisBoneka);
        System.out.println("--------------------");
    }

    // CODE ANGGOTA 2 (TAMBAHAN)
    public static class Produksi {
        private String namaDesainer;
        private int jumlahBoneka;
        private int estimasiHari;
        private double biayaProduksi;
        
        public Produksi(String namaDesainer, int jumlahBoneka, int estimasiHari, double biayaProduksi) {
            this.namaDesainer = namaDesainer;
            this.jumlahBoneka = jumlahBoneka;
            this.estimasiHari = estimasiHari;
            this.biayaProduksi = biayaProduksi;
        }
        
        public void tampilkanProduksi() {
            System.out.println("=== INFO PRODUKSI ===");
            System.out.println("Nama Desainer: " + namaDesainer);
            System.out.println("Jumlah Boneka: " + jumlahBoneka + " pcs");
            System.out.println("Estimasi Hari: " + estimasiHari + " hari");
            System.out.println("Biaya Produksi per Boneka: Rp " + biayaProduksi);
            System.out.println("--------------------");
        }
        
        public int getJumlahBoneka() { return jumlahBoneka; }
        public double getBiayaProduksi() { return biayaProduksi; }
    }
}
