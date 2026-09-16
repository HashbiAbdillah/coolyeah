import java.util.Scanner;

public class prak1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai1, nilai2;
        double hasilJml, hasilKrg, hasilKli, hasilBgi;
        System.out.print("Masukkan nilai pertama: ");
        nilai1 = input.nextInt();
        System.out.print("Masukkan nilai kedua: ");
        nilai2 = input.nextInt();
        hasilJml = (double) nilai1 + nilai2;
        System.out.println("Hasil penjumlahan: " + hasilJml);
        hasilKrg = (double) nilai1 - nilai2;
        System.out.println("Hasil penjumlahan: " + hasilKrg);
        hasilKli = (double) nilai1 * nilai2;
        System.out.println("Hasil penjumlahan: " + hasilKli);
        hasilBgi = (double) nilai1 / nilai2;
        System.out.println("Hasil penjumlahan: " + hasilBgi);
    }  
}
//Hashbi Abdillah
//265150600111022
