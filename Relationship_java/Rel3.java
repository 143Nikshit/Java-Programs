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
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getModel() {
        return model;
    }
}

class Rel3 {
    public static void main(String[] args) {
        Car c = new Car("Tesla");
        Engine e = new Engine("Electric");
        c.setEngine(e);

        System.out.println(c.getModel());
        System.out.println(c.getEngine().getType());
    }
}
