class Animal{
    String animalName;
    String animalType;
    int animalAge;
    String animalColor;
    String animalSound;

    Animal(String animalname, String animaltype, int animalage, String animalcolor, String animalsound)
    {
        this.animalName = animalname;
        this.animalType = animaltype;   
        this.animalAge = animalage;
        this.animalColor = animalcolor;
        this.animalSound = animalsound;
    }

    void display() {
        System.out.println("Animal Name: " + animalName);
        System.out.println("Animal Type: " + animalType);
        System.out.println("Animal Age: " + animalAge);
        System.out.println("Animal Color: " + animalColor);
        System.out.println("Animal Sound: " + animalSound);
    }
}

public class this4 {
    public static void main(String[] args) {
        Animal a1 = new Animal("Lion", "Mammal", 8, "Golden", "Roar");

        a1.display();
    }
}
