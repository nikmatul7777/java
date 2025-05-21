package com.pelajar;

import java.util.Scanner;

public class DataSiswaArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menentukan jumlah siswa
        System.out.print("Masukkan jumlah siswa: ");
        int jumlah = input.nextInt();
        input.nextLine(); // Buang newline

        // Deklarasi array
        String[] nama = new String[jumlah];
        int[] umur = new int[jumlah];
        String[] kelas = new String[jumlah];

        // Input data siswa
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMasukkan data siswa ke-" + (i + 1));
            System.out.print("Nama  : ");
            nama[i] = input.nextLine();

            System.out.print("Umur  : ");
            umur[i] = input.nextInt();
            input.nextLine(); // Buang newline

            System.out.print("Kelas : ");
            kelas[i] = input.nextLine();
        }

        // Menampilkan data siswa
        System.out.println("\n=== Daftar Siswa ===");
        System.out.println("No\tNama\tUmur\tKelas");
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i+1) + "\t" + nama[i] + "\t" + umur[i] + "\t" + kelas[i]);
        }

        input.close();
    }
}
