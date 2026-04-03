//! WAJP to find out the smallest digit
// WAJP to find out the product of all the digits in given number
import java.util.Scanner;

public class _11smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int smallest = 9;
        while(num > 0) {
            int digit = num % 10; // Get the last digit
            if (digit < smallest) {
                smallest = digit; // Update smallest if current digit is smaller
            }
            num /= 10; // Remove the last digit
        }
        System.out.println("The smallest digit is: " + smallest);
    }
}
