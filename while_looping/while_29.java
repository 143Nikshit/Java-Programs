// 29. Find the largest digit in the given number. 

import java.util.Scanner;

public class while_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int max = 0;   // minimum possible digit

        while (n != 0) {
            int digit = n % 10;
            if (digit > max) {
                max = digit;
            }
            n = n / 10;
        }

        System.out.println("Largest digit = " + max);
    }
}
