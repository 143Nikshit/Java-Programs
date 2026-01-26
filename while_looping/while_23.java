// 23. Print all numbers between a and b that are divisible by 7. 

import java.util.Scanner;

public class while_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter value of b: ");
        int b = sc.nextInt();

        int i = a;

        while(i <= b)
        {
            if(i % 7 ==0)
            {
                System.err.print(i + " ");
            }
            i++;
        }
    }
}
