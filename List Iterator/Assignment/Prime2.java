package Assignment;

import java.util.ArrayList;
import java.util.ListIterator;

// Print all prime numbers present in given collection Using ListIterator
public class Prime2 {

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
        list.add(3);
        list.add(6);
        list.add(13);
        list.add(18);
        list.add(19);

        ListIterator<Integer> li = list.listIterator();

        System.out.println("Prime Numbers:");

        while (li.hasNext()) {
            int num = li.next();
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }

    }
}
