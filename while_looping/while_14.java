// 14. Find and print the sum of digits of the given number.

import java.util.Scanner;

public class while_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;
        while(n != 0)
        {
            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }
        System.out.println("Sum of digits = " + sum);
    }
}
