package Assignment;

import java.util.ArrayList;

//Find Second Max element present in the array Using For Loop
public class Max3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(50);
        list.add(300);
        list.add(250);

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);

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
