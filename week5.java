import java.util.Scanner;

public class week5 {
    public static void main(String[] args) {
        
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        double alas;
        double tinggi;
        double luas;
        double sisiA, sisiB, sisiC;
        double keliling;

        System.out.print("masukan alas :");
        alas = myObj.nextDouble();

        System.out.print("masukan tinggi :");
        tinggi = myObj.nextDouble();

        luas = 0.5 * alas * tinggi;

        System.out.print("Luas segitiga :" + luas);

        System.out.println("");

        System.out.print("masukan sisi A :");
        sisiA = myObj.nextDouble();
        System.out.print("masukan sisi B :");
        sisiB = myObj.nextDouble();
        System.out.print("masukan sisi C :");
        sisiC = myObj.nextDouble();

        keliling = sisiA + sisiB + sisiC;

        System.out.print("Keliling segitiga :" + keliling);

        myObj.close();

    }
}