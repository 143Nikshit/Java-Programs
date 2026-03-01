package Assignment;

import java.util.ArrayList;

// Print Even Element Sum using iterator Using For Loop
public class Even3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(9);
        list.add(6);
        list.add(11);
        list.add(4);

        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if (num % 2 == 0) {
                sum += num;
            }
        }

        System.out.println("Sum of Even Elements: " + sum);
    }
}
