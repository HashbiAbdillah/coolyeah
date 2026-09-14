import java.util.Scanner;

public class input {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai1, nilai2;
        double nilai3,  hasil;
        System.out.print("Masukkan nilai pertama: ");
        nilai1 = input.nextInt();
        System.out.print("Masukkan nilai kedua: ");
        nilai2 = input.nextInt();
        System.out.print("Masukkan nilai ketiga: ");
        nilai3 = input.nextDouble();
        hasil = (double)nilai1 + nilai2 + nilai3;
        System.out.println("Hasil penjumlahan: " + hasil);
        }
}
