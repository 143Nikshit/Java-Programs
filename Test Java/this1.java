
class Student {
    int id;
    String name;
    int age;
    String Address;
    char gender;

    // Parameterized Constructor
    Student(int id, String name, int age, String Address, char gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.Address = Address;
        this.gender = gender;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + Address);
        System.out.println("Gender: " + gender);
    }
}
public class this1 {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Raja", 20, "Delhi", 'M');
        Student s2 = new Student(102, "Ram", 22, "Mumbai", 'M');
        
        s1.display();
        s2.display();
    }
}
