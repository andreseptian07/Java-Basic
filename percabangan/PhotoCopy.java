package com.xirpldua.percabangan;
import java.util.Scanner;

public class PhotoCopy {
    public static void main(String[] args) {
        String pelanggan;
        int jml, harga, bayar;

        Scanner baca = new Scanner(System.in);

        System.out.print("Apakah anda pelanggan (Y/T) : ");
        pelanggan = baca.nextLine();

        if (pelanggan.equals("Y") || pelanggan.equals("y")) {
            System.out.print("Berapa Lembar Jumlah Foto Kopi ? ");
            jml = baca.nextInt();
            harga = 75;

        } else {
            System.out.print("Berapa Lembar Fotokopi ? ");
            jml = baca.nextInt();
            if (jml < 100) {
                harga = 200;
            } else if (jml > 100 && jml < 200) {
                harga = 150;
            } else {
                harga = 100;
            }
        }

        bayar = jml * harga;
        System.out.println(" ");
        System.out.println("========================");
        System.out.println("*** STRUK PEMBAYARAN ***");
        System.out.println("========================");
        System.out.println("Jumlah Fotokopi : " + jml + " Lembar");
        System.out.println("Harga perlembar : Rp." + harga);
        System.out.println("Jumlah Bayar : Rp." + bayar);
    }
}
