class Department {
    private String deptName;

    Department(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}

class Employee {
    private String empName;
    private Department department;

    Employee(String empName) {
        this.empName = empName;
        this.department = new Department("HR"); // Early Instantiation
    }

    public String getEmpName() {
        return empName;
    }

    public Department getDepartment() {
        return department;
    }
}

class Ear2 {
    public static void main(String[] args) {
        Employee e = new Employee("Ravi");
        System.out.println(e.getEmpName());
        System.out.println(e.getDepartment().getDeptName());
    }
}
