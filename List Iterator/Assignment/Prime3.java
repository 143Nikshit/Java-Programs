package Assignment;

import java.util.ArrayList;

// Print all prime numbers present in given collection Using For Loop
public class Prime3 {

    static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(17);
        list.add(21);
        list.add(23);

        System.out.println("Prime Numbers:");

        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        
    }
}
