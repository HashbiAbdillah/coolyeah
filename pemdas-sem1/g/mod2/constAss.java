package mod2;

import java.util.Scanner;

public class constAss {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = "filkom", nama, nim;
        String val = (s == "filkom")? "Brawijaya" : "null";
        
        do {
            System.out.println("masukan nama");
            nama = in.nextLine();
            System.out.println("masukan nim");
            nim = in.nextLine();
            if (nama.isEmpty() || nim.isEmpty()) {
                System.out.println("pastikan sudah memasukan nama dan nim");
            }
        } while (nama.isEmpty() || nim.isEmpty());
        System.out.println (s + "" + val);
        System.out.println(nama);
        System.out.println(nim);

        String[] namamhs = {"Andi", "Budi", "Citra"};
        String[] password = {"12345", "budi123", "citra456"};
        String[] nimmhs = {"261001", "261002", "261003"};
        String[] jurusan = {"TIF", "SI", "PTI"};
        String[] alamat = {"Malang", "Surabaya", "Jakarta"};
        boolean ditemukan = false;

        System.out.println("=== DAFTAR AKUN ===");
        System.out.print("Masukkan nama: ");
        String namaInput = in.nextLine();
        System.out.print("Masukkan password: ");
        String passwordInput = in.nextLine();

        for (int i = 0; i < namamhs.length; i++) {
            if (namaInput.equals(namamhs[i]) && passwordInput.equals(password[i])) {
                ditemukan = true;
                System.out.println("\n=== BIODATA MAHASISWA ===");
                System.out.println("Nama    : " + namamhs[i]);
                System.out.println("NIM     : " + nimmhs[i]);
                System.out.println("Jurusan : " + jurusan[i]);
                System.out.println("Alamat  : " + alamat[i]);
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("data tak ditemukan");
        }
    }
}
//Hashbi Abdillah
//265150600111022