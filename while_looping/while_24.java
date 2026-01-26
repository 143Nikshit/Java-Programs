// 24. Print all factors of the given number. 

import java.util.Scanner;

public class while_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int n = sc.nextInt();

        int i = 1;
        while(i <= n)
        {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
