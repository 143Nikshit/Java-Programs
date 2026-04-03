//! WAJP to check the given number is divisible by 3 and 5 
//if divisbile by 5 then print "divisible"
//if not  divisbile by 5 then print "not divisiblee"
import java.util.Scanner;
public class _04Divisible {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter a value");
        Scanner r = new Scanner(System.in);
        num = r.nextInt();

        if(num % 3 == 0 && num % 5 == 0)
        {
            System.out.println("Divisible");
        }
        else
        {
            System.out.println(" Not Divisible");
        }
    }
}
