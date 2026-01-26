// 18. Check whether the given number is a prime number.

import java.util.Scanner;
public class while_18 {
    public static void main(String[] args) {
        int i = 1 ;
        int count = 0;
        System.out.println("Enter a number : ");
        Scanner r = new Scanner (System.in);
        int num = r.nextInt();
         
        while (i <= num) {
            if (num % i == 0) {
                count++;
            }
            i++;
        }

        if (count == 2) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }
    }
}
