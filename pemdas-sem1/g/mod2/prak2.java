package mod2;

import java.util.Scanner;

public class prak2 {
    public static void main(String[] args) {
        double imt, bb, tb;
        Scanner in = new Scanner(System.in);
        System.out.println("masukan berat badan (kg)");
        bb = in.nextDouble();
        System.out.println("masukan tinggi badan (cm)");
        tb = in.nextDouble();
        imt = bb/(tb*tb);
        
        if (imt<=18.5) {
            System.out.println("kurus");
        }
        else if (imt<=25) {
            System.out.println("normal");
        }
        else if (imt <=30) {
            System.out.println("gemuk");
        }
        else {
            System.out.println("kegemukan");
        }
    }
}
