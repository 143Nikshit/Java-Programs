//11. Count and print the total number of digits in a given number. 

import java.util.Scanner;

public class while_11 {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        while( n != 0)
        {
            count ++;
            n = n /10;
        }
         System.out.println("Total number of digits = " + count);
    }
}
