// 8. Calculate the sum of all odd numbers from 1 up to n. 

import java.util.Scanner;

public class while_8 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        int num ;
        System.out.print("Enter a range :");
        Scanner r = new Scanner(System.in);
        num = r.nextInt();
        while(i <= num)
        {
            sum = sum + i;
            i = i + 2;
        }
        System.out.println("sum of all odd numbers from 1 up to "+ num + " = "+ sum);
    }
}
