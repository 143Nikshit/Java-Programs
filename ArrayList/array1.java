import java.util.ArrayList;

public class array1 {

    public static void main(String args[]) {

        // incremental capacity of array list is approximity 50%
        // (characteristics of array list)
        ArrayList ls = new ArrayList();
        ls.add(10);
        ls.add(20);
        ls.add(30);
        ls.add(23.50);
        ls.add(true);
        ls.add("King");
        ls.add(null);
        System.out.println(ls);

        // to add element at specific index
        ls.add(1, 400);
        System.out.println("size" + " " + ls.size());
        ls.add(2, 200);
        System.out.println("size" + " " + ls.size());
        ls.add(3, 300);
        System.out.println("size" + " " + ls.size());

    }
}
