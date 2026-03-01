public class Employee {
    private int employeeId;
    private String employeeName;
    private String employeeDepartment;
    private double employeeSalary;
    private String employeeDesignation;

    public Employee(int employeeId, String emplpyeeName, String employeeDepartment, double employeeSalary, String employeeDesignation) {
        setEmployeeId(employeeId);

        this.employeeName=emplpyeeName;
        this.employeeDepartment=employeeDepartment;
        this.employeeSalary=employeeSalary;
        this.employeeDesignation=employeeDesignation;

    }
    //getter and setters for EmployeeId
    public int getEmployeeId(){
        return employeeId;
    }
    public void setEmployeeId(int employeeId){
        this.employeeId=employeeId;
    }
    //getter and setters for EmployeeName
    public  String getEmployeeName(){
        return employeeName;
    }
    public void setEmployeeName(String employeeName){
        this.employeeName=employeeName;
    }
    //getter and setters for EmployeeDepartment
    public String getEmployeeDepartment(){
        return employeeDepartment;
    }
    public void setEmployeeDepartment(String employeeDepartment){
        this.employeeDepartment=employeeDepartment;
    }
    //getter and setters for EmployeeSalary
    public double getEmployeeSalary(){
        return employeeSalary;
    }
    public void setEmployeeSalary(double employeeSalary){
        this.employeeSalary=employeeSalary;
    }
    //getter and setters for EmployeeDesignation
    public String getEmployeeDesignation(){
        return employeeDesignation;
    }
    public void setEmployeeDesignation(String employeeDesignation){
        this.employeeDesignation=employeeDesignation;
    }
    @Override
    public String toString(){
        return "Employee Id: " + employeeId + ", Name: " + employeeName + ", Department: " + employeeDepartment + ", Salary: " + employeeSalary + ", Designation: " + employeeDesignation;
    }
}
