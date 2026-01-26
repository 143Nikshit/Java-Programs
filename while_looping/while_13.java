// 13. Check whether the given number is a palindrome. 

import java.util.Scanner;

public class while_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;
        int rev = 0;
        while(n !=0 )
        {
            int digit = n % 10;
            rev = rev * 10 + digit ;
            n = n / 10;
        }
        if(original == rev){
            System.out.print("Enter Number is palindrone");
        }else{
            System.out.print("Enter Number is not a palindrone");
        }
    }
}
