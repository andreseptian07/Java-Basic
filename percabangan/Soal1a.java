package com.xirpldua.percabangan;

import javax.swing.*;

public class Soal1a {
    public static void main(String[] args) {
        int a,b,c;
        double ratata;

        String value1 = JOptionPane.showInputDialog("Masukan Angka Pertama : ");
        a = Integer.parseInt(value1);

        String value2 = JOptionPane.showInputDialog("Masukan Angka Kedua : ");
        b = Integer.parseInt(value2);

        String value3 = JOptionPane.showInputDialog("Masukan Angka Ketiga : ");
        c = Integer.parseInt(value3);

        ratata = (a+b+c)/3;

        if (ratata >= 60) {
            JOptionPane.showMessageDialog(null,
                    "Nilai Rata-rata dari "
                            + a + ", "
                            + b + " dan"
                            + c + " adalah \n"
                            + ratata + "\n:-)",
                    "Hasil Perhitungan", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Nilai Rata-rata dari "
                            + a + ", "
                            + b + " dan"
                            + c + " adalah \n"
                            + ratata + "\n:-(",
                    "Hasil Perhitungan", JOptionPane.INFORMATION_MESSAGE);
        }


    }
}
