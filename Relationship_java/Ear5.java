class Address {
    private String city;

    Address(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }
}

class Person {
    private String name;
    private Address address;

    Person(String name) {
        this.name = name;
        this.address = new Address("Mumbai"); // Early Instantiation
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
}

class Ear5 {
    public static void main(String[] args) {
        Person p = new Person("Neha");
        System.out.println(p.getName());
        System.out.println(p.getAddress().getCity());
    }
}
