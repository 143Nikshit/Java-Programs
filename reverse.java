// Reverse Number Program
// input number 123  ---> 321
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        int n,r;
        System.out.print("Enter a Number ");
        Scanner ref =new Scanner(System.in);
        n=ref.nextInt();

        while(n>0)
        {
            r = n%10;
            System.out.print(r);
            n=n/10;
        }
    }
}
