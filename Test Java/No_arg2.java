
class Employee{
    String Ename;
    int Eid;
    String Edept;
    double Esalary;
    String Eaddress;
}
public class No_arg2 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.Ename = "Ram Laxman";
        e1.Eid = 101;
        e1.Edept = "IT";
        e1.Esalary = 55000.50;
        e1.Eaddress = "Vasi Virar Qspyder ";

        System.out.println("Employee Name: " + e1.Ename);
        System.out.println("Employee ID: " + e1.Eid);
        System.out.println("Employee Department: " + e1.Edept);
        System.out.println("Employee Salary: " + e1.Esalary);
        System.out.println("Employee Address: " + e1.Eaddress);
    }
}
