class Employee{
    String Ename;
    int Eid;
    String Edept;
    double Esalary;
    String Eaddress;

    Employee(String name, int id, String dept, double salary, String address) {
        Ename = name;
        Eid = id;
        Edept = dept;
        Esalary = salary;
        Eaddress = address;
    }
    void display(){
        System.out.println("Employee Name: " + Ename);
        System.out.println("Employee ID: " + Eid);
        System.out.println("Employee Department: " + Edept);
        System.out.println("Employee Salary: " + Esalary);
        System.out.println("Employee Address: " + Eaddress);
    }
}

public class Para_con2 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ram Laxman", 101, "IT", 55000.50, "Vasi Virar Qspyder ");
        Employee e2 = new Employee("Shyam Sundar", 102, "HR", 60000.75, "Andheri Mumbai");

        e1.display();
        System.out.println("==============================");
        e2.display();
    }
}
