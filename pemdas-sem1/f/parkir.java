import java.util.Scanner;

public class parkir{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int durasi, jenisKend, civitas;
        int tarifMtr = 2000, tarifMbl = 5000, tarifCiv = 2000, tarif = 0;
        // boolean civ;

        System.out.print("masukan durasi parkir:");
        durasi = input.nextInt();
        while (durasi<0) {
            System.out.println("durasi tidak valid");
            System.out.print("masukan durasi parkir");
            durasi = input.nextInt();
        }

        // System.out.print("masukan jenis kendaraan (1/2):");
        // jenisKend = input.nextInt(); 
        do {
            System.out.print("masukan jenis kendaraan (1/2):");
            jenisKend = input.nextInt();
        }
        while (jenisKend != 1 || jenisKend != 2); {
            System.out.println("jenis kendaraan tidak valid");
            // System.out.print("masukan jenis kendaraan (1/2)");
            // jenisKend = input.nextInt(); 
        }  
        
             
        System.out.print("apakah anda civitas? (tidak=0 ya=1):");
        civitas = input.nextInt();       
        while (civitas != 0 && civitas != 1) {
            System.out.println("input tidak valid");
            System.out.print("apakah anda civitas? (tidak=0 ya=1):");
            civitas = input.nextInt();
        }

        // if (jenisKend == 1) {
        //     tarif = tarifMtr + (durasi-1)*1000;       
        // }
        // else {
        //       tarif = tarifMbl + (durasi-1)*2000;       
        //     }
        // kode if ini sama kaya switch, cuma beda penggunaan
        switch (jenisKend) {
            case 1:
                tarif = tarifMtr + (durasi-1)*1000;
                break;  
            default:
                 tarif = tarifMbl + (durasi-1)*2000;       
                break;
        }

        if (durasi >24) {
            tarif = 50000 + tarif;
        }
        
        if (civitas == 1) {
            tarif = tarifCiv;
        }
        
        System.out.println("total tarif= " + tarif); 

        // int i = 1;
        // for (; i >= 1; i++) {
        //     System.out.println(i);
        // }
    }
}