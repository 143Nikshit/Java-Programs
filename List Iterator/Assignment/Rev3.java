package Assignment;

import java.util.ArrayList;

// Reverse the given collection in same list Using For Loop
public class Rev3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(5);

        int n = list.size() + 1;
        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;

        for (int i = 0; i < list.size(); i++) {
            actualSum += list.get(i);
        }

        int missing = expectedSum - actualSum;

        System.out.println("Missing Element: " + missing);
    }
}
