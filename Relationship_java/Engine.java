// Engine class (Independent class)
class Engine {

    // Private data member (Encapsulation)
    private double hp;

    // Getter method to read hp value
    public double getHP() {
        return hp;
    }

    // Setter method to set hp value
    public void setHP(double hp) {
        this.hp = hp;
    }

    // Constructor
    public Engine(double hp) {
        // Using setter inside constructor (best practice)
        setHP(hp);
    }
}
