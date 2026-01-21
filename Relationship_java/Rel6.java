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
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Processor getProcessor() {
        return processor;
    }

    public String getCompany() {
        return company;
    }
}

class Rel6 {
    public static void main(String[] args) {
        Laptop l = new Laptop("Dell");
        Processor p = new Processor("Intel");
        l.setProcessor(p);

        System.out.println(l.getCompany());
        System.out.println(l.getProcessor().getBrand());
    }
}
