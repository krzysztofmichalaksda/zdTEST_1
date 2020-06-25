package com.sdatest;

public class Person {
    String name;
    String lastName;
    private int age;
    public Person(String givenName, String givenLastName, int givenAge) {
        name = givenName;
        lastName = givenLastName;
        age = givenAge;
    }

    public void hello()
    {
        System.out.println("Witaj " + name + " " + lastName + ".");
        System.out.println("Jak się miewasz?");
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public int getAge() {
        return age;
    }

    public char getFirstCharOfName()
    {
        char firstChar = name.charAt(0);

        return firstChar;
    }
}
