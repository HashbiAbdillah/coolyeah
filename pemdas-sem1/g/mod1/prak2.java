import java.util.Scanner;

public class prak2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kwhAwal, kwhAkhir, biayaBeban, ppj,tarifppj, tarif, totPemakaian,totTarif, panjangSisi=20;
        String nama, kelurahan, garisSisi= "=".repeat(panjangSisi) ;
        System.out.print("Masukkan Nama: ");
        nama = input.nextLine();
        System.out.print("Masukkan kelurahan: ");
        kelurahan = input.nextLine();
        System.out.print("Masukkan Kwh Awal: ");
        kwhAwal = input.nextInt();
        System.out.print("Masukkan Kwh Akhir: ");
        kwhAkhir = input.nextInt();
        System.out.print("Masukkan biaya beban: ");
        biayaBeban = input.nextInt();
        System.out.print("Masukkan ppj: ");
        ppj = input.nextInt();
        //Hashbi Abdillah
        //265150600111022
        totPemakaian = kwhAkhir - kwhAwal;
        tarif = totPemakaian * biayaBeban;
        tarifppj= tarif*ppj/100;
        totTarif= tarif + tarifppj;

        String  textHeader ="PLN" + kelurahan, header = garisSisi + textHeader + garisSisi, footer="=".repeat(header.length());

        System.out.printf("%s%n", header) ;
        System.out.println("Nama: " + nama);
        System.out.println("Kelurahan: " + kelurahan);
        System.out.println("Total pemakaian bulan ini: " + totPemakaian);
        System.out.println("Tarif listrik: " + tarif);
        System.out.printf("PPJ %d%%: " + tarifppj + "%n", ppj);
        System.out.println("Total bayar: " + totTarif);
        
        System.out.printf("%s%n", footer);
        input.close();
    }
}
