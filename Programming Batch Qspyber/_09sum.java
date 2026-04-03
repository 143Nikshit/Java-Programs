//! WAJP to find out the sum of digits

import java.util.Scanner;
public class _09sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        while (num > 0) {
            sum += num % 10; // Add the last digit to sum
            num /= 10; // Remove the last digit
        }
        System.out.println("The sum of digits is: " + sum);
    }

}
