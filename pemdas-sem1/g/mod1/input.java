import java.util.Scanner;

public class input {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai1, nilai2, hasil;
        String nama, nim;
        System.out.print("Masukkan nilai pertama: ");
        nilai1 = input.nextInt();
        System.out.print("Masukkan nilai kedua: ");
        nilai2 = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan nama: ");
        nama = input.nextLine();
        System.out.print("Masukkan nim: ");
        nim = input.nextLine();
        hasil =  nilai1 + nilai2;
        System.out.println("Hasil penjumlahan: " + hasil);
        System.out.println("nama: " + nama);
        System.out.println("nim: " + nim);
        }
}



















        // double nilai3,  hasil;

        // nilai3 = input.nextDouble();
        // hasil = (double)nilai1 + nilai2 + nilai3;
