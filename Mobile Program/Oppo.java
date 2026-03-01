public class Oppo {
    public void printThanks()
    {
        System.out.println("Thanks for buying : ");
    }
     String phoneName;
    String modelName;
    double price;

    Oppo(String phoneName, String modelName, double price) {
        this.phoneName = phoneName;
        this.modelName = modelName;
        this.price = price;
    }

    void showDetails() {
        System.out.println("Phone Name : " + phoneName);
        System.out.println("Model Name : " + modelName);
        System.out.println("Price      : ₹" + price);
    }
}
