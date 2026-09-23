package mod2;

import java.util.Scanner;

public class prak3 {
    public static void main(String[] args) {
        int jamKerja, upah = 5000, lembur = 6000, denda = 1000, totupah = 0, totdenda = 0, totlembur = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("masukan jam kerja : ");
        jamKerja = in.nextInt();

        if (jamKerja < 50) {
            upah = jamKerja * upah;
            totdenda = (50-jamKerja) * denda;
            totupah =  upah - totdenda;
        }
        else if (jamKerja <= 60) {
            upah = jamKerja * upah;
            totupah = upah;
        }
        else if (jamKerja > 60) {
            upah = 60 * upah;
            totlembur = (jamKerja - 60) * lembur;
            totupah = upah + totlembur;
        }
        System.out.println("Upah = " + upah);
        System.out.println("Lembur = " + totlembur);
        System.out.println("Denda = " + totdenda);
        System.out.println("----------------------");
        System.out.println("Total upah = " + totupah);
        //Hashbi Abdillah
        //265150600111022
        in.close();
    }
}
