// ANGGOTA 3: Main Program
public class Main {
    public static void main(String[] args) {
        System.out.println("=== PROGRAM KONVEKSI BONEKA ===\n");
        
        KonveksiBoneka konveksi1 = new KonveksiBoneka(
            "Boneka Lucu Collection", 
            "Bandung", 
            "Boneka Beruang"
        );
        
        KonveksiBoneka.Produksi produksi1 = new KonveksiBoneka.Produksi(
            "Desi Anggraeni",
            150,
            7,
            25000.0
        );
        
        konveksi1.tampilkanInfoKonveksi();
        produksi1.tampilkanProduksi();
        
        hitungBiayaTotal(produksi1);
        
        System.out.println("\n=== PRODUKSI KEDUA ===");
        
        KonveksiBoneka.Produksi produksi2 = new KonveksiBoneka.Produksi(
            "Rina Melati",
            200,
            10,
            30000.0
        );
        
        produksi2.tampilkanProduksi();
        hitungBiayaTotal(produksi2);
    }
    
    // Method untuk menghitung biaya total
    public static void hitungBiayaTotal(KonveksiBoneka.Produksi produksi) {
        double biayaTotal = produksi.getBiayaProduksi() * produksi.getJumlahBoneka();
        System.out.println("💵 BIAYA TOTAL PRODUKSI: Rp " + biayaTotal);
        System.out.println("=================================\n");
    }
}