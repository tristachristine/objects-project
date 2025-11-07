// Created by trista.yaskus@malad.us
// Created for Software and Programming Dev 1
// Part one of Objects Project

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Dog implements Comparable<Dog> {

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

    @Override
    public int compareTo(Dog otherDog) {
        return this.furColor.compareTo(otherDog.furColor);
    }

    // Subclass for comparing the dogs
    class Comparison {
        public static void main(String args[]) {
            ArrayList<Dog> dogList = new ArrayList<Dog>();
            dogList.add(new Dog("Red", "Clifford", 1962));
            dogList.add(new Dog("White", "Bone", 2021));
            dogList.add(new Dog("Brown", "Berry", 2024));
            dogList.add(new Dog("Black & Gray", "Rocky", 2006));

            Collections.sort(dogList);

            Iterator<Dog> iterator = dogList.iterator();
            while (iterator.hasNext()) {
                Dog dog = iterator.next();
                System.out.println("Color: " + dog.furColor + ", Age: " + dog.birthYear); // Grabs and prints attributes
                                                                                          // of the dog
            }
        }
    }
}