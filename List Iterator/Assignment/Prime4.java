package Assignment;

import java.util.ArrayList;

// Print all prime numbers present in given collection Using For-Each Loop
public class Prime4 {

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
        list.add(10);
        list.add(29);
        list.add(31);
        list.add(40);
        list.add(41);

        System.out.println("Prime Numbers:");

        for (int num : list) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }

    }
}
