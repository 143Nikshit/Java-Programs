import java.util.ArrayList; //ctrk +shift + o is the shprtcut to import class from package

public class Student1 {
    private int studentId;
    private String studentName;

    Student1(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId +
                ", Student Name: " + studentName;
    }

    public static void main(String[] args) {
        Student1 s1 = new Student1(101, "Jayant");
        Student1 s2 = new Student1(102, "Rohit");
        Student1 s3 = new Student1(103, "Satyarth");

        ArrayList<Student1> ls = new ArrayList<Student1>();
        ls.add(s1);
        ls.add(s2);
        ls.add(s3);

        System.out.println(ls);

    }

}
