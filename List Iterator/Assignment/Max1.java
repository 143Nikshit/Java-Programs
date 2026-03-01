package Assignment;

import java.util.ArrayList;
import java.util.Iterator;

// Find Second Max element present in the array Using Iterator.
public class Max1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(25);
        list.add(40);
        list.add(5);
        list.add(30);

        Iterator<Integer> it = list.iterator();

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        while (it.hasNext()) {
            int num = it.next();

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
