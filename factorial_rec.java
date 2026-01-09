// factorial using Recursion

import java.util.Scanner;
public class factorial_rec {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter any  Number :");
        Scanner r = new Scanner(System.in);
        n = r.nextInt(); 

        factorial_rec obj = new factorial_rec();
        int result = obj.fact(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }
    int fact(int n)
    {
        if(n==1  || n==0)
        {
            return 1;
        }else{
            return n*fact(n-1);
        }
    }
}
