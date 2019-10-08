package com.xirpldua.pengulangan;

public class PengulanganForBersarang {
    public static void main(String[] args) {
        int a = 5;
        for (int i = 0; i <= a; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
