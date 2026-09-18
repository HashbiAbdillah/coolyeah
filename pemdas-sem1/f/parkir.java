import java.lang.classfile.instruction.StackInstruction;
import java.util.Scanner;

public class parkir{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int durasi, jenisKend;
        int tarifMtr = 2000, tarifMbl = 5000, tarifCiv = 2000, tarif = 0;
        String civitas;

        System.out.print("masukan durasi parkir:");
        durasi = input.nextInt();
        while (durasi<0) {
            System.out.println("durasi tidak valid");
            System.out.print("masukan durasi parkir");
            durasi = input.nextInt();
        }

        System.out.print("masukan jenis kendaraan (1/2):");
        jenisKend = input.nextInt(); 
        while (jenisKend != 1 && jenisKend != 2) {
            System.out.println("jenis kendaraan tidak valid");
            System.out.print("masukan jenis kendaraan (1/2)");
            jenisKend = input.nextInt(); 
        }  
             
        System.out.print("apakah anda civitas? (y/n):");
        civitas = input.next();       
        while (!civitas.equalsIgnoreCase("y") && !civitas.equalsIgnoreCase("n")) {
            System.out.println("input tidak valid");
            System.out.print("apakah anda civitas? (y/n):");
            civitas = input.next();
        }

        if (jenisKend == 1) {
            tarif = tarifMtr + (durasi-1)*1000;       
        }
        else
            if (jenisKend == 2) {
              tarif = tarifMbl + (durasi-1)*2000;       
            }

        if (durasi >24) {
            tarif = 50000 + tarif;
        }
        
        if (civitas.equalsIgnoreCase("y")) {
            tarif = tarifCiv;
        }
        
        System.out.println("total tarif= " + tarif); 
    }
}