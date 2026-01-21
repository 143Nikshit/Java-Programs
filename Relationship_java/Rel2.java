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
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public String getEmpName() {
        return empName;
    }
}

class Rel2 {
    public static void main(String[] args) {
        Employee e = new Employee("Ravi");
        Department d = new Department("IT");
        e.setDepartment(d);

        System.out.println(e.getEmpName());
        System.out.println(e.getDepartment().getDeptName());
    }
}
