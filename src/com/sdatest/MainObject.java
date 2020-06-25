package com.sdatest;

public class MainObject {
    public static void main(String[] args) {
        Person firstPerson = new Person("Krzysztof", "Michalak", 30);
        Person secondPerson = new Person("Jan", "Nowak", 50);
        firstPerson.hello();
        secondPerson.hello();
        if (firstPerson.getAge() == 30) {
            firstPerson.setAge(31);
        }
        System.out.println("Wiek pierwszej osoby po zmianie: " + firstPerson.getAge());
        System.out.println(firstPerson.getFirstCharOfName());
    }
}
