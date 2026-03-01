package Assignment;

import java.util.ArrayList;
import java.util.ListIterator;

// Print Even Element Sum using iterator Using ListIterator

public class Even2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(12);
        list.add(7);
        list.add(14);

        ListIterator<Integer> li = list.listIterator();
        int sum = 0;

        while (li.hasNext()) {
            int num = li.next();
            if (num % 2 == 0) {
                sum += num;
            }
        }

        System.out.println("Sum of Even Elements: " + sum);
    }
}
