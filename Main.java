public class Main {
    public static void main(String[] args) {

        // Defines the current year to calculate age
        int currentYear = 2025;

        // Creates new object: dog1
        Dog dog1 = new Dog("Red", "Clifford", 1962);
        // Prints atrributes of dog1
        System.out.println("Name: " + dog1 + ", Fur Color: " + dog1.furColor + ", Born: " + dog1.birthYear + ", Age: "
                + dog1.age(currentYear));
        // Creates new object: dog2
        Dog dog2 = new Dog("White", "Bone", 2021);
        // Prints atrributes of dog2
        System.out.println("Name: " + dog2 + ", Fur Color: " + dog2.furColor + ", Born: " + dog2.birthYear + ", Age: "
                + dog2.age(currentYear));
        // Creates new object: dog3
        Dog dog3 = new Dog("Brown", "Berry", 2024);
        // Prints atrributes of dog3
        System.out.println("Name: " + dog3 + ", Fur Color: " + dog3.furColor + ", Born: " + dog3.birthYear + ", Age: "
                + dog3.age(currentYear));

    }

}
