import java.util.Scanner;

public class InputBelanja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan total belanja : " );
        int totalBelanja = input.nextInt();

        // ============

        if (totalBelanja < 100_000) {
            System.out.println("Tidak mendapat diskon");
        } else if (totalBelanja <= 499_999) {
            System.out.println("Mendapatkan diskon 5%");
        } else {
            System.out.println("Mendapatkan diskon 10%");
        }
    }
}
