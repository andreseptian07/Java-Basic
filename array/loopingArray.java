package com.xirpldua.array;

public class loopingArray {
    public static void main(String[] args) {
        int[] data = new int[1000];

        for (int x = 0; x < data.length; x++ ) {
            data[x] = x + 1;
            System.out.println(data[x]);
        }
    }

}
