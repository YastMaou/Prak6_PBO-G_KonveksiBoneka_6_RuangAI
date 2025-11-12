
public class KonveksiBoneka {
    private String namaKonveksi;
    private String lokasi;
    private String jenisBoneka;
    
    // Constructor
    public KonveksiBoneka(String namaKonveksi, String lokasi, String jenisBoneka) {
        this.namaKonveksi = namaKonveksi;
        this.lokasi = lokasi;
        this.jenisBoneka = jenisBoneka;
    }
    
    // Method tampilkan info konveksi
    public void tampilkanInfoKonveksi() {
        System.out.println("=== INFO KONVEKSI ===");
        System.out.println("Nama Konveksi: " + namaKonveksi);
        System.out.println("Lokasi: " + lokasi);
        System.out.println("Jenis Boneka: " + jenisBoneka);
        System.out.println("--------------------");
    }
    
    // STRUCTURE UNTUK STATIC NESTED CLASS (Anggota 2 akan lengkapi)
    public static class Produksi {
    }
}