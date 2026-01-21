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
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }
}

class Rel5 {
    public static void main(String[] args) {
        Person p = new Person("Neha");
        Address a = new Address("Pune");
        p.setAddress(a);

        System.out.println(p.getName());
        System.out.println(p.getAddress().getCity());
    }
}
