// 28. Find the smallest digit in the given number. 

import java.util.Scanner;

public class while_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int min = 9;   // maximum possible digit

        while (n != 0) {
            int digit = n % 10;
            if (digit < min) {
                min = digit;
            }
            n = n / 10;
        }

        System.out.println("Smallest digit = " + min);
    }
}
