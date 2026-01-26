// 19. Print the Fibonacci series up to n terms. 

import java.util.Scanner;

public class while_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int a = 0, b=1;
        int i = 1;

        while (i <= n)
        {
            System.out.print(a + " ");
            int c = a + b ;
            a = b;
            b = c;
            i++;
        }
    }
}
