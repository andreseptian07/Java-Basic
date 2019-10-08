package com.xirpldua.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOutputBufferReader {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader baca = new BufferedReader(isr);

        System.out.println("Aplikasi Penjumlahan Sederhana");

        int angka1 = 0;
        int angka2 = 0;

        try {
            System.out.println("Masukan Angka Petama : ");
            angka1 = Integer.parseInt(baca.readLine());
            System.out.println("Masukan Angka Kedua : ");
            angka2 = Integer.parseInt(baca.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        int hasil = angka1 + angka2;
        System.out.println("Hasil dari "
                + angka1
                + " + "
                + angka2
                + " adalah "
                + hasil );
    }
}
