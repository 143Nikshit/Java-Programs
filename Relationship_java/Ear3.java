class Engine {
    private String type;

    Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

class Car {
    private String model;
    private Engine engine;

    Car(String model) {
        this.model = model;
        this.engine = new Engine("Petrol"); // Early Instantiation
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }
}

class Ear3 {
    public static void main(String[] args) {
        Car c = new Car("Honda");
        System.out.println(c.getModel());
        System.out.println(c.getEngine().getType());
    }
}
