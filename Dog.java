// Created by trista.yaskus@malad.us
// Created for Software and Programming Dev 1
// Part one of Objects Project

public class Dog {

    // Attributes of the object
    String furColor;
    String dogName;
    int birthYear;

    // Constructor for attributes
    public Dog(String color, String name, int year) {
        this.furColor = color;
        this.dogName = name;
        this.birthYear = year;
    }

    // Calculates the age of the dog
    public int age(int currentYear) {
        return currentYear - birthYear;

    }

    public String toString() {
        return dogName;

    };

    // Bark function
    public void bark() {
        System.out.println(dogName + " says 'woof!'");

    }
}