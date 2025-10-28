// Created by trista.yaskus@malad.us
// Created for Software and Programming Dev 1
// Part three of Objects Project

public class Chihuahua {

    // Attributes of the object
    private String[] favoriteToy; // Array for holding toy preferences
    private boolean showDog; // Determines whether or not it is a show dog

    // Constructor for Attributes
    public Chihuahua(String furColor, String dogName, int birthYear, String[] toy, boolean showdog) {
        super(furColor, dogName, birthYear); // Borrows information from the main dog class
        this.favoriteToy = toy;
        this.showDog = showdog;

    }

    public void addToy(String dogToy) {
        String[] newToys = new String[favoriteToy.length + 1]; // Creates a larger array
        System.arraycopy(favoriteToy, 0, newToys, 0, favoriteToy.length); // Grabs content from the original array
        newToys[favoriteToy.length] = dogToy;
        this.favoriteToy = newToys;
    }

    // Method to check if working dog
    public boolean isShowDog() {
        return showDog;
    }
}
