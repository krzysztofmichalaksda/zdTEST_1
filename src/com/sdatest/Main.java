package com.sdatest;

public class Main {

    public static void main(String[] args) {
        String hello = ", jestem twoim programem.";
        int age = 55;
        boolean isChild = age < 18;
        if (isChild) {
            System.out.print("Cześć");
        } else if (age >= 18 && age < 50) {
            System.out.print("Witaj");
        } else {
            System.out.print("Dzień dobry");
        }
        System.out.println(hello);

        String partOfDay = "południe";
        String niceString = "Miłego";
        switch (partOfDay) {
            case "poranek":
                niceString = "Miłeg dnia.";
                break;
            case "południe":
                niceString = "Udanego popołudnia.";
                break;
            case "wieczór":
                niceString = "Spokojnego wieczoru.";
                break;
        }
        System.out.println(niceString);
    }
}
