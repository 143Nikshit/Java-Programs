package Assignment;

import java.util.ArrayList;
import java.util.ListIterator;

// Reverse the given collection in same list Using ListIterator

public class Rev2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(5);
        list.add(2);

        int n = list.size() + 1;
        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        ListIterator<Integer> li = list.listIterator();

        while (li.hasNext()) {
            actualSum += li.next();
        }

        int missing = expectedSum - actualSum;

        System.out.println("Missing Element: " + missing);
    }
}
