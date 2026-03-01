// Searching Element based on object  

public class student1 {
    private String StudentName;
    private int id;
    private double percentage;

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public String getStudentName() {
        return StudentName;
    }

    public int getId() {
        return id;
    }

    public double getPercentage() {
        return percentage;
    }

    public student1(int id, String StudentName, double percentage) {
        this.id = id;
        this.StudentName = StudentName;
        this.percentage = percentage;
    }

    // Override toString()
    public String toString() {
        return "Student Name: " + StudentName + ", ID: " + id + ", Percentage: " + percentage;
    }

    public boolean equals(student1 obj) {
        if (this.id == obj.id
                && this.StudentName.equalsIgnoreCase(obj.StudentName)
                && this.percentage == obj.percentage) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

    }

}
