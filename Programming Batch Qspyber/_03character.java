//! Write a java program to check whether it is alphabet, number, and special character
import java.util.Scanner;
class _03character{
    public static void main(String[] args) {
        // int num;
        char ch = 0;

        System.out.println("Enter a value");
        Scanner r = new Scanner(System.in);
        ch = r.next().charAt(0);

        if((ch >='a' && ch <='z') || (ch >='A' && ch <='Z'))
        {
            System.out.println("Alphabet");
        }
        
        else if(ch >= '0' && ch<='9' )
        {
            System.out.println("Number");
        }
        else
        {
            System.out.println("Special Character");
        }
    }
}