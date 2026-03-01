package Assignment;

import java.util.ArrayList;

// Print Even Element Sum using iterator Using For-Each Loop
public class Even4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(18);
        list.add(21);
        list.add(24);
        list.add(7);

        int sum = 0;

        for (int num : list) {
            if (num % 2 == 0) {
                sum += num;
            }
        }

        System.out.println("Sum of Even Elements: " + sum);
    }
}
