public class array4 {
    private int EmpId;
    private String Ename;
    private String Ejob;
    private double Esal;
    private String Edept;

    public array4(int EmpId, String Ename, String Ejob, double Esal, String Edept)
    {
        this.EmpId = EmpId;
        this.Ename = Ename;
        this.Ejob = Ejob;
        this.Esal = Esal;
        this.Edept = Edept;
    }

    public void setEmployee(int EmpId, String Ename, String Ejob, double Esal, String Edept)
    {
        this.EmpId = EmpId;
        this.Ename = Ename;
        this.Ejob = Ejob;
        this.Esal = Esal;
        this.Edept = Edept;
    }

    // overriding to string metod
    public String toString()
    {
        return "EmpId :" + EmpId + " Ename :" + Ename + " Ejob :" + Ejob + " Esal :" + Esal + " Edept :" + Edept;
    }
    public static void main(String[] args) {
        array4 e1 = new array4(101, "Sanju Bhai", "Manager", 50000.0, "IT");
        array4 e2 = new array4(102, "Raju Bhai", "Developer", 40000.0, "IT");
        array4 e3 = new array4(102, "Raju Bhai", "Developer", 40000.0, "IT");

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);


    }

}
