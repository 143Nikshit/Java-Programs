class Student {
    int id;
    String name;
    int age;
    String Address;
    char gender;

    // Parameterized Constructor
    Student(int i, String n, int a, String addr, char g) {
        id = i;
        name = n;
        age = a;
        Address = addr;
        gender = g;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + Address);
        System.out.println("Gender: " + gender);
    }
}
public class Para_con1 {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Raja", 20, "Delhi", 'M');
        Student s2 = new Student(102, "Ram", 22, "Mumbai", 'M');
        
        s1.display();
        s2.display();
    }
}

