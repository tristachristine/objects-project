// Created by trista.yaskus@malad.us
// Created for Software and Programming Dev 1
// Part three of Objects Project

// Subclass for the existing dog class
public class GermanShepherd extends Dog {

    // Attributes of the object
    private String[] favoriteTreat; // Array for holding treat preferences
    private boolean serviceDog; // Determines whether or not it is a working dog

    // Constructor for Attributes
    public GermanShepherd(String furColor, String dogName, int birthYear, String[] treats, boolean working) {
        super(furColor, dogName, birthYear); // Borrows information from the main dog class
        this.favoriteTreat = treats;
        this.serviceDog = working;

    }

    public void addTreat(String dogTreat) {
        String[] newTreats = new String[favoriteTreat.length + 1]; // Creates a larger array
        System.arraycopy(favoriteTreat, 0, newTreats, 0, favoriteTreat.length); // Grabs content from the original array
        newTreats[favoriteTreat.length] = dogTreat;
        this.favoriteTreat = newTreats;
    }

    // Method to check if working dog
    public boolean isServiceDog() {
        return serviceDog;
    }
}
