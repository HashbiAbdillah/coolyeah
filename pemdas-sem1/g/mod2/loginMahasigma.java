package mod2;
import java.util.Scanner;
public class loginMahasigma {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] nama = {"Andi", "Budi", "Citra"};
        String[] password = {"12345", "budi123", "citra456"};
        String[] nim = {"261001", "261002", "261003"};
        String[] jurusan = {"TIF", "SI", "PTI"};
        String[] alamat = {"Malang", "Surabaya", "Jakarta"};

        System.out.println("=== DAFTAR AKUN ===");

        System.out.print("Masukkan nama: ");
        String namaInput = input.nextLine();
        System.out.print("Masukkan password: ");
        String passwordInput = input.nextLine();

        boolean ditemukan = false;

        for (int i = 0; i < nama.length; i++) {
            if (namaInput.equals(nama[i]) && passwordInput.equals(password[i])) {
                ditemukan = true;

                System.out.println("\n=== BIODATA MAHASISWA ===");
                System.out.println("Nama    : " + nama[i]);
                System.out.println("NIM     : " + nim[i]);
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
