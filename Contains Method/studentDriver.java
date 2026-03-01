import java.util.ArrayList;

public class studentDriver {
    public static void main(String[] args) {
        ArrayList<student1> list = new ArrayList<student1>();
        list.add(new student1(101, "jagu", 78));
        list.add(new student1(102, "Dholo", 34.78));
        list.add(new student1(103, "Bala", 60));
        list.add(new student1(104, "Kirish", 12.0));
        list.add(new student1(105, "Munni", 78.90));

        System.out.println(list);  

        student1 keyStudent1 = new student1(104, "Kirish", 12.0); 
    }
}
