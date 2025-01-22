
    import java.util.Scanner;

public class TahunKabisat {
    public static void main(String[] args) {
        // Membuat scanner untuk input pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta input tahun dari pengguna
        System.out.print("Masukkan sebuah tahun: ");
        int tahun = scanner.nextInt();

        // Mengecek apakah tahun kabisat atau bukan
        if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
            System.out.println(tahun + " adalah tahun kabisat.");
        } else {
            System.out.println(tahun + " bukan tahun kabisat.");
        }

        // Menutup scanner
        scanner.close();
    }
}
    

