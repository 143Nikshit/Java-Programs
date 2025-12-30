// Sum of digits program
// input number 126 ---->(1+2+6=9)
import java.util.Scanner;
public class sumno {
    public static void main(String[] args) {
        int n,r,sum=0;
        System.out.print("Enter any Number ");
        Scanner ref = new Scanner(System.in);
        n = ref.nextInt();

        while (n>0) {
            r =n%10;
            sum =sum+r;
            n=n/10;
        }
        System.out.print("sum of digits "+sum);
    }
}
