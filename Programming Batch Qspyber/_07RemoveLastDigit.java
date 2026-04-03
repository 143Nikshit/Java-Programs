//! WAJP to remove last Digit

import java.util.Scanner;

public class _07RemoveLastDigit {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter a value");
        Scanner r = new Scanner(System.in);
        num = r.nextInt(); 
        num = num /10;   
        System.out.println(num);
        
    }
}
