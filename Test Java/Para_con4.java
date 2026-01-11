class Animal{
    String animalName;
    String animalType;
    int animalAge;
    String animalColor;
    String animalSound;

    Animal(String name, String type, int age, String color, String sound)
    {
        animalName = name;
        animalType = type;   
        animalAge = age;
        animalColor = color;
        animalSound = sound;
    }

    void display() {
        System.out.println("Animal Name: " + animalName);
        System.out.println("Animal Type: " + animalType);
        System.out.println("Animal Age: " + animalAge);
        System.out.println("Animal Color: " + animalColor);
        System.out.println("Animal Sound: " + animalSound);
    }
}

public class Para_con4 {
    public static void main(String[] args) {
        Animal a1 = new Animal("Lion", "Mammal", 8, "Golden", "Roar");

        a1.display();
    }
}
