import java.util.Scanner;

public class testing {
    public static void main(String[] args) {

        Scanner ns = new Scanner(System.in);
        int hargaBlender;
        double totalHarga;
        String status;

        System.out.print("Masukan harga blender : ");
        hargaBlender = ns.nextInt();
        ns.nextLine();

        System.out.print("Masukan status member : ");
        status = ns.nextLine();

        if (status.contentEquals("ya") && hargaBlender > 500000) {
            System.out.println("Mendapat diskon 10%");
            totalHarga = hargaBlender - (hargaBlender * 0.10);
            System.out.println("Total harga : " + totalHarga);
        } else {
            if (status.contentEquals("tidak") && hargaBlender > 1000000) {
                System.out.println("Mendapat diskon 5%");
                totalHarga = hargaBlender - (hargaBlender * 0.05);
                System.out.println("Total harga : " + totalHarga);
            }
        }
        ns.close();
    }
}
