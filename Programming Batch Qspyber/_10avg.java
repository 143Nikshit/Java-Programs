//! WAJP to find out the average of digits

import java.util.Scanner;

public class _10avg {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        while (num > 0) {
            sum += num % 10; // Add the last digit to sum
            num /= 10; // Remove the last digit
            count++;
        }

        double avg = (double) sum / count;
        System.out.println("Average of digits: " + avg);
    }
}
