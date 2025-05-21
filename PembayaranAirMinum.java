package com.pelajar;


    import java.util.Scanner;

public class PembayaranAirMinum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SISTEM PEMBAYARAN AIR MINUM ===");

        // Input data pelanggan
        System.out.print("Masukkan Kode Pelanggan     : ");
        String kodePelanggan = scanner.nextLine();

        System.out.print("Masukkan Nama Pelanggan     : ");
        String namaPelanggan = scanner.nextLine();

        System.out.print("Masukkan Jumlah Pemakaian Air (m³): ");
        double pemakaian = scanner.nextDouble();

        // Menentukan tarif dan golongan
        double tarif;
        String golongan;
        if (pemakaian <= 10) {
            tarif = 1200;
            golongan = "A";
        } else if (pemakaian <= 20) {
            tarif = 1600;
            golongan = "B";
        } else if (pemakaian <= 30) {
            tarif = 2000;
            golongan = "C";
        } else {
            tarif = 2500;
            golongan = "D";
        }

        // Perhitungan biaya
        double totalBiaya = pemakaian * tarif;
        double pajak = totalBiaya * 0.1;
        double totalPembayaran = totalBiaya + pajak;

        // Output hasil
        System.out.println("\n=== RINCIAN PEMBAYARAN ===");
        System.out.println("Kode Pelanggan   : " + kodePelanggan);
        System.out.println("Nama Pelanggan   : " + namaPelanggan);
        System.out.println("Pemakaian        : " + pemakaian + " m³");
        System.out.println("Golongan Tarif   : " + golongan);
        System.out.println("Tarif per m³     : Rp " + tarif);
        System.out.println("Total Biaya      : Rp " + totalBiaya);
        System.out.println("Pajak (10%)      : Rp " + pajak);
        System.out.println("-------------------------------");
        System.out.println("Total Pembayaran : Rp " + totalPembayaran);

        // Peringatan jika boros
        if (pemakaian > 30) {
            System.out.println("⚠️  Anda termasuk pemakaian tinggi, harap hemat air.");
        }

        scanner.close();
    }
}


