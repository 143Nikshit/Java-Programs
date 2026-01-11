class Animal{
    String animalName;
    String animalType;
    int animalAge;
    String animalColor;
    String animalSound;
}

public class No_arg4 {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.animalName = "Lion";
        a1.animalType = "Mammal";   
        a1.animalAge = 8;
        a1.animalColor = "Golden";
        a1.animalSound = "Roar";

        System.out.println("Animal Name: " + a1.animalName);
        System.out.println("Animal Type: " + a1.animalType);
        System.out.println("Animal Age: " + a1.animalAge);
        System.out.println("Animal Color: " + a1.animalColor);
        System.out.println("Animal Sound: " + a1.animalSound);
    }
}
