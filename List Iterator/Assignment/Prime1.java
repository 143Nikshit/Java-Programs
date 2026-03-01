package Assignment;

// Print all prime numbers present in given collection Using Iterator

import java.util.ArrayList;
import java.util.Iterator;
public class Prime1 {

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
        list.add(2);
        list.add(4);
        list.add(7);
        list.add(9);
        list.add(11);

        Iterator<Integer> it = list.iterator();

        System.out.println("Prime Numbers:");

        while (it.hasNext()) {
            int num = it.next();
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }
}
