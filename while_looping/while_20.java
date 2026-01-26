// 20. Find and print the sum of the Fibonacci series up to n terms. 

import java.util.Scanner;

public class while_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int a = 0, b=1;
        int i = 1;
        int sum = 0;

        while(i <= n)
        {
            sum = sum + a;
            int c = a + b;
            a = b;
            b = c;
            i ++;
        }
        System.out.print( "Sum of Fibonacci series : "+ sum);
    }
}
