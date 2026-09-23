package mod2;
import java.util.Scanner;

public class prak1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, r, x, y, keliling, luas;
        System.out.println("Menu:");
        System.out.println("1. Menghitung luas dan keliling persegi panjang:");
        System.out.println("2. Menghitung luas dan keliling lingkaran:");
        System.out.println("3. Menghitung luas dan keliling segitiga    :");
        int pilihan = in.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("masukan nilai panjang");
                a = in.nextInt();
                System.out.println("masukan nilai lebar");
                b = in.nextInt(); //Hashbi Abdillah
                luas = (a*b); //265150600111022
                keliling = (2 * (a + b)) ;
                System.out.println("luas = " + (int) luas);
                System.out.println("keliling = " + (int) keliling);
                break;
            case 2:
                System.out.println("masukan nilai jari jari");
                a = in.nextDouble();
                if (a % 7 == 0) {
                    luas = 22.0 / 7 * (a * a);
                    keliling = 2 * 22.0 / 7 * a;
                } else {
                    luas = 3.14 * (a * a);
                    keliling = 2 * 3.14 * a;
                }
                System.out.println("luas = " + luas);
                System.out.println("keliling = " + keliling);
                break;
            case 3:
                System.out.println("masukan nilai alas");
                a = in.nextInt();
                System.out.println("masukan nilai tinggi");
                b = in.nextInt();
                System.out.println("masukan nilai sisi 1");
                r = in.nextInt();
                System.out.println("masukan nilai sisi 2");
                x = in.nextInt();
                System.out.println("masukan nilai sisi 3");
                y = in.nextInt();
                luas = 1/2 * a*b;
                keliling = r + x + y;
                System.out.println("luas = " + (int)luas);
                System.out.println("keliling = " + (int)keliling);
                break;
            default:
                System.out.println("Data tidak ditemukan, program dihentikan");
                break;
        }
    }
}
