package Assignment;

// Find Second Max element present in the array Using ListIterator
import java.util.ArrayList;
import java.util.ListIterator;

public class Max2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(60);
        list.add(45);
        list.add(20);
        list.add(55);

        ListIterator<Integer> li = list.listIterator();

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        while (li.hasNext()) {
            int num = li.next();

            if (num > max) {
                secondMax = max;
                max = num;
            } 
            else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        System.out.println("Second Maximum: " + secondMax);
    }
}
