// 25. Find and print the sum of all factors of the given number. 

import java.util.Scanner;

public class while_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int n = sc.nextInt();

        int i = 1;
        int sum =0;
        while(i <= n)
        {
            if (n % i == 0) {
                sum = sum + i;
            }
            i++;
        }
        System.out.print("Sum of factors ="+ sum);
    }
}
