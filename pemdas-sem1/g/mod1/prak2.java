import java.util.Scanner;

public class prak2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            int kwhAwal, kwhAkhir, biayaBeban, ppj;
            String nama, kelurahan;
            System.out.print("Masukkan Nama: ");
            nama = input.next();
            System.out.print("Masukkan kelurahan: ");
            kelurahan = input.next();
            System.out.print("Masukkan Kwh Awal: ");
            kwhAwal = input.nextInt();
            System.out.print("Masukkan Kwh Akhir: ");
            kwhAkhir = input.nextInt();
            System.out.print("Masukkan biaya beban: ");
            biayaBeban = input.nextInt();
            System.out.print("Masukkan ppj: ");
            ppj = input.nextInt();
        System.out.printf("%30s%c", "PLN JAVA",'=');
    }
}
