// Write a program to check Divisibility of 5

import java.util.Scanner;

public class divisibility {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter a Number ");
        Scanner ref = new Scanner(System.in);
        n = ref.nextInt();
        
        if(n%5==0)
        {
            System.out.print("Number is divisble by 5");
        }
        else
        {
            System.out.print("Number is not divisble by 5");
        }
    }
}
