// palindrome Number Program
//  input Number 121 ---->121 
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        int n,c,r,s=0;
        System.out.print("Enter any number ");
        Scanner ref =new Scanner(System.in);
        n = ref.nextInt();

        c=n;
        while (n>0) {
            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }
        if (s==c) {
            System.out.print("palindrome Number");
        }
        else{
            System.out.print("Not a Palindrome Number");
        }
    }
}
