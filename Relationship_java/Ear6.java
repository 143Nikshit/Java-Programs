class Processor {
    private String brand;

    Processor(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}

class Laptop {
    private String company;
    private Processor processor;

    Laptop(String company) {
        this.company = company;
        this.processor = new Processor("Intel"); // Early Instantiation
    }

    public String getCompany() {
        return company;
    }

    public Processor getProcessor() {
        return processor;
    }
}

class Ear6 {
    public static void main(String[] args) {
        Laptop l = new Laptop("HP");
        System.out.println(l.getCompany());
        System.out.println(l.getProcessor().getBrand());
    }
}
