import java.util.*;
import java.lang.Math;

public class tes {
    
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double durasi;
        String member;
        int mtr, mbl;
        int tarif, jenisKendaraan, status, totknd;

        mtr = 0;
        mbl = 0;
        System.out.println("Nyalakan Sistem? (1 untuk ON , 0 untuk OFF)");
        status = input.nextInt();
        while (status == 1) {
            System.out.println("Masukkan jenis kendaraan(1/2)");
            jenisKendaraan = input.nextInt();
            System.out.println("Masukkan durasi parkir");
            durasi = input.nextDouble();
            System.out.println("Apakah anda terdaftar member?(ya/tidak)");
            member = input.nextLine();
            while (!member.equals("ya") && !member.equals("tidak")) {
                System.out.println("Jawab dengan kata (ya / tidak)");
                member = input.nextLine();
            }
            if (jenisKendaraan == 1) {
                mtr = mtr + 1;
                tarif = (int) (2000 + durasi - 1 * 1000);
            } else {
                mbl = mbl + 1;
                tarif = (int) (5000 + durasi - 1 * 2000);
            }
            if (durasi > 24) {
                System.out.println("ANDA DIKENAKAN DENDA INAP SEBESAR Rp 50.000");
                tarif = tarif + 500000;
            }
            if (member.equals("ya")) {
                tarif = tarif - 2000;
            }
            System.out.println("Tarif parkir sebanyak : " + tarif);
            System.out.println("Lanjut ga bos?(0 untuk tidak/1 untuk lanjut)");
            status = input.nextInt();
        }
        totknd = mtr + mbl;
        System.out.println("Jumlah kendaraan yang masuk : " + totknd);
        System.out.println("Jumlah motor yang parkir : " + mtr);
        System.out.println("Jumlah mobil yang parkir : " + mbl);
    }
}

