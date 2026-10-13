public class OperasiMatematika {

    public static void main(String[] args){
        int hargaKopi = 18000;
        int jumlahBeli =7;
        int diskon = 16000;
        int jumlahOrang =4;

        int totalBayar = hargaKopi * jumlahBeli - diskon;
        int bayarPerorang = totalBayar / jumlahOrang;
        int sisaUang = totalBayar % jumlahOrang;

        System.out.println("\n=== Kasir & Split Bill Nongkrong ===");
        System.out.println("");
        System.out.println("Total Bayar : "+totalBayar);
        System.out.println("Bayar /Orang : "+bayarPerorang);
        System.out.println("Sisa Uang : " + sisaUang);

    }
}