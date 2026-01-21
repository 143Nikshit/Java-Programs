class Sim {
    private String network;

    Sim(String network) {
        this.network = network;
    }

    public String getNetwork() {
        return network;
    }
}

class Mobile {
    private String brand;
    private Sim sim;

    Mobile(String brand) {
        this.brand = brand;
        this.sim = new Sim("Airtel"); // Early Instantiation
    }

    public String getBrand() {
        return brand;
    }

    public Sim getSim() {
        return sim;
    }
}

class Ear4 {
    public static void main(String[] args) {
        Mobile m = new Mobile("Vivo");
        System.out.println(m.getBrand());
        System.out.println(m.getSim().getNetwork());
    }
}
