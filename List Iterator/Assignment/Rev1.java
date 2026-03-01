package Assignment;

import java.util.ArrayList;
import java.util.Iterator;

// Reverse the given collection in same list using iterator
public class Rev1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);

        int n = list.size() + 1; // because one element is missing
        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            actualSum += it.next();
        }

        int missing = expectedSum - actualSum;

        System.out.println("Missing Element: " + missing);
    }
}
