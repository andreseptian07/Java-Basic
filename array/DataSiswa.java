package com.xirpldua.array;

import java.util.Scanner;

public class DataSiswa {
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        int data;
        String[] nis = new String[30];
        String[] nama = new String[30];
        String[] kelas = new String[30];
        String[] alamat = new String[30];
        int[] nilaiUH = new int[30];
        int[] nilaiUTS = new int[30];
        int[] nilaiUAS = new int[30];
        int[] nilaiTugas = new int[30];
        int[] nilaiAkhir = new int[30];
        String[] indexNilai = new String[30];

        System.out.println("Aplikasi Nilai Siswa");
        System.out.println("===========INPUTAN============");
        System.out.print("Berapa data yang akan di inputkan ? ");
        data = baca.nextInt();

        for (int a = 1; a <= data; a++) {
            System.out.println("-----Data ke-" + a + "------");
            nis[a] = baca.nextLine();
            System.out.print("NIS        = ");
            nis[a] = baca.nextLine();
            System.out.print("Nama Siswa = ");
            nama[a] = baca.nextLine();
            System.out.print("Kelas      = ");
            kelas[a] = baca.nextLine();
            System.out.print("Alamat     = ");
            alamat[a] = baca.nextLine();
            System.out.print("Nilai Ulangan Harian = ");
            nilaiUH[a] = baca.nextInt();
            System.out.print("Nilai UTS = ");
            nilaiUTS[a] = baca.nextInt();
            System.out.print("Nilai UAS = ");
            nilaiUAS[a] = baca.nextInt();
            System.out.print("Niai Tugas = ");
            nilaiTugas[a] = baca.nextInt();

            int nilai = (nilaiUTS[a] + nilaiUAS[a] + nilaiUH[a] + nilaiTugas[a]) / 4;
            nilaiAkhir[a] = nilai;

            if (nilai < 50) {
                indexNilai[a] = "C";
            } else if (nilai < 80) {
                indexNilai[a] = "B";
            } else {
                indexNilai[a] = "C";
            }
            System.out.println("================================================");
            System.out.println("================================================");
        }

        System.out.println("==========OUTPUT==========");
        System.out.println("Banyaknya data : " + data);
        for (int a = 1; a <= data; a++) {
            System.out.println("====== Data Siswa Ke-" + a + "=========");
            System.out.println("NIS           : " + nis[a]);
            System.out.println("Nama          : " + nama[a]);
            System.out.println("Kelas         : " + kelas[a]);
            System.out.println("Alamat        : " + alamat[a]);
            System.out.println("Nilai Ulangan : " + nilaiUH[a]);
            System.out.println("Nilai UTS     : " + nilaiUTS[a]);
            System.out.println("Nilai UAS     : " + nilaiUAS[a]);
            System.out.println("Nilai Tugas   : " + nilaiTugas[a]);
            System.out.println("Nilai Akhir   : " + nilaiAkhir[a]);
            System.out.println("Index Nilai   : " + indexNilai[a]);
            System.out.println(" ");
        }
    }
}
