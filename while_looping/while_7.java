// 7. Calculate the sum of all even numbers from 1 up to n. 

import java.util.Scanner;
public class while_7 {
    public static void main(String[] args) {
        int num;
        int sum =0;
        int i = 2;
        System.out.print("Enter a range :");
        Scanner r = new Scanner(System.in);
        num = r.nextInt();

        while (i <= num) {
            sum = sum + i;
            i = i + 2;  
        }
        System.out.println("sum of all even numbers from 1 to "+ num + " = " + sum);

    }
}
