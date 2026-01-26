// 15. Check whether the given number is an Armstrong number. 
// 153 = 1³ + 5³ + 3³ = 153

import java.util.Scanner;

public class while_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;
        int sum = 0;

        while( n != 0)
        {
            int digit = n % 10;
            sum = sum + (digit * digit * digit);
            n = n / 10;
        }
        if(original == sum)
        {
            System.out.println(" Enter Number is Armstrong ");
        }
        else{
            System.out.println(" Enter Number is not an Armstrong ");
        }
    }
}
