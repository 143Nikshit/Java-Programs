// Write a Java program print Tribonacci Series.
// 0 1 2 3 6 11 20 ...

import java.util.Scanner;
public class tribonnaci {
    public static void main(String[] args) {
        int a =0, b=1, c=2, d, term;
        System.out.print("Enter the number of terms: ");
        Scanner r = new Scanner(System.in); 
        term = r.nextInt();
        for (int i=1; i<=term; i++){
            System.out.print(a + " ");
            d =a + b+ c;
            a = b;
            b = c;
            c = d;
        }
    }
}
