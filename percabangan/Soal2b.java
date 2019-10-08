package com.xirpldua.percabangan;

import java.util.Scanner;

public class Soal2b {
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        System.out.println("Masukan angka 1 - 10");
        int a = baca.nextInt();

        if (a == 1) {
            System.out.println("satu");
        } else if (a == 2) {
            System.out.println("dua");
        } else if (a == 3) {
            System.out.println("tiga");
        } else if (a == 4) {
            System.out.println("empat");
        } else if (a == 5) {
            System.out.println("lima");
        } else if (a == 6) {
            System.out.println("enam");
        } else if (a == 7) {
            System.out.println("tujuh");
        } else if (a == 8) {
            System.out.println("delapan");
        } else if (a == 9) {
            System.out.println("sembilan");
        } else if (a == 10) {
            System.out.println("sepuluh");
        } else {
            System.out.println("Invalid Number");
        }
    }
}
