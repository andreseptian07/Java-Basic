package com.xirpldua.percabangan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soal1b {
    public static void main(String[] args) {
        int nilaiPertama, nilaiKedua, nilaiKetiga;

        BufferedReader baca = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Aplikasi Nilai");
        try {
            System.out.println("Masukan Nilai Pertama : ");
            nilaiPertama = Integer.parseInt(baca.readLine());
            System.out.println("Masuka Nilai Kedua : ");
            nilaiKedua = Integer.parseInt(baca.readLine());
            System.out.println("Masukan Nilai Ketiga : ");
            nilaiKetiga = Integer.parseInt(baca.readLine());

            int ratata = (nilaiPertama + nilaiKedua + nilaiKetiga) / 3;

            if (ratata >= 60) {
                System.out.println("Nila Rata-rata dari : "
                        +nilaiPertama + ", " + nilaiKedua + ", " + nilaiKetiga + " adalah "
                        + ratata);
                System.out.println(":-)");
            } else {
                System.out.println("Nila Rata-rata dari : "
                        +nilaiPertama + ", " + nilaiKedua + ", " + nilaiKetiga + " adalah "
                        + ratata);
                System.out.println(":-(");
            }


        } catch (IOException e){
            System.out.println("error");
        }
    }
}
