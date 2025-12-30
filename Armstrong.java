// Armstrong Number Program
//  input number 153 ----> (1*1*1 +5*5*5 + 3*3*3 =153)
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        int n,c,r,arm=0;
        System.out.print("Enter any Number ");
        Scanner ref = new Scanner(System.in);
        n= ref.nextInt();

        c=n;
        while (n>0) {
            r = n%10;
            arm = (r*r*r)+arm;
            n =n/10;
        }
        if (arm==c) {
            System.out.print("Armstrong Number");
        }
        else{
            System.out.print("Not a Armstrong Number");
        }
    }
}
