public class Main {
    public static void main(String[] args) {
        ngitung();  
        biodata();
    }
    public static void biodata(){
        //string
        String nama = "Hashbi Abdillah";
        String prodi = "Pendidikan Teknologi Informasi";
        String asal = "SMKN 1 Agartha";
        System.out.println("Nama saya " + nama + ". prodi saya " + prodi + ". Asal sekolah saya " + asal);
    }
    public static void ngitung(){
        //operasi int   
        int x = 18;
        int y = 9;
        int hasil = x + y;
        int hasilkrg = x - y;
        int hasilkli = x * y;
        int hasilbgi = x / y;
        System.out.println("hasil tambah " + x + " dan " + y + " adalah " + hasil);
        System.out.println("Hasil kurang dari " + x + " dan " + y + " adalah " + hasilkrg);
        System.out.println("Hasil kali dari " + x + " dan " + y + " adalah " + hasilkli);
        System.out.println("Hasil bagi dari " + x + " dan " + y + " adalah " + hasilbgi);
    }
    
}

