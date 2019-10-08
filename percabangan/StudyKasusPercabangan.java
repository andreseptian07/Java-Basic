package com.xirpldua.percabangan;

import java.util.Scanner;

public class StudyKasusPercabangan {
    public static void main(String[] args) {
        int ulanganHarian, uts, uas, tugas, kehadiran;
        double nilaiRaport;
        char indexPrestasi;

        Scanner input = new Scanner(System.in);

        System.out.println("APLIKASI NILAI RAPORT");
        System.out.println("=====================");

        System.out.println("Masukan Nilai Ulangan Harian : ");
        ulanganHarian = input.nextInt();

        System.out.println("Masukan Nilai Tugas : ");
        tugas = input.nextInt();

        System.out.println("Masukan Nilai Kehadiran : ");
        kehadiran = input.nextInt();

        System.out.println("Masukan Nilai UTS : ");
        uts = input.nextInt();

        System.out.println("Masukan Nilai UAS : ");
        uas = input.nextInt();

        nilaiRaport = (ulanganHarian*20/100)
                + (uts*20/100)
                + (tugas*20/100)
                + (kehadiran*10/100)
                + (uas*30/100);

        if (nilaiRaport >= 90 ) {
            indexPrestasi = 'A';
        } else if (nilaiRaport >= 80) {
            indexPrestasi = 'B';
        } else if (nilaiRaport >= 70) {
            indexPrestasi = 'C';
        } else if (nilaiRaport >=60) {
            indexPrestasi = 'D';
        } else {
            indexPrestasi = 'E';
        }

        System.out.println("Nilai Ulangan Harian : " + ulanganHarian);
        System.out.println("Nilai Tugas          : " + tugas);
        System.out.println("Nilai Kehadiran      : " + kehadiran);
        System.out.println("Nilai UTS            : " + uts);
        System.out.println("Nilai UAS            : " + uas );
        System.out.println("Nilai Raport Anda Adalah : " + nilaiRaport);
        System.out.println("Indeks Prestasi Anda Adalah : " + indexPrestasi);

    }
}
