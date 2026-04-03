//! WAJP to find last digit

import java.util.Scanner;
public class _06last {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter a value");
        Scanner r = new Scanner(System.in);
        num = r.nextInt();
        int n = num % 10;    
        System.out.println(n);
        
    }
}
