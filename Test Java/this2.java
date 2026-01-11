class Employee{
    String Ename;
    int Eid;
    String Edept;
    double Esalary;
    String Eaddress;

    Employee(String Ename, int Eid, String Edept, double Esalary, String Eaddress) {
        this.Ename = Ename;
        this.Eid = Eid;
        this.Edept = Edept;
        this.Esalary = Esalary;
        this.Eaddress = Eaddress;
    }
    void display(){
        System.out.println("Employee Name: " + Ename);
        System.out.println("Employee ID: " + Eid);
        System.out.println("Employee Department: " + Edept);
        System.out.println("Employee Salary: " + Esalary);
        System.out.println("Employee Address: " + Eaddress);
    }
}

public class this2 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ram Laxman", 101, "IT", 55000.50, "Vasi Virar Qspyder ");
        Employee e2 = new Employee("Shyam Sundar", 102, "HR", 60000.75, "Andheri Mumbai");

        e1.display();
        System.out.println("==============================");
        e2.display();
    }
}
