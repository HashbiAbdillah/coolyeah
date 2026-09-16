import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int luas, lebar;
        System.out.print("Masukkan luas: ");
        luas = in.nextInt();
        System.out.print("Masukkan lebar: ");
        lebar = in.nextInt();
        // char i= 'd';
        double panjang = (double) luas / lebar;
        System.out.printf("persegi panjang dengan luas x lebar (%d x %d) "+"memiliki Panjang = %.2f cm 2%n", luas , lebar, panjang);
        // System.out.println(panjang);
        // System.out.println(lebar);
        // System.out.println(luas);
        // // System.out.println(i);
    }
}

