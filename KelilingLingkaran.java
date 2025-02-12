
    import java.util.Scanner;

public class KelilingLingkaran {
    // Metode static untuk menghitung keliling lingkaran
    static double hitungKeliling(double radius) {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input radius dari pengguna
        System.out.print("Masukkan jari-jari lingkaran: ");
        double radius = scanner.nextDouble();
        
        // Menghitung dan menampilkan hasil keliling lingkaran
        double keliling = hitungKeliling(radius);
        System.out.println("Keliling lingkaran adalah: " + keliling);
        
        scanner.close();
    }
}

