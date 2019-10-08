package com.xirpldua.operator;

import java.util.Scanner;

public class LatihanOperator {
    public static void main(String[] args) {
        int a, b, hasilPenjumlahan;
        System.out.println("Aplikasi Operator");
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Angka Pertama : ");
        a = input.nextInt();
        System.out.println("Masukan Angka Kedua : ");
        b = input.nextInt();
        System.out.println("Masukan Angka Ketiga : ");
        int c = input.nextInt();
        System.out.println("Masukan Angka Keempat : ");
        int d = input.nextInt();
        hasilPenjumlahan = a + b + c + d;
        int hasilPengurangan = a - b - c - d;
        int hasilPerkalian = a * b * c * d;
        double hasilPembagian = a / b / c / d;
        double rataRata = (a + b + c + d)/4;
        System.out.println("Hasil dari " + a + " + " + b + " + " + c + " + " + d + " adalah " + hasilPenjumlahan);
        System.out.println("Hasil dari " + a + " - " + b + " - " + c + " - " + d + " adalah " + hasilPengurangan);
        System.out.println("Hasil dari " + a + " x " + b + " x " + c + " x " + d + " adalah " + hasilPerkalian);
        System.out.println("Hasil dari " + a + " / " + b + " / " + c + " / " + d + " adalah " + hasilPembagian);
        System.out.println("Rata-rata dari " + a + " , " + b + " , " + c + " , " + d + " adalah " + rataRata);

    }
}
