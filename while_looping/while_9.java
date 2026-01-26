// 9. Calculate and print the factorial of a given number. 

import java.util.Scanner;

public class while_9 {
    public static void main(String[] args) {
        int i =1;
        int fact = 1;
         System.out.print("Enter a range : ");
        Scanner r = new Scanner(System.in);
        int n = r.nextInt(); 

        while( i <= n)
        {
            fact = fact * i;
            i ++;
        }
        System.out.println("Factorial of " + n + " = " + fact);
    }
}
