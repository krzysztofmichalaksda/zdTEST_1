package com.sdatest;

public class MainLoops {
    public static void main(String[] args) {
        int[] pricesTables = {1317, 1089, 1119};
        int[] pricesChairs = new int[]{123, 222, 317, 89, 119};
        for (int priceTable:pricesTables) {
            System.out.println(priceTable);
        }
        System.out.println("Ceny krzeseł:");
        for (int chairPrice:pricesChairs) {
            System.out.print(chairPrice + " ");
        }
    }
}
