import java.util.Scanner;

public class operatortes {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        int nilaiMTK, nilaiENG, fisika;

        System.out.print("Masukkan nilai MTK : ");
        nilaiMTK = ns.nextInt();

        System.out.print("Masukkan nilai English : ");
        nilaiENG = ns.nextInt();

        System.out.print("Masukkan nilai fisika : ");
        fisika = ns.nextInt();

        if (nilaiMTK == 75 && nilaiENG != 75) {
            System.out.println("Lulus");
        } else  {
            System.out.println("Tidak lulus lulus");
        }

        if (nilaiENG > 90 || fisika < 75) {
            System.out.println("Anda pintar");
        } else {
            System.out.println("harus lebih pintar");
        }

        ns.close();
    }
}
