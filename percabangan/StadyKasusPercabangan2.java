package com.xirpldua.percabangan;


import java.util.Scanner;

public class StadyKasusPercabangan2 {
    public static void main(String[] args) {
        double pendapatan,
                uangJasa = 0,
                komisi = 0,
                total,
                totalKomisi;

        System.out.println("Aplikasi BONUS SALESMEN");
        System.out.println("========================");

        Scanner baca = new Scanner(System.in);

        System.out.println("Masukan Jumlah Pendapatan Salesmen : ");
        pendapatan = baca.nextInt();

        if (pendapatan <= 200000 && pendapatan > 0) {
            uangJasa = 10000;
            komisi = 0.1 * pendapatan;
        } else if (pendapatan > 200000 && pendapatan < 500000) {
            uangJasa = 20000;
            komisi = 0.15 * pendapatan;
        } else if (pendapatan >= 500000) {
            uangJasa = 30000;
            komisi = 0.20 * pendapatan;
        }

        totalKomisi = uangJasa + komisi;

        total = pendapatan + uangJasa + komisi;

        System.out.println("=====================================");
        System.out.println("Pendapatan Murni : Rp." + pendapatan);
        System.out.println("Uang Jasa        : Rp." + uangJasa);
        System.out.println("Komisi           : Rp." + komisi);
        System.out.println("Totla Komisi     : Rp." + totalKomisi);
        System.out.println("Total Pendapatan : Rp." + total);

    }
}
