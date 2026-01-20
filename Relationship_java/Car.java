// Car class (HAS-A Engine)
class Car {

    // Private data member
    private String modelName;

    // HAS-A relationship (reference variable)
    private Engine engine;

    // Getter for modelName
    public String getModelName() {
        return modelName;
    }

    // Setter for modelName
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    // Constructor for Car
    public Car(String modelName) {
        setModelName(modelName);
    }

    // Getter for Engine object
    public Engine getEngine() {
        return engine;
    }

    // Setter for Engine object (IMPORTANT)
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
