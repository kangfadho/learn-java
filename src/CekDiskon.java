public class CekDiskon {
    public static void main(String[] args) {
        int totalBelaja = 500_000;

        // ===================

        System.out.println("\n==Studi kasus 01 — Sistem Diskon Toko ==");
        if (totalBelaja < 100_000) {
            System.out.println("Tidak Mendapatkan Diskon");
        } else if (totalBelaja <= 499_999 ) {
            System.out.println("Mendapatkan Diskon 5%");
        } else{
            System.out.println("Mendapatkan diskon 10%");
        }
    }
}
