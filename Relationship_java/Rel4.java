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
    }

    public void setSim(Sim sim) {
        this.sim = sim;
    }

    public Sim getSim() {
        return sim;
    }

    public String getBrand() {
        return brand;
    }
}

class Rel4 {
    public static void main(String[] args) {
        Mobile m = new Mobile("Samsung");
        Sim s = new Sim("Jio");
        m.setSim(s);

        System.out.println(m.getBrand());
        System.out.println(m.getSim().getNetwork());
    }
}
