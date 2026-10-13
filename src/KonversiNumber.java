import java.lang.reflect.Array;
import java.util.Arrays;

public class KonversiNumber {
    public static void main(String[] args){
        String nama;
        nama ="Muhammad Muhafadhoh";

        int umur;
        umur=20;

        // ===========


        System.out.println("Nama Saya : "+nama);
        System.out.println("Umur Saya : "+umur);

        if (umur >= 20) {
            System.out.println("saya Sudah Dewasa");
        } else {
            System.out.println("Saya Umur-nya masih mudah");
        }


        System.out.println("================\n");

        String[] teman = {
            "Riki", "Rafi", "Fauzan", "Abi", "Hendra"
        };

        System.out.println("dan saya memiliki teman : "+teman.length);
        System.out.println(teman[0]+ " " + teman[1]+" "+ teman[2]+" "+teman[3]+" "+teman[4]);
    }
}