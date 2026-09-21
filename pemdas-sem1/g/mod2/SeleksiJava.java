package mod2;
import java.util.Scanner;
public class SeleksiJava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("masukan nilai: ");
        int nilai = in.nextInt();
        if (nilai > 60)
            System.out.println("anda lulus");
        else if (nilai >= 40) 
            System.out.println("Anda harus mengulang");
        else {
            System.out.println("anda gagal");
        }
    }
}
