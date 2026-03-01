package Assignment;

import java.util.ArrayList;

// Reverse the given collection in same list Using For-Each Loop
public class Rev4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(1);
        list.add(2);
        list.add(5);

        int n = list.size() + 1;
        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;

        for (int num : list) {
            actualSum += num;
        }

        int missing = expectedSum - actualSum;

        System.out.println("Missing Element: " + missing);

    }
}
