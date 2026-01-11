// Creating a class student with no-argument constructor and initializing its attributes in main method

class student{
    int id;
    String name;
    int age;
    String Address;
    char gender;
}

public class No_arg1{
     public static void main(String[] args)
    {
        student s1 = new student();
        s1.id = 101;
        s1.name = "Raja Ram";
        s1.age = 20;
        s1.Address = "Vasi Virar Qspyder ";
        s1.gender = 'M';
        System.out.println("Student ID: " + s1.id);
        System.out.println("Student Name: " + s1.name);
        System.out.println("Student Age: " + s1.age);
        System.out.println("Student Address: " + s1.Address);
        System.out.println("Student Gender: " + s1.gender); 
    }
}