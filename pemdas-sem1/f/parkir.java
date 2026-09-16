import java.util.Scanner;

public class parkir{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int durasi, jenisKend;
        int tarifMtr = 2000, tarifMbl = 5000;

        System.out.print("masukan durasi parkir:");
        durasi = input.nextInt();
        System.out.print("masukan jenis kendaraan (1/2):");
        jenisKend = input.nextInt();        

        while (durasi<0) {
            System.out.println("durasi tidak valid");
            System.out.print("masukan durasi parkir");
            durasi = input.nextInt();
        }
        while (jenisKend != 1 && jenisKend != 2) {
            System.out.println("jenis kendaraan tidak valid");
            System.out.print("masukan jenis kendaraan (1/2)");
             input.nextInt();
        }

        if (jenisKend == 1) {
            if (durasi >1) {
              tarifMtr = tarifMtr + (durasi-1)*1000; 
              System.out.println("total tarif= "+tarifMtr);       
            }
            else{
                System.out.println("tarif parkir= " + tarifMtr);
            }  
        }
        else
            if (durasi >1) {
              tarifMbl = tarifMbl + (durasi-1)*2000; 
              System.out.println("total tarif= "+tarifMbl);       
            }
            else{
                System.out.println("tarif parkir= " + tarifMbl);
            }
    }
}