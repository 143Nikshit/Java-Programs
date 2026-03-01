package Assignment;

import java.util.ArrayList;

//Find Second Max element present in the array Using For-Each Loop
public class Max4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(3);
        list.add(12);
        list.add(6);
        list.add(10);

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : list) {

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
