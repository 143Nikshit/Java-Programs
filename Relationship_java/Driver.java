// Driver class (Execution starts here)
public class Driver {

    public static void main(String[] args) {

        // OX1: Car object is created
        Car c1 = new Car("Tata Nano");

        // Prints model name
        System.out.println(c1.getModelName()); // Tata Nano

        // OX2: Engine object is created separately
        Engine e1 = new Engine(1400);

        // Engine object is assigned to Car
        c1.setEngine(e1);

        // Accessing Engine through Car
        System.out.println(c1.getEngine().getHP()); // 1400.0
    }
}
