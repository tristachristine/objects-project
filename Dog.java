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

}

public static void main(String[] args) {

    // Creates new object: dog1
    Dog dog1 = new Dog("Red", "Clifford", 1962);
    // Prints atrributes of dog1
    System.out.println("Name: " + dog1 + ", Fur Color: " + dog1.furColor + "Born: " + dog1.birthYear);

}
