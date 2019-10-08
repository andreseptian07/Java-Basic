package com.xirpldua.inputoutput;

import java.util.Scanner;

public class InputOutputScanner {
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);

        System.out.println("Contoh Program Input Output Sederhana");

        System.out.println("Masukan Angka Pertama : ");
        int angkaPertama = baca.nextInt();

        System.out.println("Masukan Angka Ke Dua : ");
        int angkaKedua = baca.nextInt();

        int hasil = angkaPertama + angkaKedua;

        System.out.println("Hasil dari "
                + angkaPertama
                + " + "
                + angkaKedua
                + " adalah "
                + hasil );
    }
}
