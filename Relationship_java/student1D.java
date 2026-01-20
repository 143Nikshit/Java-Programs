// Tor un this program use this commands:
// javac student1D.java
// java Driver  to run this program

public class student1D {
    private String sName;

    public String getSName() {
        return sName;
    }
    public void setSName(String sName) {
        this.sName = sName;
    }

    public student1D(String sName) {   // constructor
        setSName(sName);
    }

    private student1 s;  // HAS-A relationship

    public student1 getstudent1(){
        return s;
    }

    public void setstudent1(student1 s){
        this.s = s;
    }
}

// Driver class (Execution starts here)

class Driver{               
    public static void main(String[] args) {

        // OX1: student1D object is created
        student1D sd1 = new student1D("Alice");

        // Prints student name
        System.out.println("Student Name: " + sd1.getSName()); // Alice

        sd1.setstudent1(new student1(2));

        System.out.print("Student ID: "+sd1.getstudent1().getSId());

    }
}
